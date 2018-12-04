import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class transformacion {
    public static void main(String[] args) {
        ParseTreeWalker walker = new ParseTreeWalker();
        try {
            CSVTable tablaCSV = new CSVTable();
            CSVListener listenerCSV = new CSVListener(tablaCSV);
            ParseTree tree = procesarCSV(new FileInputStream("./../Documentos/ficheros_a_procesar.csv"));
            walker.walk(listenerCSV, tree);
            // System.out.println(tablaCSV.toString());

            for (int i = 0; i < tablaCSV.size(); i++) {
                System.out.println(tablaCSV.get(i, Content.json));
            }
            System.out.println(tablaCSV.toDo(0).toString());
        } catch (Exception e) {
            System.out.println("ERROR al procesar el archivo CSV");
        }

    }

    /**
     * Método que devuelve el parser para el CSV
     * 
     * @param datos Contenido del archivo CSV
     * @return
     */
    public static ParseTree procesarCSV(String datos) throws Exception {
        CSVParser parserCSV = new CSVParser(new CommonTokenStream(new CSVLexer(CharStreams.fromString(datos))));
        parserCSV.setBuildParseTree(true);
        return parserCSV.init();
    }

    /**
     * Método que devuelve el parser para el CSV
     * 
     * @param datos InputStream desde el que llega el contenido del CSV
     */
    public static ParseTree procesarCSV(InputStream datos) throws Exception {
        CSVParser parserCSV = new CSVParser(new CommonTokenStream(new CSVLexer(CharStreams.fromStream(datos))));
        parserCSV.setBuildParseTree(true);
        return parserCSV.init();
    }
}