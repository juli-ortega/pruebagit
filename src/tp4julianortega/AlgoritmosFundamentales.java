package tp4julianortega;
public class AlgoritmosFundamentales {
    //Algortimo ordenamiento por insercion
    public void OrdenamientoPorInsercion(int insercion[]){
        for(int i=1 ; i < insercion.length ; i++){
            int valor = insercion[i];
            int j = i - 1;
                while (j >= 0 && insercion[j]> valor) {
                    insercion[j+1] = insercion[j];
                    j--; 
                }
            insercion[j+1] = valor; 
        } 
    }
    
    public void AlgoritmoDeLaBurbuja(int burbuja[]){
        boolean intercambiado = false;
        do {
            for (int i = 1; i < burbuja.length; i++) {
                if (burbuja[i-1] > burbuja[i] ) {
                    int aux = burbuja[i-1];
                    burbuja[i-1] = burbuja[i];
                    burbuja[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
    }
    
    public void OrdenamientoPorSeleccion (int seleccion[]){
        for (int i = 1; i < seleccion.length; i++) {
            int minimo = i;
            for (int j = i+1; j < seleccion.length; j++) {
                if ( seleccion[j] < seleccion[minimo]){
                minimo = j;
                int aux = seleccion[minimo];
                seleccion[minimo] = seleccion[j];
                seleccion[j] = aux;
                }
            }
        }
    }
    
    
    public void BusquedaSecuencial(int busquedaArray[], int busquedaElemento ){
        boolean encuentro = false;
        for (int i = 1; i < busquedaArray.length; i++) {
            if (busquedaArray[i]== busquedaElemento) {
                encuentro = true;
            }
        }
    }
}
