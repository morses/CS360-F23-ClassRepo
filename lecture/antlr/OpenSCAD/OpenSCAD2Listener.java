// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpenSCAD2Parser}.
 */
public interface OpenSCAD2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(OpenSCAD2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(OpenSCAD2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(OpenSCAD2Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(OpenSCAD2Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(OpenSCAD2Parser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(OpenSCAD2Parser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(OpenSCAD2Parser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(OpenSCAD2Parser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OpenSCAD2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OpenSCAD2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OpenSCAD2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OpenSCAD2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#primitive_solid}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_solid(OpenSCAD2Parser.Primitive_solidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#primitive_solid}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_solid(OpenSCAD2Parser.Primitive_solidContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(OpenSCAD2Parser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(OpenSCAD2Parser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#intersection_for}.
	 * @param ctx the parse tree
	 */
	void enterIntersection_for(OpenSCAD2Parser.Intersection_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#intersection_for}.
	 * @param ctx the parse tree
	 */
	void exitIntersection_for(OpenSCAD2Parser.Intersection_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(OpenSCAD2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(OpenSCAD2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(OpenSCAD2Parser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(OpenSCAD2Parser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OpenSCAD2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OpenSCAD2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(OpenSCAD2Parser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(OpenSCAD2Parser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#module_definition}.
	 * @param ctx the parse tree
	 */
	void enterModule_definition(OpenSCAD2Parser.Module_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#module_definition}.
	 * @param ctx the parse tree
	 */
	void exitModule_definition(OpenSCAD2Parser.Module_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(OpenSCAD2Parser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(OpenSCAD2Parser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OpenSCAD2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OpenSCAD2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(OpenSCAD2Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(OpenSCAD2Parser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#arg_decl}.
	 * @param ctx the parse tree
	 */
	void enterArg_decl(OpenSCAD2Parser.Arg_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#arg_decl}.
	 * @param ctx the parse tree
	 */
	void exitArg_decl(OpenSCAD2Parser.Arg_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#arg_call_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_call_list(OpenSCAD2Parser.Arg_call_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#arg_call_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_call_list(OpenSCAD2Parser.Arg_call_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCAD2Parser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterArg_call(OpenSCAD2Parser.Arg_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCAD2Parser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitArg_call(OpenSCAD2Parser.Arg_callContext ctx);
}