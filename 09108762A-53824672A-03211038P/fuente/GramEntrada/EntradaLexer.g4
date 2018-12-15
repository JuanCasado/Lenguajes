lexer grammar EntradaLexer;

@header{
package fuente.GramEntrada;
}

SPACE: ' ';

KW_JSON: '-JSON=';
KW_DOT: '-DOT=';
KW_SVG: '-SVG=';
KW_CSV: '-CSV=';
LEN: '-len';
FONTCOLOR: '-fontcolor';
FONTNAME: '-fontname';
FONTSIZE: '-fontsize';
ARROWSIZE: '-arrowsize';
ARROWHEAD: '-arrowhead';
ARROWCOLOR: '-arrowcolor';
PENWIDTH: '-penwidth';
FILLCOLOR: '-fillcolor';
STYLE: '-style';
SHAPE: '-shape';
COLOR: '-color';

EDGE: '_edge';
NODE: '_node';
DIR: '-dir';

RELATIONSHIP: '_relationship=';
CLASS: '_class=';
PROPERTY: '_property=';
INHERITANCE: '_inheritance=';
INDERECT_USE: '_indirect_use=';

TEXTO: .+?;
CADENA: '"'.+?'"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
