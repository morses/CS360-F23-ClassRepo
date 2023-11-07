// Generated from Expr.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';

// This class defines a complete generic visitor for a parse tree produced by ExprParser.

export default class ExprVisitor extends antlr4.tree.ParseTreeVisitor {

	// Visit a parse tree produced by ExprParser#prog.
	visitProg(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by ExprParser#expr.
	visitExpr(ctx) {
	  return this.visitChildren(ctx);
	}



}