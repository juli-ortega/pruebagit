
package tp4julianortega;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas debe ser mayor a 2");
        int x = 0;
        int y = 0;
        do {
            x = sc.nextInt();
            if (x<2){
                System.out.println("Error, ingrese un numero correcto");
            }
        } while (x<2);
        System.out.println("Ingrese el numero de columnas debe ser mayor a 2");
        do {
            y = sc.nextInt();
            if (y<2){
                System.out.println("Error, ingrese un numero correcto");
            }
        } while (y<2);
        int [][] arreglo = new int [x][y];
        int suma = 0;
        System.out.println("Ahora llene la matriz:");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                int llenar = sc.nextInt();
                arreglo[i][j]= llenar;
                suma+=llenar;
            }
        }
        int resultado =0;
        resultado = suma/(x*y);
        
        
    }
}
