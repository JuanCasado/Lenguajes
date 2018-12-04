parser grammar EntradaParser;

options{
    tokenVocab = EntradaLexer;
    language = Java;
}

init: (tipo_archivo|parametros|basura)+;

tipo_archivo: (json|svg|dot|csv);

texto: (TEXTO|CADENA)+;
basura: (TEXTO|ASIG|SPACE)+;

json: kw_json ASIG texto SPACE?;
kw_json: KW_JSON;

svg: kw_svg ASIG texto SPACE?;
kw_svg: KW_SVG;

dot: kw_dot ASIG texto SPACE?;
kw_dot: KW_DOT;

csv: kw_csv ASIG texto SPACE?;
kw_csv: KW_CSV;

parametros: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape);

len: kw_len (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
fontcolor: kw_fontcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?; //String --> si entra con " usamos cadena
fontname: kw_fontname  (kw_edge|kw_node)  (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
fontsize: kw_fontsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
arrowsize: kw_arrowsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
arrowcolor: kw_arrowcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
penwidth: kw_penwidth (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
fillcolor: kw_fillcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
style: kw_style (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;
shape: kw_shape (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) ASIG texto SPACE?;

//variable_param: (kw_fontcolor|kw_fontname) bbaja (kw_edge|kw_node) bbaja

kw_edge: EDGE;
kw_node: NODE;

kw_relationship: RELATIONSHIP;
kw_class: CLASS;
kw_property: PROPERTY;
kw_inheritance: INHERITANCE;
kw_inderect_use: INDERECT_USE;
kw_len: LEN;
kw_fontcolor: FONTCOLOR;
kw_fontname: FONTNAME;
kw_fontsize: FONTSIZE;
kw_arrowsize: ARROWSIZE;
kw_arrowcolor: ARROWCOLOR;
kw_penwidth: PENWIDTH;
kw_fillcolor: FILLCOLOR;
kw_style: STYLE;
kw_shape: SHAPE;