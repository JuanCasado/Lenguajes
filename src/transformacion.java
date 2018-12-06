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

    public static void processJSON(ActionTable at) {
        for (int i = 0; i < at.size(); i++) {
            Action action = at.toDo(i);
            if (action != Action.skip) {
                // AQUI PROCESAMOS EL JSON
                System.out.println("Procesando JSON " + at.get(i, Content.json));
                String dotContent = "graph ejemplo{ node [fontname=\"Arial\"];  edge [fontname=\"Arial\",fontsize=12]; node [shape=record,style=filled,fillcolor=lightgoldenrodyellow,fontsize=10] property_name [label=\"{name|xsd:String}\"]; property_apellidos [label=\"{apellidos|xsd:String}\",style=\"filled,dashed\"]; property_edad [label=\"{edad|xsd:Integer}\"]; property_fechaUNIX [label=\"{fechaUnix|xsd:DateTime}\"]; property_mascotas [label=\"{mascotas|http://PdL.com/class#Mascota}\"]; property_nombreMascota [label=\"{nombreMascota|xsd:String}\"]; node [shape=ellipse,style=filled,fillcolor=lightseagreen,fontsize=20] class_Principal [label=\"Principal\"]; class_Hijo [label=\"Hijo\"]; class_Nieto [label=\"Nieto\"]; class_Mascota [label=\"Mascota\"] node [shape=hexagon,style=filled,fillcolor=paleturquoise,fontsize=15] relationship_conoceA [label=\"conoce A\"];  edge[style=dashed,len=3,color=grey] class_Principal -- property_name; class_Hijo -- property_name; class_Hijo -- property_apellidos; class_Nieto -- property_name; class_Nieto -- property_apellidos; class_Nieto -- property_edad; class_Nieto -- property_mascotas; class_Mascota -- property_nombreMascota;  relationship_conoceA -- property_fechaUNIX; property_mascotas -- class_Mascota [style=dotted,arrowhead=vee,dir=forward,arrowsize=2,label=\"TypeOf\"]; class_Nieto -- class_Mascota [label=\".mascotas (0..n)\", fontcolor=orangered, color=orangered, style=dashed, arrowhead=vee,dir=forward,arrowsize=2] edge[len=5,color=black] class_Principal -- class_Hijo [arrowhead=normal,arrowsize=3,dir=back,label=\"inherits\"]; class_Hijo -- class_Nieto [arrowhead=normal,arrowsize=3,dir=back,label=\"inherits\"];  relaciones edge[len=2,penwidth=3,color=blue] class_Nieto -- relationship_conoceA [label=\"Conoce A (0..n)\",fontcolor=blue,dir=forward,arrowhead=normal]; relationship_conoceA -- class_Nieto [label=\"es conocido por (0..n)\",fontcolor=blue,dir=forward,arrowhead=normal]; }";
                Engine engine = Engine.neato;
                if (action == Action.saveSvg) {
                    // AQUI GUARDAMOS EL SVG
                    try {
                        GraphGenerator.generateGraphFromString(engine, dotContent, at.get(i, Content.svg));
                        System.out.println("Guardando SVG " + at.get(i, Content.svg));
                    } catch (Exception e) {
                        System.out.println("Error al guardar el SVG");
                    }

                } else if (action == Action.saveDot) {
                    // AQUI GUARDAMOS EL DOT
                    try {
                        FileManager.write(at.get(i, Content.dot), dotContent);
                        System.out.println("Guardando DOT " + at.get(i, Content.dot));
                    } catch (Exception e) {
                        System.out.println("Error al guardar el DOT");
                    }

                } else if (action == Action.saveBoth) {
                    // AQUI GUARDAMOS AMBOS
                    try {
                        System.out.println("Guardando AMBOS");
                        System.out.println("Guardando SVG " + at.get(i, Content.svg));
                        GraphGenerator.generateGraphFromString(engine, dotContent, at.get(i, Content.svg));
                        System.out.println("Guardando DOT " + at.get(i, Content.dot));
                        FileManager.write(at.get(i, Content.dot), dotContent);
                    } catch (Exception e) {
                        System.out.println("Se ha producido un error");
                    }

                }
            }
        }
    }
}
