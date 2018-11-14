lexer grammar CsvLexer;

COMA: ',';
INTRO: [\r\n];
BARRA: '/'|'\\';
JSON_EXTENSION: '.json';
DOT_EXTENSION: '.dot';
SVG_EXTENSION: '.svg';
FILE    : ((IDLETRA|DIGITO|PUNTUACION) BARRA?)+
        | DOT DOT? BARRA?;
fragment IDLETRA: [a-zA-ZáéíóúÁÉÍÓÚ];
fragment DIGITO: [0-9];
fragment PUNTUACION: '_'|' '|'-'|':';
fragment DOT : '.';

