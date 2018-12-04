import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class transformacion {
    public static void main(String[] args) {
        ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println("ESTO ES PARA IMPRIMIR CSV");
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

        EntradaTable tableEntry = new EntradaTable();
        tableEntry.addJSON("toma json");
        tableEntry.addJSON("toma json 21312");
        tableEntry.addCSV("csv, hoal, qweq");
        tableEntry.addCSV("c2");
        tableEntry.addCSV("c3");
        tableEntry.addCSV("csv5");
        tableEntry.addCSV("csv, hoal, q12312eq");
        tableEntry.addDOT("soy un dot");
        tableEntry.addSVG("ni idea de lo que es un svg");

        System.out.println(tableEntry.toString());
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

    /**
     * Método que devuelve el parser para el JSON
     * 
     * @param datos Contenido del archivo JSON
     * @return
     */
    public static ParseTree procesarJSON(String datos) throws Exception {
        JsonParser parserJSON = new JsonParser(new CommonTokenStream(new JsonLexer(CharStreams.fromString(datos))));
        parserJSON.setBuildParseTree(true);
        return parserJSON.init();
    }

    /**
     * Método que devuelve el parser para el JSON
     * 
     * @param datos InputStream desde el que llega el contenido del JSON
     */
    public static ParseTree procesarJSON(InputStream datos) throws Exception {
        JSONParser parserJSON = new JsonParser(new CommonTokenStream(new JsonLexer(CharStreams.fromStream(datos))));
        parserJSON.setBuildParseTree(true);
        return parserJSON.init();
    }
}
