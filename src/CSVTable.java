import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un CSV
 */

public class CSVTable {
    // que seria una fila?
    // private HashMap<String,String> _unafila = new HashMap<String,String>();
    private ArrayList<HashMap<String, String>> _filas = new ArrayList<HashMap<String, String>>();
    private ArrayList<String> _columnas = new ArrayList<String>();
    public static final String CAMPO_VACIO = "";

    /**
     * Metodo que se encarga de añadir una columna nueva a la lista de columnas del
     * CSV No se especifica la posicion porque esto debe establecerse por orden de
     * lectura
     * 
     * @param p_nombreColumna Nombre de la columna a insertar
     */
    public void addColumn(String p_nombreColumna) {
        _columnas.add(p_nombreColumna);
    }

    /**
     * Metodo para saber si un nombre de columna existe y que indice tiene
     * 
     * @param p_nombreColumna Nombre de la columna a buscar
     * @return
     */
    public int getColumnIndex(String p_nombreColumna) {
        return _columnas.indexOf(p_nombreColumna);
    }

    /**
     * Dado el indice de una columna, nos devuelve su nombre
     * 
     * @param p_indiceColumna
     * @return
     */
    public String getColumnName(int p_indiceColumna) {
        return _columnas.get(p_indiceColumna);
    }

    /**
     * Método para crear tantas filas como sean necesarias si no hay suficientes
     * para lo que solicita el usuario
     * 
     * @param p_filas
     */
    private void crea_filas(int p_filas) {
        while (_filas.size() < p_filas) {
            _filas.add(new HashMap<String, String>());
        }
    }

    /**
     * Metodo para crear una nueva fila
     * 
     */
    public void newRow() {
        this.crea_filas(_filas.size() + 1);
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
        sb.append("\nTabla de simbolos CSV:\r\n");
        sb.append("Numero de columnas: " + columnSize() + " - Numero de filas: " + this.size() + "\r\n");
        sb.append("Columnas disponibles: \r\n" + _columnas.toString() + "\r\n");
        sb.append("Filas disponibles: \r\n" + _filas.toString() + "\r\n");

        return sb.toString();
    }

    /**
     * Metodo auxiliar para devolver el numero de filas
     * 
     * @return
     */
    public int size() {
        return _filas.size();
    }

    /**
     * Metodo auxiliar para devolver el numero de columnas
     */
    public int columnSize() {
        return _columnas.size();
    }

    /**
     * Método que da el contenido correspondiente a la columna solicitada
     * 
     * @param row Un entero que nos indica la fila
     * @param col La columna que se solicita
     * @return
     */
    public String get(int row, Content col) {
        if (row < size()) {
            row++;
            switch (col) {
            case json:
                return getValue(row, 1);
            case dot:
                return getValue(row, 2);
            case svg:
                return getValue(row, 3);
            }
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
        if (row < size()) {
            row++;
            if (getValue(row, 1).equals(CAMPO_VACIO)) { // si no tenemos json
                return Action.skip; // no hacemos nada
            } else if (getValue(row, 2).equals(CAMPO_VACIO) && getValue(row, 3).equals(CAMPO_VACIO)) { // si no tenemos
                                                                                                       // dot ni svg
                return Action.skip; // no hacemos nada
            } else if (getValue(row, 2).equals(CAMPO_VACIO)) { // si tenemos svg
                return Action.saveSvg; // solo guardamos svg
            } else if (getValue(row, 3).equals(CAMPO_VACIO)) { // si solo tenemos dot
                return Action.saveDot; // solo guardamos el dot
            } else {
                return Action.saveBoth; // si tenemos todo, guardamos todo
            }
        }
        return null;
    }
}