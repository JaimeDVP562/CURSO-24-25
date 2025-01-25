package tema7Arrays;

import java.util.Scanner;

public class T07E29BuscaTesoro {

    public static void main(String[] args) {
        /**
         * 
         * El juego «Busca el tesoro» coloca inicialmente, y de forma aleatoria, una
         * mina y un tesoro sobre un tablero de 4 filas por 5 columnas. Hecho esto, el
         * jugador debe averiguar dónde está el tesoro indicando las coordenadas (x, y).
         * Si se encuentra el tesoro el programa debe terminar con el mensaje
         * «¡Enhorabuena! ¡Has encontrado el tesoro!». Sin embargo, si se encuentra la
         * mina el jugador pierde la partida y el programa acaba. Al finalizar, se
         * muestra el tablero completo, mostrando los disparos realizados por el
         * jugador, la mina y el tesoro.
         * 
         */

        String[][] tablero = new String[4][5];
        String tesoro = "€";
        String mina = "X";

        // Introduzca las coordenadas x e y
        System.out.println("Introduzca la coordenada x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Introduzca la coordenada y");
        int y = sc.nextInt();

        // Inicializamos el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ";
                System.out.println("X");
            }
        }
    }
}
