import java.util.*;


public class Contador {

    static boolean getCont;
    
    private int cont;

    // contador de defecto
    public Contador() {
    }

    // c.parÃ¡metros
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        }
    }

    //c.copia
    public Contador(Contador ani) {
        cont = ani.cont;
    }

    //get
    public int getCont() {
        return cont;
    }

    //set
    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } 
    }

    // incrementar contador
    public void incrementar() {
        cont++;
    }

    //decrementar contador
    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}


