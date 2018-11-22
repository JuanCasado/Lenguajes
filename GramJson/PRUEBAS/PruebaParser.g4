parser grammar PruebaParser;

options{
    tokenVocab = PruebaLexer;
    language = Java;
}

init: sallave context? graphs scllave;
context: sallave kw_context  dos_ptos sallave descripcion+ scllave coma ;
descripcion: (dos_ptos | cadena| intro | ampli_info| nombre| ruta| declaracion)+;
cadena: comillas (nombre (bbaja (nombre|digito)+)?)+ comillas;
ampli_info: sallave descripcion+ scllave coma?;
ruta: comillas kw_http kw_www? ( (nombre|digito)+ punto? barra? alm?)+ comillas;
declaracion:  comillas arroba nombre comillas dos_ptos comillas nombre dos_ptos nombre comillas coma?
            | comillas arroba nombre comillas dos_ptos ruta coma?
            | comillas arroba nombre comillas dos_ptos cadena+ coma?
            | comillas arroba nombre comillas dos_ptos nombre+ coma?
            | comillas arroba nombre comillas dos_ptos comillas arroba nombre+ comillas coma?
            | comillas arroba nombre comillas dos_ptos comillas digito comillas coma?
            ;
/* GRAPHS COMPUESTO DE DOMAIN CHARACTERISTICS PROPERTIES QUE SON LOS OBJETOS */
graphs: kw_graphs dos_ptos sacorchete (list)? sccorchete;
/* DENTRO DE CADA OBJETO ENCONTRAMOS LOS LIST QUE SON @NOMBRE */
list: target dos_ptos sacorchete objetos* sccorchete;
objetos: sallave prop+ scllave coma?;
prop:  (pclass| relationship| property)+ ;

pclass: id name label? inherits? properties?;
id: kw_id dos_ptos ruta coma?;
name: kw_name dos_ptos comillas nombre comillas coma?;
label: kw_label dos_ptos ampli_info coma?;
inherits: kw_inherits dos_ptos ruta coma?;
properties: kw_properties dos_ptos sacorchete (ruta coma?)* sccorchete;

relationship: id name reverse_name label? labelrn? from to properties;
reverse_name: kw_reversename dos_ptos comillas nombre comillas coma?;
labelrn: kw_labelrn dos_ptos ampli_info ;
from: kw_from dos_ptos ruta;
to: kw_to dos_ptos ruta;

property: id name typeOf label isList? /*optional?*/ mulMax? mulMin? usedby? languageData?
        | id name typeOf isList? mulMax? mulMin?  label usedby? languageData?
        ;
typeOf: kw_typeof dos_ptos comillas nombre+ dos_ptos nombre+ comillas coma?
      | kw_typeof dos_ptos ruta coma?
      ;
usedby: kw_usedby dos_ptos sacorchete ruta sccorchete coma?;
isList: kw_isList dos_ptos bool coma?;
bool: kw_true|kw_false;
//optional:;
mulMin: kw_mulmin dos_ptos comillas (nombre|digito) comillas coma?;
mulMax: kw_mulmax dos_ptos comillas (nombre|digito) comillas coma?;
languageData:;

nombre_obj: nombre;
sacorchete: SACORCHETE;
sccorchete: SCCORCHETE;
target: comillas arroba nombre comillas;
kw_true: KW_TRUE;
kw_false: KW_FALSE;
kw_isList: KW_ISLIST;

kw_context: KW_CONTEXT;
kw_http: KW_HTTP;
kw_www: KW_WWW;
kw_id: KW_ID;
kw_name: KW_NAME;
kw_label: KW_LABEL;
kw_properties: KW_PROPERTIES;
kw_inherits: KW_INHERITS;
kw_graphs: KW_GRAPHS;
kw_reversename: KW_REVERSENAME;
kw_labelrn: KW_LABELRN;
kw_from: KW_FROM;
kw_to: KW_TO;
kw_typeof: KW_TYPEOF;
kw_usedby: KW_USEDBY;
kw_mulmax: KW_MULMAX;
kw_mulmin: KW_MULMIN;

punto: PUNTO;
barra: BARRA;
alm: ALM;
dos_ptos: DOS_PTOS;
sallave: SALLAVE;
scllave: SCLLAVE;
coma: COMA;
comillas: COMILLAS;
bbaja: BBAJA;
nombre: NOMBRE;
digito: DIGITO;
intro: INTRO;
arroba: ARROBA;
