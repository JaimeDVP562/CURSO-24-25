// Jaime Gavilán Torrero

import java.util.Random;
import java.util.Scanner;

public class examenJGT {

    public static void main(String[] args) {
        char[][] tablero = new char[4][4];
        inicializarTablero(tablero);

        boolean turnoJugador = true;
        while (true) {
            imprimirTablero(tablero);

            if (turnoJugador) {
                jugadorJuega(tablero);
            } else {
                maquinaJuega(tablero);
            }

            if (comprobarGanador(tablero)) {
                imprimirTablero(tablero);
                System.out.println(turnoJugador ? "¡Has ganado!" : "¡La máquina ha ganado!");
                break;
            }

            turnoJugador = !turnoJugador;
        }
    }

    private static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private static void imprimirTablero(char[][] tablero) {
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

    private static void jugadorJuega(char[][] tablero) {
        Scanner scanner = new Scanner(System.in);
        int fila = -1, columna = -1;

        while (true) {
            // Pedir la fila
            System.out.print("Introduce la fila (a-d): ");
            char letraFila = scanner.nextLine().toUpperCase().charAt(0);

            // Validar fila
            if (letraFila >= 'A' && letraFila <= 'D') {
                fila = letraFila - 'A'; // Convertir letra de fila a índice numérico
                break;
            } else {
                System.out.println("Fila inválida. Introduce una letra entre A y D.");
            }
        }

        while (true) {
            // Pedir la columna
            System.out.print("Introduce la columna (0-3): ");
            columna = scanner.nextInt();

            // Validar columna
            if (columna >= 0 && columna <= 3) {
                if (tablero[fila][columna] == '-') {
                    tablero[fila][columna] = 'X';
                    break;
                } else {
                    System.out.println("¡La casilla ya está ocupada! Intenta de nuevo.");
                }
            } else {
                System.out.println("Columna inválida. Debe ser un número entre 0 y 3.");
            }
        }

    }

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
        System.out.println("La máquina ha jugado.");
    }

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
