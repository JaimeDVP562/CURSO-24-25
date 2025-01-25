package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E17CuentaDigitosDeUnNumero {
    public static void main(String[] args) {
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        try {
            // Declaramos las variable de entrada
            System.out.println("\033[1mNÚMERO DE DÍGITOS DE UN NÚMERO\033[0m ");
            System.out.println("Introduzca un número entero: ");
            int entrada = sc.nextInt();
            sc.nextLine();

            int contador = 0;
            int numeroAbsoluto = Math.abs(entrada); // Con la funcion esta, lo que se busca es que imprima el valor del
                                                    // número eliminando el signo del numero y los decimales
                                                    // IMPORTANTE!!!

            // Contamos los dígitos usando divisiones sucesivas
            if (numeroAbsoluto == 0) {
                contador = 1;
            } else {
                while (numeroAbsoluto > 0) {
                    numeroAbsoluto = (numeroAbsoluto / 10); // Dividimos el númeroAbsoluto entre 10 para que en cada
                                                            // iteración del bucle le quite un decimal al numero
                                                            // introducido
                    contador++;
                }
            }
            System.out.println("\nEl número introducido tieene " + contador + " digito/s. ");

            sc.close();

        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        }
    }
}
