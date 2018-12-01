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

    }
}