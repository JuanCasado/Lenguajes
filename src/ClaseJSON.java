import java.util.*;

public class ClaseJSON {
    private HashMap<String, HashMap<String, String>> _properties = new HashMap<>();
    private HashMap<String, String> _names = new HashMap<>();

    public void addCreatedProperty(HashMap<String, String> property) {
        _properties.put(property.get("@ID_PROPRETY@"), property);
        property.remove("@ID_PROPERTY@");
    }

    public void addLabel(String clave, String valor) {
        _names.put(clave, valor);
    }

    public void addValorProperty(String property) {
        _properties.put(property, new HashMap<>());
    }

    public void addValorProperty(String property, HashMap<String, String> contenido) {
        _properties.put(property, contenido);
    }

    public void addFullProperty(String property, HashMap<String, String> contenido) {
        if (_properties.containsKey(property))
            _properties.remove(property);
        this.addValorProperty(property, contenido);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

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