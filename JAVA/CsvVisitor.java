import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CsvVisitor extends CsvParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor row;

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
            visit(row);
        }
        return contenedor;
    }

    @Override
    public HashContenedor visitNombre(CsvParser.NombreContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        row.setFinal("nombre", token);
        return null;
    }

    @Override
    public HashContenedor visitRutafichero(CsvParser.RutaficheroContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.json_file().getText();
        row.setFinal("fichero", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.dot_file().getText();
        row.setFinal("dot", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherografico(CsvParser.RutaficherograficoContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.svg_file().getText();
        row.setFinal("grafico", token);
        return null;
    }

    @Override
    public HashContenedor visitRow(CsvParser.RowContext ctx) {
        row = new HashContenedor("row");

        visit(ctx.nombre());
        visit(ctx.rutafichero()); 
        visit(ctx.rutaficherosalida()); 
        visit(ctx.rutaficherografico()); 

        contenedor.addNode(row);
        return null;
    }
}