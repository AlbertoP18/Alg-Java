
package vectormemoria;

import javax.swing.JOptionPane;
import static vectormemoria.metodos.*;

public class VectorMemoria {
    public static int posicionInicialEnMemoria = 0;

    public static void main(String[] args) {

        boolean vectorRellenado = false;

        int cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de filas"));

        int cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de columnas"));

        int vectorMemoria[] = new int[posicionInicialEnMemoria + cantidadFilas * cantidadColumnas];


      while (true) {
            byte eleccion = input("""
                                         0 - Salir
                                         1 - llenar matriz
                                         2 - ver vector
                                         3 - Mostrar matriz
                                         4 - Ver todas las sumatorias
                                         5 - Ver la sumatoria mayor
                                         6 - Ver la sumatoria menor""");
            switch (eleccion) {
                case 0 -> {

                }

                case 1 -> {
                    if (!vectorRellenado) {
                        vectorMemoria = rellenarVector(vectorMemoria, cantidadFilas, cantidadColumnas);
                        vectorRellenado = true;
                    } else {
                        Error("El vector ya ha sido rellenado");
                    }
                }
                case 2 -> {
                    imprimirVector(vectorMemoria);
                }
                case 3 -> {
                    imprimirMatriz(vectorMemoria, cantidadFilas, cantidadColumnas);
                }
                case 4 -> {
                    if (vectorRellenado) {
                        int[] sumatorias = obtenerSumatorias(vectorMemoria, cantidadFilas, cantidadColumnas);
                        imprimirVector(sumatorias);
                    } else {
                        Error("El vector no ha sido rellenado");
                    }
                }
                case 5 -> {
                    if (vectorRellenado) {
                        int[] sumatorias = obtenerSumatorias(vectorMemoria, cantidadFilas, cantidadColumnas);
                        //El resultado es un vector que contiene el elemento mayor y su indice
                        int elementoMayor = obtenerMayor(sumatorias);
                        
                        JOptionPane.showMessageDialog(null,"La sumatoria mayor fue de " + elementoMayor);
                
                    } else {
                        Error("El vector no ha sido rellenado");
                    }
                }
                case 6 -> {
                    if (vectorRellenado) {
                        int[] sumatorias = obtenerSumatorias(vectorMemoria, cantidadFilas, cantidadColumnas);
                        int elementoMenor = obtenerMenor(sumatorias);       
                        JOptionPane.showMessageDialog(null,"La sumatoria menor fue de " + elementoMenor);
              
                    } else {
                        Error("✖️El vector no ha sido rellenado✖️");
                    }
                }
                
               
                default ->
                    JOptionPane.showMessageDialog(null,"no es valido, intente de nuevo");
            }

            if (eleccion == 0) {
                break;
            }

        }


    }
    
}
