package EjerciciosJavaT5;

import java.util.Scanner;

public class t05EXXPintaTablero {
    public static void main(String[] args) {
        /**
         * Pinta un tablero que pida de entrada por teclado un ancho y alto
         * 
         * Ejemplo:
         * Introduzca el ancho de la tabla: 3
         * Introduzca el alto de la tabla: 4
         * |_ _ _ _|_ _ _ _|_ _ _ _|
         * |_ _ _ _|_ _ _ _|_ _ _ _|
         * |_ _ _ _|_ _ _ _|_ _ _ _|
         * |_ _ _ _|_ _ _ _|_ _ _ _|
         */

        // Declaraciones
        int ancho = 0;
        int alto = 0;
        Scanner sc = new Scanner(System.in);
        // Lee altura de teclado
        System.out.print("Introduzca el ancho de la tabla: ");
        ancho = sc.nextInt();
        System.out.print("Introduzca el alto de la tabla: ");
        alto = sc.nextInt();

        String planoHorizontal = "";
        String planoVertical = "";

        // Creamos palo
        for (int i = 0; i < alto; i++) {
            planoVertical += "|";
            sc.close();
            for (int b = 0; b < ancho; b++) {

                planoHorizontal += "_";
            }

            System.out.println(planoVertical + planoHorizontal);

        }

    }

    /**
     * // Pintamos el palo vertical
     * for (int i = 0; i < altura - 1; i++) {
     * System.out.println("*" + espacioHorizontal + "*");
     * }
     * // Pintamos el palo horizonal
     * System.out.println(sPaloHorizontal);
     * 
     */
    // Cerramos Scanner

}
