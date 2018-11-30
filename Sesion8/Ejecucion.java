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
        inputFile = "C:\\antlr\\Sesion8\\datosprueba.csv";

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        gestrategiaLexer lexer = new gestrategiaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gestrategiaParser parser = new gestrategiaParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.csv();

        // configuramos el listener
        CSVListener_TipoBasico TB = new CSVListener_TipoBasico();

        ParseTreeWalker walker = new ParseTreeWalker();

        // Recorremos el árbol
        walker.walk(TB, tree);

        System.out.print(TB.filas);
    }
}