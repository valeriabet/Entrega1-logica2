public class ListaCircular {//Creación clase 
    private Nodo cabeza = null;//CReqación nodo para inciciar la lista
    private Nodo cola = null;//creación ultimo nodo de la lista

    public void insertar(int x, int y){//Método para insertar un nodo en la lista
        Nodo nuevo = new Nodo(x, y);//Creación de objeto con laas coordenadas
        if (cabeza == null){//Evalúa si el primer elemento de la lista está vacío
            cabeza = nuevo;//El objeto nodo se asigna como primer elemento de la lista
            cola = nuevo;//el objeto nodo se asigna como ultimo elemento de la lista
            cabeza.siguiente = cabeza;//Se apunta el siguiente nodo a sí mismo
        }else{
            cola.siguiente = nuevo;//Si la cabeza de la lista no está vacía el siguiente nodo apunta a uno nuevo
            nuevo.siguiente = cabeza;//El siguiente nodo apunta a la cabeza
            cola = nuevo; //La cola de la lista se convierte en el nuevo nodo
        }
    }
        public Nodo getCabeza(){//Método para obtener el nodo de la cabeza
            return cabeza;
    }
}
