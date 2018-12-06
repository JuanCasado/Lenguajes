import java.util.*;
import java.io.*;

public class FileManager {
    private FileManager(){}
    public static void write(String ruta, String content) throws Exception{
        crearCarpeta(ruta);
        PrintWriter writer = new PrintWriter(ruta, "UTF-8");
        writer.println(content);
        writer.close();
    } 
    public static void crearCarpeta(String ruta){
        Integer index;
        //con split separo src con las barras
        if(ruta.contains("/")){
            index= ruta.lastIndexOf("/");
        }else if (ruta.contains("\\")){
            index = ruta.lastIndexOf("\\");
        }
        else{
            return ;
        }
        new File(ruta.substring(0, index)).mkdir();
    }
}