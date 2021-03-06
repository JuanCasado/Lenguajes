
lexer grammar JsonLexer;

SALLAVE: '{';
SCLLAVE: '}';
SACORCHETE: '[';
SCCORCHETE: ']';
COMA: ',';
DOS_PTOS: ':';
COMILLAS: '"';
PUNTO: '.';
BARRA: '/';
ALM: '#';
BBAJA: '_';
ARROBA: '@';

KW_CONTEXT: '"@context":';
KW_WWW: 'www.';
KW_HTTP: 'http://';
KW_ID: '"@id":';
KW_NAME: '"name":';
KW_PROPERTIES: '"properties":';
KW_INHERITS: '"inherits":';
KW_GRAPHS: '"graphs":';
KW_REVERSENAME: '"reverseName":';
KW_LABELRN: '"labelReverseName":';
KW_LANGUAGEDATA: '"languageData":';
KW_LANGUAGE: '"language":';
KW_NUMBER: '"number":';
KW_WORDTYPE: '"wordType":';
KW_GENDER: '"gender":';
KW_OPTIONAL: '"optional":';
KW_LABEL: '"label":';
KW_FROM: '"from":';
KW_TO: '"to":';
KW_TYPEOF: '"typeOf":';
KW_USEDBY: '"usedby":';
KW_MULMAX: '"multiplicityMax":';
KW_MULMIN: '"multiplicityMin":';
KW_ISLIST: '"isList":';

KW_TRUE: 'true';
KW_FALSE: 'false';
/*TARGET: (ARR ID);
    fragment ARR: '@';
    fragment ID: [a-zA-Z];
*/    
NOMBRE: ([a-zA-Z] |'á'|'é'|'í'|'ó'|'ú'|'ö'|'Á'|'É'|'Í'|'Ú'|'ñ'|'Ñ')+;
DIGITO: [0-9]+;
INTRO: [\n\r\t ] -> skip;

/*mode SENTENCIA_LINEA_MODE;
FINAL_SENTENCIA: '"'->popMode;
TEXTOSENTENCIA: .+?;
*/
