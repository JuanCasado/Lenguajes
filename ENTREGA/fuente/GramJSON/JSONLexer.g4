lexer grammar JSONLexer;

@header{
package fuente.GramJSON;
}

//JSON ESPECIFICO

//  LISTAS
//GRAPHS: '"graphs"';
GRAPH: '"@graph"' P_SPACE DOSPUNTOSF;
TREE: '"@tree"' P_SPACE DOSPUNTOSF;
PROPERTIES: '"properties"' P_SPACE DOSPUNTOSF P_SPACE '[';
USEDBY: '"usedby"' P_SPACE DOSPUNTOSF;
LANGUAGEDATA: '"languageData"' P_SPACE DOSPUNTOSF;
fragment P_SPACE: ' '*;
fragment DOSPUNTOSF: ':';

//  ATRIBUTOS
KW_ID: '"@id"' P_SPACE DOSPUNTOSF;
KW_NAME: '"name"' P_SPACE DOSPUNTOSF;
KW_GENDER: '"gender"' P_SPACE DOSPUNTOSF;
KW_NUMBER: '"number"' P_SPACE DOSPUNTOSF;
KW_WORD_TYPE: '"wordType"' P_SPACE DOSPUNTOSF;
KW_TYPE_OF: '"typeOf"' P_SPACE DOSPUNTOSF;
KW_IS_LIST: '"isList"' P_SPACE DOSPUNTOSF;
KW_OPTIONAL: '"optional"' P_SPACE DOSPUNTOSF;
KW_MULTIPLICITY_MAX: '"multiplicityMax"' P_SPACE DOSPUNTOSF;
KW_MULTIPLICITY_MIN: '"multiplicityMin"' P_SPACE DOSPUNTOSF;
KW_REVERSE_NAME: '"reverseName"' P_SPACE DOSPUNTOSF;
KW_FROM: '"from"' P_SPACE DOSPUNTOSF;
KW_TO: '"to"' P_SPACE DOSPUNTOSF;
KW_INHERITS: '"inherits"' P_SPACE DOSPUNTOSF;


//  OBJETOS
LABEL: '"label"' P_SPACE DOSPUNTOSF;
LABEL_REVERSENAME: '"labelReverseName"' P_SPACE DOSPUNTOSF;

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

COMA: ',';
DOSPUNTOS : ':';
WS: [\n\t\r\b ] -> skip;

mode CONTEXT_MODE;
CERRARCONTEXT: '"graphs"' C_SPACE* ':' -> popMode;
INFO: .+? -> skip;
fragment C_SPACE: ' ';
