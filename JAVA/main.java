import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

class main{  
    public static void main(String[] args) throws Exception{
        /*
        entradaParser parser = new entradaParser(new CommonTokenStream(new entradaLexer(args.length>0?new ANTLRInputStream(args[0]):new ANTLRInputStream(System.in))));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.fichero();
        
        System.out.print(tree.toStringTree(parser));

        entradaSimbols eSimbols = new entradaSimbols();
        entradaVisitor entrada = new entradaVisitor(eSimbols);
        entrada.visit(tree);
        */
        HashContenedor hash1 = new HashContenedor("hash1");
        HashContenedor hash2 = new HashContenedor("hash2");
        hash1.setFinal ("id1","cont1");
        hash1.setFinal ("id1","cont2");
        hash1.addNode(hash2);
        hash2.setFinal("id3", "cont3");
        hash2.setFinal("id4", "cont4");
        hash2.setFinal("id5", "cont5");
        ArrayList <Tag> toGet= new ArrayList<>();
        toGet.add(new Tag(Tag.State.MANDATORY,"id1"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "id2"));
        toGet.add(new Tag(Tag.State.OPTIONAL, "hash2"));
        if (hash1.getContentent(toGet)!=null){
            System.out.print("ok");
        } else {
            System.out.print(":(");
        }
        
    }
}