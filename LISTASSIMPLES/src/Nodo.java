public class Nodo {//Creación clase
    String nombre, telefono;//Variable para almacenar el contenido del nodo
    Nodo siguiente;//Puntero al siguiente nodo

    public Nodo(String nombre, String telefono){//Método nodo para representar los contactos de la lista con nombre, telefono y el puntero al siguiente nodo
        this.nombre = nombre;//Instanciación de la variable nombre de la clase actual
        this.telefono = telefono;//Instanciación de la variable telefono de la clase actual
        this.siguiente = null;//Instanciación, el puntero siempre tiene a null
    }
}
