import java.util.*;
import java.io.*;

public class FileManager {
    private FileManager(){}
    public void write(String src, String fileName, ArrayList<String> lines) throws Exception{
        new File("../"+src).mkdir();
        PrintWriter writer = new PrintWriter(src+fileName, "UTF-8");
        for (String line : lines) {
            writer.println(line);
        }
        writer.close(); 
    }  
}