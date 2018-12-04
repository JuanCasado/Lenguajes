import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

public class Ejecucion {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        // Fuerzo la carga del fichero de pruebas
        inputFile = "C:\\antlr\\Lenguajes\\GramCSV\\datosprueba.csv";

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        CSVLexer lexer = new CSVLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.csv();

        // Creamos una tabla de símbolos de CSV
        TSimb_CSV_Avanzado miTablaDeSimbolos = new TSimb_CSV_Avanzado();

        // configuramos el listener
        CSVListener_TipoAvanzadoTS TB = new CSVListener_TipoAvanzadoTS(miTablaDeSimbolos);

        ParseTreeWalker walker = new ParseTreeWalker();

        // Recorremos el árbol
        walker.walk(TB, tree);

        System.out.print(miTablaDeSimbolos.toString());

        // Usamos la tabla de símbolos
        System.out.println(miTablaDeSimbolos.getValue(2, "City"));
        System.out.println(miTablaDeSimbolos.getValue(2, "Athlete"));

        int numcol = miTablaDeSimbolos.columnSize();
        for (int x = 0; x < numcol; x++) {
            System.out.println(miTablaDeSimbolos.getColumnName(x));
        }

        int numfil = miTablaDeSimbolos.rowSize();
        for (int x = 1; x <= numfil; x++) {
            System.out.println(miTablaDeSimbolos.getValue(x, "Athlete"));
        }
    }
}