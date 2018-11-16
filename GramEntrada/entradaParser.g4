parser grammar entradaParser;

options{
    tokenVocab = entradaLexer;
    language = Java;
}

fichero: (tipo_archivo|comentario|wsci)*;

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
coma: COMA;
dos_ptos: KW_DOS_PUNTOS; //:
punto: PUNTO;
doblepunto: DOBLEPUNTO; //..
cadena: CADENA_ABRIR (TEXTO_CADENA)* CADENA_CERRAR;  


kw_json: KW_JSON;
extension_json: EXTENSION_JSON;
kw_svg: KW_SVG;
extension_svg: EXTENSION_SVG;
kw_dot: KW_DOT;
extension_dot: EXTENSION_DOT;
kw_csv: KW_CSV;
extension_csv: EXTENSION_CSV;