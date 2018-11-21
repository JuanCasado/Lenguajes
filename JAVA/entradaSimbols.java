import java.util.HashMap;

class entradaSimbols {
    private HashMap <Integer,String> simbols;
    private Integer row;
    private String jsonBuffer;
    public entradaSimbols (){
        this.simbols = new HashMap<>();
        this.row = 0;
        this.jsonBuffer = "";
    }
    public void addRow (){
        this.row ++;
        System.out.print("NEW ROW");
    }
    public void addJson (){
        this.simbols.put(row, jsonBuffer);
        jsonBuffer = "";
        System.out.print("NEW JSON");
    }
    public void addJsonFragment (String fragment){
        jsonBuffer+=fragment;
    }
}