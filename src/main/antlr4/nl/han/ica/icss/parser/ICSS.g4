grammar ICSS;

stylesheet: constants? styleNodes switchCase?;
constants: constant+;
constant: 'let' VARNAME 'is' value ';';
styleNodes: styleNode+;
styleNode: NAME properties;
switchCase: NAME 'switch' VARNAME caseCase+ defaultCase;
defaultCase: DEFAULT properties;
caseCase: 'case' value properties;
properties: '{' property+ '}';
property: NAME ':' value ';';
value: /*(*/COLOR #colorLiteral
        | PIXELS #pixelLiteral
        | VARNAME #varName
        | NUMBERS+ #numbers/*)*/
        | PERCENTAGE #percentage
        | value SUMOP value #addExpression
        | value SUMMIN value #minExpression
        | value SUMKEER value #keerExpression;
       // (('+' | '*' | '-' | '/') (PIXELS | NUMBERS))*;
//expression SUMOP expression # addExpression
WS : [ \t\r\n]+ -> skip ;
//SUM: ('+' | '*' | '-' | '/') (PIXELS | [0-9]);
DEFAULT: 'default';
SUMOP: '+';
SUMMIN: '-';
SUMKEER: '*';
COLOR: HASH ALPHANUM ALPHANUM ALPHANUM ALPHANUM ALPHANUM ALPHANUM ;
PIXELS: NUMBERS+ 'px' ;
PERCENTAGE: NUMBERS+ '%';
VARNAME : '$' (LETTERS | '_')+;
NAME : (DOT | HASH | LETTERS | '-' | '_')+ ;
PROPERTYNAME : (LETTERS | '-')+ ;
fragment ALPHANUM: ([a-fA-F] | [0-9]) ;
fragment LETTERS: [a-zA-Z] ;
NUMBERS: [0-9] ;
fragment HASH: '#' ;
fragment DOT: '.' ;