grammar Expr;
stat: expr # label_stat;
expr:
	expr op = ('*' | '/') expr		# label_mul_div
	| expr op = ('+' | '-') expr	# label_add_sub
	| INT							# label_int
	| '(' expr ')'					# label_parens;

ID: [a-zA-Z]+; // match identifiers
INT: [0-9]+;
WS: [ \t]+ -> skip;
MUL: '*'; // assigns token name to '*' used above in grammar
DIV: '/';
ADD: '+';
SUB: '-';