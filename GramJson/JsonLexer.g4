lexer grammar JSONLexer;


CADENA: '"' .+? '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
ABRIR_LLAVE: '{';
CERRAR_LLAVE: '}';
ABRIR_CORCHETE: '[';
CERRAR_CORCHETE: ']';

DOSPUNTOS: ':';
COMA: ',';
WS: [\n\t\r\b ]->skip;
