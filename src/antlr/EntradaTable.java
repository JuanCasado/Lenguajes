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
        System.out.println(table.getNodeOf("file").get(0).getNodeOf("json").get(0).getValueOf("path"));
        System.out.println(table.getNodeOf("file").get(0).getNodeOf("svg").get(0).getValueOf("file"));
        System.out.println(table.getNodeOf("parametros").get(0).getValueOf("styleinhernode"));
        System.out.println(table.getNodeOf("parametros").get(0).getValueOf("lenrel"));
        System.out.println(table.getNodeOf("parametros").get(0).getValueOf("shapeindernode"));
    }
}