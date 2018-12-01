import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

class main {
    public static void main(String[] args) throws Exception {
        /* A ENTREGAR CON:
         * EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream( new
         * EntradaLexer(args.length > 0 ? new ANTLRInputStream(args[0]) : new
         * ANTLRInputStream(System.in))));
         */
        ArrayList<Tag> toGet = new ArrayList<>();
        toGet.add(new Tag(Tag.State.MANDATORY, "id1"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "id2"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "hash2"));

        System.out.println("PRUEBAS DE ENTRADA:");
        EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream(new EntradaLexer(new ANTLRInputStream(new FileInputStream("./../Documentos/pruebas.prog")))));
        parserEntrada.setBuildParseTree(true);
        HashContenedor hash1 = new EntradaVisitor().visit(parserEntrada.init());
        
        if (hash1.getContentent(toGet) != null) {
            System.out.println("ok");
        } else {
            System.out.println(":(");
        }

        System.out.println("PRUEBAS DE CSV:");
        CsvParser parserCsv = new CsvParser(new CommonTokenStream(new CsvLexer(new ANTLRInputStream(new FileInputStream("./../Documentos/ficheros_a_procesar.csv"))))); 
        parserCsv.setBuildParseTree(true);
        HashContenedor hash2 = new CsvVisitor().visit(parserCsv.init());
        
        ArrayList<Tag> toGetCsv = new ArrayList<>();
        toGetCsv.add(new Tag(Tag.State.MANDATORY, "row"));

        if (hash2.getContentent(toGetCsv) != null) {
            System.out.println("ok");
        } else {
            System.out.println(":(");
        }
        

    }
}