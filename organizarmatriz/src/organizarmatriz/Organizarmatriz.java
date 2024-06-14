
package organizarmatriz;

    
 public class Organizarmatriz {

    public static int[] organizarHorizontal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] vectorHorizontal = new int[filas * columnas];

        int indice = 0;
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                vectorHorizontal[indice++] = matriz[fila][columna];
            }
        }

        return vectorHorizontal;
    }

    public static int[] organizarVertical(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] vectorVertical = new int[filas * columnas];

        int indice = 0;
        for (int columna = 0; columna < columnas; columna++) {
            for (int fila = 0; fila < filas; fila++) {
                vectorVertical[indice++] = matriz[fila][columna];
            }
        }

        return vectorVertical;
    }

    public static void imprimirVector(int[] vector, String nombre) {
       
        System.out.println(nombre);
        
        for (int i= 0; i< vector.length; i++) {
            System.out.print( "| " + vector[i] + " |");
        }
        
        System.out.println();
    }
    
    

    public static void main(String[] args) {
 
         
        int[][] matrizEjemplo = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

   
        int[] vectorHorizontal = organizarHorizontal(matrizEjemplo);
        int[] vectorVertical = organizarVertical(matrizEjemplo);

   
        imprimirVector(vectorHorizontal, "Vector Horizontal");
        imprimirVector(vectorVertical, "Vector Vertical");
        
        
        
    }
    
    
 }
    

