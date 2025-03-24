import implementaciones.PilaEstatica;
import interfaces.PilaTDA;

public class App {
    //Metodo Principal
    public static void main(String[] args) {
        // Creo una variable llamada p1 que es de tipo PilaTDA con la imprementacion PilaEstatica
        PilaTDA p1 = new PilaEstatica();

        // Inicializo la pila p1
        p1.InicializarPila();

        // Verifico que la pila este vacia
        System.out.println(p1.PilaVacia()); // True = esta vacia 

        // Agrego algunos valores con Apilar()
        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
        p1.Apilar(5);

        // Verifico que la pila p1 no este vacia ahora
        System.out.println(p1.PilaVacia()); // False = tiene valores

        // Uso Tope() para saber el ultimo valor de la pila
        System.out.println(p1.Tope()); // El ultimo valor debe ser 5
        
        // Uso Desapilar y luego Tope() para quitar un valor y ver el que tenia atras
        p1.Desapilar();
        System.out.println(p1.Tope()); // El ultimo valor ahora debe ser 4


        
    }
}
