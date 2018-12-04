import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class transformacion {
    public static void main(String[] args) {
        try {
            CSVParser parserCSV = procesarCSV(new FileInputStream("./../Documentos/fichero_a_procesar.csv"));
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
        return parser.init();
    }

    /**
     * Método que devuelve el parser para el CSV
     * 
     * @param datos InputStream desde el que llega el contenido del CSV
     */
    public static ParseTree procesarCSV(InputStream datos) throws Exception {
        CSVParser parserCSV = new CSVParser(new CommonTokenStream(new CSVLexer(CharStreams.fromStream(datos))));
        parserCSV.setBuildParseTree(true);
        return parser.init();
    }
}