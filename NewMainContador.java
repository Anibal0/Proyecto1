
import java.util.Scanner;

public class NewMainContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        Contador contd=new Contador();
        
        int beat;
        
        
        System.out.println("Introduzca un valor ");
        
        beat=sc.nextInt();
        
        
        contd.incrementar();
       
        
        System.out.print(Contador.getCont);
        
        
        System.out.print("Introduzca otro Valor");
        
        beat=sc.nextInt();
        
        
        contd.decrementar();
        
        System.out.print(Contador.getCont);
        
        
       
    }
    
}
        
        
        
 
