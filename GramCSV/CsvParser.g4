parser grammar CsvParser;

options{
    tokenVocab = CsvLexer;
    language = Java;
}

fichero: (declaracion | sentencias)*;

declaracion: (cosas* coma)* intro;
sentencias: nombre coma rutafichero coma rutaficherosalida coma rutaficherografico intro;

rutafichero: (doblepunto|punto|disco) barra? (barra (carpeta|archivo)*);
rutaficherosalida: (doblepunto|punto|disco) barra? (barra (carpeta|archivo)*);
rutaficherografico: (doblepunto|punto|disco) barra? (barra (carpeta|archivo)*);

carpeta: nombrecarpeta;
archivo: nombrearchivo punto extension;

nombre: IDENTIFICADOR;
cosas: IDENTIFICADOR;
intro: INTRO;
coma: COMA;
barra: BARRA;
doblepunto: DOBLEPUNTO;
disco: DISCO;
punto: PUNTO;
nombrearchivo: NOMBRECOSAS;
nombrecarpeta: NOMBRECOSAS;
extension: EXTENSION;
