parser grammar entradaParser;

options{
    tokenVocab = entradaLexer;
    language = Java;
}

fichero: (tipo_archivo|comentario|wsci|parametros)*;

comentario: COMENTARIOABRIR (textos|authorcom|descrcom|targcom|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLINEA textos* FINAL_COMENTARIO_UL;

authorcom: AUTHOR+;
descrcom: DESCRIPTION+;
targcom: TARGET+;
textos: (TEXTOCOMENTARIO_ML|TEXTOCOMENTARIO_UL)+;

rutafichero: (doblepunto|punto|letra dos_ptos?|variable|barra)*; //variable es el nombre del disco C/

tipo_archivo: (json|svg|dot|csv);
json: kw_json wsci* asig wsci* rutafichero variable punto extension_json;
svg: kw_svg wsci* asig wsci* rutafichero variable punto extension_svg;
dot: kw_dot wsci* asig wsci* rutafichero variable punto extension_dot;
csv: kw_csv wsci* asig wsci* rutafichero variable punto extension_csv;

wsci: (white_space|intro);
white_space: WS;
barra: BARRA;
intro: INTRO;
letra: LETRA;
numero: INT;
variable: IDF;
sap: SAP;
scp: SCP;
asig: ASIG;
opasig: OPASIG;
opblt: OPBLT;
opbgt: OPBGT;
coma: COMA;
dos_ptos: KW_DOS_PUNTOS; //:
punto: PUNTO;
doblepunto: DOBLEPUNTO; //..
cadena: CADENA_ABRIR (TEXTO_CADENA)* CADENA_CERRAR;  
bbaja: BBAJA; //barrabaja
cor_abrir: COR_ABRIR; //corchete
cor_Cerrar: COR_CERRAR;


kw_json: KW_JSON;
extension_json: EXTENSION_JSON;
kw_svg: KW_SVG;
extension_svg: EXTENSION_SVG;
kw_dot: KW_DOT;
extension_dot: EXTENSION_DOT;
kw_csv: KW_CSV;
extension_csv: EXTENSION_CSV;

parametros: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape);

len: kw_len bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig numero ;
fontcolor: kw_fontcolor bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable); //String --> si entra con " usamos cadena
fontname: kw_fontname bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable);
fontsize: kw_fontsize bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  numero;
arrowsize: kw_arrowsize bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  numero;
arrowcolor: kw_arrowcolor bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable);
penwidth: kw_penwidth bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  numero;
fillcolor: kw_fillcolor bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable);
style: kw_style bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable);
shape: kw_shape bbaja (kw_edge|kw_node) bbaja (kw_relationship|kw_class|kw_inheritance|kw_inderect_use) asig  (cadena|variable);

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