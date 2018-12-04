parser grammar JsonParser;

options{
    tokenVocab = JsonLexer;
    language = Java;
}

init: obj*;
obj: nombre? sallave (obj | list | prop)* scllave coma?;
list: nombre? sacorchete (obj | list | prop)* scllave coma?;
prop: 