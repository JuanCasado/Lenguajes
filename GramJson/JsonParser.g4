parser grammar JSONParser;

options{
    tokenVocab= JSONLexer;
    language = Java;
}

init: objeto*;

objeto: (nombre_objeto DOSPUNTOS)? cuerpo_objeto COMA?;
nombre_objeto: CADENA;
cuerpo_objeto: ABRIR_LLAVE (objeto|atributo|lista)+ CERRAR_LLAVE;

atributo: (nombre_atributo DOSPUNTOS)? valor_atributo;
nombre_atributo: CADENA;
valor_atributo: CADENA;

lista: (nombre_lista DOSPUNTOS)? cuerpo_lista;
nombre_lista: CADENA;
cuerpo_lista: ABRIR_CORCHETE (objeto|atributo|lista)+ CERRAR_CORCHETE;

