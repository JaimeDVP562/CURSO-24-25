package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E06CuentaDigitosDeUnNumero {

    public static void main(String[] args) {

        /**
         * 6. Realiza un programa que nos diga cuántos dígitos tiene un número
         * introducido por teclado. Este ejercicio es equivalente a otro realizado
         * anteriormente,
         * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
         * como
         * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
         * esta manera, la única Limitación en el número de dígitos la establece el tipo
         * de dato que se
         * utilice (int o long).
         * 
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variable de entrada
        System.out.println("\033[1mNÚMERO DE DÍGITOS DE UN NÚMERO\033[0m ");
        System.out.println("Introduzca un número entero: ");
        int entrada = sc.nextInt();
        sc.nextLine();

        int contador = 0;
        int numeroAbsoluto = Math.abs(entrada); // Con la funcion esta, lo que se busca es que imprima el valor del
                                                // número eliminando el signo del numero y los decimales IMPORTANTE!!!

        // Contamos los dígitos usando divisiones sucesivas
        if (numeroAbsoluto == 0) {
            contador = 1;
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto = (numeroAbsoluto / 10); // Dividimos el númeroAbsoluto entre 10 para que en cada
                                                        // iteración del bucle le quite un decimal al numero introducido
                contador++;
            }
        }
        System.out.println("\n" + entrada + " tiene " + contador + " digito/s. ");

        sc.close();
    }
}
