package antlr;

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class EntradaTable {
    private final CharStream input;
    private HashMap<String, String[]> l2_fileContent;
    private HashMap<String, String> l2_parametrosContent;

    private static final String l1 [] = {
        "file",
        "parametros"
    };
    private static final String l1_f[] = { 
        "path", 
        "file" 
    };

    private static final String l2_file [] = {
        "json",
        "svg",
        "dot",
        "csv"
    };
    private static final String l2_parametros_f1 [] = {
        "len",
        "fontcol",
        "fontname",
        "fontsize",
        "arrowsize",
        "arrowcol",
        "penwidth",
        "fillcol",
        "style",
        "shape"
    };
    private static final String l2_parametros_f2 [] = {
        "rel",
        "class",
        "inher",
        "inder"
    };
    private static final String l2_parametros_f3 [] = {
        "edge",
        "node",
    };
    private final String l2_parametros [];

    public EntradaTable(FileInputStream stream) throws Exception {
        l2_parametros = createParameters();
        input = CharStreams.fromStream(stream);
    }

    public EntradaTable(String path) {
        l2_parametros = createParameters();
        input = CharStreams.fromString(path);
    }

    private String [] createParameters (){
        ArrayList <String> parameters = new ArrayList <>();
        for (String f1 : l2_parametros_f1) {
            for (String f2 : l2_parametros_f2){
                if (f1 != l2_parametros_f1[0]){
                    for (String f3 : l2_parametros_f3) {
                        parameters.add(f1+f2+f3);
                    }
                }else{
                    parameters.add(f1+f2);
                }
            }
        }
        String result [] = new String [parameters.size()];
        for (int x = 0; x < parameters.size(); x++){
            result[x] = parameters.get(x);
        }
        return result;
    }

    public boolean evaluateTree() {
        EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream(new EntradaLexer(input)));
        parserEntrada.setBuildParseTree(true);
        HashContenedor table = new EntradaVisitor().visit(parserEntrada.init());
        ArrayList<Tag> l1Tag = new ArrayList<>();
        for (String l1String : l1){
            l1Tag.add(new Tag(l1String));
        }
        HashMap<String,ArrayList<Tag>> l2_Tags = new HashMap<>();
        ArrayList<Tag> l2_fileTag = new ArrayList<>();
        for (String l2_fileString : l2_file) {
            l2_fileTag.add(new Tag(l2_fileString));
        }
        l2_Tags.put(l1[0], l2_fileTag);
        ArrayList<Tag> l2_parametrosTag = new ArrayList<>();
        for (String l2_parametrosString : l2_parametros) {
            l2_parametrosTag.add(new Tag(l2_parametrosString));
        }
        l2_Tags.put(l1[1], l2_parametrosTag);
        ArrayList <String> l1_content = table.validateContentent(l1Tag);
        if (l1_content == null )
            return false;

        if (l1_content.get(0)!=null){
            HashContenedor file = table.getNodeOf(l1[0]).get(0);
            ArrayList<String> fileContent = file.validateContentent(l2_fileTag);
            if (fileContent == null)
                return false;
            l2_fileContent = new HashMap<>();
            for (String fl : fileContent){
                if (fl!=null){
                    String vector []= new String [2];
                    vector[0]=file.getNodeOf(fl).get(0).getValueOf(l1_f[0]);
                    vector[1]=file.getNodeOf(fl).get(0).getValueOf(l1_f[1]);
                    l2_fileContent.put(fl, vector);
                }
            }
        }
        if (l1_content.get(1)!=null){
            HashContenedor parametros = table.getNodeOf(l1[1]).get(0);
            ArrayList<String> parametrosContent = parametros.validateContentent(l2_parametrosTag);
            if (parametrosContent == null)
                return false;
            l2_parametrosContent = new HashMap<>();
            for (String pl : parametrosContent){
                if (pl!=null){
                    l2_parametrosContent.put(pl, parametros.getValueOf(pl));
                }
            }
        }
        return true;
    }

    public static String[] getl1(){
        return l1;
    }
    
    public static String[] getl1_f() {
        return l1_f;
    }
    
    public static String[] getl2_file(){
        return l2_file;
    }
    
    public static String[] getl2_parametros_f1(){
        return l2_parametros_f1;
    }
    
    public static String[] getl2_parametros_f2(){
        return l2_parametros_f2;
    }
    
    public static String[] getl2_parametros_f3(){
        return l2_parametros_f3;
    }
}