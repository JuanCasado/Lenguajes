import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un JSON
 */

public class JSONTable {
    /* Una clase esta compuesta por un nombre y de ella almacenaremos 
    sus datos en un arraylist para recorrerlos.
    */
    private String ultimaClase;
    private Integer ultimaRelacion;
    private HashMap<String, ArrayList<String>> _clase = new HashMap<>();
    /* En _nombre almacenaremos los name, label, reverseName... que podamos encontratrarnos
    dentro de una clase, una relacion... */
    private HashMap <String, HashMap <String, String>> _nombre = new HashMap<>();
    /* En las relaciones almacenaremos los from y los to en los que se hace referencia en 
    las clases.
    Es un array en lugar de un HashMap porque no nos interesa tener una clave para identificarla, sin
    embargo en el interior del array si que nos interesa saber a qué clases puede afectar */
    private ArrayList <HashMap <String, String>> _relaciones = new ArrayList<>();
   /* Las propiedades de las relaciones hace referencia al listado de propiedades que nos podemos
   encontrar en una relacion */
    private HashMap< Integer,ArrayList<String>> _propertiesRelationship  = new HashMap<>();
    public static final String CAMPO_VACIO = "";

    public void addId(String id){
        _clase.put(id, new ArrayList<>());
        _nombre.put(id, new HashMap<>());
        ultimaClase = id;
    }
   
    public void addName(String name){
        //tiene el id de la Clas
        _nombre.get(ultimaClase).put(Nombres.name.toString(), name);
    }

    public void addLabel (String label, String contenido ){
        _nombre.get(ultimaClase).put(label, contenido);
    }
    
    public void addRelaciones(String rel){
    //dentro de un inherits tenemos el from que es la clase procedente
    //y to que es a la que afecta.
       HashMap<String, String> relaciones = new HashMap<>();

      _relaciones.add(relaciones);
      relaciones.put(Relaciones.to.toString(), rel);
      relaciones.put(Relaciones.from.toString(), ultimaClase);
      
       //relaciones.put(Relaciones.from.toString(), ultimaClase);
       //relaciones.put(Relaciones.to.toString(), ultimaClase);
    }
    public void addProperties (String proper){
        _clase.get(ultimaClase).add(proper);
    }

   
    
}