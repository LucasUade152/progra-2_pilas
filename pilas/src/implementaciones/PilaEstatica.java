package implementaciones;

import interfaces.PilaTDA;

public class PilaEstatica implements PilaTDA {
    // Declaro las propiedades a utilizar en esta clase
    int [] v;
    int i;

    public void InicializarPila() {
        v = new int[100];
        i = 0;
    }

    public void Apilar(int x) {
        v[i] = x;
        i++;
    }

    public void Desapilar() {
        i--;
    }

    public int Tope() {
        return v[i-1];
    }

    public boolean PilaVacia() {
       return i == 0;
    }

}
