
//fichero ejecutable

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Testear {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);
        LExprLexer lexer = new LExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LExprParser parser = new LExprParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.s();

        // Enseñamos el árbol
        System.out.println(tree.toStringTree(parser));

        VisitorNuestro nv = new VisitorNuestro();
        int resultado = nv.visit(tree);

        System.out.println("El resultado del árbol es: " + resultado);
    }
}