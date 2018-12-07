import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un CSV
 */

public class EntradaTable implements ActionTable {
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
                        _parametersName.add(f1 + f3 + f2);
                    }
                } else {
                    _parameters.add(CAMPO_VACIO); // si es len no tiene (edge|node)
                    _parametersName.add(f1 + f2);
                }
            }
        }
    }

    private static final String parametros_f1[] = { "-len", "-fontcolor", "-fontname", "-fontsize", "-arrowsize",
            "-arrowcolor", "-penwidth", "-fillcolor", "-style", "-shape" };
    private static final String parametros_f2[] = { "_relationship=", "_class=", "_property=", "_inheritance=",
            "_inderect_use=" };
    private static final String parametros_f3[] = { "_edge", "_node", };

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
     * Método que se encarga de añadir un DOT nuevo a la lista de DOT de la e t a a
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
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
     * Método que se encarga de añadir un SVG nuevo a la lista de SVG de la e t a a
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
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
     * Método que se encarga de añadir un CSV nuevo a la lista de CSV de la e t a a
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
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
        // System.out.println(_parametersName.indexOf(p_parameter));
        if (_parametersName.contains(p_parameter))
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
        sb.append("CSVs disponibles: \r\n" + _CSVs.toString() + "\r\n\r\n");
        sb.append("------------------------------------------------------------------\r\n\r\n");
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

    @Override
    public int size() {
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

    public String getCSV(int index) {
        return _CSVs.get(index);
    }

    private String getParameters(int index) {
        return _parameters.get(index);
    }

    public boolean hasJSON() {
        return _JSONs.size() > 0;
    }

    public boolean hasDOT() {
        return _DOTs.size() > 0;
    }

    public boolean hasSVG() {
        return _SVGs.size() > 0;
    }

    public boolean hasCSV() {
        return _CSVs.size() > 0;
    }

    public boolean hasParametros() {
        return _parameters.size() > 0;
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

    public ArrayList<String> getNodeRelationshipParameters() {
        return getParameterByContent("_node_relationship=");
    }

    public ArrayList<String> getEdgeRelationshipParameters() {
        return getParameterByContent("_edge_relationship=");
    }

    public ArrayList<String> getNodeClassParameters() {
        return getParameterByContent("_node_class=");
    }

    public ArrayList<String> getEdgeClassParameters() {
        return getParameterByContent("_edge_class=");
    }

    public ArrayList<String> getNodePropertyParameters() {
        return getParameterByContent("_node_property=");
    }

    public ArrayList<String> getEdgePropertyParameters() {
        return getParameterByContent("_edge_property=");
    }

    public ArrayList<String> getNodeInheritanceParameters() {
        return getParameterByContent("_node_inheritance=");
    }

    public ArrayList<String> getEdgeInheritanceParameters() {
        return getParameterByContent("_edge_inheritance=");
    }

    public ArrayList<String> getNodeIndirectUseParameters() {
        return getParameterByContent("_node_indirect_use=");
    }

    public ArrayList<String> getEdgeIndirectUseParameters() {
        return getParameterByContent("_edge_indirect_use=");
    }

    private ArrayList<String> getParameterByContent(String contenido) {
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < _parametersName.size(); i++) {
            if (_parametersName.get(i).contains(contenido)) {
                if (!_parameters.get(i).equals(CAMPO_VACIO)) {
                    String cadena = _parametersName.get(i).replaceAll(contenido, CAMPO_VACIO);
                    cadena = cadena.substring(1);
                    if (cadena.equals("len") || cadena.equals("fontsize") || cadena.equals("arrowsize")
                            || cadena.equals("penwidth")) {
                        resultado.add(cadena + "=" + _parameters.get(i));
                    } else
                        resultado.add(cadena + "=\"" + _parameters.get(i) + "\"");
                }
            }
        }
        return resultado;
    }
}
