import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class CSVListener_TipoAvanzadoTS extends gestrategiaParserBaseListener {
    public static final String CAMPO_VACIO = "";

    private TSimb_CSV_Avanzado _tablasimbolos;

    private CSVListener_TipoAvanzadoTS() {
        super();
    }

    public CSVListener_TipoAvanzadoTS(TSimb_CSV_Avanzado p_ts) {
        super();
        _tablasimbolos = p_ts;
    }

    @Override
    public void exitColumnaConComillas(gestrategiaParser.ColumnaConComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.CADENA().getText());
    }

    @Override
    public void exitColumnaSinComillas(gestrategiaParser.ColumnaSinComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.TEXTO().getText());
    }

    @Override
    public void exitColumnaVacio(gestrategiaParser.ColumnaVacioContext ctx) {
        _tablasimbolos.addColumn(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
    }

    @Override
    public void enterLinea(gestrategiaParser.LineaContext ctx) {
        _tablasimbolos.newRow();
    }

    @Override
    public void exitTextoSinComillas(gestrategiaParser.TextoSinComillasContext ctx) {
        _tablasimbolos.addValue(ctx.TEXTO().getText());
    }

    @Override
    public void exitStringConComillas(gestrategiaParser.StringConComillasContext ctx) {
        _tablasimbolos.addValue(ctx.CADENA().getText());
    }

    @Override
    public void exitCampoVacio(gestrategiaParser.CampoVacioContext ctx) {
        _tablasimbolos.addValue(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
    }
}