import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class transformacion {
    public static void main(String[] args) {
        ParseTreeWalker walker = new ParseTreeWalker();
        try {
            EntradaTable tablaEntrada = new EntradaTable();
            EntradaListener listenerEntrada = new EntradaListener(tablaEntrada);
            ParseTree tree;
            if (args.length > 0) {
                tree = procesarEntrada(args); // cuando nos lo pasan por argumento
            } else {
                tree = procesarEntrada(System.in); // cuando no nos pasan argumento
            }
            walker.walk(listenerEntrada, tree);

            if (tablaEntrada.hasCSV()) {

            }
        } catch (Exception e) {
            System.out.println("ERROR al procesar la ENTRADA");
            // System.out.println(e.toString());
        }

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
            // System.out.println(tablaCSV.toDo(0).toString());
        } catch (Exception e) {
            System.out.println("ERROR al procesar el archivo CSV");
        }

        /*
         * System.out.println("ESTO ES PARA IMPRIMIR JSON"); try { JSONTable tablaJSON =
         * new JSONTable(); = new JSONListener(tablaJSON); ParseTree tree =
         * procesarJSON(new
         * FileInputStream("./../Documentos/ficheros_a_procesar.json"));
         * walker.walk(listenerJSON, tree); // System.out.println(tablaJSON.toString());
         * 
         * for (int i = 0; i < tablaJSON.size(); i++) {
         * System.out.println(tablaJSON.get(i, Content.json)); }
         * System.out.println(tablaJSON.toDo(0).toString()); } catch (Exception e) {
         * System.out.println("ERROR al procesar el archivo JSON"); }
         */
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

    public static ParseTree procesarEntrada(String[] datos) throws Exception {
        BufferString sb = new BufferString();
        for (String s : datos) {
            sb.append(s);
        }
        EntradaParser parserEntrada = new EntradaParser(
                new CommonTokenStream(new EntradaLexer(CharStreams.fromString(sb.toString))));
        parserEntrada.setBuildParseTree(true);
        return parserEntrada.init();
    }

    public static ParseTree procesarEntrada(InputStream datos) throws Exception {
        EntradaParser parserEntrada = new EntradaParser(
                new CommonTokenStream(new EntradaLexer(CharStreams.fromStream(datos))));
        parserEntrada.setBuildParseTree(true);
        return parserEntrada.init();
    }
    /**
     * Método que devuelve el parser para el JSON
     * 
     * @param datos Contenido del archivo JSON
     * @return
     */
    /*
     * public static ParseTree procesarJSON(String datos) throws Exception {
     * JsonParser parserJSON = new JsonParser(new CommonTokenStream(new
     * JsonLexer(CharStreams.fromString(datos))));
     * parserJSON.setBuildParseTree(true); return parserJSON.init(); }
     * 
     * /** Método que devuelve el parser para el JSON
     * 
     * @param datos InputStream desde el que llega el contenido del JSON
     */
    /*
     * public static ParseTree procesarJSON(InputStream datos) throws Exception {
     * JSONParser parserJSON = new JsonParser(new CommonTokenStream(new
     * JsonLexer(CharStreams.fromStream(datos))));
     * parserJSON.setBuildParseTree(true); return parserJSON.init(); }
     */
}
