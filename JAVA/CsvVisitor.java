import java.util.*;

public class CsvVisitor extends CsvParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;

    public CsvVisitor() {
        contenedor = new HashContenedor("csv");
        HashContenedor hash2 = new HashContenedor("hash2");
        contenedor.setFinal("id1", "cont1");
        contenedor.setFinal("id1", "cont2");
        contenedor.addNode(hash2);
        hash2.setFinal("id3", "cont3");
        hash2.setFinal("id4", "cont4");
        hash2.setFinal("id5", "cont5");
    }

    @Override
    public HashContenedor visitInit(CsvParser.InitContext ctx) {
        for (CsvParser.RowContext row : ctx.row()) {
            visitChildren(row);
        }
        return contenedor;
    }
    
    @Override
    public T visitNombre(CsvParser.NombreContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRow(CsvParser.RowContext ctx) {
        HashContenedor row = new HashContenedor("row");
        
        contenedor.addNode(row);
    }
}