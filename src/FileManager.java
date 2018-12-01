import java.util.*;

public class FileManager {
    private FileManager(){}
    public void write(String src, String fileName, ArraList<String> lines){
        new File("../"+src).mkdir();
        PrintWriter writer = new PrintWriter(src+fileName, "UTF-8");
        for (String line : lines) {
            writer.println(line);
        }
        writer.close(); 
    }  
}