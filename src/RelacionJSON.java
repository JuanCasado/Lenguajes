import java.util.*;

public class RelacionJSON {
    private HashMap<String, String> _clases = new HashMap<>();
    private HashMap<String, HashMap<String, String>> _properties = new HashMap<>();
    private HashMap<String, String> _names = new HashMap<>();
    private String id = "";

    public RelacionJSON(String relacion) {
        id = relacion;
    }

    public String getID() {
        return id;
    }

    public void addCreatedProperty(HashMap<String, String> property) {
        _properties.put(property.get("@ID_PROPRETY@"), property);
        property.remove("@ID_PROPERTY@");
    }

    public void addFullProperty(String property, HashMap<String, String> contenido) {
        if (_properties.containsKey(property))
            _properties.remove(property);
        this.addValorProperty(property, contenido);
    }

    public void addValorProperty(String property) {
        _properties.put(property, new HashMap<>());
    }

    public void addValorProperty(String property, HashMap<String, String> contenido) {
        _properties.put(property, contenido);
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
        for (String propertyId : _properties.keySet()) {
            HashMap<String, String> property = _properties.get(propertyId);
            sb.append("\t\t\t" + propertyId + "\n");
            for (String nombreProperty : property.keySet()) {
                sb.append("\t\t\t\t" + nombreProperty + " : " + property.get(nombreProperty) + "\n");
            }
        }
        return sb.toString();
    }
}