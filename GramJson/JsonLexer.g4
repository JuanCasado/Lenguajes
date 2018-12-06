lexer grammar JSONLexer;

//JSON ESPECIFICO

//  LISTAS
//GRAPHS: '"graphs"';
GRAPH: '"@graph"';
TREE: '"@tree"';
PROPERTIES: '"properties"' P_SPACE ':' P_SPACE '[';
USEDBY: '"usedby"';
LANGUAGEDATA: '"languageData"';
fragment P_SPACE: ' '*;

//  ATRIBUTOS
KW_ID: '"@id"';
KW_NAME: '"name"';
KW_GENDER: '"gender"';
KW_NUMBER: '"number"';
KW_WORD_TYPE: '"wordType"';
KW_TYPE_OF: '"typeOf"';
KW_IS_LIST: '"isList"';
KW_OPTIONAL: '"optional"';
KW_MULTIPLICITY_MAX: '"multiplicityMax"';
KW_MULTIPLICITY_MIN: '"multiplicityMin"';
KW_REVERSE_NAME: '"reverseName"';
KW_FROM: '"from"';
KW_TO: '"to"';
KW_INHERITS: '"inherits"';

//  OBJETOS
LABEL: '"label"';
LABEL_REVERSENAME: '"labelReverseName"';

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
