principal: entradaLexer entradaParser

entradaLexer: entradaLexer.java
	javac entradaLexer.java

entradaParser: entradaParser.java	
	javac entradaParser.java

.PHONY: clean clean_java clean_class clean_interp clean_tokens
clean_java:
	rm -f *.java

clean_class:
	rm -rf *.class

clean_interp:
	rm -rf *.interp

clean_tokens:
	rm -rf *.java

clean:
	rm -f *.java *.class *.interp *.tokens