.PHONY: clean cleanAntlr cleanAll build buildAll buildAntlr
clean:
	rm -f ./*.class;
	rm -f ./fuente/*.class;
	rm -f ./fuente/GramCSV/*.class;
	rm -f ./fuente/GramEntrada/*.class;
	rm -f ./fuente/GramJSON/*.class;
cleanAntlr:
	rm -f ./fuente/GramCSV/*.java ./fuente/GramCSV/*.interp ./fuente/GramCSV/*.tokens;
	rm -f ./fuente/GramEntrada/*.java ./fuente/GramEntrada/*.interp ./fuente/GramEntrada/*.tokens;
	rm -f ./fuente/GramJSON/*.java ./fuente/GramJSON/*.interp ./fuente/GramJSON/*.tokens;
cleanAll:
	rm -f ./*.class;
	rm -f ./fuente/*.class;
	rm -f ./fuente/GramCSV/*.java ./fuente/GramCSV/*.class ./fuente/GramCSV/*.interp ./fuente/GramCSV/*.tokens;
	rm -f ./fuente/GramEntrada/*.java ./fuente/GramEntrada/*.class ./fuente/GramEntrada/*.interp ./fuente/GramEntrada/*.tokens;
	rm -f ./fuente/GramJSON/*.java ./fuente/GramJSON/*.class ./fuente/GramJSON/*.interp ./fuente/GramJSON/*.tokens;
build:
	javac ./fuente/GramJSON/*.java;
	javac ./fuente/GramCSV/*.java;
	javac ./fuente/GramEntrada/*.java;
	javac ./fuente/*.java;
	javac ./*.java;
buildAntlr:
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramCSV/CSVLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramCSV/CSVParser.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramEntrada/EntradaLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramEntrada/EntradaParser.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramJSON/JSONLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramJSON/JSONParser.g4;
buildAll:
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramCSV/CSVLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramCSV/CSVParser.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramEntrada/EntradaLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramEntrada/EntradaParser.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramJSON/JSONLexer.g4;
	java -jar /usr/local/lib/antlr-4.7.1-complete.jar ./fuente/GramJSON/JSONParser.g4;
	javac ./fuente/GramJSON/*.java;
	javac ./fuente/GramCSV/*.java;
	javac ./fuente/GramEntrada/*.java;
	javac ./fuente/*.java;
	javac ./*.java;