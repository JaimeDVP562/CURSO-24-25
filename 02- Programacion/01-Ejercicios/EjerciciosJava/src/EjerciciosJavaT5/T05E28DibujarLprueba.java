package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E28DibujarLprueba {
    /**
     * 
     * Dibuja una L introduciendo la altura por teclado
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Inicializa el Scanner
        Scanner sc = new Scanner(System.in);

        // Introduce los datos
        System.out.println("Introduzca la altura de la L: ");
        int altura = sc.nextInt();
        sc.nextLine(); // Consume el caracter al pulsar enter
        System.out.println("\n");

        // Declaramos variables
        String paloHorizontal = "";
        int longPaloHorizontal = altura / 2;

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < longPaloHorizontal; i++) {
            paloHorizontal += "* ";
        }
        System.out.println(paloHorizontal);
        sc.close();
    }
}
