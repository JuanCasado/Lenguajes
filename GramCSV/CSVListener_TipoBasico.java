import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class CSVListener_TipoBasico extends gestrategiaParserBaseListener {
    public static final String CAMPO_VACIO = "";

    // Cada map representa una fila y está asociado a una cabecera
    public List<Map<String, String>> filas = new ArrayList<Map<String, String>>();

    // los nombres de los campos
    public List<String> nombreCampos;

    // Dato temporal de la creación de una fila
    public List<String> datosFilaActual;

    @Override
    public void enterLinea(gestrategiaParser.LineaContext ctx) {
        datosFilaActual = new ArrayList<String>();
    }

    @Override
    public void exitTextoSinComillas(gestrategiaParser.TextoSinComillasContext ctx) {
        datosFilaActual.add(ctx.TEXTO().getText());
    }

    @Override
    public void exitStringConComillas(gestrategiaParser.StringConComillasContext ctx) {
        datosFilaActual.add(ctx.CADENA().getText());
    }

    @Override
    public void exitCampoVacio(gestrategiaParser.CampoVacioContext ctx) {
        datosFilaActual.add(CAMPO_VACIO);
    }

    @Override
    public void exitLinea(gestrategiaParser.LineaContext ctx) {
        if (ctx.getParent().getRuleIndex() == gestrategiaParser.RULE_cabecera) // si la linea es la hija de la cabecera
            return; // no lo ejecutará
        // Supongo que es una linea de datos
        Map<String, String> lineatemporal = new LinkedHashMap<String, String>();
        int i = 0;
        for (String actual : datosFilaActual) { // para cada uno de los datos que te has encontrado en la fila actual:
            lineatemporal.put(nombreCampos.get(i), actual);
            i++;
        }
        filas.add(lineatemporal);
    }

    @Override
    public void exitCabecera(gestrategiaParser.CabeceraContext ctx) {
        nombreCampos = new ArrayList<String>();
        nombreCampos.addAll(datosFilaActual);
    }

}