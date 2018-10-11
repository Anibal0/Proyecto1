import calculadora2.procesos;
import java.util.*;

public class Calculadora2{
    
    
    public static void main (String[] args){
        
                                                                                     
    
        
        Scanner inicio = new Scanner (System.in);
        
        procesos ani= new procesos ();
        
        int n2;
        int n1;
        int resultado;
        
        int opcion;
        
        boolean op=true;
        
        while(op){
            
            
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.print("5. finalizacion \n");
            
            opcion= inicio.nextInt();
            
            
            if (opcion==5){
                
                
                System.out.println("has finalizado");
                
                break;
            
            }else{
                
                switch (opcion){
                    
                    
                    case 1:
                        
                        System.out.print("ingrese el primer numero:");
                        n1=inicio.nextInt();
                        
                        System.out.print("ingrese el primer numero:");
                        n2=inicio.nextInt();
                        
                       resultado=ani.sumar(n1,n2);
                        
                    
                        System.out.println("EL resultado es:"+resultado);
                        
                        
                        
                        break;
                        
                        
                    case 2:
                        
                        
                        System.out.print("ingrese el primer numero:");
                        n1=inicio.nextInt();
                        
                        System.out.print("ingrese el primer numero:");
                        n2=inicio.nextInt();
                        
                        resultado=ani.restar(n1, n2);
                        
                        System.out.println("EL resultado es:"+resultado);
                        
                        break;
                        
                        
                    case 3:
                        
                        
                        
                        System.out.print("ingrese el primer numero:");
                        n1=inicio.nextInt();
                        
                        System.out.print("ingrese el primer numero:");
                        n2=inicio.nextInt();
                        
                        resultado=ani.multiplicacion(n1, n2);
                        
                        System.out.println("EL resultado es:"+resultado);
                        
                        break;
                        
                        
                    case 4:
                        
                        
                        
                        System.out.print("ingrese el primer numero:");
                        n1=inicio.nextInt();
                        
                        System.out.print("ingrese el primer numero:");
                        n2=inicio.nextInt();
                        
                        resultado=ani.divicion(n1, n2);
                        
                        System.out.println("EL resultado es:"+resultado);
                        
                        break;
                       
                    default:
                            
                            System.out.print("operacion no valida");
                        
                        
                        
                           
                }
                
            }
                
            
            
            
            
        }