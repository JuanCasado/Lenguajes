lexer grammar gestrategiaLexer;

TEXTO: ~[,\n\r"]+;  //~ -> cualquier cosa que no sea eso
CADENA: '"' ('""'|~'"')* '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
INTRO: [\n\r]+;
SEPARADOR: ',';
