parser grammar JsonParser;

options{
    tokenVocab = JsonLexer;
    language = Java;
}

init: obj*;

obj : (name col)? open_obj (obj|lis|prop)* clos_obj end?;
lis : (name col)? open_lis ((name end?)|lis|obj)* clos_lis end?;
prop: name col name end?;

col: COL;
name: NAME+;
open_lis: OPEN_LIS;
clos_lis: CLOS_LIS;
open_obj: OPEN_OBJ;
clos_obj: CLOS_OBJ;
end: END;