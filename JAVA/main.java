import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

class main{  
    public static void main(String[] args) throws Exception{
        EntradaParser parser = new EntradaParser(new CommonTokenStream(new EntradaLexer(args.length>0?new ANTLRInputStream(args[0]):new ANTLRInputStream(System.in))));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.init();
        
        //System.out.print(tree.toStringTree(parser));

        EntradaVisitor entrada = new EntradaVisitor();
        HashContenedor hash1 = entrada.visit(tree);

        ArrayList<Tag> toGet = new ArrayList<>();
        toGet.add(new Tag(Tag.State.MANDATORY, "id1"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "id2"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "hash2"));
        
        if (hash1.getContentent(toGet)!=null){
            System.out.print("ok");
        } else {
            System.out.print(":(");
        }
        
    }
}