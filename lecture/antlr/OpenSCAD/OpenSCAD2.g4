/*
    LL() Grammar for the 3D CAD language OpenSCAD (http://www.openscad.org)
    Written from the Bison grammar at https://github.com/openscad/openscad
    and the language documentation.

    Not complete, and not extensively tested.
*/
grammar OpenSCAD2;

/*************************************
 *             Lexer                 *
 *************************************/
    
INCLUDE_DECL:     'include'  '<' ~[>]+ '>'
            ;

USE_DECL    :     'use' '<' ~[>]+ '>'
            ;


MODULE      : 'module'      ;
FUNCTION    : 'function'    ;
IF          : 'if'          ;
ELSE        : 'else'        ;
TRUE        : 'true'        ;
FALSE       : 'false'       ;
UNDEF       : 'undef'       ;

LT          : '<'           ;
LE          : '<='          ;
GT          : '>'           ;
GE          : '>='          ;
EQ          : '=='          ;
NE          : '!='          ;
AND         : '&&'          ;
OR          : '||'          ;
NOT         : '!'           ;

// primitive solids
CUBE        : 'cube'        ;
SPHERE      : 'sphere'      ;
CYLINDER    : 'cylinder'    ;
POLYHEDRON  : 'polyhedron'  ;

// transformations
SCALE       : 'scale'       ;
RESIZE      : 'resize'      ;
ROTATE      : 'rotate'      ;
TRANSLATE   : 'translate'   ;
MIRROR      : 'mirror'      ;
MULTMATRIX  : 'multmatrix'  ;
COLOR       : 'color'       ;
MINKOWSKI   : 'minkowski'   ;
HULL        : 'hull'        ;

// constructive solid geometry (csg)
UNION       : 'union'       ;
DIFFERENCE  : 'difference'  ;
INTERSECTION: 'intersection';
RENDER      : 'render'      ;

MODIFIER    : ('!' | '#' | '%' | '*')
            ;

fragment
DIGIT       : [0-9] ;

fragment
EXP         : [eE] [+-]? DIGIT+  ;

NUMBER      : DIGIT+ EXP?
            | DIGIT* '.' DIGIT+ EXP?
            | DIGIT+ '.' DIGIT* EXP?
            ;

IDENTIFIER  : '$'? [a-zA-Z0-9_]+  ;

STRING      : '"' (ESC_SEQ | ~('\\' | '"') )* '"' ;

fragment
ESC_SEQ     : '\\' ([btnfr] | '"' | '\'' | '\\')      ;

WHITESPACE  :  [ \t\r\n]+   -> skip ;

C_COMMENT   :   '/*' .*? '*/' -> skip ;

LINE_COMMENT:   '//' ~[\r\n]* -> skip ;

/*************************************
 *             Parser                *
 *************************************/

prog        : input*        ;

input       : INCLUDE_DECL
            | USE_DECL
            | unit
            ;
unit        : definition
            | statement
            ;
            
definition  : module_definition
            | function_definition
            ;
            
statement   : block
            | primitive_solid
            | for_loop
            | intersection_for
            | assign
            | ifelse
            | assignment
            | MODIFIER? module_instantiation
            | ';'
            ;

block                : '{' unit* '}'
                     ;

primitive_solid      : MODIFIER? (CUBE | SPHERE | CYLINDER | POLYHEDRON) '(' arg_call_list ')' ';'
                     ;                
                     
for_loop             : 'for' '(' arg_call_list ')' statement
                     ;

intersection_for     : 'intersection_for' '(' arg_call_list ')' statement
                     ;
                     
assign               : 'assign' '(' arg_call_list ')' statement
                     ;
                     
ifelse               : 'if' '(' expr ')' statement ('else' statement)?
                     ;

assignment           : IDENTIFIER '=' expr ';'
                     ;
                        
module_instantiation : (UNION | DIFFERENCE | INTERSECTION | IDENTIFIER) '(' ')' statement
                     | RENDER '(' arg_call_list ')' statement
                     | (SCALE | RESIZE | ROTATE | TRANSLATE | MIRROR | MULTMATRIX | COLOR | MINKOWSKI | HULL) '('  arg_call_list ')' statement
                     | IDENTIFIER '(' arg_call_list ')' statement
                     ;
            
module_definition    : MODULE IDENTIFIER '(' arg_decl? (',' arg_decl)* ')' unit
                     ;

function_definition  : FUNCTION IDENTIFIER '(' arg_decl? (',' arg_decl)* ')' '=' expr ';'
                     ;

expr        : expr '?' expr ':' expr           
            | expr OR expr                     
            | expr AND expr                   
            | expr (EQ | NE) expr             
            | expr (LT | LE | GE | GT) expr   
            | expr ('+' | '-') expr        
            | expr ('*' | '/' | '%') expr    
            | ('+' | '-') expr
            | NOT expr
            | TRUE
            | FALSE
            | UNDEF
            | IDENTIFIER
            //  | expr '.' IDENTIFIER
            | STRING
            | NUMBER
            | '[' expr ':' expr ']'
            | '[' expr ':' expr ':' expr ']'
            | '[' expr? (',' expr)* ','? ']'
            | '(' expr ')'
            | IDENTIFIER '[' expr ']'
            | function_call
            ;

function_call   : IDENTIFIER '(' arg_call_list ')'
                ;

arg_decl        : IDENTIFIER
                | IDENTIFIER '=' expr
                ;

arg_call_list   : arg_call? (',' arg_call)*
                ;  

arg_call        : expr
                | IDENTIFIER '=' expr
                ;





