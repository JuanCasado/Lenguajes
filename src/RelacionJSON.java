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

    public String getName(Nombres languaje_name) {
        String languaje = languaje_name.toString();
        if (_names.containsKey(languaje))
            return _names.get(languaje);
        else{
            return _names.get(Nombres.name.toString());
        }
    }

    public String getName(String extra, Nombres languaje_name) {
        String languaje = extra + languaje_name.toString();
        if (_names.containsKey(languaje))
            return _names.get(languaje);
        else {
            return _names.get(Nombres.name.toString());
        }
    }

    public String getClase(String clase) {
        if (_clases.containsKey(clase))
            return _clases.get(clase);
        else
            return "";
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
        _names.put(JSONkey.reverse_.toString()+Nombres.name.toString(), reverseName);
    }

    public void addFrom(String from) {
        _clases.put(JSONkey.from.toString(), from);
    }

    public void addTo(String to) {
        _clases.put(JSONkey.to.toString(), to);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\tRELACION: " + (id.equals("") ? "herencia" : id) + "\n");

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