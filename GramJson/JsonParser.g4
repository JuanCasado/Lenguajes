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

lista: (nombre_lista DOSPUNTOS)? cuerpo_lista COMA?
    | (graphs DOSPUNTOS) cuerpo_graphs COMA?
    | (graph DOSPUNTOS) cuerpo_graph COMA?
    | properties cuerpo_properties COMA?
    | (arbol DOSPUNTOS) cuerpo_tree COMA?
    ;
nombre_lista: cadena;
cuerpo_lista: ABRIR_CORCHETE (objeto|atributo|lista)+ CERRAR_CORCHETE;

graphs: GRAPHS;
cuerpo_graphs: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;
graph: GRAPH;
cuerpo_graph: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;
properties: PROPERTIES;
cuerpo_properties: atributo+ CERRAR_CORCHETE;
arbol: TREE;
cuerpo_tree: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;

cadena: (TEXTO|TRUE|FALSE);
