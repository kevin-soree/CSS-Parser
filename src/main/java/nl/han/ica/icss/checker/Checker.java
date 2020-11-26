package nl.han.ica.icss.checker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import nl.han.ica.icss.ast.*;

public class Checker {

    private HashMap<String, ConstantDefinition> symboltable;

    public void check(AST ast) {
        //Clear symbol table
        symboltable = new HashMap<>();
        ArrayList<ASTNode> children = ast.root.getChildren();
        for (ASTNode child : children) {
            checkConstantDefinitions(child);
            checkStyleRules(child);
            checkSwitchRules(child);
        }

        //Save the symbol table.
        ast.symboltable = symboltable;
        //Save the verdict
        if (ast.getErrors().isEmpty()) {
            ast.checked = true;
        }
    }

    /**
     * This method gets the children of the stylerule and also retrieves the properties and loops through the properties.
     * The other check methods get called in that loop for each property.
     * @param child
     * The stylerule
     */
    private void checkStyleRules(ASTNode child) {
        if (child instanceof Stylerule) {
            ArrayList<ASTNode> body = child.getChildren();
            for (ASTNode property : body) {
                ArrayList<ASTNode> properties = property.getChildren();
                for (ASTNode reference : properties) {
                    checkConstantDefined(reference);
                    checkOperations(reference);
                    checkValuesWithAttributeName(property, reference);
                }
            }
        }
    }

    /**
     * This method checks the switch rules. There are two checks here. One to see if the match in the switch actually
     * references a declared constant.
     * @param child
     * The switchrule
     */
    private void checkSwitchRules(ASTNode child) {
        if (child instanceof Switchrule) {
            Switchrule c = (Switchrule)child;
            if(c.match instanceof ConstantReference) {
                ConstantReference match = (ConstantReference) c.match;
                if(!symboltable.containsKey(match.name)) {
                    child.setError(match.name+" is not defined");
                }
                else {
                    casesOfSameType(c, match);
                }
            }
        }
    }

    /**
     * Checks if all the cases are of the same type as the match type.
     * @param c
     * The case
     * @param match
     * The value of match as comparison
     */
    private void casesOfSameType(Switchrule c, ConstantReference match) {
        ConstantDefinition matchDefinition = symboltable.get(match.name);
        for(SwitchValueCase valueCase : c.valueCases) {
            if(!matchDefinition.expression.getClass().equals(valueCase.value.getClass())) {
                valueCase.setError("Case type must be the same as match type.");
            }
        }
    }

    /**
     * Checks if the declaration name (like width or height) also gets a correct value like pixels values.
     * @param property
     * The property (Declaration)
     * @param reference
     * The reference (Color Literal, Pixel literal)
     */
    private void checkValuesWithAttributeName(ASTNode property, ASTNode reference) {
        if(reference instanceof ColorLiteral) {
            if(((Declaration) property).property.contains("width") || ((Declaration) property).property.contains("height")) {
                property.setError("Color can't be used as a value for width or height");
            }
        }
        if(reference instanceof PixelLiteral) {
            if(((Declaration) property).property.contains("color")) {
                property.setError("Pixel values can't be used as a value for color");
            }
        }
    }

    /**
     * Checks if the operaties use consistent values, so pixels for everything, etc.
     * Checks for color literals, these are not allowed in operations.
     * Checks if the multiply operator has a scalar value.
     * @param reference
     * The reference in the operation.
     */
    private void checkOperations(ASTNode reference) {
        if (reference instanceof Operation) {
            Operation operation = ((Operation) reference);
            Expression lhs = operation.lhs;
            Expression rhs = operation.rhs;
            if (checkConstantDefined(lhs) && lhs instanceof ConstantReference) {
                lhs = symboltable.get(((ConstantReference) lhs).name).expression;
            }
            if (checkConstantDefined(rhs) && rhs instanceof ConstantReference) {
                rhs = symboltable.get(((ConstantReference) rhs).name).expression;
            }
            checkColorLiteralsInOperations(reference, lhs, rhs);
            checkSubtractAndAddOperations(reference, lhs, rhs);
            checkMultiplyOperation(reference);
            if(lhs instanceof Operation) {
                checkOperations(lhs);
            }
            if(rhs instanceof Operation) {
                checkOperations(rhs);
            }
        }
    }

    /**
     * This method makes sure that color literals are not allowed in operations.
     * @param reference
     * The operation itself
     * @param lhs
     * The left hand side of the operation
     * @param rhs
     * The right hand side of the operation
     */
    private void checkColorLiteralsInOperations(ASTNode reference, Expression lhs, Expression rhs) {
        if (lhs instanceof ColorLiteral || rhs instanceof ColorLiteral) {
            reference.setError("Color literals are not allowed in Operations.");
        }
    }

    /**
     * Checks the multiply operation on errors. A multiply value must have alteast one scalar value.
     * @param reference
     * The operation
     */
    private void checkMultiplyOperation(ASTNode reference) {
        if (reference instanceof MultiplyOperation) {
            if (!(((MultiplyOperation) reference).lhs instanceof ScalarLiteral)
                    && !(((MultiplyOperation) reference).rhs instanceof ScalarLiteral)) {
                reference.setError("Multiply must be done with atleast 1 scalar value");
            }
        }
    }

    /**
     * Checks the subtract and add operation on errors. Both values (lhs and rhs) must be of the same type.
     * @param reference
     * The operation
     * @param lhs
     * The left hand side
     * @param rhs
     * the right hand side.
     */
    private void checkSubtractAndAddOperations(ASTNode reference, Expression lhs, Expression rhs) {
        if (reference instanceof SubtractOperation || reference instanceof AddOperation) {
            if (lhs.getClass() != rhs.getClass()) {
                reference.setError("Both values must be of the same type");
            }
        }
    }

    /**
     * Checks if the constant which is references is declared.
     * @param reference
     * The constant reference itself.
     */
    private boolean checkConstantDefined(ASTNode reference) {
        if (reference instanceof ConstantReference) {
            if(!symboltable.containsKey(((ConstantReference) reference).name)) {
                reference.setError(((ConstantReference) reference).name+" is not defined");
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the constant is already defined.
     * @param child
     * The constant reference
     */
    private void checkConstantDefinitions(ASTNode child) {
        if(child instanceof ConstantDefinition) {
            ConstantDefinition c = (ConstantDefinition) child;
            if(symboltable.containsKey(c.name.name)) {
                child.setError(c.name.name+" is already defined");
            }
            symboltable.put(c.name.name, (ConstantDefinition)child);
        }
    }
}
