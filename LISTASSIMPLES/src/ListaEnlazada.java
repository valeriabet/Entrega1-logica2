public class ListaEnlazada {//Creación de clase
    private Nodo cabeza;//Creación primer nodo

//Método para agregar contactos al final de la lista
    public void agregar(String nombre, String telefono){
        Nodo nuevo = new Nodo(nombre, telefono);//Creación de objeto con sus valores
        if (cabeza == null){//Evalúa si el primer nodo está vacío
            cabeza = nuevo;//Asigna el objeto al nodo
        } else {
            Nodo temp = cabeza;//Se inicia temp para recorrer la lista
            while (temp.siguiente != null){//Se recorre la lista mientras que no se llegue hasta el último elemento
                temp = temp.siguiente;//Se avanza al siguiente nodo
            }
            temp.siguiente = nuevo;//Cuando se llega al final de la lista, se encunetra un valo vacío, el ultimo ondo sew apunta al primero
        }
    }

//Método para mostrar y recorrer todos los contactos 
    public void mostrar (){
        Nodo temp = cabeza;//Se inicia temp para recorrer la lista de contactos
        while (temp != null){//Ciclo que recorre la lista mientras el elemento no esté vacío
            System.out.println("Nombre: " + temp.nombre + ", " + "Teléfono:"  + temp.telefono);
            temp = temp.siguiente;//Imprime el elemento (no vacío) de la lista
        }
    }

//Método para eliminar contactos con el nombre
    public void eliminar (String nombre, String telefono){
        if (cabeza == null){//Evalúa si el primer elemento de la lista está vacío
            System.out.println("La lista está vacía" );//Luego imprime que está vacía la lista
            return;
        }
        if (cabeza.nombre.equals(nombre)){//Evalúa si el nombre del elemento es igual al que se quiere eliminar
            cabeza = cabeza.siguiente;//Se continúa al siguiente elemento
            return;
        }
        Nodo temp = cabeza;//Se inicia otro temp para recorrer la lista
        while (temp.siguiente != null && ! temp.siguiente.nombre.equals(nombre)){
            temp = temp.siguiente;//Ciclo que recorre mientras que el elemento no esté vacío y no esté ya en la lista
        }
        
        if (temp.siguiente != null){//Evalúa si el siguiente nodo está vacío o no
            temp. siguiente = temp.siguiente.siguiente;//Se recorre hasta el siguiente nodo
        }else{
            System.out.println("No se encontró el contacto");//Imprime que no se encuentra el contacto
        }
    }
}
