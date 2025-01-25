package tema7Arrays;

import java.util.Scanner;

public class T07E09ParImpar {

    /**
     * 
     * 
     * Realiza un programa que pida 8 números enteros y que luego muestre esos
     * números junto con la palabra “par” o “impar” según proceda.
     */
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos los arrays de enteros
        int[] numeros = new int[8];
        int[] numerosPantalla = new int[numeros.length];

        // Pedimos al usuario que introduzca los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número entero: ");
            numeros[i] = sc.nextInt();
            numerosPantalla[i] = numeros[i];
        }

        // Mostramos por patallla los números y si son pares o impares
        for (int i = 0; i < numerosPantalla.length; i++) {
            if (numerosPantalla[i] % 2 == 0) {
                System.out.println("El número " + numerosPantalla[i] + " es par");
            } else {
                System.out.println("El número " + numerosPantalla[i] + " es impar");
            }
        }

    }
}
