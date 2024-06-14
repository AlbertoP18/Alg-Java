
package notas;

import javax.swing.JOptionPane;


public class Notas {

       double n1, n2 ,n3, promedio = 0;
       
       
       
       
       
        public void promedio(double n1, double n2, double n3,double prom){
        
            this.n1 = n1;
                    
            this.n2 = n2;
         
            this.n3 = n3;
            
                
                         }
        
            public double calcularPromedio(double n1, double n2, double n3) {
                
               double respuesta = (n1 + n2 +n3) / 3;
               
                this.promedio = respuesta;
                
                         return respuesta;
                        }

     
     
    
}      
        
        
        

      
    
