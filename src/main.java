import antlr.*;
import java.io.*;

class main {
    public static void main(String[] args) throws Exception {
        /*
         * A ENTREGAR CON: EntradaParser parserEntrada = new EntradaParser(new
         * CommonTokenStream( new EntradaLexer(args.length > 0 ? new
         * ANTLRInputStream(args[0]) : new ANTLRInputStream(System.in))));
         */

        System.out.println("PRUEBAS DE ENTRADA:");
        EntradaTable entrada = new EntradaTable(new FileInputStream("./../Documentos/pruebas.prog"));
        //entrada.test();

        System.out.println("PRUEBAS DE CSV:");
        CsvTable csv = new CsvTable(new FileInputStream("./../Documentos/ficheros_a_procesar.csv"));
        csv.test();

        System.out.println("PRUEBAS DE JSON:"); 
        JsonTable json = new JsonTable(new FileInputStream("./../Documentos/nschema-RelacionFamiliar.json"));
        //json.test();
    }
}