package tp4julianortega;
public class Ejercicio1 {
    public static void main(String[] args) {
    //Explique brevemente en quÃ© consisten los siguientes Algoritmos Fundamentales.
        System.out.println("""
                           Algoritmos de Ordenacion: 
                              Ordenamiento por Inserci\u00c3\u00b3n
                                   Es una representaci\u00c3\u00b3n natural de c\u00c3\u00b3mo aplicar\u00c3\u00adamos el orden a un conjunto de elementos.Inicialmente se tiene un solo elemento, que por defecto es un conjunto ordenado,  estos se van ordenando de menor a mayor, mientras se van colocando los elementos el mayor se va desplazando hacia la derecha 
                              Algoritmo de la burbuja
                                   Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por parejas), si no est\u00c3\u00a1n en el orden correcto, se intercambian entre s\u00c3\u00ad sus valores. El valor m\u00c3\u00a1s peque\u00c3\u00b1o flota hasta el principio de la lista como si fuera una burbuja
                              Ordenamiento por selecci\u00c3\u00b3n
                                   Este algoritmo recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida el menor elemento se coloca al inicio de la lista recorrida. En la siguiente iteraci\u00c3\u00b3n se recorre nuevamente la lista pero comenzando en el segundo elemento
                              Algoritmo Quick-Sort
                                   En este algortimo se elige un elemento que sea central de la lista, este divide todos los otros elementos en dos partes,por un lado los mayores a \u00c3\u00a9l y por el otro los menores luego quedan sublistas de cada lado entonces se repite este proceso de forma recursiva para cada sublista mientras \u00c3\u00a9stas contengan m\u00c3\u00a1s de un elemento. Una vez terminado este proceso todos los elementos estar\u00c3\u00a1n ordenados.
                           Algoritmos de B\u00c3\u00basqueda:
                              B\u00c3\u00basqueda Secuencial
                           Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde un elemento al siguiente, comenzando en la primera posici\u00c3\u00b3n de la lista y se detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado.
                              B\u00c3\u00basqueda Binaria
                           Este algoritmo se utiliza cuando disponemos de una lista ordenada, lo que nos permite facilitar la b\u00c3\u00basqueda, ya que podemos ir disminuyendo el espacio de b\u00c3\u00basqueda a segmentos menores a la lista original y completa. Se busca a partir del medio y ahi se evalua si el elemento que se busca esta a la derecha o a la izquierda del mismo 
                           Algoritmos de Recorrido:
                              Recorrido de Profundidad
                           en el recorrido en profundidad, todos los descendientes de un hijo se procesan antes del siguiente hijo. Para saber c\u00c3\u00b3mo regresarnos, vamos guardando los nodos visitados en una estructura de pila
                              Recorrido de Anchurael proceso se realiza horizontalmente desde el ra\u00c4\u00b1\u00c5\u00ba a todos sus hijos, a continuaci\u00c3\u00b3n, a los hijos de sus hijos y as\u00c3\u00ad \u00cc\ufffd sucesivamente hasta que todos los nodos han sido procesados. En otras palabras, en el recorrido en anchura, cada nivel se procesa totalmente antes de que comience el siguiente nivel. 
                           """);
    }
    
}
