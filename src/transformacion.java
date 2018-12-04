import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class transformacion {
    public static void main(String[] args) {
        CSVParser parserCSV = new CSVParser(new FileInputStream("./../Documentos/fichero_a_procesar.csv"));

    }

    /**
     * Método que devuelve el parser para el CSV
     * 
     * @param datos Contenido del archivo CSV
     * @return
     */
    public CSVParser procesarCSV(String datos) {
        input = CharStreams.fromString(datos);
        CSVParser parserCSV = new CSVParser(new CommonTokenStream(new CSVLexer(input)));
        parserCSV.setBuildParseTree(true);
        return parserCSV;
    }

    /**
     * Método que devuelve el parser para el CSV
     * 
     * @param datos InputStream desde el que llega el contenido del CSV
     */
    public void procesarCSV(InputStream datos) {
        input = CharStreams.fromStream(datos);
        CSVParser parserCSV = new CSVParser(new CommonTokenStream(new CSVLexer(input)));
        parserCSV.setBuildParseTree(true);
        return parserCSV;
    }
}