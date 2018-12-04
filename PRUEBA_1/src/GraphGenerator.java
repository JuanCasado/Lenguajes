import java.io.*;

class GraphGenerator{
    private GraphGenerator (){}
    public static enum Engine{
        neato,
        dot,
        circo,
        fdp,
        osage,
        twopi
    }
    public static String generateGraph (Engine process, String from) throws Exception{
        Process p = Runtime.getRuntime().exec(process.toString()+" -Tsvg "+from);
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
}