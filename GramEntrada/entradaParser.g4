parser grammar EntradaParser;

options{
    tokenVocab = EntradaLexer;
    language = Java;
}

init: (tipo_archivo|parametros|basura)+;

tipo_archivo: (json|svg|dot|csv);

textojson: (TEXTO|CADENA)+;
textosvg: (TEXTO|CADENA)+;
textodot: (TEXTO|CADENA)+;
textocsv: (TEXTO|CADENA)+;
textoparam: (TEXTO|CADENA)+;

basura: (TEXTO|ASIG|SPACE)+;

json: kw_json ASIG textojson SPACE?;
kw_json:  KW_JSON;

svg: kw_svg ASIG textosvg SPACE?;
kw_svg:  KW_SVG;

dot: kw_dot ASIG textodot SPACE?;
kw_dot:  KW_DOT;

csv: kw_csv ASIG textocsv SPACE?;
kw_csv:  KW_CSV;

parametros: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape);

len: kw_len len_name ASIG textoparam SPACE?;
fontcolor: fontcolor_name ASIG textoparam SPACE?; //String --> si entra con " usamos cadena
fontname: fontname_name ASIG textoparam SPACE?;
fontsize: fontsize_name ASIG textoparam SPACE?;
arrowsize: arrowsize_name ASIG textoparam SPACE?;
arrowcolor: arrowcolor_name ASIG textoparam SPACE?;
penwidth: penwidth_name ASIG textoparam SPACE?;
fillcolor: fillcolor_name ASIG textoparam SPACE?;
style: style_name ASIG textoparam SPACE?;
shape: shape_name ASIG textoparam SPACE?;

len_name: (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
fontcolor_name: kw_fontcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
fontname_name: kw_fontname  (kw_edge|kw_node)  (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
fontsize_name: kw_fontsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
arrowsize_name:  kw_arrowsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
arrowcolor_name: kw_arrowcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
penwidth_name: kw_penwidth (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
fillcolor_name: kw_fillcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
style_name: kw_style (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
shape_name: kw_shape (kw_edge|kw_node) (kw_relationship|kw_class|kw_inheritance|kw_inderect_use);
//variable_param: (kw_fontcolor|kw_fontname) bbaja (kw_edge|kw_node) bbaja

kw_edge:  EDGE;
kw_node:  NODE;
kw_relationship:  RELATIONSHIP;
kw_class:  CLASS;
kw_property:  PROPERTY;
kw_inheritance:  INHERITANCE;
kw_inderect_use:  INDERECT_USE;

kw_len:  LEN;
kw_fontcolor:  FONTCOLOR;
kw_fontname:  FONTNAME;
kw_fontsize:  FONTSIZE;
kw_arrowsize:  ARROWSIZE;
kw_arrowcolor:  ARROWCOLOR;
kw_penwidth:  PENWIDTH;
kw_fillcolor:  FILLCOLOR;
kw_style:  STYLE;
kw_shape:  SHAPE;
