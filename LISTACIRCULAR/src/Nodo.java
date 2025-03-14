public class Nodo {//CReación de la clase
    int x, y;//Variables para las coordenadas de los ejes x y y del plano cattesiano
    Nodo siguiente;//Puntero al siguiente nodo en la lista

    public Nodo (int x, int y){//Método para crear el nodo con las coordenadas 
        this.x = x;//Instanciación de la coordenada x en la clase
        this.y = y;//Instanciación de la coordenada y en la clse
        this.siguiente = null;//Inicializa el siguiente puntero vacío
    }
}
