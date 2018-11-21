lexer grammar JsonLexer;

/*
URL: 'http://PdL.com/';
PROPERTY: 'property#';
CLASS: 'class#';
LANGPROP: 'langprop#';
XSD: 'xsd:';
STRING: 'string';
INTEGER: 'integer';
BOOLEAN: 'boolean';
TYPES: 'typoes';
RELATIONSHIP 'relationship#';
ID: 'id';
LANGUAJE: 'languaje';
TYPE: 'type';
GENDER: 'gender';
NUMBER: 'number';
WORDTYPE: 'wordType';
ES: 'es';
EN: 'en';
BOOL: 'true'|'false';
STR: '"';
TAG: '@';
*/
OPEN_OBJ: '{';
CLOS_OBJ: '}';
OPEN_LIS: '[';
CLOS_LIS: ']';
END: ',';
NAME: ([a-zA-Z0-9]|'"'|'@'|'#'|'_'|'-'|'.'|'http:'|'xsd:')+;
COL: ':';
//TXT: [a-zA-Z0-9][a-zA-Z0-9 _-]*;
TRASH: [\n\r\t ] -> skip;