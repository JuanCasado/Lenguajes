import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un CSV
 */

public class EntradaTable {
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
                        _parameters.add(f1 + f2 + f3);
                        _parametersName.add(CAMPO_VACIO);
                    }
                } else {
                    parameters.add(f1 + f2);
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
     * Método que se encarga de añadir un json nuevo a la lista de json de la
     * entrada
     * 
     * @param p_json Nombre del json a insertar
     */
    public void addJSON(String p_json) {
        _JSONs.add(p_json);
    }

    public void addDOT(String p_dot) {
        _DOTs.add(p_dot);
    }

    public void addSVG(String p_svg) {
        _SVGs.add(p_svg);
    }

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

    /**
     * Metodo que introduce de manera efectiva los datos de una celda en su
     * estructura
     * 
     * @param p_fila    Numero de la fila
     * @param p_columna Nombre de la columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(int p_fila, String p_columna, String p_valor) {
        // Me aseguro que tengo filas donde introducir datos
        this.crea_filas(p_fila);

        // Añadimos los datos en la fila que me han pedido
        _filas.get(p_fila - 1).put(p_columna, p_valor);
    }

    /**
     * Método que introduce datos de una celda segun su indice de fila,columna
     * 
     * @param p_fila    Numero de fila
     * @param p_columna Numero de columna
     * @param p_valor   valor a introducir
     */
    public void addValue(int p_fila, int p_columna, String p_valor) {
        // Hacemos uso del método de introduccion de datos
        this.addValue(p_fila, this.getColumnName(p_columna), p_valor);
    }

    /**
     * Metodo para la recuperacion efectiva de los datos de una celda de la
     * estructura
     * 
     * @param p_fila    fila a leer
     * @param p_columna nombre de columna a recuperar
     * @return
     */
    public String getValue(int p_fila, String p_columna) {
        return _filas.get(p_fila - 1).get(p_columna);
    }

    /**
     * Metodo que recupera los datos segun las coordenadas fila,columna
     * 
     * @param p_fila    numero de fila a recuperar (base 1)
     * @param p_columna numero de columna a recuperar (base 0)
     * @return
     */
    public String getValue(int p_fila, int p_columna) {
        return this.getValue(p_fila, this.getColumnName(p_columna));
    }

    /**
     * Metodo de utilidad para introducir valores en la ultima fila de la estructura
     * disponible
     * 
     * @param p_columna Nombre de la columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(String p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Metodo de utilidad para introducir valores en la ultima fila sin el nombre de
     * la columna, solo con su indice (base 0)
     * 
     * @param p_columna Indice de la columna (base 0)
     * @param p_valor   valor a introducir
     */
    public void addValue(int p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Metodo de utilidad para introducir un valor al final absoluto de la
     * estructura de datos
     * 
     * @param p_valor
     */
    public void addValue(String p_valor) {
        addValue(_filas.size(), _filas.get(_filas.size() - 1).size(), p_valor);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nTabla de simbolos JSON:\r\n");
        sb.append("Numero de JSONs: " + jsonSize() + "Numero de DOTs: " + dotSize() + "Numero de SVGs: " + svgSize()
                + " - Numero de CSVs: " + csvSize() + "Numero de Parametros: " + paramSize() + "\r\n");
        sb.append("JSONs disponibles: \r\n" + _JSONs.toString() + "\r\n");
        sb.append("DOTs disponibles: \r\n" + _DOTs.toString() + "\r\n");
        sb.append("SVGs disponibles: \r\n" + _SVGs.toString() + "\r\n");
        sb.append("CSVs disponibles: \r\n" + _SVGs.toString() + "\r\n");
        sb.append("Paramatros disponibles: \r\n" + paramToString() + "\r\n");
        return sb.toString();
    }

    public String paramToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _parameters.size(); i++) {
            sb.append(_parametersName.get(i) + " : ");
            sb.append(_parameters.get(i) + "\r\n");
        }
        return sb;
    }

    public int paramSize() {
        return _parameters.size();
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

    public String get(int row, Content col) {
        row++;
        switch (col) {
        case json:
            return getValue(row, 1);
        case dot:
            return getValue(row, 2);
        case svg:
            return getValue(row, 3);
        }
        return null;
    }

    /**
     * Método que nos indica que hacer acción realizar sobre la fila
     * 
     * @param row Un enetero que nos indica la fila
     * @return
     */
    public Action toDo(int row) {
        row++;
        if (getValue(row, 1).equals(CAMPO_VACIO)) {
            return Action.skip;
        } else if (getValue(row, 2).equals(CAMPO_VACIO) && getValue(row, 3).equals(CAMPO_VACIO)) {
            return Action.skip;
        } else if (getValue(row, 2).equals(CAMPO_VACIO)) {
            return Action.saveSvg;
        } else if (getValue(row, 3).equals(CAMPO_VACIO)) {
            return Action.saveDot;
        } else {
            return Action.saveBoth;
        }
    }
}
