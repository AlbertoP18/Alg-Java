
package javaapplication13;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class JavaApplication13 {

    public static void main(String[] args) throws IOException {
  
        
    double contadora=0, acumuladora=0;
    double prom; 
    int cant;
        FileWriter fichero = new FileWriter( "C:/Users/alber/Documents/fichero.txt");
    
    cant =  Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas estuidantes hay?"));
   
     double[] arrayNotas = new double[cant];
     String[] arrayNombre = new String[cant];
     String[] arrayDes = new String[cant];
     
     
        for (int i = 0; i < cant; i++) {
            
             arrayNombre[i] = JOptionPane.showInputDialog(null, "nombres");
            arrayNotas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la nota"));
           
            
            if(arrayNotas[i] >= 3){
                
                arrayDes[i] = "Aprobo";
            }
            else {
                 arrayDes[i] = "Reprobo";
            }
             
            acumuladora = acumuladora + arrayNotas[i];
            
            contadora = contadora + 1; 
            
            
        }
        
        
        String men;

        men = " los elementos del vector son: \n" ; 
   
   
        for (int i = 0; i < cant; i++) {
            
         
            men+= " \n" + arrayNombre[i] + " " + arrayNotas[i] + " " + arrayDes[i];
            
               fichero.write("los datos estan aqui: " + men);
        
        }
        
        fichero.close();
        
          JOptionPane.showMessageDialog(null,men);
                
        prom = acumuladora/contadora;
        
        
        JOptionPane.showMessageDialog(null, "el promedio es: " + prom);
        
        
        
        
        
        
        
        
    }
    
}
