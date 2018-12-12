import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un JSON
 */

public class JSONTable {
    /*
     * Una clase esta compuesta por un nombre y de ella almacenaremos sus datos en
     * un arraylist para recorrerlos.
     */
    private GrafoJSON ultimoGrafo;
    private Integer ultimaRelacion;

    private ArrayList<GrafoJSON> _grafos = new ArrayList<>();

    public static final String CAMPO_VACIO = "";

    public void addGrafo(String nombreGrafo) {
        ultimoGrafo = new GrafoJSON();
        ultimoGrafo.setName(nombreGrafo);
        _grafos.add(ultimoGrafo);
    }

    public void setEngine(Engine engine) {
        ultimoGrafo.setEngine(engine);
    }

    public void addValorProperty(String property) {
        ultimoGrafo.addValorProperty(property);
    }

    public void addUsedBy(String usedBy) {
        ultimoGrafo.addUsedBy(usedBy);
    }

    public void addClase(String id) {
        ultimoGrafo.addClase(id);
    }

    public void addRelationship(String id) {
        ultimoGrafo.addRelationship(id);
    }

    public void addProperty(String id) {
        ultimoGrafo.addProperty(id);
    }

    public void addPropertyGender(String gender) {
        ultimoGrafo.addPropertyGender(gender);
    }

    public void addPropertyNumber(String number) {
        ultimoGrafo.addPropertyNumber(number);
    }

    public void addPropertyWordType(String wordType) {
        ultimoGrafo.addPropertyWordType(wordType);
    }

    public void addPropertyTypeOf(String typeOf) {
        ultimoGrafo.addPropertyTypeOf(typeOf);
    }

    public void addPropertyIsList(String isList) {
        ultimoGrafo.addPropertyIsList(isList);
    }

    public void addPropertyIsOptional(String isOptional) {
        ultimoGrafo.addPropertyIsOptional(isOptional);
    }

    public void addPropertyMultiMax(String multiMax) {
        ultimoGrafo.addPropertyMultiMax(multiMax);
    }

    public void addPropertyMultiMin(String multiMin) {
        ultimoGrafo.addPropertyMultiMin(multiMin);
    }

    public void addRelationshipReverseName(String reverseName) {
        ultimoGrafo.addRelationshipReverseName(reverseName);
    }

    public void addRelationshipFrom(String from) {
        ultimoGrafo.addRelationshipFrom(from);
    }

    public void addRelationshipTo(String to) {
        ultimoGrafo.addRelationshipTo(to);
    }

    public void addRelationshipFromClass(String inherit) {
        ultimoGrafo.addRelationshipFromClass(inherit);
    }

    public void addUltimo(int num) {
        ultimoGrafo.addUltimo(num);
    }

    public void addLabel(String clave, String valor) {
        if (valor == null){
            valor = "";
        }
        valor = valor.replaceAll("'", "");
        valor = valor.replaceAll(" ", "");
        ultimoGrafo.addLabel(clave, valor);
    }

    public void addLabelReverseName(String clave, String valor) {
        if (valor == null) {
            valor = "";
        }
        valor = valor.replaceAll("'", "");
        valor = valor.replaceAll(" ", "");
        ultimoGrafo.addLabelReverseName(clave, valor);
    }

    public void addName(String name) {
        ultimoGrafo.addName(name);
    }

    public int getSize() {
        return _grafos.size();
    }

    public String getDotContent(int index, Nombres languaje,ArrayList<String> _node_relationship, ArrayList<String> _edge_relationship,
            ArrayList<String> _node_class, ArrayList<String> _edge_class, ArrayList<String> _node_property,
            ArrayList<String> _edge_property, ArrayList<String> _node_inheritance, ArrayList<String> _edge_inheritance,
            ArrayList<String> _node_indirect_use, ArrayList<String> _edge_indirect_use) {
        if (_grafos.size() > index)
            return _grafos.get(index).toDot(languaje, _node_relationship, _edge_relationship, _node_class, _edge_class,
                    _node_property, _edge_property, _node_inheritance, _edge_inheritance, _node_indirect_use,
                    _edge_indirect_use);
        return "";
    }

    public Engine getEngine(int index) {
        if (_grafos.size() > index)
            return _grafos.get(index).getEngine();
        return null;
    }

    public String getName(int index) {
        if (_grafos.size() > index)
            return _grafos.get(index).getName();
        return "";
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (GrafoJSON grafo : _grafos) {
            sb.append(grafo.toString());
        }
        return sb.toString();
    }
}