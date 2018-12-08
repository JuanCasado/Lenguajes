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

basura: (TEXTO|SPACE)+;

json: kw_json  textojson SPACE?;
kw_json:  KW_JSON;

svg: kw_svg  textosvg SPACE?;
kw_svg:  KW_SVG;

dot: kw_dot  textodot SPACE?;
kw_dot:  KW_DOT;

csv: kw_csv  textocsv SPACE?;
kw_csv:  KW_CSV;

parametros: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape|color|arrowhead|dir);

len: len_name textoparam SPACE?;
fontcolor: fontcolor_name  textoparam SPACE?; //String --> si entra con " usamos cadena
fontname: fontname_name  textoparam SPACE?;
fontsize: fontsize_name  textoparam SPACE?;
arrowsize: arrowsize_name  textoparam SPACE?;
arrowcolor: arrowcolor_name  textoparam SPACE?;
penwidth: penwidth_name  textoparam SPACE?;
fillcolor: fillcolor_name  textoparam SPACE?;
style: style_name  textoparam SPACE?;
shape: shape_name  textoparam SPACE?;
color : color_name textoparam SPACE?;
arrowhead : arrowhead_name textoparam SPACE?;
dir : dir_name textoparam SPACE?;

len_name: kw_len (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
fontcolor_name: kw_fontcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
color_name: kw_color (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
fontname_name: kw_fontname  (kw_edge|kw_node)  (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
fontsize_name: kw_fontsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
arrowsize_name:  kw_arrowsize (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
arrowcolor_name: kw_arrowcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
arrowhead_name: kw_arrowhead (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
penwidth_name: kw_penwidth (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
fillcolor_name: kw_fillcolor (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
style_name: kw_style (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
shape_name: kw_shape (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
dir_name: kw_dir (kw_edge|kw_node) (kw_relationship|kw_class|kw_property|kw_inheritance|kw_inderect_use);
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
kw_color:  COLOR;
kw_fontname:  FONTNAME;
kw_fontsize:  FONTSIZE;
kw_arrowsize:  ARROWSIZE;
kw_arrowhead:  ARROWHEAD;
kw_arrowcolor:  ARROWCOLOR;
kw_penwidth:  PENWIDTH;
kw_fillcolor:  FILLCOLOR;
kw_style:  STYLE;
kw_shape:  SHAPE;
kw_dir:  DIR;
