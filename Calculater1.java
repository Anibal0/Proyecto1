//* Iporting All  the packedges

import java.util.*;



public class Calculater1{
    
    public static void main(String [] args) {
        
        
        //* Creates scanner object
        
        Scanner input= new Scanner(System.in);
        

//* Declaracion de variables 
        
        int a=0;
        int b=0;
        int c;
        int x=1;
        
        
       //* Caculater title *//
       
        System.out.print("*****Bienvenido*****\n\n");
        
        
        //* Prompts user to choose which number he will like to use 
        
        System.out.print("introduzca el primer numero\n");
        a= input.nextInt();
        System.out.print("introduzca el segungo numero\n");
        b= input.nextInt();
        
        //* Prompts user to choose an operatio 
        
        System.out.print("Escoja una de las opciones"+
                
        //* calculater interface 
               
        "\n2.Suma"+
        "\n3.Resta"+
        "\n4.Multiplicacion"+
        "\n5.Divicion"+
        
        "\n listo\n");
        
        int operation=input.nextInt();
        int Suma=2;
        int resta=3;
        int Multiplicacion=4;
        int divcio=5;
        
        //* Does action depending on what the user  have choosen 
        if (operation==Suma){
            
            c=a+b;
            
            System.out.println(a+"+"+b+"="+c);
        }
        
        else if(operation==resta)
        
        {
            c=a-b;
            
            System.out.println(a+"-"+b+"="+c);
        }
        
        
        else if (operation==Multiplicacion){
            
            
            c=a*b;
            
            System.out.println(a+"*"+b+"="+c);
            
            
        }
        
        else if (operation==divcio){
            
            //* Statement that may cause an exception 
            try
            {
                c=a/b;
                   System.out.println(a+"/"+b+"="+c);
                   
                   x=2;
            }
          
            //* The exception or error will be catch by using this statement
            catch (Exception e)
            
            {
                
                System.out.println("El nuero ingresado no es valido favor ingrese otro");
                
            }
            //* Loop  body 
            do{
                //* Statement that may cause an exception
                try{
            
            System.out.print("introduzca el primer numero\n");
        a= input.nextInt();
        System.out.print("introduzca el segungo numero\n");
        b= input.nextInt();
        int divv=a/b;
        System.out.println("El resultado es: "+divv);
        x=2;
        
                }
                //* The exception or the  error will be catch by using this statement
                catch (Exception e){
                
                    System.out.println("Try again");
                
                }
                //* Loop will repeat the  action as long as the result equal to 1 
            }while (x==1);
        
            
        }
            
        
    }
    
    
}
