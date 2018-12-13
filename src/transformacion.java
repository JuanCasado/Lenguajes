import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.lang.reflect.Method;

import java.io.*;
import java.util.*;

public class transformacion {
    private static final String SEPARATOR = "----------------------------------------------------------------------------------------------------------------------------------";

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
            // System.out.println(tablaEntrada.toString());

            ArrayList<String> _node_relationship = tablaEntrada.getNodeRelationshipParameters();
            ArrayList<String> _edge_relationship = tablaEntrada.getEdgeRelationshipParameters();
            ArrayList<String> _node_class = tablaEntrada.getNodeClassParameters();
            ArrayList<String> _edge_class = tablaEntrada.getEdgeClassParameters();
            ArrayList<String> _node_property = tablaEntrada.getNodePropertyParameters();
            ArrayList<String> _edge_property = tablaEntrada.getEdgePropertyParameters();
            ArrayList<String> _node_inheritance = tablaEntrada.getNodeInheritanceParameters();
            ArrayList<String> _edge_inheritance = tablaEntrada.getEdgeInheritanceParameters();
            ArrayList<String> _node_indirect_use = tablaEntrada.getNodeIndirectUseParameters();
            ArrayList<String> _edge_indirect_use = tablaEntrada.getEdgeIndirectUseParameters();
            ArrayList<ActionTable> actions = new ArrayList<>();
            Nombres languaje = Nombres.name;
            actions.add(tablaEntrada);
            if (tablaEntrada.hasCSV()) {
                for (int i = 0; i < tablaEntrada.csvSize(); i++) {
                    tablaEntrada.getCSV(i);
                    try {
                        CSVTable tablaCSV = new CSVTable();
                        CSVListener listenerCSV = new CSVListener(tablaCSV);
                        ParseTree treeCSV = procesarCSV(new FileInputStream(tablaEntrada.getCSV(i)));
                        walker.walk(listenerCSV, treeCSV);
                        actions.add(tablaCSV);
                    } catch (Exception e) {
                        System.out.println("ERROR al procesar el archivo CSV: " + tablaEntrada.getCSV(i));
                        System.out.println(e.toString());
                    }
                }
            }
            System.out.println("\n" + SEPARATOR);
            HashMap<String, JSONTable> jsonResult = new HashMap<>();
            for (ActionTable at : actions) {
                for (int i = 0; i < at.size(); i++) {
                    Action action = at.toDo(i);
                    switch (action) {
                    case skip:
                        System.out.println("No action needed for " + at.get(i, Content.json));
                        break;
                    case saveDot:
                        System.out.println("We only need to save a dot file for" + at.get(i, Content.json));
                        break;
                    case saveSvg:
                        System.out.println("We only need to save a svg file for" + at.get(i, Content.json));
                        break;
                    case saveBoth:
                        System.out.println("We need to save a dot and a svg files for" + at.get(i, Content.json));
                        break;
                    }
                    if (action != Action.skip) {
                        try {
                            JSONTable tablaJSON;
                            System.out.println(SEPARATOR);
                            if (jsonResult.keySet().contains(at.get(i, Content.json))) {
                                System.out.println("JSON: " + at.get(i, Content.json)
                                        + " already processed retrieving from memory");
                                tablaJSON = jsonResult.get(at.get(i, Content.json));
                            } else {
                                System.out.println("Procesando JSON: " + at.get(i, Content.json));
                                tablaJSON = new JSONTable();
                                jsonResult.put(at.get(i, Content.json), tablaJSON);
                                JSONListener listenerJSON = new JSONListener(tablaJSON);
                                ParseTree treeJSON = procesarJSON(new FileInputStream(at.get(i, Content.json)));
                                walker.walk(listenerJSON, treeJSON);
                                //System.out.println(tablaJSON.toString());
                            }
                            for (int j = 0; j < tablaJSON.getSize(); j++) {

                                String dotContent = tablaJSON.getDotContent(j, languaje, _node_relationship,
                                        _edge_relationship, _node_class, _edge_class, _node_property, _edge_property,
                                        _node_inheritance, _edge_inheritance, _node_indirect_use, _edge_indirect_use);

                                // String dotContent = "";
                                Engine engine = tablaJSON.getEngine(j);
                                String dotName = at.get(i, Content.dot);
                                String svgName = at.get(i, Content.svg);
                                System.out.println("\nFound : " + tablaJSON.getName(j));
                                if (tablaJSON.getSize() > 1) {
                                    if (dotName.endsWith(".dot")) {
                                        dotName = dotName.replace(".dot", "_" + tablaJSON.getName(j) + ".dot");
                                    } else {
                                        dotName += "_" + tablaJSON.getName(j) + ".dot";
                                    }
                                    if (svgName.endsWith(".svg")) {
                                        svgName = svgName.replace(".svg", "_" + tablaJSON.getName(j) + ".svg");
                                    } else {
                                        svgName += "_" + tablaJSON.getName(j) + ".svg";
                                    }
                                }
                                if (action == Action.saveSvg) {
                                    // AQUI GUARDAMOS EL SVG
                                    try {
                                        GraphGenerator.generateGraphFromFileTmp(engine, dotContent, svgName);
                                        System.out.println("Guardando SVG: " + svgName + " with " + engine.toString());
                                        abrirURL(svgName);
                                    } catch (Exception e) {
                                        System.out.println("Error al guardar el SVG: " + svgName);
                                        System.out.println(e.toString());
                                    }
                                } else if (action == Action.saveDot) {
                                    // AQUI GUARDAMOS EL DOT
                                    try {
                                        FileManager.write(dotName, dotContent);
                                        System.out.println("Guardando DOT: " + dotName);
                                    } catch (Exception e) {
                                        System.out.println("Error al guardar el DOT: " + dotName);
                                        System.out.println(e.toString());
                                    }

                                } else if (action == Action.saveBoth) {
                                    // AQUI GUARDAMOS AMBOS
                                    try {
                                        // System.out.println("Guardando AMBOS");
                                        System.out.println("Guardando DOT: " + dotName);
                                        FileManager.write(dotName, dotContent);
                                    } catch (Exception e) {
                                        System.out.println("Error al guardar el DOT: " + dotName);
                                        System.out.println(e.toString());
                                    }
                                    try {
                                        System.out.println("Guardando SVG: " + svgName + " with " + engine.toString());
                                        GraphGenerator.generateGraphFromFile(engine, dotName, svgName);
                                        abrirURL(svgName);
                                    } catch (Exception e) {
                                        System.out.println("Error al guardar el SVG: " + svgName);
                                        System.out.println(e.toString());
                                    }
                                }
                            }
                            System.out.println(SEPARATOR);
                            // System.out.println(tablaJSON.toString());
                        } catch (Exception e) {
                            System.out.println("ERROR al procesar el archivo JSON: " + at.get(i, Content.json));
                            System.out.println(e.toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR al procesar la ENTRADA");
            System.out.println(e.toString());
        }
        System.out.print("\n");
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
        JSONParser parserJSON = new JSONParser(new CommonTokenStream(new JSONLexer(CharStreams.fromString(datos))));
        parserJSON.setBuildParseTree(true);
        return parserJSON.init();
    }

    /**
     * Método que devuelve el parser para el JSON
     * 
     * @param datos InputStream desde el que llega el contenido del JSON
     */
    public static ParseTree procesarJSON(InputStream datos) throws Exception {
        JSONParser parserJSON = new JSONParser(new CommonTokenStream(new JSONLexer(CharStreams.fromStream(datos))));
        parserJSON.setBuildParseTree(true);
        return parserJSON.init();
    }
    public static void abrirURL(String url) {
        String nombreSO = System.getProperty("os.name");
        url = "file://"+ System.getProperty("user.dir") + "/" + url;
        System.out.println("Opening: "+url);
        try {
            if (nombreSO.startsWith("Mac OS")) {
                Class manager = Class.forName("com.apple.eio.FileManager");
                Method openURL = manager.getDeclaredMethod("openURL", new Class[] { String.class });
                openURL.invoke(null, new Object[] { url });
            } else if (nombreSO.startsWith("Windows")) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
                p.waitFor();
            } else {
                String[] navegadores = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari",
                        "Safari", "Chrome", "chrome", "Google Chrome", "google chrome" };
                String navegador = null;
                for (int contador = 0; contador < navegadores.length && navegador == null; contador++) {
                    if (Runtime.getRuntime().exec(new String[] { "which", navegadores[contador] }).waitFor() == 0) {
                        navegador = navegadores[contador];
                    }
                }
                if (navegador != null) {
                    Process p = Runtime.getRuntime().exec(new String[] { navegador, url });
                    p.waitFor();
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
