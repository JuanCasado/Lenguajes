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
            if (entrada.containsFile(EntradaTable.File.json)){
                String pathJson = entrada.getPath(EntradaTable.File.json);
                String nameJson = entrada.getName(EntradaTable.File.json);
                //Procesar JSON
                
                if (entrada.containsFile(EntradaTable.File.dot)){
                    String pathDot = entrada.getPath(EntradaTable.File.dot);
                    String nameDot = entrada.getName(EntradaTable.File.dot);
                    //Guardar Dot
                }
                if (entrada.containsFile(EntradaTable.File.svg)){
                    String pathSvg = entrada.getPath(EntradaTable.File.svg);
                    String nameSvg = entrada.getName(EntradaTable.File.svg);
                    //Guardar Svg
                }
            }
            if (entrada.containsFile(EntradaTable.File.csv)){
                String pathCsv = entrada.getPath(EntradaTable.File.csv);
                String nameCsv = entrada.getName(EntradaTable.File.csv);
                CsvTable csv = new CsvTable(new FileInputStream(pathCsv+nameCsv));
                if (csv.evaluateTree()) {
                    for (int i = 0; i < csv.getsize(); i++){
                        if (csv.containsFile(i, CsvTable.File.json)){
                            String pathJson = csv.getPath(i, CsvTable.File.json);
                            String nameJson = csv.getName(i, CsvTable.File.json);
                            // Procesar JSON

                            if (csv.containsFile(i, CsvTable.File.dot)) {
                                String pathDot = csv.getPath(i, CsvTable.File.dot);
                                String nameDot = csv.getName(i, CsvTable.File.dot);
                                // Guardar Dot
                            }
                            if (csv.containsFile(i, CsvTable.File.svg)) {
                                String pathSvg = csv.getPath(i, CsvTable.File.svg);
                                String nameSvg = csv.getName(i, CsvTable.File.svg);
                                // Guardar Svg
                            }
                        }
                    }
                } else {
                    System.out.println("Fallo en el CSV");
                }
            }
        } else {
            System.out.println("Fallo en los parámetros de entrada");
        }


        System.out.println("PRUEBAS DE JSON:"); 
        JsonTable json = new JsonTable(new FileInputStream("./../Documentos/nschema-RelacionFamiliar.json"));
        json.test();
    }
}