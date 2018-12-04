import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un JSON
 */

public class JSONTable {
    /* Una clase esta compuesta por un nombre y de ella almacenaremos 
    sus datos en un arraylist para recorrerlos.
    */
    private HashMap<String, ArrayList<String>> _clase = new HashMap<>;
    /* En _nombre almacenaremos los name, label, reverseName... que podamos encontratrarnos
    dentro de una clase, una relacion... */
    private HashMap <String, HashMap <String, String>> _nombre = new HashMap<>;
    /* En las relaciones almacenaremos los from y los to en los que se hace referencia en 
    las clases.
    Es un array en lugar de un HashMap porque no nos interesa tener una clave para identificarla, sin
    embargo en el interior del array si que nos interesa saber a qué clases puede afectar */
    private ArrayList <HashMap <String, String>> _relaciones = new ArrayList< HashMap <String, String>;
   /* Las propiedades de las relaciones hace referencia al listado de propiedades que nos podemos
   encontrar en una relacion */
    private HashMap< Integer,ArrayList<String>> _propertiesRelationship  = new HashMap <>;
    public static final String CAMPO_VACIO = "";

   
    
}