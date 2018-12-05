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

    /**
     * Método para rellenar el array de _parametersName con sus valores y
     * _paramaters de campos vacios
     */
    public EntradaTable() {
        for (String f1 : parametros_f1) {
            for (String f2 : parametros_f2) {
                if (f1 != parametros_f1[0]) { // si el parametro no es len
                    for (String f3 : parametros_f3) {
                        _parameters.add(CAMPO_VACIO);
                        _parametersName.add(f1 + f2 + f3);
                    }
                } else {
                    _parameters.add(CAMPO_VACIO); // si es len no tiene (edge|node)
                    _parametersName.add(f1 + f2);
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
     * Método que se encarga de añadir un DOT nuevo a la lista de DOT de la e t
     * ada
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
     * Método que se encarga de añadir un SVG nuevo a la lista de SVG de la e t
     * ada
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
     * Método que se encarga de añadir un CSV nuevo a la lista de CSV de la e t
     * ada
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

    /**
     * Método para imprimir los parametros
     * 
     * @return
     */
    public String paramToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _parameters.size(); i++) {
            sb.append(_parametersName.get(i) + " : ");
            sb.append(_parameters.get(i) + "\r\n");
        }
        return sb.toString();
    }

    /**
     * Método para imprimir el array de JSONs
     * 
     * @return
     */
    public String JSONToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _JSONs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_JSONs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    /**
     * Método para imprimir el array de DOTs
     * 
     * @return
     */
    public String DOTToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _DOTs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_DOTs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    /**
     * Método para imprimri el array de SVGs
     * 
     * @return
     */
    public String SVGToString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < _SVGs.size(); i++) {
            sb.append(i + " : ");
            sb.append(_SVGs.get(i) + "\r\n");
        }
        return sb.toString();
    }

    /**
     * Método que devuelve la longitud del array _parameters
     * 
     * @return
     */
    public int paramSize() {
        return _parameters.size();
    }

    /**
     * Método que devuelve la longitud del array _parametersName
     * 
     * @return
     */
    private int paramNameSize() {
        return _parametersName.size();
    }

    public int getTableSize() {
        return jsonSize();
    }

    /**
     * Método que devuelve la longitud del array _CSVs
     * 
     * @return
     */
    public int csvSize() {
        return _CSVs.size();
    }

    /**
     * Método que devuelve la longitud del array _JSONs
     * 
     * @return
     */
    private int jsonSize() {
        return _JSONs.size();
    }

    /**
     * Método que devuelve la longitud del array _DOTs
     * 
     * @return
     */
    private int dotSize() {
        return _DOTs.size();
    }

    /**
     * Método que devuelve la longitud del array _SVGs
     * 
     * @return
     */
    private int svgSize() {
        return _SVGs.size();
    }

    private String getValueJSON(int index) {
        return _JSONs.get(index);
    }

    private String getValueDOT(int index) {
        return _DOTs.get(index);
    }

    private String getValueSVG(int index) {
        return _SVGs.get(index);
    }

    private String getCSV(int index) {
        return _CSVs.get(index);
    }

    private String getParameters(int index) {
        return _parameters.get(index);
    }

    public String get(int row, Content col) {
        if (row < jsonSize()) { // tal como rellenamos los datos, todos los arrays tienen la misma longitud
            switch (col) {
            case json:
                return getValueJSON(row);
            case dot:
                return getValueDOT(row);
            case svg:
                return getValueSVG(row);
            }
        }
        return null;
    }

    public Action toDo(int row) {
        if (row < jsonSize()) {
            if (getValueJSON(row).equals(CAMPO_VACIO)) { // si no tenemos el json
                return Action.skip; // no hacemos nada
            } else if (getValueDOT(row).equals(CAMPO_VACIO) && getValueSVG(row).equals(CAMPO_VACIO)) { // si no tenemos
                                                                                                       // dot ni svg
                return Action.skip; // no hacemos nada
            } else if (getValueDOT(row).equals(CAMPO_VACIO)) { // si no tenemos el dot
                return Action.saveSvg; // guardamos el svg
            } else if (getValueSVG(row).equals(CAMPO_VACIO)) { // si no tenemos svg
                return Action.saveDot; // guardamos el dot
            } else {
                return Action.saveBoth;
            }
        }
        return null;
    }
}
