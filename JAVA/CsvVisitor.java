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
        System.out.println("INIT");
        for (CsvParser.RowContext row : ctx.row()) {
            visit(row);
        }
        return contenedor;
    }

    @Override
    public HashContenedor visitNombre(CsvParser.NombreContext ctx) {
        System.out.print("nombre : ");
        String token = "";
        token += ctx.dir().getText();
        System.out.println(token);
        row.setFinal("nombre", token);
        return null;
    }

    @Override
    public HashContenedor visitRutafichero(CsvParser.RutaficheroContext ctx) {
        System.out.print("fichero : ");
        String token = "";
        token += ctx.dir().getText();
        token += ctx.json_file().getText();
        System.out.println(token);
        row.setFinal("fichero", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx) {
        System.out.print("dot : ");
        String token = "";
        token += ctx.dir().getText();
        token += ctx.dot_file().getText();
        System.out.println(token);
        row.setFinal("dot", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherografico(CsvParser.RutaficherograficoContext ctx) {
        System.out.print("grafico : ");
        String token = "";
        token += ctx.dir().getText();
        token += ctx.svg_file().getText();
        System.out.println(token);
        row.setFinal("grafico", token);
        return null;
    }

    @Override
    public HashContenedor visitRow(CsvParser.RowContext ctx) {
        System.out.println("ROW");
        row = new HashContenedor("row");

        visit(ctx.nombre());
        visit(ctx.rutafichero()); 
        visit(ctx.rutaficherosalida()); 
        visit(ctx.rutaficherografico()); 

        contenedor.addNode(row);
        return null;
    }
}