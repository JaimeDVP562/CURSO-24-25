package EjerciciosJavaT5;

import java.util.Scanner;

public class T05XXTableroRelleno {
    public static void main(String[] args) {
        // Declaraciones
        final String BORDE_H = "___";
        final String BORDE_V = "|";
        int alto = 0;
        int ancho = 0;
        Scanner sc = new Scanner(System.in);
        // Lee altura de teclado
        while (alto <= 0) {
            try {
                System.out.print("Introduzca altura del tablero: ");
                alto = sc.nextInt();
                if (alto <= 0) {
                    System.out.println("ERROR: La altura debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un número positivo.");
                sc.nextLine();
            }
        }
        // Lee anchura de teclado
        while (ancho <= 0) {
            try {
                System.out.print("Introduzca anchura del tablero: ");
                ancho = sc.nextInt();
                if (ancho <= 0) {
                    System.out.println("ERROR: La anchura debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La anchura debe ser un número positivo.");
                sc.nextLine();
            }

            for (int i = 0; i < alto; i++) {
                // String bordeHorizontal = "";
                String fila = "1";

                for (int j = 0; j < ancho; j++) {
                    if (j == ancho - 1) {
                        fila += BORDE_H + ",";

                    } else {
                        fila += BORDE_H + BORDE_V;
                    }

                }
                System.out.println(fila);
            }

        }
        sc.close();
    }
}
