package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E2TramoHorario {
    public static void main(String[] args) {

        /**
         * Realiza un programa que pida una hora por teclado y que muestre luego buenos
         * dia, buenas tardes o buenas noches según la hora del dia. Se utilizarán los
         * tramos
         * de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente.
         * Sólo se tienen en cuenta las horas, los minutos no se deben introducidos por
         * teclado.
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una hora entre las 0 y las 23");
        int hora = sc.nextInt();

        String mensaje;

        if (hora >= 6 && hora <= 12) {
            mensaje = "Buenos dias.";
        } else if (hora >= 13 && hora <= 20) {
            mensaje = "Buenas tardes.";
        } else if (hora >= 21 && hora <= 23) {
            mensaje = "Buenas noches.";
        } else {
            mensaje = "La hora es incorrecta";
        }

        // Mostramos el mensaje resultante
        System.out.println(mensaje);
        sc.close();
    }

}
