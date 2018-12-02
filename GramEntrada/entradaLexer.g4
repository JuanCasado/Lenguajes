lexer grammar EntradaLexer;


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

KW_JSON: GUION?'JSON';
KW_DOT: GUION?'DOT';
KW_SVG: GUION?'SVG';
KW_CSV: GUION?'CSV';
LEN: GUION?'len';
FONTCOLOR: GUION?'fontcolor';
FONTNAME: GUION?'fontname';
FONTSIZE: GUION?'fontsize';
ARROWSIZE: GUION?'arrowsize';
ARROWCOLOR: GUION?'arrowcolor';
PENWIDTH: GUION?'penwidth';
FILLCOLOR: GUION?'fillcolor';
STYLE: GUION?'style';
SHAPE: GUION?'shape';
EXTENSION_JSON: 'json';
EXTENSION_SVG: 'svg';
EXTENSION_DOT: 'dot';
EXTENSION_CSV: 'csv';

EDGE: (BARRABAJA|GUION)?'edge';
NODE: (BARRABAJA|GUION)?'node';

RELATIONSHIP: (BARRABAJA|GUION)?'relationship';
CLASS: (BARRABAJA|GUION)?'class';
PROPERTY: (BARRABAJA|GUION)?'property';
INHERITANCE: (BARRABAJA|GUION)?'inheritance';
INDERECT_USE: (BARRABAJA|GUION)?'inderect_use';


IDF: (ID_LETRA|BARRABAJA|GUION)(ID_LETRA|BARRABAJA|DIGITO|GUION)*;    //identificador final     <-- [a-zA-Z]([a-zA-Z][0-9])*
fragment ID_LETRA:[a-zA-Z]|'á'|'é'|'í'|'ó'|'ú'|'ö'|'Á'|'É'|'Í'|'Ú'|'ñ'|'Ñ';         //fragment es un "atajo" para decir que hay unos símbolos que funcionan como símbolos terminales, pero los sustituye (en linea 19)
fragment DIGITO: [0-9];  
fragment BARRABAJA: '_';
fragment GUION: '-';

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