parser grammar CSVParser;

options{
    tokenVocab= CSVLexer;
    language = Java;
}

init: cabecera linea+;

cabecera:  columna (SEPARADOR columna)* INTRO;
linea: campo (SEPARADOR campo)* INTRO;

columna: TEXTO    #columnaSinComillas
    | CADENA    #columnaConComillas
    |           #columnaVacio
    ;

campo: TEXTO    #textoSinComillas
    | CADENA    #stringConComillas
    |           #campoVacio
    ;
