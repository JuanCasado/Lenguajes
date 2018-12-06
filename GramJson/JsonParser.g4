parser grammar JSONParser;

options{
    tokenVocab= JSONLexer;
    language = Java;
}

init: objeto*;

objeto: estado_context 
    |(nombre_objeto DOSPUNTOS)? cuerpo_objeto COMA?
    ;
nombre_objeto: cadena;
cuerpo_objeto: ABRIR_LLAVE (objeto|atributo|lista)+ CERRAR_LLAVE;

atributo: kw_id  DOSPUNTOS valor_id COMA?
    | kw_geder DOSPUNTOS  valor_gender  COMA?
    | kw_number DOSPUNTOS valor_number COMA?
    | kw_word_type DOSPUNTOS valor_word_type COMA?
    | kw_type_of DOSPUNTOS valor_type_of COMA?
    | kw_islist DOSPUNTOS valor_islist COMA?
    /*| kw_optional DOSPUNTOS valor_optional COMA?*/
    |(nombre_atributo DOSPUNTOS)? valor_atributo COMA?
    ;
nombre_atributo: cadena;
valor_atributo: cadena;

lista: //(graphs DOSPUNTOS) cuerpo_graphs COMA?
     (graph DOSPUNTOS) cuerpo_graph COMA?
    | properties cuerpo_properties COMA?
    | (arbol DOSPUNTOS) cuerpo_tree COMA?
    | (nombre_lista DOSPUNTOS)? cuerpo_lista COMA?
    ;
nombre_lista: cadena;
cuerpo_lista: ABRIR_CORCHETE (objeto|atributo|lista)+ CERRAR_CORCHETE;

/*graphs: GRAPHS;
cuerpo_graphs: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;*/
graph: GRAPH;
cuerpo_graph: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;
properties: PROPERTIES;
cuerpo_properties: atributo+ CERRAR_CORCHETE;
arbol: TREE;
cuerpo_tree: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;

cadena: (TEXTO|BOOLEANO);

kw_id: KW_ID;
valor_id: cadena;
kw_geder: KW_GENDER;
valor_gender: cadena;
kw_number: KW_NUMBER;
valor_number: cadena;
kw_word_type: KW_WORD_TYPE;
valor_word_type: cadena;
kw_type_of: KW_TYPE_OF;
valor_type_of: cadena;
kw_islist: KW_ISLIST;
valor_islist: cadena;
/*kw_optional: KW_OPTIONAL;
valor_optional: TEXTO;*/


estado_context: ESTADO_CONTEXT CERRARCONTEXT;

