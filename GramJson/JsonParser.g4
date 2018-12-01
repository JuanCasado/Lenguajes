parser grammar JsonParser;

options{
    tokenVocab = JsonLexer;
    language = Java;
}

init: sallave context? graphs scllave;
context:  kw_context sallave (descripcion coma?)+  scllave coma ;
descripcion: (dos_ptos | cadena| intro | ampli_info| nombre| ruta| declaracion|target|kw| comillas)+;
cadena: comillas (nombre (bbaja (nombre|digito)+)?)* comillas;
ampli_info: sallave (descripcion coma?)+ scllave coma?;
ruta: comillas kw_http kw_www? ( (nombre|digito)+ punto? barra? alm?)+ comillas;
declaracion:  comillas arroba nombre comillas dos_ptos comillas nombre dos_ptos nombre comillas coma?
            | comillas arroba nombre comillas dos_ptos ruta coma?
            | comillas arroba nombre comillas dos_ptos cadena+ coma?
            | comillas arroba nombre comillas dos_ptos nombre+ coma?
            | comillas arroba nombre comillas dos_ptos comillas arroba nombre+ comillas coma?
            | comillas arroba nombre comillas dos_ptos comillas digito comillas coma?
            ;
/* GRAPHS COMPUESTO DE DOMAIN CHARACTERISTICS PROPERTIES QUE SON LOS OBJETOS */
graphs: kw_graphs sacorchete (lista)* sccorchete;
/* DENTRO DE CADA OBJETO ENCONTRAMOS LOS LIST QUE SON @NOMBRE */
lista: sallave (comillas nombre comillas dos_ptos) sallave objetos* scllave scllave coma?
     | sallave (kw_properties) sallave objetos* scllave scllave coma?
     ;
objetos: target dos_ptos sacorchete (prop coma?)* sccorchete;
//list: nombre? sallave (prop|objetos|list)+ scllave coma?;
prop: sallave (pclass | relationship | property | languageProperty) scllave ;

pclass:  (id | name |label | inherits |properties)+ ;
id: kw_id  ruta coma?;
name: kw_name comillas nombre comillas coma?;
label: kw_label  ampli_info coma?;
properties: kw_properties sacorchete (ruta coma?)+ sccorchete coma?;
inherits: kw_inherits(ruta coma?)+ coma?;

relationship:  (id|name|reverse_name|label|labelrn|from|to|properties)+ ;
reverse_name: kw_reversename comillas nombre comillas coma?;
labelrn: kw_labelrn ampli_info coma? ;
from: kw_from  ruta coma?;
to: kw_to  ruta coma?;

property:  id  name (typeOf | label | isList | optional | mulMax | mulMin | usedby /* | languageData */)+ ;
optional: kw_optional nombre coma?  
        | kw_optional ampli_info coma?
        | kw_optional (kw_true|kw_false) coma?
        ;
languageData: kw_languageData nombre_obj coma
            | kw_languageData ampli_info coma
            ;
        

typeOf: kw_typeof comillas nombre+ dos_ptos nombre+ comillas coma?
      | kw_typeof ruta coma?
      ;
usedby: kw_usedby sacorchete ruta sccorchete coma?;
isList: kw_isList  bool coma?;
bool: kw_true|kw_false;
mulMin: kw_mulmin comillas (nombre|digito) comillas coma?;
mulMax: kw_mulmax comillas (nombre|digito) comillas coma?;
//languageData:;

languageProperty:  (id| language | gender |number |wordType )+ ;
language: kw_language nombre coma
        | kw_language ampli_info coma
        ;
gender: kw_gender nombre coma
        | kw_gender ampli_info coma
        ;
number: kw_number nombre coma
        | kw_number ampli_info coma
        ;
wordType: kw_wordType nombre coma
        | kw_wordType ampli_info coma
        ;


nombre_obj: nombre;
sacorchete: SACORCHETE;
sccorchete: SCCORCHETE;
target: comillas arroba nombre comillas;
kw: (kw_context | kw_false| kw_from| kw_gender| kw_http| kw_id |kw_inherits | kw_isList | kw_label | kw_labelrn | kw_language | kw_mulmax | kw_mulmin | kw_name | kw_number | kw_properties | kw_reversename | kw_to | kw_true | kw_typeof | kw_usedby | kw_wordType | kw_www | kw_optional |kw_languageData);
kw_true: KW_TRUE;
kw_false: KW_FALSE;
kw_isList: KW_ISLIST;
kw_optional: KW_OPTIONAL;
kw_languageData: KW_LANGUAGEDATA;
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
kw_language: KW_LANGUAGE;
kw_number: KW_NUMBER;
kw_gender: KW_GENDER;
kw_wordType: KW_WORDTYPE;

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