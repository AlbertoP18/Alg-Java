package vectormemoria;

import javax.swing.JOptionPane;
import static vectormemoria.VectorMemoria.*;

public class metodos {

    public static int obtenerElemento(int[] vector, int i, int j, int cantidadColumnas) {
        return vector[posicionInicialEnMemoria + cantidadColumnas * i + j];
    }

    public static byte input(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            try {
                return Byte.valueOf(entrada);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Error Intente de nuevo");
            }
        }
    }

    public static void Error(String mensaje) {
        JOptionPane.showMessageDialog(null, "Error: " + mensaje);
    }

    public static int[] rellenarVector(int[] vector, int cantidadFilas, int cantidadColumnas) {
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                vector[posicionInicialEnMemoria + cantidadColumnas * i + j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor en la fila: " + i + " columna: " + j));
            }
        }
        return vector;
    }

    public static void imprimirVector(int[] vector) {
        String resultado = " ";
        for (int i = 0; i < vector.length; i++) {
            resultado += (vector[i] + " \t");
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void imprimirMatriz(int[] vector, int cantidadFilas, int cantidadColumnas) {
        String men = "";
        for (int i = 0; i < cantidadFilas; i++) {
            men += "\n";
            for (int j = 0; j < cantidadColumnas; j++) {
                men += (obtenerElemento(vector, i, j, cantidadColumnas) + " \t");
                
            }
            
        }
        JOptionPane.showMessageDialog(null, men);
    }

    public static int sumatoriaColumna(int[] vector, int j, int cantidadFilas, int cantidadColumnas) {
        int sumatoria = 0;
        for (int i = 0; i < cantidadFilas; i++) {
            sumatoria += obtenerElemento(vector, i, j, cantidadColumnas);
        }
        return sumatoria;
    }

    public static int[] obtenerSumatorias(int[] vector, int cantidadFilas, int cantidadColumnas) {
        int sumatorias[] = new int[cantidadColumnas];
        for (int j = 0; j < cantidadColumnas; j++) {
            sumatorias[j] = sumatoriaColumna(vector, j, cantidadFilas, cantidadColumnas);

        }
        return sumatorias;
    }



    public static int obtenerMayor(int[] vector) {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int obtenerMenor(int[] vector) {
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

}
