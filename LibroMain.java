
public class LibroMain {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // objetos
        Libro li1=new Libro();
        Libro li2=new Libro();
         
        //Mostramos su estado
        System.out.println(li1.toString());
        System.out.println(li2.toString());
         
        // atributo 
        li1.setNumPaginas(10);
         
        
        if(li1.getNumPaginas){
         
            
            System.out.print(li2.getNumPaginas);
            
       
        }
        
        else{
            System.out.println(li2.getTitulo()+"contien mas pag ");
        }
    }
    
}
