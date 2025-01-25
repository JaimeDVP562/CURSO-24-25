package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E5 {
    public static void main(String[] args) {
        /**
         * 
         * 5. Realiza un programa que calcule el tiempo que tardará en caer un objeto en
         * caer
         * desde una altura h. Aplica la fórmula raiz cuadrada de (2h/g "siendo g 9.81)
         */
        // Pedimos al usuario que introduzca la altua
        System.out.println("Introduzca la altua (en metros) desde la que cae el objeto: ");

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        double valorH = sc.nextDouble();

        double valorG = 9.81;
        double tiempoCaida = Math.sqrt((2 * valorH) / valorG); // Con Math.sqrt hacemos la raiz cuadrada de un número

        // Imprimimos el resultado de la operacion con dos decimales
        System.out.printf("El objeto tarda %.2f segundos.%n", tiempoCaida);

        // Cerramos el Scanner
        sc.close();
    }

}
