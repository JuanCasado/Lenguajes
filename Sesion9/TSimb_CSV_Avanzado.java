
//Esta clase se encarga de mantener los datos de un CSV

import java.util.*;

public class TSimb_CSV_Avanzado {
    // Qué sería uan fila
    // private HashMap<String,String> _unafila = new HashMap<String,String>();

    private ArrayList<HashMap<String, String>> _filas = new ArrayList<HashMap<String, String>>();
    private ArrayList<String> _columnas = new ArrayList<String>();

    /**
     * Método que se encarga de añadir una columna nueva a la lista de columanas d
     * l CSV No se especifica la posicioón porque esto debe esteblcerse por orden 
     * lecutra
     * 
     * @param p_nombreColumna Contiene el nombre de la columna a añadir
     */
    public void addColumn(String p_nombreColumna) {
        _columnas.add(p_nombreColumna);
    }

    /**
     * Método para sbaer si un nombre de columna existe y saber que índice tiene
     * 
     * @param p_nombreColumna
     * @return
     */
    public int getColumnIndex(String p_nombreColumna) {
        return _columnas.indexOf(p_nombreColumna);
    }

    /**
     * Dado el índice de una columna nos devuelve su nombre
     * 
     * @param p_indiceColumna
     * @return
     */
    public String getColumnName(int p_indiceColumna) {
        return _columnas.get(p_indiceColumna);
    }

    /**
     * Método para crear tantas filas como sena necesarias si no hay suficientes
     * para lo que solicita el usuario
     * 
     * @param p_filas
     */
    private void crear_filas(int p_filas) {
        while (_filas.size() < p_filas)
            _filas.add(new HashMap<String, String>());
    }

    /**
     * Método para crear una nueva fila
     **/
    public void newRow() {
        this.crear_filas(_filas.size() + 1);
    }

    /**
     * Método que introduce de manera "EFECTIVA" los datos de una celda en su e
     * tructura
     * 
     * @param p_fila    Numero de la fila
     * @param p_columna Nombre de la columna (String)
     * @param p_valor   Valor a introducir
     */
    public void addValue(int p_fila, String p_columna, String p_valor) {
        // Me aseguro de tener filas donde insertar los datos
        this.crear_filas(p_fila);

        // añadimos los datos en la fila que se han pedido
        _filas.get(p_fila - 1).put(p_columna, p_valor);
    }

    /**
     * Método que introduce datos de una celda según su índice de fila, columa
     * 
     * @param p_fila    Numero de fila
     * @param p_columna Numero de columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(int p_fila, int p_columna, String p_valor) {
        // Hacemos uso del
        this.addValue(p_fila, this.getColumnName(p_columna), p_valor);
    }

    /**
     * Método para la recuperación "EFECTIVA" de los datos de una celda de la
     * estructura
     * 
     * @param p_fila    Fila a leer
     * @param p_columna Nombre de columnba a recuperar
     * @return
     */
    public String getValue(int p_fila, String p_columna) {
        return _filas.get(p_fila).get(p_columna);
    }

    /**
     * Método que recupera los datos según la coordenada fila, columna
     * 
     * @param p_fila    Numero de la fila a recuperar (base 1)
     * @param p_columna
     * @return
     */
    public String getValue(int p_fila, int p_columna) {
        return this.getValue(p_fila, this.getColumnName(p_columna));
    }

    /**
     * Método de utilidad para introducir valores en la úiltima fila de la e
     * tructura disponible
     * 
     * @param p_columna Nombre de la columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(String p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Método de utilidad para introducir valores en la úiltima fila de la
     * estructura disponible sin el nombre de la columna, sólo con su índice (base
     * 0)
     * 
     * @param p_columna Indice columna (base 0)
     * @param p_valor   Valor a introducir
     */
    public void addValue(int p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Método de utilidad para introducir valores al final absoulto de la  ra de
     * datos
     * 
     * @param p_valor Valor a introducir
     */
    public void addValue(String p_valor) {
        this.addValue(_filas.size(), _filas.get(_filas.size() - 1).size(), p_valor);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\nTabla de símbolos CSV: \r\n");
        sb.append("Numero de columnas: " + _columnas.size() + " - Número de filas: " + this.rowSize() + "\r\n");
        sb.append("Columnas disponibles: \r\n" + _columnas.toString() + "\r\n");
        sb.append("Filas disponibles: \r\n" + _filas.toString() + "\r\n");

        return sb.toString();
    }

    /**
     * Método auxiliar para devolver el númerod e filas
     * 
     * @return numero de filas
     */
    public int rowSize() {
        return _filas.size();
    }

    /**
     * Método auxiliar para devolver el número de columnas
     * 
     * @return numero de columnnas
     */
    public int columnSize() {
        return _columnas.size();
    }
}