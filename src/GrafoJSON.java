import java.util.*;

public class GrafoJSON {
    private HashMap<String, ClaseJSON> _clases = new HashMap<>();
    private ArrayList<RelacionJSON> _relaciones = new ArrayList<>();
    private HashMap<String, HashMap<String, String>> bufferProperties = new HashMap<>();

    private String name;
    private Engine engine;

    private int ultimoIntroducido; // 0->clase, 1->relacion, 2->property
    private ClaseJSON ultimaClase;
    private String ultimaClaseId;
    private RelacionJSON ultimaRelacion;
    private HashMap<String, String> ultimaProperty;
    private String ultimaPropertyId;

    private String dot;

    public void addUltimo(int num) {
        ultimoIntroducido = num;
    }

    public String getName() {
        return this.name;
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

    public String toDot(String languaje, ArrayList<String> _node_relationship, ArrayList<String> _edge_relationship,
            ArrayList<String> _node_class, ArrayList<String> _edge_class, ArrayList<String> _node_property,
            ArrayList<String> _edge_property, ArrayList<String> _node_inheritance, ArrayList<String> _edge_inheritance,
            ArrayList<String> _node_indirect_use, ArrayList<String> _edge_indirect_use) {
        if (dot==null){
            StringBuffer sb = new StringBuffer();
            // Defecto
            sb.append("graph ejemplo{\n");
            sb.append("//Defecto\n");
            sb.append("node [fontname=\"Arial\"];\n");
            sb.append("edge [fontname=\"Arial\",fontsize=12];\n");

            // Propiedades
            sb.append("\n//PROPERTIES\n");
            sb.append(fragmentDot(_node_property, "node"));
            sb.append(fragmentDot(_edge_property, "edge"));
            for (String propertyID : bufferProperties.keySet()) {
                HashMap<String, String> propertyContent = bufferProperties.get(propertyID);
                if (propertyContent.containsKey("name")) {
                    sb.append("property_");
                    if (propertyContent.containsKey(languaje)){
                        sb.append(propertyContent.get(languaje));
                        sb.append(" [label=\"{" + propertyContent.get(languaje) + "|");
                    }else{
                        sb.append(propertyContent.get("name"));
                        sb.append(" [label=\"{" + propertyContent.get("name") + "|");
                    }
                    if (propertyContent.containsKey("typeOf"))
                        sb.append(propertyContent.get("typeOf"));
                    sb.append("}\"");
                    if (propertyContent.containsKey("optional")){
                        if (propertyContent.get("optional").equals("true")){
                            sb.append(",style=\"filled,dashed\"");
                        }
                    }
                    sb.append("];\n");
                }
            }

            //Clases
            sb.append("\n//CLASES\n");
            sb.append(fragmentDot(_node_class, "node"));
            sb.append(fragmentDot(_edge_class, "edge"));
            for (String claseID : _clases.keySet()){
                String nombreClase = _clases.get(claseID).getName(languaje);
                sb.append("class_");
                sb.append(nombreClase);
                sb.append(" [label=");
                sb.append(nombreClase);
                sb.append("];\n");
            }

            //Relaciones
            sb.append("\n//RELACIONES\n");
            sb.append(fragmentDot(_node_relationship, "node"));
            for (RelacionJSON relacion : _relaciones) {
                if (relacion.hasID()){
                    String nombreRealcion = relacion.getName(languaje);
                    if (nombreRealcion!=null){
                        sb.append("relationship_");
                        sb.append(nombreRealcion);
                        sb.append(" [label=");
                        sb.append(nombreRealcion);
                        sb.append("];\n");
                    }
                }
            }


            //Clase -- Propiedad
            sb.append("\n//CLASE -- PROPIEDAD\n");
            sb.append(fragmentDot(_edge_relationship, "edge"));
            sb.append("\n");
            for (String claseID : _clases.keySet()){
                ClaseJSON clase = _clases.get(claseID);
                for (int i = 0; i<clase.amountProperties();i++){
                    if (bufferProperties.containsKey(clase.getProperty(i))) {
                        sb.append("class_");
                        sb.append(clase.getName(languaje));
                        sb.append( " -- ");
                        sb.append("property_");
                        if (bufferProperties.get(clase.getProperty(i)).containsKey(languaje)){
                            sb.append(bufferProperties.get(clase.getProperty(i)).get(languaje));
                        }else{
                            sb.append(bufferProperties.get(clase.getProperty(i)).get("name"));
                        }
                        sb.append("\n");
                    }
                }
            }

            //Relacion -- Propiedad
            sb.append("//RELACION -- PROPIEDAD\n");
            for (RelacionJSON relacion : _relaciones) {
                for (int i = 0; i < relacion.amountProperties(); i++) {
                    if (relacion.getName(languaje)!=null){
                        if (bufferProperties.containsKey(relacion.getProperty(i))) {
                            sb.append("relationship_");
                            sb.append(relacion.getName(languaje));
                            sb.append(" -- ");
                            sb.append("property_");
                            if (bufferProperties.get(relacion.getProperty(i)).containsKey(languaje)) {
                                sb.append(bufferProperties.get(relacion.getProperty(i)).get(languaje));
                            } else {
                                sb.append(bufferProperties.get(relacion.getProperty(i)).get("name"));
                            }
                            sb.append("\n");
                        }
                    }
                }
            }

            // uso indirecto de definición de tipos
            sb.append(fragmentDot(_node_indirect_use, "node"));
            sb.append(fragmentDot(_edge_indirect_use, "edge"));
            sb.append("// uso indirecto de definición de tipos\n");
            for (String idProperty : bufferProperties.keySet()){
                if (bufferProperties.get(idProperty).containsKey("typeOf")){
                    if (_clases.keySet().contains(bufferProperties.get(idProperty).get("typeOf"))){
                        sb.append("property_");
                        if (bufferProperties.get(idProperty).containsKey(languaje)) {
                            sb.append(bufferProperties.get(idProperty).get(languaje));
                        } else {
                            sb.append(bufferProperties.get(idProperty).get("name"));
                        }
                        sb.append(" -- ");
                        sb.append("class_");
                        sb.append(_clases.get(bufferProperties.get(idProperty).get("typeOf")).getName(languaje));
                        sb.append(" [label=\"TypeOf\"];\n");
                    }
                }
            }


            sb.append("\n}\n");

            //System.out.println(sb.toString());
            dot = sb.toString();
            return sb.toString();
        }else {
            return dot;
        }
    }

    private String fragmentDot(ArrayList<String> cadena, String tipo) {
        StringBuffer sb = new StringBuffer();
        if (cadena.size() > 0) {
            sb.append(tipo);
            sb.append("[");
            for (String parameter : cadena) {
                sb.append(parameter + ", ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}