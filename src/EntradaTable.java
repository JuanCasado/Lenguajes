import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un CSV
 */

public class EntradaTable {
    private int indexJSON = 0;
    private int indexDOT = 0;
    private int indexSVG = 0;
    private ArrayList<String> _JSONs = new ArrayList<String>();
    private ArrayList<String> _DOTs = new ArrayList<String>();
    private ArrayList<String> _SVGs = new ArrayList<String>();
    private ArrayList<String> _CSVs = new ArrayList<String>();
    private ArrayList<String> _parameters = new ArrayList<String>();
    private ArrayList<String> _parametersName = new ArrayList<String>();

    public static final String CAMPO_VACIO = "";

    public EntradaTable() {
        for (String f1 : parametros_f1) {
            for (String f2 : parametros_f2) {
                if (f1 != parametros_f1[0]) {
                    for (String f3 : parametros_f3) {
                        _parameters.add(CAMPO_VACIO);
                        _parametersName.add(f1 + f2 + f3);
                    }
                } else {
                    _parameters.add(f1 + f2);
                    _parametersName.add(CAMPO_VACIO);
                }
            }
        }
    }

    private static final String parametros_f1[] = { "len", "fontcol", "fontname", "fontsize", "arrowsize", "arrowcol",
            "penwidth", "fillcol", "style", "shape" };
    private static final String parametros_f2[] = { "rel", "class", "inher", "inder" };
    private static final String parametros_f3[] = { "edge", "node", };

    /**
     * Método que se encarga de añadir un JSON nuevo a la lista de JSON de la
     * entrada
     * 
     * @param p_json JSON a insertar
     */
    public void addJSON(String p_json) {
        if (indexJSON == _JSONs.size()) {
            _JSONs.add(p_json);
        } else {
            _JSONs.set(indexJSON, p_json);
        }
        indexJSON++;

        while (dotSize() < jsonSize()) {
            _DOTs.add("");
        }
        while (svgSize() < jsonSize()) {
            _SVGs.add("");
        }
    }

    /**
     * Método que se encarga de añadir un DOT nuevo a la lista de DOT de la e
     * trada
     * 
     * @param p_dot DOT a insertar
     */
    public void addDOT(String p_dot) {
        if (indexDOT == _DOTs.size()) {
            _DOTs.add(p_dot);
        } else {
            _DOTs.set(indexDOT, p_dot);
        }
        indexDOT++;

        while (jsonSize() < dotSize()) {
            _JSONs.add(CAMPO_VACIO);
        }
        while (svgSize() < dotSize()) {
            _SVGs.add(CAMPO_VACIO);
        }
    }

    /**
     * Método que se encarga de añadir un SVG nuevo a la lista de SVG de la e
     * trada
     * 
     * @param p_svg SVG a insertar
     */
    public void addSVG(String p_svg) {
        if (indexSVG == _SVGs.size()) {
            _SVGs.add(p_svg);
        } else {
            _SVGs.set(indexSVG, p_svg);
        }
        indexSVG++;

        while (dotSize() < svgSize()) {
            _DOTs.add(CAMPO_VACIO);
        }
        while (jsonSize() < svgSize()) {
            _JSONs.add(CAMPO_VACIO);
        }
    }

    /**
     * Método que se encarga de añadir un CSV nuevo a la lista de CSV de la e
     * trada
     * 
     * @param p_csv CSV a insertar
     */
    public void addCSV(String p_csv) {
        _CSVs.add(p_csv);
    }

    /**
     * Añadimos a los paramatros un nuevo parámtro
     * 
     * @param p_parameter Nombre del parametro
     * @param p_content   Es el contenido a insertar en el parametro
     */
    public void addParameters(String p_parameter, String p_content) {
        _parameters.set(_parametersName.indexOf(p_parameter), p_content);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nTabla de simbolos JSON:\r\n");
        sb.append("Numero de JSONs: " + jsonSize() + "Numero de DOTs: " + dotSize() + "Numero de SVGs: " + svgSize()
                + " - Numero de CSVs: " + csvSize() + "Numero de Parametros: " + paramSize() + "\r\n");
        sb.append("JSONs disponibles: \r\n" + JSONToString() + "\r\n");
        sb.append("DOTs disponibles: \r\n" + DOTToString() + "\r\n");
        sb.append("SVGs disponibles: \r\n" + SVGToString() + "\r\n");
        sb.append("CSVs disponibles: \r\n" + _CSVs.toString() + "\r\n");
        sb.append("Paramatros disponibles: \r\n" + paramToString() + "\r\n");
        return sb.toString();
    }

    public String paramToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _parameters.size(); i++) {
            sb.append(_parametersName.get(i) + " : ");
            sb.append(_parameters.get(i) + "\r\n");
        }
        return sb.toString();
    }

    public String JSONToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _JSONs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_JSONs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    public String DOTToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _DOTs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_DOTs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    public String SVGToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _SVGs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_SVGs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    public int paramSize() {
        return _parameters.size();
    }

    public int paramNameSize() {
        return _parametersName.size();
    }

    public int csvSize() {
        return _CSVs.size();
    }

    public int jsonSize() {
        return _JSONs.size();
    }

    public int dotSize() {
        return _DOTs.size();
    }

    public int svgSize() {
        return _SVGs.size();
    }

    /*
     * public String get(int row, Content col) { row++; switch (col) { case json:
     * return getValue(row, 1); case dot: return getValue(row, 2); case svg: return
     * getValue(row, 3); } return null; }
     */

    /**
     * Método que nos indica que hacer acción realizar sobre la fila
     * 
     * @param row Un enetero que nos indica la fila
     * @return
     */
    /*
     * public Action toDo(int row) { row++; if (getValue(row,
     * 1).equals(CAMPO_VACIO)) { return Action.skip; } else if (getValue(row,
     * 2).equals(CAMPO_VACIO) && getValue(row, 3).equals(CAMPO_VACIO)) { return
     * Action.skip; } else if (getValue(row, 2).equals(CAMPO_VACIO)) { return
     * Action.saveSvg; } else if (getValue(row, 3).equals(CAMPO_VACIO)) { return
     * Action.saveDot; } else { return Action.saveBoth; } }
     */
}
