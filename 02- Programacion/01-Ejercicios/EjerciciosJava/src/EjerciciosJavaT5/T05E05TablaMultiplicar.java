package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E05TablaMultiplicar {

    public static void main(String[] args) {

        /**
         * Muestra la tabla de multiplicar de un número introducido por teclado
         * 
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables a utilizar
        System.out.println("Introduce un numero y se mostrará el resultado de su tabla de multiplicar:\t ");
        int entrada = sc.nextInt();
        sc.nextLine();
        int i = 0; // Variable de control de bucle
        int resultado = 0;

        while (i <= 10) {
            resultado = entrada * i;
            i++; // Declaramos que cada vez que se ejecute el bucle, se sume uno mas al valor de
                 // i
            System.out.println(entrada + " x " + i + " = " + resultado);
        }

        sc.close();
    }

}
