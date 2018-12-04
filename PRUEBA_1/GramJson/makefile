principal: JsonLexer JsonParser

JsonLexer: JsonLexer.java
	javac JsonLexer.java

JsonParser: JsonParser.java	
	javac JsonParser.java

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