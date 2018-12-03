parser grammar jParser;

options{
    tokenVocab = jLexer;
    language = Java;
}

init: sallave (descripcion|obj|array)* scllave;
obj: nombre_obj? sallave (array|obj|estr)* scllave coma?;

array: nombre_array? sacorchete (estr|array|obj)* sccorchete coma?;
estr:  (reglas coma?)+ ;

ruta: (nombre|barra|alm|digito|punto|bbaja|guion|dos_ptos)*;

descripcion: comillas arroba nombre comillas dos_ptos sallave definicion* scllave coma?;
definicion: comillas arroba? nombre comillas dos_ptos comillas (nombre|ruta) comillas coma?
          | comillas nombre comillas dos_ptos sallave definicion* scllave coma?
          ;

reglas: (pclass  /*/relationship | property | languageProperty*/ );
pclass: (id | name | label | inherits | properties)+;
id: kw_id comillas ruta comillas coma?;
name: kw_name comillas nombre comillas coma?;
label: kw_label ampli_info coma?;
properties: kw_properties sacorchete (comillas ruta comillas coma?)+ sccorchete coma?;
inherits: kw_inherits (comillas ruta  comillas coma?)+ coma?;
ampli_info: sallave definicion* scllave;


nombre: NOMBRE;
nombre_obj: comillas arroba nombre comillas dos_ptos
          | comillas nombre comillas dos_ptos
          ;

nombre_array: nombre_obj;
nombre_est: nombre_obj;
comillas: COMILLAS;
sallave: SALLAVE;
scllave: SCLLAVE;
sacorchete: SACORCHETE;
sccorchete: SCCORCHETE;
arroba: ARROBA;
coma: COMA;
punto: PUNTO;
barra: BARRA;
dos_ptos: DOS_PTOS;
alm: ALM;
digito: DIGITO;
bbaja: BBAJA;
guion: GUION;


kw_id: KW_ID;
kw_inherits: KW_INHERITS;
kw_label: KW_LABEL;
kw_name: KW_NAME;
kw_properties: KW_PROPERTIES;


