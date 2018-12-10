parser grammar JSONParser;

options{
    tokenVocab= JSONLexer;
    language = Java;
}

init: objeto*;

objeto: estado_context 
    | (nombre_label)? cuerpo_label COMA?
    | (nombre_label_reversename)? cuerpo_label_reversename COMA?
    | (nombre_objeto DOSPUNTOS)? cuerpo_objeto COMA?
    ;
nombre_objeto: cadena;
cuerpo_objeto: ABRIR_LLAVE (objeto|atributo|lista)+ CERRAR_LLAVE;

nombre_label: LABEL;
label_clave: cadena;
label_valor: cadena;
contenido_label: label_clave DOSPUNTOS label_valor COMA?;
cuerpo_label: ABRIR_LLAVE contenido_label+ CERRAR_LLAVE;

nombre_label_reversename: LABEL_REVERSENAME;
label_reversename_clave: cadena;
label_reversename_valor: cadena;
contenido_label_reversename: label_reversename_clave DOSPUNTOS label_reversename_valor COMA?;
cuerpo_label_reversename: ABRIR_LLAVE contenido_label_reversename+ CERRAR_LLAVE;

atributo: kw_id valor_id COMA?
    | kw_name valor_name COMA?
    | kw_geder valor_gender  COMA?
    | kw_number valor_number COMA?
    | kw_word_type valor_word_type COMA?
    | kw_type_of valor_type_of COMA?
    | kw_is_list valor_is_list COMA?
    | kw_optional valor_optional COMA?
    | kw_multiplicity_max valor_multiplicity_max COMA?
    | kw_multiplicity_min valor_multiplicity_min COMA?
    | kw_reverse_name valor_reverse_name COMA?
    | kw_from valor_from COMA?
    | kw_to valor_to COMA?
    | kw_inherits valor_inherits COMA?
    |(nombre_atributo DOSPUNTOS)? valor_atributo COMA?
    ;
nombre_atributo: cadena;
valor_atributo: cadena;

lista: graph cuerpo_graph COMA?
    | properties cuerpo_properties COMA?
    | arbol cuerpo_tree COMA?
    | usedby cuerpo_usedby COMA?
    | languajedata cuerpo_languagedata COMA?
    | (nombre_lista DOSPUNTOS)? cuerpo_lista COMA?
    ;
nombre_lista: cadena;
cuerpo_lista: ABRIR_CORCHETE (objeto|atributo|lista)+ CERRAR_CORCHETE;

graph: GRAPH;
cuerpo_graph: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;

properties: PROPERTIES;
valor_propertie: cadena;
cuerpo_properties: (valor_propertie COMA?)+ CERRAR_CORCHETE;

arbol: TREE;
cuerpo_tree: ABRIR_CORCHETE objeto+ CERRAR_CORCHETE;

usedby: USEDBY;
valor_usedby: cadena COMA?;
cuerpo_usedby: ABRIR_CORCHETE valor_usedby+ CERRAR_CORCHETE;

languajedata: LANGUAGEDATA;
cuerpo_languagedata: ABRIR_CORCHETE atributo+ CERRAR_CORCHETE;


cadena: (TEXTO|BOOLEANO);

kw_id: KW_ID;
valor_id: cadena;
kw_name: KW_NAME;
valor_name: cadena;
kw_geder: KW_GENDER;
valor_gender: cadena;
kw_number: KW_NUMBER;
valor_number: cadena;
kw_word_type: KW_WORD_TYPE;
valor_word_type: cadena;
kw_type_of: KW_TYPE_OF;
valor_type_of: cadena;
kw_is_list: KW_IS_LIST;
valor_is_list: cadena;
kw_optional: KW_OPTIONAL;
valor_optional: cadena;
kw_multiplicity_max: KW_MULTIPLICITY_MAX;
valor_multiplicity_max: cadena;
kw_multiplicity_min: KW_MULTIPLICITY_MIN;
valor_multiplicity_min: cadena;
kw_reverse_name: KW_REVERSE_NAME;
valor_reverse_name: cadena;
kw_from: KW_FROM;
valor_from: cadena;
kw_to: KW_TO;
kw_inherits: KW_INHERITS;
valor_inherits: cadena;

valor_to: cadena;


estado_context: ESTADO_CONTEXT CERRARCONTEXT;
