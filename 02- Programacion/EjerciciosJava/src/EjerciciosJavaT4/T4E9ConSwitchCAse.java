package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E9ConSwitchCAse {

    public static void main(String[] args) {
        /**
         * Escribe un programa que nos diga el horoscopo.
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.err.println("Este programa te dirá cual es tu horóscopo.\n");
        System.err.println("Introduce el mes en que nació: ");
        String mes = sc.nextLine();

        String mensaje = "";

        switch (mes) {
            case "enero":
                mensaje = "acuario";
                break;
            case "febrero":
                mensaje = "piscis";
                break;
            case "marzo":
                mensaje = "aries";
                break;
            case "abril":
                mensaje = "tauro";
                break;
            case "mayo":
                mensaje = "géminis";
                break;
            case "junio":
                mensaje = "cáncer";
                break;
            case "julio":
                mensaje = "leo";
                break;
            case "agosto":
                mensaje = "virgo";
                break;
            case "septiembre":
                mensaje = "libra";
                break;
            case "octubre":
                mensaje = "escorpio";
                break;
            case "noviembre":
                mensaje = "sagitario";
                break;
            case "diciembre":
                mensaje = "capricornio";
                break;

            default:
                System.err.println("Te has equivocado pringado");
                break;
        }

        System.err.println("Tu horóscopo es " + mensaje);

        sc.close();
    }

}
