package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E28DibujarU {

    public static void main(String[] args) {
        /**
         * DIBUJAR U pidiendo la altura por teclado
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos que introduzcan los datos necesarios
        System.out.println("Introduzca la altura de la U: ");
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");

        try {

            // Declaramos variables
            int longFilaAbajo = (altura / 2);
            String filaAbajo = "";

            int longEspaciosInteriores = (altura / 2);
            String espaciosInteriores = "";

            // Pintamos los espacios interiores
            for (int i = 1; i <= longEspaciosInteriores; i++) {
                espaciosInteriores += "  ";
            }

            // Pintamos la altura
            for (int i = 1; i < altura; i++) {
                System.out.println("D" + espaciosInteriores + "D");
            }

            // Pintamos la fila de abajo
            for (int i = 1; i <= longFilaAbajo; i++) {
                filaAbajo += " D";
            }
            System.out.println(filaAbajo);
        } catch (Exception e) {
            System.out.println("ERROR: Los valores introducidos son incorrectos: ");
        }

        sc.close();
    }
}
