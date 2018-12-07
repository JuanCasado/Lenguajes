import java.util.*;

public class GrafoJSON {
    private HashMap<String, ClaseJSON> _clases = new HashMap<>();
    private ArrayList<RelacionJSON> _relaciones = new ArrayList<>();
    private ClaseJSON ultimaClase;
    private String ultimaClaseId;
    private String name;
    private RelacionJSON ultimaRelacion;
    private Engine engine;
    private int ultimoIntroducido; // 0->clase, 1->relacion, 2->property
    private HashMap<String, String> ultimaProperty;
    private String ultimaPropertyId;
    private HashMap<String, HashMap<String, String>> bufferProperties = new HashMap<>();

    public void addUltimo(int num) {
        ultimoIntroducido = num;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClase(String clase) {
        ultimaClase = new ClaseJSON();
        ultimaClaseId = clase;
        ultimoIntroducido = 0;
        _clases.put(clase, ultimaClase);
    }

    public void addRelationship(String relationship) {
        ultimoIntroducido = 1;
        ultimaRelacion = new RelacionJSON(relationship);
        _relaciones.add(ultimaRelacion);
    }

    public void addProperty(String property) {
        ultimoIntroducido = 2;
        ultimaPropertyId = property;
        if (bufferProperties.containsKey(property)) {
            ultimaProperty = bufferProperties.get(property);
        } else {
            ultimaProperty = new HashMap<>();
            bufferProperties.put(property, ultimaProperty);
        }
    }

    public void addUsedBy(String usedBy) {
        if (usedBy.contains("class#")) {
            if (_clases.containsKey(usedBy)) {
                _clases.get(usedBy).addValorProperty(ultimaPropertyId);
            }
        } else if (usedBy.contains("relationship#")) {
            for (RelacionJSON rel : _relaciones) {
                if (rel.getID().equals(usedBy)) {
                    rel.addValorProperty(ultimaPropertyId);
                }
            }
        }
    }

    public void addLabel(String clave, String valor) {
        switch (ultimoIntroducido) {
        case 0:
            ultimaClase.addLabel(clave, valor);
            break;
        case 1:
            ultimaRelacion.addLabel(clave, valor);
            break;
        case 2:
            ultimaProperty.put(clave, valor);
            break;
        }
    }

    public void addValorProperty(String property) {
        if (!bufferProperties.keySet().contains(property))
            bufferProperties.put(property, new HashMap<String, String>());
        switch (ultimoIntroducido) {
        case 0:
            ultimaClase.addValorProperty(property);
            break;
        case 1:
            ultimaRelacion.addValorProperty(property);
            break;
        }
    }

    public void addLabelReverseName(String clave, String valor) {
        ultimaRelacion.addLabel("reverse_" + clave, valor);
    }

    public void addName(String name) {
        switch (ultimoIntroducido) {
        case 0:
            ultimaClase.addLabel("name", name);
            break;
        case 1:
            ultimaRelacion.addLabel("name", name);
            break;
        case 2:
            ultimaProperty.put("name", name);
            break;
        }
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

    public void addRelationshipFrom(String from) {
        ultimaRelacion.addFrom(from);
    }

    public void addRelationshipTo(String to) {
        ultimaRelacion.addTo(to);
    }

    public void addRelationshipFromClass(String inherit) {
        RelacionJSON herencia = new RelacionJSON("");
        _relaciones.add(herencia);
        herencia.addFrom(ultimaClaseId);
        herencia.addTo(inherit);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Grafo: " + name + "\n");

        sb.append("TIPO: " + engine.toString() + "\n");
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

    public String toDot(ArrayList<String> _node_relationship, ArrayList<String> _edge_relationship,
            ArrayList<String> _node_class, ArrayList<String> _edge_class, ArrayList<String> _node_property,
            ArrayList<String> _edge_property, ArrayList<String> _node_inheritance, ArrayList<String> _edge_inheritance,
            ArrayList<String> _node_indirect_use, ArrayList<String> _edge_indirect_use) {
        StringBuffer sb = new StringBuffer();
        sb.append("graph ejemplo{\n");
        sb.append("//Defecto\n");
        sb.append("node [fontname=\"Arial\"];\n");
        sb.append("edge [fontname=\"Arial\",fontsize=12];\n");

        return sb.toString();
    }

}