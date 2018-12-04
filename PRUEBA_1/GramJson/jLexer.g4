lexer grammar jLexer;

COMA: ',';
PUNTO: '.';
DOS_PTOS: ':';
BARRA: ('/');
BBAJA: '_';
GUION: '-';
ARROBA: '@';
ALM: '#';
SALLAVE: '{';
SCLLAVE: '}';
SACORCHETE: '[';
SCCORCHETE: ']';
COMILLAS: '"';

NOMBRE: ([a-zA-Z]+ | ('á'|'é'|'í'|'o'|'u'|'ü'))+;
DIGITO: [0-9]+;


KW_ID: '"@id":';
KW_NAME: '"name":';
KW_PROPERTIES: '"properties":';
KW_INHERITS: '"inherits":';
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

INTRO: [\n\r\t] -> skip;