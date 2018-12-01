package antlr;

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class CsvTable {
    private final HashContenedor table;
    public CsvTable (FileInputStream stream) throws Exception {
        table = evaluateTree(CharStreams.fromStream(stream));
    }
    public CsvTable (String path){
        table = evaluateTree(CharStreams.fromString(path));
    }
    private HashContenedor evaluateTree (CharStream input){
        CsvParser parserCsv = new CsvParser(new CommonTokenStream(new CsvLexer(input)));
        parserCsv.setBuildParseTree(true);
        return new CsvVisitor().visit(parserCsv.init());
    }

    public void test(){
        System.out.println(table.getNodeOf("row").get(0).getValueOf("nombre"));
        System.out.println(table.getNodeOf("row").get(1).getValueOf("nombre"));
        ArrayList<Tag> toGetCsv = new ArrayList<>();
        toGetCsv.add(new Tag("row"));

        if (table.validateContentent(toGetCsv) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}