parser grammar CsvParser;

options{
    tokenVocab = CsvLexer;
    language = Java;
}

csv_file : info row+;
info : (dir coma dir coma dir coma dir end);
row : nombre rutafichero rutaficherosalida rutaficherografico;

dir : (FILE BARRA?)+;
json_file : FILE JSON_EXTENSION;
svg_file : FILE SVG_EXTENSION;
dot_file : FILE DOT_EXTENSION;
coma : COMA;
end : INTRO;
nombre : dir coma ;
rutafichero : dir json_file coma;
rutaficherosalida : dir dot_file coma;
rutaficherografico : dir svg_file end?;


