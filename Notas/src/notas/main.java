
package notas;

import javax.swing.JOptionPane;

public class main {
         
     public static void main(String[] args) {
     
         Notas notas = new Notas();
         
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota: "));
        double promedio;
        
            promedio = notas.calcularPromedio(n1, n2, n3);
         
         
                 JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio);

     
                
    }
     
     
     
     }
     
    

