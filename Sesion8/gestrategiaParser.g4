parser grammar gestrategiaParser;

options{
    tokenVocab= gestrategiaLexer;
    language = Java;
}

csv: cabecera linea+;

cabecera:  linea;
linea: campo (SEPARADOR campo)* INTRO;

campo: TEXTO    #textoSinComillas
    | CADENA    #stringConComillas
    |           #campoVacio
    ;
