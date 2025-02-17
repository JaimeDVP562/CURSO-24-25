package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E04CajaFuerte {

    public static void main(String[] args) {
        /**
         * Realiza el control de acceso a una caja fuerte. La combinación será un número
         * de 4 cifras.
         * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos
         * mostrará el mensaje "Lo siento, contraseña incorrecta" y si acertamos se nos
         * dirá "La caja fuerte se ha abierto correctamente". Tendremos cuatro
         * oportunidades para abrir la caja fuerte.
         */
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        int contraseña = 1234;
        int intentos = 1;

        while (intentos <= 4) {
            System.out.println("Introduzca una contraseña de cuatro caracteres");
            int intentoContraseña = sc.nextInt();
            intentos = intentos + 1;
            if (contraseña == intentoContraseña) {
                System.out.println("La contraseña se ha introducido correctamente.");
                break;
            } else {
                System.out.println("\033[1mLa contraseña no se ha introducido correctamente\033[0m");
            }
        }

        System.out.println("Lo siento, intentos agotados:(");

        sc.close();
    }
}
