package antlr;

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class JsonTable {
    private final CharStream input;
    private 

    public JsonTable(FileInputStream stream) throws Exception {
        table = evaluateTree(CharStreams.fromStream(stream));
    }

    public JsonTable(String path) {
        table = evaluateTree(CharStreams.fromString(path));
    }

    private HashContenedor evaluateTree(CharStream input) {
        JsonParser parserJson = new JsonParser(new CommonTokenStream(new JsonLexer(input)));
        parserJson.setBuildParseTree(true);
        return new JsonVisitor().visit(parserJson.init());
    }

    public void test() {

    }
}