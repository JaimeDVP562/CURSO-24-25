package tema7Arrays;

import java.util.Scanner;

public class T07E12 {

    /**
     * 
     * Realiza un programa que pida 10 números por teclado y que los almacene en un
     * array. A continuación se mostrará el contenido de ese array junto al índice
     * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
     * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
     * ambos números están entre 0 y 9. El programa deberá colocar el número de la
     * posición inicial en la posición final, rotando el resto de números para que
     * no se pierda ninguno. Al final se debe mostrar el array resultante.
     */
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        String indice = "";
        String arrayOriginal = "";
        int valorInicial = 0;
        int valorFinal = 0;

        // Declaramos un array de enteros
        int[] numeros = new int[10];

        // Rellenamos el array con números que le pedimos al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor, introduzca un número: ");
            numeros[i] = sc.nextInt();

            arrayOriginal += numeros[i] + "  ";
            indice += i + "   ";
        }

        // Pintamos el array original
        System.out.println("Indice: " + indice);
        System.out.println("        " + arrayOriginal);

        // Pedimos al usuario que introduzca la posicion inicial y final
        System.out.println("Introduzca la posición inicial (0 - 9): ");
        int posicionInicial = sc.nextInt();

        System.out.println("Introduzca la posición final (0 - 9): ");
        int posicionFinal = sc.nextInt();

        // Cerramos el Scanner
        sc.close();
    }
}
