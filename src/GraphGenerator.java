import java.io.*;

public class GraphGenerator {
    private GraphGenerator() {
    }

    public static void generateGraphFromFile(Engine process, String from, String to) throws Exception {
        Process p = Runtime.getRuntime().exec(process.toString() + " -Tsvg " + from + " -o " + to);
        p.waitFor();
        InputStream is = p.getErrorStream();
        byte[] buffer = new byte[is.available()];
        is.read(buffer, 0, is.available());
        for (byte dato : buffer) {
            System.out.print((char) dato);
        }
    }

    public static void generateGraphFromFileTmp(Engine process, String content, String to) throws Exception {
        String from = ".archivoDotTmp.dot";
        FileManager.write(from, content);
        Process p = Runtime.getRuntime().exec(process.toString() + " -Tsvg " + from + " -o " + to);
        p.waitFor();
        File archivoTmp = new File(from);
        archivoTmp.delete();
        InputStream is = p.getErrorStream();
        byte[] buffer = new byte[is.available()];
        is.read(buffer, 0, is.available());
        for (byte dato : buffer) {
            System.out.print((char) dato);
        }
    }

    public static void generateGraphFromString(Engine process, String dot, String to) throws Exception {
        Process p = Runtime.getRuntime().exec(process.toString() + " -Tsvg -o " + to);
        BufferedWriter writter = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        writter.write(dot);
        p.waitFor();
        InputStream is = p.getErrorStream();
        byte[] buffer = new byte[is.available()];
        is.read(buffer, 0, is.available());
        for (byte dato : buffer) {
            System.out.print((char) dato);
        }
    }
}