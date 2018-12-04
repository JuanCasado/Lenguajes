parser grammar CsvParser;

@header{
    package antlr;

    
}

options{
    tokenVocab = CsvLexer;
    language = Java;
}

init : info row+;
info : (dir coma dir coma dir coma dir end);
row : nombre rutafichero rutaficherosalida rutaficherografico end?;

dir : (FILE BARRA?)*;
json_file : (filename json_extension)?;
svg_file : (filename svg_extension)?;
dot_file : (filename dot_extension)?;
coma : COMA;
end : INTRO;
filename : FILE;
json_extension : JSON_EXTENSION?;
svg_extension : SVG_EXTENSION?;
dot_extension : DOT_EXTENSION?;
nombre : dir coma ;
rutafichero : dir json_file coma;
rutaficherosalida : dir dot_file coma;
rutaficherografico : dir svg_file coma?;


