
package tp4julianortega;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio3 llamado2 = new Ejercicio3(); //llamado de la clase
        int[] arregloOriginal = new int [20];
        int[] arregloModificado = new int [20];
        System.out.println("Ingrese los 20 elementos del array");
        for (int i = 0; i < arregloOriginal.length; i++) {
            int numeroArray = sc.nextInt();
            arregloOriginal[i] = numeroArray;
            arregloModificado[i] = numeroArray;
        }
        boolean condicion = true;
        System.out.println("Ingrese el orden: (1) para ascendente o (2) para descendente");
        String orden = sc.nextLine();
        do{
            orden = sc.nextLine();
            switch (orden) {
                case "1":
                    orden = "ASC";
                    condicion = false;
                    break;
                case "2":
                    orden = "DESC";
                    condicion = false;
                    break;
                default:
                    System.out.println("Por favor ingrese un numero que corresponda");
                    break;
            }
        }while(condicion);
        System.out.println("Ingrese a la clase de ordenamiento((1)Insercion,(2) burbuja,(3) seleccion)");
        boolean condicion2 = true;
        String seleccionDeOrdenamiento;
        do{
            seleccionDeOrdenamiento = sc.nextLine();
            switch (seleccionDeOrdenamiento) {
                case "1":
                    llamado2.OrdenamientoPorInsercion(arregloModificado, orden);
                    condicion2 = false;
                    break;
                case "2":
                    llamado2.AlgoritmoDeLaBurbuja(arregloModificado, orden);
                    condicion2 = false;
                    break;
                case "3":
                    llamado2.OrdenamientoPorSeleccion(arregloModificado, orden);
                    condicion2 = false;
                    break;
                default:
                    System.out.println("Por favor ingrese un numero que corresponda");
                    break;
            }
        }while(condicion2);
        System.out.println("Arreglo Original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print(arregloOriginal[i] + " ");
        }
        System.out.println("");
        System.out.println("Arreglo ordenado a tu manera:");
        for (int i = 0; i < arregloModificado.length; i++) {
            System.out.print(arregloModificado[i] + " ");
        }
        System.out.println("");
    }
    
}
