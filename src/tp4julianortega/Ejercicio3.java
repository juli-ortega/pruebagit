
package tp4julianortega;
public class Ejercicio3 {
    public void OrdenamientoPorInsercion(int insercion[], String orden){
        int n = insercion.length;
        for (int i = 1; i < n; i++) {
            int valor = insercion[i];
            int j = i - 1;
            if ("ASC".equals(orden)) {
                while (j >= 0 && insercion[j] > valor) {
                    insercion[j + 1] = insercion[j];
                    j--;
                }
            } else if ("DESC".equals(orden)) {
                while (j >= 0 && insercion[j] < valor) {
                    insercion[j + 1] = insercion[j];
                    j--;
                }
            }
            insercion[j + 1] = valor;
        }
    }
    
    public void AlgoritmoDeLaBurbuja(int burbuja[],String orden){
        int n = burbuja.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (("ASC".equals(orden) && burbuja[j] > burbuja[j + 1]) || ("DESC".equals(orden) && burbuja[j] < burbuja[j + 1])) {
                    int temp = burbuja[j];
                    burbuja[j] = burbuja[j + 1];
                    burbuja[j + 1] = temp;
                }
            }
        }
    }
    
    public void OrdenamientoPorSeleccion(int seleccion[], String orden){
        for (int i = 0; i < seleccion.length-1; i++) {
            int mayor = i;
            
        //int[] arreglo = {5, 2, 9, 1, 5, 8};
        
            for (int j = i+1; j < seleccion.length; j++) {
                if ("ASC".equals(orden)){
                    if ( seleccion[j] < seleccion[mayor]){
                    mayor = j;
                    }
                }else if("DESC".equals(orden)){
                    if ( seleccion[j] > seleccion[mayor]){
                    mayor = j;
                    }
                }
            }
        int aux = seleccion[i];
            seleccion[i] = seleccion[mayor];
            seleccion[mayor] = aux;
        }
    }
    
}
