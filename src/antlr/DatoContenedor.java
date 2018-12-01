package antlr;

class DatoContenedor extends Contenedor {
    private String content;             
    public DatoContenedor(String id, String content) {
        super(Node.FINAL, id);
        this.content = content;
    }    
    public String getValue() {
        return this.content;
    }
   
}