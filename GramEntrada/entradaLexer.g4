lexer grammar entradaLexer;

COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);      //estos tres son TOKENS
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);
CADENA_ABRIR: '"' -> pushMode(CADENA_CARACTERES_MODE);              //una cadena de caracteres comienza con un '"'


//IDENTIFICADOR: [a-zA-Z]+;
INT: [0-9]+;
LETRA: [a-zA-Z];
COMA: ',';
DOBLEPUNTO: '..';
PUNTO: '.';
INTRO: [\r\n]+;
OPBLT: '<';
OPBGT: '>';
SAP: '(';
SCP: ')';
ASIG: '=';  
OPASIG:':=';
BBAJA: '_';
COR_ABRIR: '[';
COR_CERRAR: ']';
KW_DOS_PUNTOS: ':';
TERMINADOR: ';';
WS: ' '+ ;
BARRA: '\\' | '/';

KW_JSON:'JSON';
KW_DOT: 'DOT';
KW_SVG: 'SVG';
KW_CSV: 'CSV';
LEN: 'len';
FONTCOLOR: 'fontcolor';
FONTNAME: 'fontname';
FONTSIZE: 'fontsize';
ARROWSIZE: 'arrowsize';
ARROWCOLOR: 'arrowcolor';
PENWIDTH: 'penwidth';
FILLCOLOR: 'fillcolor';
STYLE: 'style';
SHAPE: 'shape';
EXTENSION_JSON: 'json';
EXTENSION_SVG: 'svg';
EXTENSION_DOT: 'dot';
EXTENSION_CSV: 'csv';

EDGE: 'edge';
NODE: 'node';

RELATIONSHIP: 'relationship';
CLASS: 'class';
PROPERTY: 'property';
INHERITANCE: 'inheritance';
INDERECT_USE: 'inderect_use';


IDF: ID_LETRA(ID_LETRA/*|BARRABAJA*/|DIGITO)*;    //identificador final     <-- [a-zA-Z]([a-zA-Z][0-9])*
fragment ID_LETRA:[a-zA-Z];         //fragment es un "atajo" para decir que hay unos símbolos que funcionan como símbolos terminales, pero los sustituye (en linea 19)
fragment DIGITO: [0-9];  
//fragment BARRABAJA: '_';

mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/' -> popMode; //con popMode se sale del modo
TEXTOCOMENTARIO_ML: .+?;
AUTHOR: '@author:' .+? INTRO;
DESCRIPTION: '@description:' .+?;
TARGET: '@target' .+?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n' -> popMode; //es igual que INTRO, pero al estar dentro del modo hay que interpretarlo de esta manera
TEXTOCOMENTARIO_UL: .+?;

mode CADENA_CARACTERES_MODE;
CADENA_CERRAR: '"' -> popMode;      //una cadena de caracteres termina con un '"'
TEXTO_CADENA: .+?;                  //dentro de una cadena puede haber cualquier tipo de caracter