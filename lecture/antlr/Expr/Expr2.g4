/*
 * Simple Expression grammar, modified slightly from the ANTLR4 example
 */

grammar Expr2;

/* Tokens */
MUL    : '*'   ;
DIV    : '/'   ;
ADD    : '+'   ;
SUB    : '-'   ;
LPAREN : '('   ;
RPAREN : ')'   ;
fragment DIGIT : [0-9] ;
NEWLINE :[\r\n]+ ; 
INT :	DIGIT+ ;
FLOAT:  DIGIT+ '.' DIGIT+
        | DIGIT+ '.' 
        | '.' DIGIT+;
WS:     [ \t]+ -> skip ;

/* Grammar rules */
prog:	(expr NEWLINE)* 
    ;
expr:	expr (MUL|DIV) expr
    |	expr (ADD|SUB) expr
    |   INT
    |   FLOAT
    | 	LPAREN expr RPAREN
    ;

