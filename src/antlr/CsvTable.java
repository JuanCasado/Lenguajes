package antlr;

import org.antlr.v4.runtime.*;

import java.util.*;
import java.io.*;

public class CsvTable {
    private final CharStream input;
    private final static String row = "row";
    private final static String[] cols = {
        "nombre",
        "json",
        "dot",
        "svg"
    };

    private ArrayList <HashMap<String,String>> fileContent;

    public CsvTable(InputStream stream) throws Exception {
        input = CharStreams.fromStream(stream);
    }

    public CsvTable(String path) {
        input = CharStreams.fromString(path);
    }

    public CsvTable(String[] args) {
        StringBuffer path = new StringBuffer();
        for (String str : args){
            path.append(str);
            path.append(" ");
        }
        input = CharStreams.fromString(path.toString());
    }
    public boolean evaluateTree (){
        CsvParser parserCsv = new CsvParser(new CommonTokenStream(new CsvLexer(input)));
        parserCsv.setBuildParseTree(true);
        HashContenedor table = new CsvVisitor().visit(parserCsv.init());

        ArrayList <Tag> rowEval = new ArrayList<>();
        rowEval.add(new Tag(Tag.State.MANDATORY, row));
        ArrayList<String> contentValidated  = table.validateContentent(rowEval);
        if (contentValidated==null)
            return false;

        ArrayList<Tag> colEval = new ArrayList<>();
        for (String colName : cols){
            colEval.add(new Tag(colName));
        }

        ArrayList<HashContenedor> rawRows = table.getNodeOf(contentValidated.get(0));
        fileContent = new ArrayList<>();
        for (HashContenedor rawRow : rawRows){
            HashMap<String, String> rowContent = new HashMap<>();
            ArrayList<String> colContentValidated = rawRow.validateContentent(colEval);
            if (colContentValidated == null){
                return false;
            }
            for (String validCol : colContentValidated){
                rowContent.put(validCol, rawRow.getValueOf(validCol));
            }
            fileContent.add(rowContent);
        }
        return true;
    }

    protected static String getRow (){
        return row;
    }

    protected static String[] getCols (){
        return cols;
    }

    public static enum File {
        nombre,
        json, 
        svg, 
        dot
    };

    public int getsize(){
        return fileContent.size();
    }
    
    public boolean containsFile(int index, File file) {
        if (index>= getsize())
            return false;
        switch (file) {
        case nombre:
            return fileContent.get(index).containsKey(cols[0]);
        case json:
            return fileContent.get(index).containsKey(cols[1]);
        case svg:
            return fileContent.get(index).containsKey(cols[2]);
        case dot:
            return fileContent.get(index).containsKey(cols[3]);
        }
        return false;
    }

    public String getPath(int index, File file) {
        if (containsFile(index, file))
            switch (file) {
            case nombre:
                return parseToPath(fileContent.get(index).get(cols[0]));
            case json:
                return parseToPath(fileContent.get(index).get(cols[1]));
            case svg:
                return parseToPath(fileContent.get(index).get(cols[2]));
            case dot:
                return parseToPath(fileContent.get(index).get(cols[3]));
            }
        return null;
    }

    public String getName(int index, File file) {
        if (containsFile(index, file))
            switch (file) {
            case nombre:
                return parseToFile(fileContent.get(index).get(cols[0]));
            case json:
                return parseToFile(fileContent.get(index).get(cols[1]));
            case svg:
                return parseToFile(fileContent.get(index).get(cols[2]));
            case dot:
                return parseToFile(fileContent.get(index).get(cols[3]));
            }
        return null;
    }

    private String parseToPath (String input){
        int split = input.lastIndexOf("/")+1; 
        return input.substring(0, split);
    }
    
    private String parseToFile(String input) {
        int split = input.lastIndexOf("/");
        return input.substring(split+1, input.length());
    }
}