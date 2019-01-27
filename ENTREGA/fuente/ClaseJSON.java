package fuente;

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

    public String getName(Nombres language_name) {
        String language = language_name.toString();
        if (_names.containsKey(language))
            if (_names.get(language).equals("")) {
                return _names.get(Nombres.name.toString());
            } else {
                return _names.get(language);
            }
        else
            return _names.get(Nombres.name.toString());
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
}