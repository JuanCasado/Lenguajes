parser grammar JSONParser;

options{
    tokenVocab= JSONLexer;
    language = Java;
}

init: objeto*;

objeto: (nombre_objeto DOSPUNTOS)? cuerpo_objeto COMA?;
nombre_objeto: cadena;
cuerpo_objeto: ABRIR_LLAVE (objeto|atributo|lista)+ CERRAR_LLAVE;

atributo: (nombre_atributo DOSPUNTOS)? valor_atributo COMA?;
nombre_atributo: cadena;
valor_atributo: cadena;

lista: (nombre_lista DOSPUNTOS)? cuerpo_lista COMA?;
nombre_lista: cadena;
cuerpo_lista: ABRIR_CORCHETE (objeto|atributo|lista)+ CERRAR_CORCHETE;

cadena: (TEXTO|TRUE|FALSE);
