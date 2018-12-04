grammar LExpr;

s : e;

e : e MULT e    # Mult      //el # es la manera de nombrar las operaciones
  | e ADD e     # Add
  | INT         # Int
  ;

MULT: '*';
ADD: '+';
INT: [0-9]+;
WS: [ \t\n\r]+ -> skip; 
