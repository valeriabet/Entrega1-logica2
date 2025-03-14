import javax.swing.*;//Importación librería swing de interfaz grpáfica
import java.awt.*;//Imoortación librería awt para componenetes gráficos

public class App extends JPanel{//Creación clase extendiendo el JPanel para la interfaz gráfica

//Listas circulares a la derecha, izquierda, con sus rrespectivos nodos y timer
    private ListaCircular listaDerecha;
    private ListaCircular listaIzquierda;
    private Nodo actualDerecha;
    private Nodo actualIzquierda;
    private Timer timer;

    public App (){//creación método constructor
//Inicialización de cada una de las listas
        listaDerecha = new ListaCircular();
        listaIzquierda = new ListaCircular();
//generación de nodos circjulares para las listas
        generarTrayectoriaCircular(200, 200, 100, 30, listaDerecha);
        generarTrayectoriaCircular(400, 200, 100, 30, listaIzquierda);
//Establece los nodos actuales de las listas
        actualDerecha = listaDerecha.getCabeza();
        actualIzquierda = listaIzquierda.getCabeza();
//Configuración del tiempo para los nodos
        timer = new Timer(100, e ->{
            if (actualDerecha != null){
                actualDerecha = actualDerecha.siguiente;
            }
            if (actualIzquierda != null){
                Nodo temp = listaIzquierda.getCabeza();
                while(temp.siguiente != actualIzquierda && temp.siguiente != listaIzquierda.getCabeza()){
                    temp = temp.siguiente;//Avanza al siguiente nodo
                }
                actualIzquierda = temp;
            }
                repaint();//Vuelve a pintar el elemento
            });
            timer.start();//Inicializa el tiwmpo
        }
//método para crear los nodos en un trayecto circular
    public void generarTrayectoriaCircular(int centroX, int centroY, int radio, int puntos, ListaCircular lista){
        double anguloincremento = 2 * Math.PI / puntos;
        for (int i = 0; i < puntos; i++){
            int x = (int) (centroX + radio * Math.cos(i * anguloincremento));
            int y = (int) (centroY + radio * Math.sin(i * anguloincremento));
            lista.insertar (x, y);
        }
    }
//Método para dibujar los nodos
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (actualDerecha != null){
            g.setColor(Color.GREEN);
            g.fillOval(actualDerecha.x - 10, actualDerecha.y - 10, 30, 30);
        }
        if (actualIzquierda != null){
            g.setColor(Color.pink);
            g.fillOval(actualIzquierda.x - 10, actualIzquierda.y - 10, 30, 30);
        }
    }
        
    public static void main (String[] args) {//Método main para ejecutar el ejercicio
        JFrame frame = new JFrame("Animación circular");
        App panel = new App();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
