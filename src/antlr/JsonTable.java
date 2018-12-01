package antlr;

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class JsonTable {
    private final HashContenedor table;

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
        System.out.println(table.getNodeOf("row").get(0).getValueOf("nombre"));
        System.out.println(table.getNodeOf("row").get(1).getValueOf("nombre"));
        ArrayList<Tag> toGetJson = new ArrayList<>();
        toGetJson.add(new Tag("row"));

        if (table.validateContentent(toGetJson) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}