lexer grammar EntradaLexer;

SPACE: ' ';
ASIG: '=';

KW_JSON: GUION?'JSON';
KW_DOT: GUION?'DOT';
KW_SVG: GUION?'SVG';
KW_CSV: GUION?'CSV';
LEN: GUION?'len';
FONTCOLOR: GUION?'fontcolor';
FONTNAME: GUION?'fontname';
FONTSIZE: GUION?'fontsize';
ARROWSIZE: GUION?'arrowsize';
ARROWCOLOR: GUION?'arrowcolor';
PENWIDTH: GUION?'penwidth';
FILLCOLOR: GUION?'fillcolor';
STYLE: GUION?'style';
SHAPE: GUION?'shape';

EDGE: (BARRABAJA|GUION)?'edge';
NODE: (BARRABAJA|GUION)?'node';

RELATIONSHIP: (BARRABAJA|GUION)?'relationship';
CLASS: (BARRABAJA|GUION)?'class';
PROPERTY: (BARRABAJA|GUION)?'property';
INHERITANCE: (BARRABAJA|GUION)?'inheritance';
INDERECT_USE: (BARRABAJA|GUION)?'inderect_use';

fragment BARRABAJA: '_';
fragment GUION: '-';

TEXTO: .+?;
CADENA: '"'.+?'"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
