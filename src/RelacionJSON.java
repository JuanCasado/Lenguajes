import java.util.*;

public class RelacionJSON {
    private HashMap<String, String> _clases = new HashMap<>();
    private ArrayList<String> _properties = new ArrayList<>();
    private HashMap<String, String> _names = new HashMap<>();
    private String id = "";

    public RelacionJSON(String relacion) {
        id = relacion;
    }

    public String getID() {
        return id;
    }

    public boolean hasID() {
        return id!=null;
    }

    public String getName(String languaje) {
        if (_names.containsKey(languaje))
            return _names.get(languaje);
        else
            return _names.get("name");
    }

    public int amountProperties() {
        return _properties.size();
    }

    public String getProperty(int index) {
        if (_properties.size() > index)
            return _properties.get(index);
        else
            return "";
    }

    public void addValorProperty(String property) {
        if (!_properties.contains(property))
            _properties.add(property);
    }

    public void addLabel(String clave, String valor) {
        _names.put(clave, valor);
    }

    public void addReverseName(String reverseName) {
        _names.put("reverseName", reverseName);
    }

    public void addFrom(String from) {
        _clases.put("from", from);
    }

    public void addTo(String to) {
        _clases.put("to", to);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\tRELACION: " + (id.equals("") ? "sin nombre" : id) + "\n");

        sb.append("\t\tCLASES: \n");
        for (String nombreClase : _clases.keySet()) {
            sb.append("\t\t\t" + nombreClase + " : " + _clases.get(nombreClase) + "\n");
        }

        sb.append("\t\tNOMBRES: \n");
        for (String nombres : _names.keySet()) {
            sb.append("\t\t\t" + nombres + " : " + _names.get(nombres) + "\n");
        }

        sb.append("\t\tPROPERTIES: \n");
        for (String propertyId : _properties) {
            sb.append("\t\t\t" + propertyId + "\n");
        }
        return sb.toString();
    }
}