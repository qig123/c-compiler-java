grammar Expr;
stat: expr;
expr: mul ( '+' mul | '-' mul)*;
mul: unary ('*' unary | '/' unary)*;
unary: (op = '+' | op = '-')* primary;
primary: INT # label_p0 | '(' expr ')' # label_p1;
ID: [a-zA-Z]+; // match identifiers
INT: [0-9]+;
WS: [ \t]+ -> skip;
MUL: '*'; // assigns token name to '*' used above in grammar
DIV: '/';
ADD: '+';
SUB: '-';