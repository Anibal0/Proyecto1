import java.util.*;

public class Fechamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc= new Scanner(System.in);
        
        int f,k,ñ;
        
        System.out.println("Introduce fecha: ");
        System.out.print("Imtroduzca dia: ");
        f = sc.nextInt();
        System.out.print("Introduzca mes: ");
        k = sc.nextInt();
        System.out.print("Introduzca año: ");
        ñ = sc.nextInt();

        //Se crea un objeto Fecha
        Fecha fecha = new Fecha(f,k,ñ);

        if (fecha.fechaCorrecta()) {

           
            System.out.println("La fecha introducida es : " + fecha);

            //Se muestran los 10 días 
            System.out.println("Introzuca los 10 días siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }

        } else { //Si la fecha no es correcta
            System.out.println("La fecha introduzida no valida");
        }
    }
}

    
    
  