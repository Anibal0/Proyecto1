/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anibalm
 */
public class Fecha {
    
private int dia;
    private int mes;
    private int ano;
    
    
    
    
    public Fecha (){
        
        
    }
    
    
    public Fecha (int dia , int mes, int ano){
        
        this.ano=ano;
       this.dia=dia;
       this.mes=mes;
      
    }
    public int getdia(){
        
        return dia;      
    }
    public int getmes(){
        
        return mes;
        
    }
    public int getano(){
        
        return ano;
    }
    
    public void setdia(int dia ){
        
        this.dia=dia;       
    }
    public void setmes(int mes ){
        
        this.mes=mes;   
    }
    public void setano(int ano){
        
        this.ano=ano;
           
    }
  
    public boolean fechaCorrecta (int fecha){
        
        boolean fechaCorrecta = false;
        
        if (fecha>0){
            
            fechaCorrecta=true;
        }
        
        else {
            
           fechaCorrecta=false;
        }
        return fechaCorrecta;
        
        
        publicn boolean esBisiesto(){
            
          int an  = 0;  
            
           if ((an % 4 == 0) && ((an % 100 != 0) || (an % 400 == 0))){
           System.out.println("El ano es bisiesto");
           
           }
           else{
              
               System.out.println("El ano no es bisiesto"); 
                      
        }
           
        System.out.print("dia 4\n");
        System.out.print("dia 6\n");
        System.out.print("dia 10\n");
    }
        
        public void diaSiguiente(){
        
            if (fechaCorrecta()) 
            {
            dia = 1;
            
            }
           
            else (fechaCorrecta())
                    {
                mes = 1;
      
            }

        }

    private boolean fechaCorrecta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String toString() {
        StringBuilder am = new StringBuilder();
        if (dia < 10) {
            am.append("0");
        }
        am.append(dia);
        if (mes < 10) {
            am.append("0");
        }
        am.append(mes);
        am.append("-");
        am.append(ano);
        return am.toString();
    }
} //Fin de la clase Fecha

 

 
        
        
  
}