import java.util.*;

public class ClaseJSON {
    private ArrayList<String> _properties = new ArrayList<>();
    private HashMap<String, String> _names = new HashMap<>();

    public void addLabel(String clave, String valor) {
        _names.put(clave, valor);
    }

    public void addValorProperty(String property) {
        if (!_properties.contains(property))
            _properties.add(property);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

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