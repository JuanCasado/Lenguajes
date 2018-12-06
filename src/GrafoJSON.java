import java.util.*;

public class GrafoJSON {
    private HashMap<String, ClaseJSON> _clases = new HashMap<>();
    private ArrayList<RelacionJSON> _relaciones = new ArrayList<>();
    private ClaseJSON ultimaClase;
    private RelacionJSON ultimaRelacion;
    private HashMap<String, String> ultimaProperty;
    private HashMap<String, HashMap<String, String>> bufferProperties = new HashMap<>();

    public void addClase(String clase) {
        ultimaClase = new ClaseJSON();
        _clases.put(clase, ultimaClase);
        if (bufferProperties.keySet().contains(clase)) {
            ultimaClase.addCreatedProperty(bufferProperties.get(clase));
        }
    }

    public void addRelationship(String relationship) {
        ultimaRelacion = new RelacionJSON(relationship);
        _relaciones.add(ultimaRelacion);

    }

    public void addProperty(String property) {
        ultimaProperty = new HashMap<>();
        bufferProperties.put(property, ultimaProperty);
    }

    public void addPropertyGender(String gender) {
        ultimaProperty.put("gender", gender);
    }

    public void addPropertyNumber(String number) {
        ultimaProperty.put("number", number);
    }

    public void addPropertyWordType(String wordType) {
        ultimaProperty.put("wordType", wordType);
    }

    public void addPropertyTypeOf(String typeOf) {
        ultimaProperty.put("typeOf", typeOf);
    }

    public void addPropertyIsList(String isList) {
        ultimaProperty.put("isList", isList);
    }

    public void addPropertyIsOptional(String isOptional) {
        ultimaProperty.put("isOptional", isOptional);
    }

    public void addPropertyMultiMax(String multiMax) {
        ultimaProperty.put("multiMax", multiMax);
    }

    public void addPropertyMultiMin(String multiMin) {
        ultimaProperty.put("multiMin", multiMin);
    }

    public void addRelationshipReverseName(String reverseName) {
        ultimaRelacion.addReverseName(reverseName);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (String claseId : _clases.keySet()) {
            ClaseJSON clase = _clases.get(claseId);
            sb.append("\tClase: " + claseId + "\n");
            sb.append(clase.toString() + "\n");
        }

        for (RelacionJSON relacion : _relaciones) {
            sb.append(relacion.toString() + "\n");
        }

        for (String propertyId : bufferProperties.keySet()) {
            HashMap<String, String> property = bufferProperties.get(propertyId);
            sb.append("\tProperty en buffer: " + propertyId + "\n");
            for (String nombreProperty : property.keySet()) {
                sb.append("\t\t" + nombreProperty + " : " + property.get(nombreProperty) + "\n");
            }
        }

        return sb.toString();
    }

}