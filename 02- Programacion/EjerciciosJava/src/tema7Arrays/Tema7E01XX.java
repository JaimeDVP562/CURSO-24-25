package tema7Arrays;

public class Tema7E01XX {
    /**
     * * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
     * elementos según la tabla que se muestra a continuación. Muestra el contenido
     * de todos los elementos del array. ¿Qué sucede con los valores de los
     * elementos que no han sido inicializados?
     * 
     * @param args
     */

    public static void main(String[] args) {
        // Inicializamos el Array de enteros
        int[] num = new int[12];

        // Declaramos los valores del Array
        num[0] = 39;
        num[1] = 4;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 4;

        // Recorremos el bucle para ver los valores del array
        for (int i = 0; i < num.length; i++) {
            System.out.println(" num[" + i + "] = " + num[i]);
        }
    }
}
