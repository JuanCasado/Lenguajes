import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class CSVListener_TipoAvanzadoTS extends CSVParserBaseListener {
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
    public void exitColumnaConComillas(CSVParser.ColumnaConComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.CADENA().getText());
    }

    @Override
    public void exitColumnaSinComillas(CSVParser.ColumnaSinComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.TEXTO().getText());
    }

    @Override
    public void exitColumnaVacio(CSVParser.ColumnaVacioContext ctx) {
        _tablasimbolos.addColumn(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
    }

    @Override
    public void enterLinea(CSVParser.LineaContext ctx) {
        _tablasimbolos.newRow();
    }

    @Override
    public void exitTextoSinComillas(CSVParser.TextoSinComillasContext ctx) {
        _tablasimbolos.addValue(ctx.TEXTO().getText());
    }

    @Override
    public void exitStringConComillas(CSVParser.StringConComillasContext ctx) {
        _tablasimbolos.addValue(ctx.CADENA().getText());
    }

    @Override
    public void exitCampoVacio(CSVParser.CampoVacioContext ctx) {
        _tablasimbolos.addValue(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
    }
}