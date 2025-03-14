public class App {//Creación de la clase
    public static void main(String[] args) throws Exception {//Método main
        ListaEnlazada agenda = new ListaEnlazada();//Creación de objeto de la clase ListaEnlazada
    //Se agregan los contactos llamando al método agregar
        agenda.agregar("Contacto 1", "123456");
        agenda.agregar("Contacto 2", "789012");
        agenda.agregar("Contacto 3", "345678");
        agenda.agregar("Contacto 4", "901234");
        agenda.mostrar();//Se llama al método mostrar para mostrar la lista de contactos
    //Se elimina un contacto con el método eliminar
        System.out.println("Eliminar contacto 4");
        agenda.eliminar("Contacto 4", "901234");
    
    //Se muestra de nuevo la lista
        agenda.mostrar();
    }
}
