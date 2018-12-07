import java.io.*;
import java.lang.reflect.Method;

public class GraphGenerator{
    private GraphGenerator (){}
    

    public static void generateGraphiFromFile (Engine process, String from, String to) throws Exception{
        Process p = Runtime.getRuntime().exec(process.toString()+" -Tsvg " + from + " -o "+ to);
        p.waitFor();
    }

    public static void generateGraphFromString (Engine process, String dot, String to) throws Exception{
        Process p = Runtime.getRuntime().exec(process.toString()+" -Tsvg -o "+ to);
        BufferedWriter writter = new BufferedWriter (new OutputStreamWriter(p.getOutputStream()));
        writter.write(dot);
        p.waitFor();
    }

    public static void abrirURL(String url){
        String nombreSO= System.getProperty("os.name");
        try{
            if (nombreSO.startsWith("Mac OS")) {
                    Class manager = Class.forName("com.apple.eio.FileManager");
                    Method openURL = manager.getDeclaredMethod("openURL", new Class[] { String.class });
                    openURL.invoke(null, new Object[] { url });
            }
            else if (nombreSO.startsWith("Windows"))
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            else {
                String[] navegadores = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape","safari","Safari","Chrome","chrome", "Google Chrome","google chrome"};
                String navegador = null;
                for (int contador = 0; contador < navegadores.length && navegador == null; contador++) {
                    if (Runtime.getRuntime().exec(new String[] { "which", navegadores[contador] }).waitFor() == 0)
                        navegador = navegadores[contador];
                }           
                if (navegador != null){
                    Runtime.getRuntime().exec(new String[] { navegador, url });
                }
            }    
            
        } catch (Exception e) {
           System.out.println(e.toString());
        }

    }
}