import java.util.*;
import java.io.*;

public class FileManager {
    private FileManager(){}
    public void write(String src, String fileName, String content) throws Exception{
        new File(src).mkdir();
        PrintWriter writer = new PrintWriter(src+fileName, "UTF-8");
        writer.println(content);
        writer.close(); 
    }  
}