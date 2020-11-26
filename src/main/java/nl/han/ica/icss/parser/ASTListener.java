package nl.han.ica.icss.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

import nl.han.ica.icss.ast.*;

import javax.swing.text.html.StyleSheet;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {
	
	//Accumulator attributes:
	private AST ast;
	private Stack<ASTNode> currentContainer; //This is a hint...
	//private HashMap<String, String> properties;

	public ASTListener() {
		ast = new AST();
		currentContainer = new Stack<>();
		//properties = new HashMap<>();
	}


	@Override
	public void exitStyleNode(ICSSParser.StyleNodeContext ctx) {
		IdSelector selector = new IdSelector(ctx.getChild(0).getText());
		ArrayList<ASTNode> body = new ArrayList<>();
		Stylerule rule = new Stylerule(selector, body);
		while(!currentContainer.empty()) {
			rule.addChild(currentContainer.pop());
		}
		ast.root.addChild(rule);
	}

	@Override
	public void exitProperty(ICSSParser.PropertyContext ctx) {
		Declaration n = new Declaration();
		n.property =  ctx.getChild(0).getText();
		//if(ctx.getChild(2).getChild(0).getText().startsWith("#")) {

			//n.expression = new ColorLiteral(ctx.getChild(2).getChild(0).getText());
		//}
		n.expression = (Expression) currentContainer.pop();
		currentContainer.push(n);
	}

	@Override
	public void enterColorLiteral(ICSSParser.ColorLiteralContext ctx) {
		currentContainer.push(new ColorLiteral(ctx.getText()));
	}

	@Override
	public void enterPixelLiteral(ICSSParser.PixelLiteralContext ctx) {
		currentContainer.push(new PixelLiteral(ctx.getText()));
	}

	@Override
	public void exitConstant(ICSSParser.ConstantContext ctx) {
		ConstantDefinition constant = new ConstantDefinition();
		constant.name = new ConstantReference(ctx.getChild(1).getText());
		constant.expression = (Expression) currentContainer.pop();
		ast.root.addChild(constant);
	}

	@Override
	public void enterVarName(ICSSParser.VarNameContext ctx) {
		currentContainer.push(new ConstantReference(ctx.getText()));
	}

	@Override
	public void enterNumbers(ICSSParser.NumbersContext ctx) {
		currentContainer.push(new ScalarLiteral(ctx.getText()));
	}

	@Override
	public void enterPercentage(ICSSParser.PercentageContext ctx) {
		currentContainer.push(new PercentageLiteral(ctx.getText()));
	}

	@Override
	public void exitMinExpression(ICSSParser.MinExpressionContext ctx) {
		SubtractOperation subtractOperation = new SubtractOperation();
		subtractOperation.lhs = (Expression) currentContainer.pop();
		subtractOperation.rhs = (Expression) currentContainer.pop();
		currentContainer.push(subtractOperation);
	}

	@Override
	public void exitAddExpression(ICSSParser.AddExpressionContext ctx) {
		AddOperation addOperation = new AddOperation();
		addOperation.lhs = (Expression) currentContainer.pop();
		addOperation.rhs = (Expression) currentContainer.pop();
		currentContainer.push(addOperation);
	}

	@Override
	public void exitKeerExpression(ICSSParser.KeerExpressionContext ctx) {
		MultiplyOperation multiplyOperation = new MultiplyOperation();
		multiplyOperation.lhs = (Expression) currentContainer.pop();
		multiplyOperation.rhs = (Expression) currentContainer.pop();
		currentContainer.push(multiplyOperation);
	}

	@Override
	public void exitSwitchCase(ICSSParser.SwitchCaseContext ctx) {
		Switchrule switchrule = new Switchrule();
		switchrule.selector = new TagSelector(ctx.getChild(0).getText());
		switchrule.match = new ConstantReference(ctx.getChild(2).getText());
		while (!currentContainer.empty()) {
			switchrule.addChild(currentContainer.pop());
		}
		ast.root.addChild(switchrule);
	}

	@Override
	public void exitCaseCase(ICSSParser.CaseCaseContext ctx) {
		SwitchValueCase switchValueCase = new SwitchValueCase();
		int containerSize = currentContainer.size();
		for(int i = containerSize; i > 0; i--) {
			if(currentContainer.get(i-1) instanceof Declaration || currentContainer.get(i-1) instanceof Expression) {
				switchValueCase.addChild(currentContainer.pop());
			}
		}
		currentContainer.push(switchValueCase);
	}

	@Override
	public void exitDefaultCase(ICSSParser.DefaultCaseContext ctx) {
		SwitchDefaultCase switchDefaultCase = new SwitchDefaultCase();
		int containerSize = currentContainer.size();
		for(int i = containerSize; i > 0; i--) {
			if(currentContainer.get(i-1) instanceof Declaration || currentContainer.get(i-1) instanceof Expression) {
				switchDefaultCase.addChild(currentContainer.pop());
			}
		}
		currentContainer.push(switchDefaultCase);
	}

	public AST getAST() {
		return ast;
    }
}
