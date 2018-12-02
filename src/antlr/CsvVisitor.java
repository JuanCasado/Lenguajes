package antlr;

import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

class CsvVisitor extends CsvParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor row;
    private final String rowName;
    private final String[] colsName;

    public CsvVisitor() {
        contenedor = new HashContenedor("csv");
        rowName = CsvTable.getRow();
        colsName = CsvTable.getCols();
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
        row.addFinal(colsName[0], token);
        return null;
    }

    @Override
    public HashContenedor visitRutafichero(CsvParser.RutaficheroContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.json_file().getText();
        row.addFinal(colsName[1], token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.dot_file().getText();
        row.addFinal(colsName[2], token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherografico(CsvParser.RutaficherograficoContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.svg_file().getText();
        row.addFinal(colsName[3], token);
        return null;
    }

    @Override
    public HashContenedor visitRow(CsvParser.RowContext ctx) {
        row = new HashContenedor(rowName);

        visit(ctx.nombre());
        visit(ctx.rutafichero()); 
        visit(ctx.rutaficherosalida()); 
        visit(ctx.rutaficherografico()); 

        contenedor.addNode(row);
        return null;
    }
}