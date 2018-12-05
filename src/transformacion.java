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
            ParseTree treeEntrada;
            if (args.length > 0) {
                treeEntrada = procesarEntrada(args); // cuando nos lo pasan por argumento
            } else {
                treeEntrada = procesarEntrada(System.in); // cuando no nos pasan argumento
            }
            walker.walk(listenerEntrada, treeEntrada);
            processJSON(tablaEntrada);
            if (tablaEntrada.hasCSV()) {
                for (int i = 0; i < tablaEntrada.csvSize(); i++) {
                    tablaEntrada.getCSV(i);
                    try {
                        CSVTable tablaCSV = new CSVTable();
                        CSVListener listenerCSV = new CSVListener(tablaCSV);
                        ParseTree treeCSV = procesarCSV(new FileInputStream(tablaEntrada.getCSV(i)));
                        walker.walk(listenerCSV, treeCSV);

                        processJSON(tablaCSV);
                    } catch (Exception e) {
                        System.out.println("ERROR al procesar el archivo CSV: " + tablaEntrada.getCSV(i));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR al procesar la ENTRADA");
            // System.out.println(e.toString());
        }

        /*
         * System.out.
         * println("-------------------------------------------------------\nPRUEBA JSON"
         * ); System.out.println("ESTO ES PARA IMPRIMIR JSON"); try { JSONTable
         * tablaJSON = new JSONTable(); new JsonVisitor(tablaJSON)
         * .visit(procesarJSON(new
         * FileInputStream("./../Documentos/nschema-RelacionFamiliar.json")));
         * 
         * System.out.println(tablaJSON.toString()); } catch (Exception e) { //
         * System.out.println("ERROR al procesar el archivo JSON");
         * System.out.println(e.toString()); }
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
        StringBuffer sb = new StringBuffer();
        for (String s : datos) {
            sb.append(s);
            sb.append(" ");
        }
        EntradaParser parserEntrada = new EntradaParser(
                new CommonTokenStream(new EntradaLexer(CharStreams.fromString(sb.toString()))));
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
        JsonParser parserJSON = new JsonParser(new CommonTokenStream(new JsonLexer(CharStreams.fromStream(datos))));
        parserJSON.setBuildParseTree(true);
        return parserJSON.init();
    }

    public static void processJSON(ActionTable at) {
        for (int i = 0; i < at.size(); i++) {
            Action action = at.toDo(i);
            if (action != Action.skip) {
                // AQUI PROCESAMOS EL JSON
                System.out.println("Procesando JSON " + at.get(i, Content.json));
                if (action == Action.saveSvg) {
                    // AQUI GUARDAMOS EL SVG
                    System.out.println("Guardando SVG " + at.get(i, Content.svg));
                } else if (action == Action.saveDot) {
                    // AQUI GUARDAMOS EL DOT
                    System.out.println("Guardando DOT " + at.get(i, Content.dot));
                } else if (action == Action.saveBoth) {
                    // AQUI GUARDAMOS AMBOS
                    System.out.println("Guardando AMBOS");
                    System.out.println("Guardando SVG " + at.get(i, Content.svg));
                    System.out.println("Guardando DOT " + at.get(i, Content.dot));
                }
            }
        }
    }
}
