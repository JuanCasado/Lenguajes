import java.util.*;

public class EntradaVisitor extends EntradaParserBaseVisitor<HashContenedor>{
    private HashContenedor contenedor;
    public EntradaVisitor (){
        contenedor = new HashContenedor("hash1");
        HashContenedor hash2 = new HashContenedor("hash2");
        contenedor.setFinal ("id1","cont1");
        contenedor.setFinal ("id1","cont2");
        contenedor.addNode(hash2);
        hash2.setFinal("id3", "cont3");
        hash2.setFinal("id4", "cont4");
        hash2.setFinal("id5", "cont5");
    }

    @Override
    public HashContenedor visitInit(EntradaParser.InitContext ctx) {
        return contenedor;
    }

}