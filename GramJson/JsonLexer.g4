lexer grammar JSONLexer;

//JSON ESPECIFICO

//  LISTAS
//GRAPHS: '"graphs"';
GRAPH: '"@graph"';
TREE: '"@tree"';
PROPERTIES: '"properties"' P_SPACE ':' P_SPACE '[';
fragment P_SPACE: ' '*;

//  ATRIBUTOS
KW_ID: '"@id"';
KW_GENDER: '"gender"';
KW_NUMBER: '"number"';
KW_WORD_TYPE: '"wordType"';
KW_TYPE_OF: '"typeOf"';
KW_IS_LIST: '"isList"';
KW_OPTIONAL: '"optional"';
KW_MULTIPLICITY_MAX: '"multiplicityMax"';


ESTADO_CONTEXT: '"@context"' -> pushMode(CONTEXT_MODE);

//JSON GENERAL
BOOLEANO: (TRUE|FALSE);
fragment TRUE: 'true';
fragment FALSE: 'false';
TEXTO: '"' ('""'|~'"')* '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
ABRIR_LLAVE: '{';
CERRAR_LLAVE: '}';
ABRIR_CORCHETE: '[';
CERRAR_CORCHETE: ']';

DOSPUNTOS: ':';
COMA: ',';
WS: [\n\t\r\b ] -> skip;

mode CONTEXT_MODE;
CERRARCONTEXT: '"graphs"' C_SPACE* ':' -> popMode;
INFO: .+? -> skip;
fragment C_SPACE: ' ';
