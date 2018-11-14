lexer grammar CsvLexer;

IDENTIFICADOR: [a-zA-Z]+ ;
COMA: ',';
DOBLEPUNTO: '..';
PUNTO: '.';
INTRO: [\r\n];
DISCO: [a-zA-Z]':';
BARRA: '/';
EXTENSION: 'json'|'svg'|'dot';
NOMBRECOSAS: IDLETRA(IDLETRA|DIGITO)*(PUNTUACION(IDLETRA|DIGITO)*)*;
fragment IDLETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment PUNTUACION: '_';

