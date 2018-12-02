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
    public static generateGraph (Engine process, String from, String to){
        Process p = Runtime.getRuntime().exec(process.toString()+" -Tsvg "+from+" > "+to);
    }
}