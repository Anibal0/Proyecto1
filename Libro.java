
public class Libro {
    
    
    
     /*atributos */
    public class Libro {
    
    
    
     /*atributos */
    int ISBN;
     String titulo;
     String autor;
     int numPaginas;
    boolean getNumPaginas;
     
    
     
    public Libro(int ISBN, String Titulo, String Autor, int NumPaginas){
     
        
        this.ISBN=ISBN;
        this.autor=Autor;
        this.numPaginas=NumPaginas;
        
     
    }

    Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
 
    public int getISBN() {
        return ISBN;
    }
 
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public int getNumPaginas() {
        return numPaginas;
    }
 
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
     
   
    public String toString(){
    
        
        System.out.println ("El libro "+titulo+" con Isbn " + ISBN+"");
        System.out.println(" creado por el autor " + autor+ "" );
        System.out.println(" creado por el autor " + numPaginas + "" );
        return null;
        
    }
        
        
        
                
}





