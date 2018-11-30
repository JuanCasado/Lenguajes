import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

class main {
    public static void main(String[] args) throws Exception {
        /*
         * EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream( new
         * EntradaLexer(args.length > 0 ? new ANTLRInputStream(args[0]) : new
         * ANTLRInputStream(System.in))));
         */

        EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream(new EntradaLexer(
                new ANTLRInputStream(new FileInputStream("C:\\antlr\\Lenguajes\\Documentos\\pruebas.prog")))));
        parserEntrada.setBuildParseTree(true);
        HashContenedor hash1 = new EntradaVisitor().visit(parserEntrada.init());

        /*
         * CsvParser parserCsv = new CsvParser(new CommonTokenStream(new CsvLexer(new
         * ANTLRInputStream(new FileInputStream(
         * "/Users/mr.blissfulgrin/Documents/UAH_2018_2019/LENGUAJES/LAB/PEL2/Documentos/ficheros_a_procesar.csv"
         * ))))); parserCsv.setBuildParseTree(true); HashContenedor hash2 = new
         * CsvVisitor().visit(parserCsv.init());
         */

        ArrayList<Tag> toGet = new ArrayList<>();
        toGet.add(new Tag(Tag.State.MANDATORY, "id1"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "id2"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "hash2"));

        if (hash1.getContentent(toGet) != null) {
            System.out.print("ok");
        } else {
            System.out.print(":(");
        }

    }
}