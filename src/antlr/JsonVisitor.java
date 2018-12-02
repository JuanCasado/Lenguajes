package antlr;

class JsonVisitor extends JsonParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor grafo;
    public JsonVisitor() {
        contenedor = new HashContenedor("json");
    }
    
    @Override
    public HashContenedor visitInit(JsonParser.InitContext ctx) {
        visit(ctx.graphs());
        return contenedor;
    }

    @Override
    public HashContenedor visitGraphs(JsonParser.GraphsContext ctx) {
        for (JsonParser.ListaContext lista : ctx.lista()){
            visit(lista);
        }
        return null;
    }
    
    @Override
    public HashContenedor visitLista(JsonParser.ListaContext ctx) {
        String name = "";
        if (ctx.nombre()!=null){
            name = ctx.nombre().getText();
        }
        else if (ctx.kw_properties()!=null){
            name = ctx.kw_properties().getText();  
            name.replaceAll("\"", "");
            name.replaceAll(":","");     
        }
        if (ctx.objetos() != null) {
            grafo = new HashContenedor("grafo");
            grafo.addFinal("nombre", name);
            for (JsonParser.ObjetosContext objeto : ctx.objetos()) {
                visit(objeto);
            }
        }
        contenedor.addNode(grafo);
        return null;
    }
    
    @Override
    public HashContenedor visitObjetos(JsonParser.ObjetosContext ctx) {
        grafo.addFinal("tipo", ctx.target().nombre().getText());
        if (ctx.prop()!=null){
            for (JsonParser.PropContext prop : ctx.prop()){
                visit(prop);
            }
        }
        return null;
    }

    @Override
    public HashContenedor visitProp(JsonParser.PropContext ctx) {
        if (ctx.pclass()!=null){
            HashContenedor clase = new HashContenedor("clase");
            //NOMBRE
            /*
            if (ctx.pclass().name()!=null){
                clase.addFinal("nombre", ctx.pclass().name().nombre());
            }else{
                clase.addFinal("nombre", "FALTA_NOMBRE");
            }*/
            
            grafo.addNode(clase);
        } else if (ctx.relationship()!=null){
            visit(ctx.relationship());
        } else if (ctx.property()!=null){
            visit(ctx.property());
        } else if (ctx.languageProperty()!=null){
            visit(ctx.languageProperty());
        }
        return null;
    }


    /*
    Tenemos: 

        Grafo
            Nombre : Nombre del grado
            Tipo : Dice con que se renderiza
            Clase
                Nombre :nombre de la clase
                Herencia?

    */
}