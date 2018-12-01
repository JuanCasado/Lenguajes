package antlr;

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class EntradaTable {
    private final HashContenedor table;

    public EntradaTable(FileInputStream stream) throws Exception {
        table = evaluateTree(CharStreams.fromStream(stream));
    }

    public EntradaTable(String path) {
        table = evaluateTree(CharStreams.fromString(path));
    }

    private HashContenedor evaluateTree(CharStream input) {
        EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream(new EntradaLexer(input)));
        parserEntrada.setBuildParseTree(true);
        return new EntradaVisitor().visit(parserEntrada.init());
    }

    public void test() {
        System.out.println(table.getNodeOf("row").get(0).getValueOf("nombre"));
        System.out.println(table.getNodeOf("row").get(1).getValueOf("nombre"));
        ArrayList<Tag> toGetEntrada = new ArrayList<>();
        toGetEntrada.add(new Tag("row"));

        if (table.validateContentent(toGetEntrada) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}