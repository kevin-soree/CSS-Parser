// Generated from nl\han\ica\icss\parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(ICSSParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(ICSSParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ICSSParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ICSSParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#styleNodes}.
	 * @param ctx the parse tree
	 */
	void enterStyleNodes(ICSSParser.StyleNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#styleNodes}.
	 * @param ctx the parse tree
	 */
	void exitStyleNodes(ICSSParser.StyleNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#styleNode}.
	 * @param ctx the parse tree
	 */
	void enterStyleNode(ICSSParser.StyleNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#styleNode}.
	 * @param ctx the parse tree
	 */
	void exitStyleNode(ICSSParser.StyleNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(ICSSParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(ICSSParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(ICSSParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(ICSSParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#caseCase}.
	 * @param ctx the parse tree
	 */
	void enterCaseCase(ICSSParser.CaseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#caseCase}.
	 * @param ctx the parse tree
	 */
	void exitCaseCase(ICSSParser.CaseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(ICSSParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(ICSSParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varName}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVarName(ICSSParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varName}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVarName(ICSSParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMinExpression(ICSSParser.MinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMinExpression(ICSSParser.MinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pixelLiteral}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPixelLiteral(ICSSParser.PixelLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pixelLiteral}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPixelLiteral(ICSSParser.PixelLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(ICSSParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(ICSSParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentage}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPercentage(ICSSParser.PercentageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentage}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPercentage(ICSSParser.PercentageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numbers}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(ICSSParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numbers}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(ICSSParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorLiteral}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterColorLiteral(ICSSParser.ColorLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorLiteral}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitColorLiteral(ICSSParser.ColorLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keerExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterKeerExpression(ICSSParser.KeerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keerExpression}
	 * labeled alternative in {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitKeerExpression(ICSSParser.KeerExpressionContext ctx);
}