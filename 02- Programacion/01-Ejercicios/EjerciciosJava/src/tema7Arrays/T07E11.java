package tema7Arrays;

import java.util.Scanner;

public class T07E11 {

    /**
     * Realiza un programa que pida 10 números por teclado y que los almacene en un
     * array. A continuación se mostrará el contenido de ese array junto al índice
     * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
     * primos a las primeras posiciones, desplazando el resto de números (los que no
     * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
     * el array resultante.
     */

    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        String indice = "";
        String valor = "";

        // Declaramos un array de enteros
        int[] numeros = new int[10];
        int[] resultado = new int[10]; // Array para almacenar el resultado reorganizado
        int posPrimos = 0; // Índice para los números primos
        int posNoPrimos = 0; // Índice para los números no primos (empezamos después de los primos)

        // Rellenamos el array pidiendo al usuario que ingrese los números por pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número entero (" + (i + 1) + " de 10): ");
            numeros[i] = sc.nextInt();
            valor += numeros[i] + " ";
        }

        // Cerramos el Scanner
        sc.close();

        // Comprobamos si los números son primos y los almacenamos en el array de
        // resultado
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                resultado[posPrimos] = numeros[i]; // Colocamos los primos al principio
                posPrimos++;
            }
        }

        // Añadimos los números que no son primos al final del array de resultado
        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                resultado[posPrimos + posNoPrimos] = numeros[i];
                posNoPrimos++;
            }
        }

        // Pintamos la tabla original
        System.out.println("\nArray original:");
        System.out.println("Índice: " + obtenerIndices(numeros.length));
        System.out.println("Valor : " + valor);

        // Pintamos la tabla reorganizada
        System.out.println("\nArray resultante:");
        System.out.println("Índice: " + obtenerIndices(numeros.length));
        System.out.print("Valor : ");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si encontramos un divisor, no es primo
            }
        }
        return true; // Si no encontramos divisores, es primo
    }

    // Método para obtener los índices como una cadena
    public static String obtenerIndices(int longitud) {
        StringBuilder indices = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            indices.append(i).append(" ");
        }
        return indices.toString();
    }
}
