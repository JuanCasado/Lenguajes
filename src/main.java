import antlr.*;
import java.io.*;

class main {
    public static void main(String[] args) throws Exception {
        EntradaTable entrada;
        if (args.length > 0){
            entrada = new EntradaTable(args);
        }else{
            entrada = new EntradaTable(System.in);
        }
        if (entrada.evaluateTree()){
            if (entrada.containsFile(EntradaTable.File.svg)){

                if (entrada.containsFile(EntradaTable.File.json)){
                    String path = entrada.getPath(EntradaTable.File.json);
                    String name = entrada.getName(EntradaTable.File.json);
                    //Procesar JSON
                    System.out.println("JSON: "+path+name);
                }
                if (entrada.containsFile(EntradaTable.File.dot)){
                    String path = entrada.getPath(EntradaTable.File.dot);
                    String name = entrada.getName(EntradaTable.File.dot);
                    //GUARDAR DOT
                    System.out.println("DOT: " + path + name);
                }
                //CREAR SVG
                String path = entrada.getPath(EntradaTable.File.svg);
                String name = entrada.getName(EntradaTable.File.svg);
                System.out.println("SVG: " + path + name);
            }
            if (entrada.containsFile(EntradaTable.File.csv)){
                String path = entrada.getPath(EntradaTable.File.csv);
                String name = entrada.getName(EntradaTable.File.csv);
                // PROCESAR CSV
                System.out.println("CSV: " + path + name);
            }
        } else {
            System.out.println("Fallo en los parámetros de entrada");
        }

        System.out.println("PRUEBAS DE CSV:");
        CsvTable csv = new CsvTable(new FileInputStream("./../Documentos/ficheros_a_procesar.csv"));
        csv.test();

        System.out.println("PRUEBAS DE JSON:"); 
        JsonTable json = new JsonTable(new FileInputStream("./../Documentos/nschema-RelacionFamiliar.json"));
        json.test();
    }
}