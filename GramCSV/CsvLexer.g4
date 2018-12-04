lexer grammar CsvLexer;

@header{
    package antlr;

    
}

COMA: ',';
INTRO: [\r\n];
BARRA: '/'|'\\';
JSON_EXTENSION: '.json';
DOT_EXTENSION: '.dot';
SVG_EXTENSION: '.svg';
FILE    : (IDLETRA|DIGITO|PUNTUACION)+
        | DOT DOT? ;
fragment IDLETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ];
fragment DIGITO: [0-9];
fragment PUNTUACION: '_'|' '|'-'|':';
fragment DOT : '.';

COMILLAS : ('"'|'\'') -> skip;

