import java.util.*;

public class GrafoJSON {
    private HashMap<String, ClaseJSON> _clases = new HashMap<>();
    private ArrayList<RelacionJSON> _relaciones = new ArrayList<>();
    private HashMap<String, HashMap<String, String>> _properties = new HashMap<>();

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
        if (_properties.containsKey(property)) {
            ultimaProperty = _properties.get(property);
        } else {
            ultimaProperty = new HashMap<>();
            _properties.put(property, ultimaProperty);
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
        if (!_properties.keySet().contains(property))
            _properties.put(property, new HashMap<String, String>());
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
        herencia.addTo(ultimaClaseId);
        herencia.addFrom(inherit);
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

        for (String propertyId : _properties.keySet()) {
            HashMap<String, String> property = _properties.get(propertyId);
            sb.append("\tProperty: " + propertyId + "\n");
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
            sb.append("graph "+this.name+"{\n");
            sb.append("\t//Defecto\n");
            sb.append("\tnode [fontname=\"Arial\"];\n");
            sb.append("\tedge [fontname=\"Arial\",fontsize=12];\n");

            // Propiedades
            sb.append("\n\t//PROPERTIES\n");
            sb.append("\t"+fragmentDot(_node_property, "node")+"\n");
            sb.append("\t"+fragmentDot(_edge_property, "edge") + "\n");
            for (String propertyID : _properties.keySet()) {
                HashMap<String, String> propertyContent = _properties.get(propertyID);
                if (propertyContent.containsKey("name")) {
                    sb.append("\tproperty_");
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
                    if (propertyContent.containsKey("isOptional")){
                        if (propertyContent.get("isOptional").equals("true")){
                            sb.append(",style=\"filled,dashed\"");
                        }
                    }
                    sb.append("];\n");
                }
            }

            //Clases
            sb.append("\n\t//CLASES\n");
            sb.append("\t"+fragmentDot(_node_class, "node") + "\n");
            sb.append("\t"+fragmentDot(_edge_class, "edge") + "\n");
            for (String claseID : _clases.keySet()){
                String nombreClase = _clases.get(claseID).getName(languaje);
                sb.append("\tclass_");
                sb.append(nombreClase);
                sb.append(" [label=");
                sb.append(nombreClase);
                sb.append("];\n");
            }

            //Relaciones
            sb.append("\n\t//RELACIONES\n");
            sb.append("\t"+fragmentDot(_node_relationship, "node") + "\n");
            for (RelacionJSON relacion : _relaciones) {
                if (relacion.hasID()){
                    String nombreRealcion = relacion.getName(languaje);
                    if (nombreRealcion!=null){
                        sb.append("\trelationship_");
                        sb.append(nombreRealcion);
                        sb.append(" [label=");
                        sb.append(nombreRealcion);
                        sb.append("];\n");
                    }
                }
            }


            //Clase -- Propiedad
            sb.append("\n\t//CLASE -- PROPIEDAD\n");
            sb.append("\t"+fragmentDot(_edge_relationship, "edge") + "\n");
            for (String claseID : _clases.keySet()){
                ClaseJSON clase = _clases.get(claseID);
                for (int i = 0; i<clase.amountProperties();i++){
                    if (_properties.containsKey(clase.getProperty(i))) {
                        sb.append("\tclass_");
                        sb.append(clase.getName(languaje));
                        sb.append( " -- ");
                        sb.append("property_");
                        if (_properties.get(clase.getProperty(i)).containsKey(languaje)){
                            sb.append(_properties.get(clase.getProperty(i)).get(languaje));
                        }else{
                            sb.append(_properties.get(clase.getProperty(i)).get("name"));
                        }
                        sb.append(";\n");
                    }
                }
            }

            //Relacion -- Propiedad
            sb.append("\n\t//RELACION -- PROPIEDAD\n");
            for (RelacionJSON relacion : _relaciones) {
                for (int i = 0; i < relacion.amountProperties(); i++) {
                    if (relacion.getName(languaje)!=null){
                        if (_properties.containsKey(relacion.getProperty(i))) {
                            sb.append("\trelationship_");
                            sb.append(relacion.getName(languaje));
                            sb.append(" -- ");
                            sb.append("property_");
                            if (_properties.get(relacion.getProperty(i)).containsKey(languaje)) {
                                sb.append(_properties.get(relacion.getProperty(i)).get(languaje));
                            } else {
                                sb.append(_properties.get(relacion.getProperty(i)).get("name"));
                            }
                            sb.append(";\n");
                        }
                    }
                }
            }

            // uso indirecto de definición de tipos
            sb.append("\n\t// uso indirecto de definición de tipos\n");
            for (String idProperty : _properties.keySet()){
                if (_properties.get(idProperty).containsKey("typeOf")){
                    if (_clases.keySet().contains(_properties.get(idProperty).get("typeOf"))){
                        sb.append("\tproperty_");
                        if (_properties.get(idProperty).containsKey(languaje)) {
                            sb.append(_properties.get(idProperty).get(languaje));
                        } else {
                            sb.append(_properties.get(idProperty).get("name"));
                        }
                        sb.append(" -- ");
                        sb.append("class_");
                        sb.append(_clases.get(_properties.get(idProperty).get("typeOf")).getName(languaje));
                        sb.append(" ["+ fragmentDot(_edge_indirect_use, "")+ fragmentDot(_node_indirect_use, "")+"label=\"TypeOf\"];\n");
                    }
                }
            }

            // asociaciones a través de atributos marcadas de forma directa
            sb.append("\n\t// asociaciones a través de atributos marcadas de forma directa\n");
            for (String idClase : _clases.keySet()){
                ClaseJSON clase = _clases.get(idClase);
                for (int i = 0; i<clase.amountProperties(); i++){
                    String idProperty = clase.getProperty(i);
                    if (_properties.containsKey(idProperty)){
                        HashMap <String, String> property = _properties.get(idProperty);
                        if (property.containsKey("typeOf")){
                            if (_clases.containsKey(property.get("typeOf"))){
                                ClaseJSON referencedClase = _clases.get(property.get("typeOf"));
                                sb.append("\tclass_");
                                sb.append(clase.getName(languaje));
                                sb.append(" -- class_");
                                sb.append(referencedClase.getName(languaje));
                                sb.append(" [label=\"");
                                if (property.containsKey(languaje)) {
                                    sb.append(property.get(languaje));
                                } else {
                                    sb.append(property.get("name"));
                                }
                                if (property.containsKey("multiMin")) {
                                    if (property.containsKey("multiMax")) {
                                        sb.append(" (" +property.get("multiMin")+".." +property.get("multiMax") +") ");
                                    }
                                }
                                sb.append("\"");
                                sb.append("fontcolor=\"orangered\", color=\"orangered\", style=\"dashed\", arrowhead=\"vee\",dir=\"forward\",arrowsize=\"2\"];\n");
                            }
                        }
                    }
                }
            }

            // herencias
            sb.append("\n\t// herencias\n");
            for (RelacionJSON relation : _relaciones){
                if (relation.getID().equals("")){
                    sb.append("\tclass_");
                    sb.append(_clases.get(relation.getClase("from")).getName(languaje));
                    sb.append(" -- class_");
                    sb.append(_clases.get(relation.getClase("to")).getName(languaje));
                    sb.append(" ["+ fragmentDot(_node_inheritance, "")+ fragmentDot(_edge_inheritance, "")+ "label=\"inherits\"];\n");
                }
            }

            // enlaces de relaciones
            sb.append("\n\t// enlaces de relaciones\n");
            sb.append("\tedge[len=\"2\",penwidth=\"3\",color=\"blue\"]\n");
            for (RelacionJSON relation : _relaciones) {
                if (!relation.getID().equals("")) {
                    sb.append("\tclass_");
                    sb.append(_clases.get(relation.getClase("from")).getName(languaje));
                    sb.append(" -- relationship_");
                    sb.append(relation.getName(languaje));
                    sb.append(" [label=\""+ relation.getName(languaje)+"\","+"fontcolor=\"blue\",dir=\"forward\",arrowhead=\"normal\""+"];\n");

                    sb.append("relationship_");
                    sb.append(relation.getName(languaje));
                    sb.append(" -- class_");
                    sb.append(_clases.get(relation.getClase("to")).getName(languaje));
                    sb.append(" [label=\""+ relation.getName("reverse_" + languaje)+"\","+"fontcolor=\"blue\",dir=\"forward\",arrowhead=\"normal\""+"];\n");
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
            if (!tipo.equals(""))
                sb.append("[");
            for (String parameter : cadena) {
                sb.append(parameter + ", ");
            }
            if (!tipo.equals(""))
                sb.append("]\n");
            return sb.toString();
        }
        return "";
    }
}