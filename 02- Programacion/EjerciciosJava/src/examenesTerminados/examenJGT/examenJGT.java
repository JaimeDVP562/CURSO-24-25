// Jaime Gavilán Torrero

package examenesTerminados.examenJGT;

import java.util.Random;
import java.util.Scanner;

public class examenJGT {

    public static void main(String[] args) {

        // Inicializamos el array de char para crear el tablero
        char[][] tablero = new char[4][4];
        inicializarTablero(tablero); // Llamamos a la función inicializarTablero

        // Inicializamos la variable turno jugador en true

        boolean turnoJugador = true;

        // Recorremos el bucle para empezar el juego
        while (true) {

            imprimirTablero(tablero);

            if (turnoJugador) {
                jugadorJuega(tablero); // Llamamos a la función jugadorJuega
            } else {
                maquinaJuega(tablero); // Llamamos a la función maquinaJuega
            }

            if (comprobarGanador(tablero)) {
                imprimirTablero(tablero); // Lamamos a la funcion pintaTablero
                System.out.println(turnoJugador ? "¡Enhorabuena me has ganado!" : "¡Ha ganado el ORDENADOR!");
                break;
            }

            turnoJugador = !turnoJugador; // Cada vez que iteremos en el bucle cambiaremos el estado de la variable
                                          // turnoJugador
        }
    }

    /**
     * Inicializamos el tablero introduciendole un char para rellenarlo
     * 
     * @param tablero
     */
    private static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 4; i++) {// Recorremos las filas y columnas rellenandolas con un char en primer lugar,
                                     // para inicializar el tablero
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    /**
     * Imprimos el tablero una vez rellenado con los datos introducidos
     * 
     * @param tablero
     */
    private static void imprimirTablero(char[][] tablero) {
        // Imprimimos el titulo del juego
        System.out.println(" LAS CUATRO EN RAYA ");
        System.out.println(" ===================");

        // Imprimir las filas con sus índices
        for (int i = 0; i < 4; i++) {
            String fila = (char) ('A' + i) + " |"; // Imprimir el índice de fila (A, B, C, D)
            for (int j = 0; j < 4; j++) {
                fila += " " + tablero[i][j]; // Imprimir el valor de la celda
            }
            System.out.println(fila);
        }

        // Imprimir los índices de las columnas (0-3)
        System.out.print("    ");
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Pedimos al usuario que introduzca los datos y controlamos que los introduzca
     * de manera correcta
     * 
     * @param tablero
     */
    private static void jugadorJuega(char[][] tablero) {
        Scanner scanner = new Scanner(System.in);
        int fila = -1, columna = -1;

        while (true) {

            // Empezamos con el turno del jugador y le pedimos que ingrese la fila
            System.out.print("Turno del jugador: \n");
            System.out.print("Introduce la fila (a-d): ");
            char letraFila = scanner.nextLine().toUpperCase().charAt(0);

            // Validamos la fila
            if (letraFila >= 'A' && letraFila <= 'D') {
                fila = letraFila - 'A'; // Convertir letra de fila a índice numérico
                break;
            } else {
                System.out.println("Coordenada no válida. Introduce una letra entre A y D.");
            }
        }

        while (true) {
            // Pedimos la columna
            System.out.print("Introduce la columna (0-3): ");
            columna = scanner.nextInt();
            System.out.println("\n");

            // Validamos la columna
            if (columna >= 0 && columna <= 3) {
                if (tablero[fila][columna] == '-') {
                    tablero[fila][columna] = 'X';
                    break;
                } else {
                    System.out.println("Coordenada no válida o casilla ocupada. Intentalo de nuevo.");
                }
            } else {
                System.out.println("Coordenada no válida o casilla ocupada. Debe ser un número entre 0 y 3.");
            }
        }

    }

    /**
     * // Inicializamos los numeros ramdon para introducirle los datos de manera
     * aleatoria el número de la fila y columna que va a "introducir" el ordenador
     * 
     * @param tablero
     */
    private static void maquinaJuega(char[][] tablero) {
        Random rand = new Random();
        int fila, columna;

        while (true) {
            fila = rand.nextInt(4);
            columna = rand.nextInt(4);

            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = 'O';
                break;
            }
        }
        System.out.print("\n");

    }

    /**
     * Comprobamos el tanto las filas como las columnas como las diagonales
     * recorriendo cada uno de los elementos de la tabla
     * 
     * @param tablero
     * @return
     */
    private static boolean comprobarGanador(char[][] tablero) {

        for (int i = 0; i < 4; i++) {

            // Comprobar filas y columnas
            if ((tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][2] == tablero[i][3]
                    && tablero[i][0] != '-')
                    || (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]
                            && tablero[2][i] == tablero[3][i] && tablero[0][i] != '-')) {
                return true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[2][2] == tablero[3][3]
                && tablero[0][0] != '-')
                || (tablero[0][3] == tablero[1][2] && tablero[1][2] == tablero[2][1] && tablero[2][1] == tablero[3][0]
                        && tablero[0][3] != '-')) {
            return true;
        }
        return false;

    }
}
