import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

class main{  
    public static void main(String[] args) throws Exception{
        entradaParser parser = new entradaParser(new CommonTokenStream(new entradaLexer(args.length>0?new ANTLRInputStream(args[0]):new ANTLRInputStream(System.in))));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.fichero();
        System.out.println(tree.toStringTree(parser));
    }
}