grammar Expr;
program: stmt*;
stmt: expr ';';
expr: assign;
assign: equality ('=' assign)?;
equality: relational (EQ relational | NE relational)*;
relational: add ('<' add | '<=' add | '>' add | '>=' add)*;
add: mul ( '+' mul | '-' mul)*;
mul: unary ('*' unary | '/' unary)*;
unary: (op = '+' | op = '-')* primary;
primary:
	INT				# label_p0
	| '(' expr ')'	# label_p1
	| IDENT			# lable_ident;
IDENT: [a-zA-Z_"] ([a-zA-Z_0-9])*; // match identifiers
INT: [0-9]+;
WS: [ \t]+ -> skip;
MUL: '*'; // assigns token name to '*' used above in grammar
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '==';
NE: '!=';
LT: '<';
LE: '<=';
MT: '>';
ME: '>=';