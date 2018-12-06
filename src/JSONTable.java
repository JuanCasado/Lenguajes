import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un JSON
 */

public class JSONTable {
    /*
     * Una clase esta compuesta por un nombre y de ella almacenaremos sus datos en
     * un arraylist para recorrerlos.
     */
    private GrafoJSON ultimoGrafo;
    private Integer ultimaRelacion;

    private HashMap<String, GrafoJSON> _grafos = new HashMap<>();

    public static final String CAMPO_VACIO = "";

    public void addGrafo(String nombreGrafo) {
        ultimoGrafo = new GrafoJSON();
        _grafos.put(nombreGrafo, ultimoGrafo);
    }

    public void addId(String id) {

    }

    public void addName(String name) {
    }

    public void addLabel(String label, String contenido) {
    }

    public void addRelaciones(String rel) {

    }

    public void addProperties(String proper) {
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String nombreGrafo : _grafos.keySet()) {
            sb.append("Grafos: " + nombreGrafo + "\n");
            GrafoJSON grafo = _grafos.get(nombreGrafo);
        }
        return sb.toString();
    }

}