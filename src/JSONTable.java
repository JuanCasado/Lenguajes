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

    public void addClase(String id) {
        ultimoGrafo.addClase(id);
    }

    public void addRelationship(String id) {
        ultimoGrafo.addRelationship(id);
    }

    public void addProperty(String id) {
        ultimoGrafo.addProperty(id);
    }

    public void addPropertyGender(String gender) {
        ultimoGrafo.addPropertyGender(gender);
    }

    public void addPropertyNumber(String number) {
        ultimoGrafo.addPropertyGender(number);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String nombreGrafo : _grafos.keySet()) {
            sb.append("\nGrafos: " + nombreGrafo + "\n");
            GrafoJSON grafo = _grafos.get(nombreGrafo);
            sb.append(grafo.toString());
        }
        return sb.toString();
    }

}