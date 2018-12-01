public class JsonVisitor extends JsonParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    public JsonVisitor() {
        contenedor = new HashContenedor("json");
    }
}