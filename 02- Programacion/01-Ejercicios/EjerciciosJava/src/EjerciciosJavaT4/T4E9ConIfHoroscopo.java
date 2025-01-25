package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E9ConIfHoroscopo {

    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        System.err.println("Introduzca el dia en que nació: ");
        int dia = sc.nextInt();
        sc.nextLine(); // IMPORTANTE --> Poner sc.nectLine() parq que despues pueda leer correctamente
                       // la siguiente linea

        System.err.println("Introduzca el mes en que nació: ");
        String mes = sc.nextLine();
        String mensaje = "";

        // Creamos la sentencia if
        if (dia >= 21 && dia < 31 && mes.equals("marzo") || dia <= 19 && mes.equals("abril")) {
            mensaje = "Aries";
        } else if (dia >= 20 && dia < 31 && mes.equals("abril") || dia <= 20 && mes.equals("mayo")) {
            mensaje = "Tauro";
        } else if (dia >= 21 && dia < 31 && mes.equals("mayo") || dia <= 21 && mes.equals("junio")) {
            mensaje = "Géminis";
        } else if (dia >= 21 && dia < 31 && mes.equals("junio") || dia <= 22 && mes.equals("julio")) {
            mensaje = "Cáncer";
        } else if (dia >= 23 && dia < 31 && mes.equals("julio") || dia <= 22 && mes.equals("agosto")) {
            mensaje = "Leo";
        } else if (dia >= 23 && dia < 31 && mes.equals("agosto") || dia <= 22 && mes.equals("septiembre")) {
            mensaje = "Virgo";
        } else if (dia >= 23 && dia < 31 && mes.equals("septiembre") || dia <= 22 && mes.equals("octubre")) {
            mensaje = "Libra";
        } else if (dia >= 23 && dia < 31 && mes.equals("octubre") || dia <= 21 && mes.equals("noviembre")) {
            mensaje = "Escorpio";
        } else if (dia >= 22 && dia < 31 && mes.equals("noviembre")
                || dia <= 21 && mes.equals("diciembre")) {
            mensaje = "Sagitario";
        } else if (dia >= 22 && dia < 31 && mes.equals("diciembre") || dia <= 19 && mes.equals("enero")) {
            mensaje = "Capricornio";
        } else if (dia >= 20 && dia < 31 && mes.equals("enero") || dia <= 18 && mes.equals("febrero")) {
            mensaje = "Acuario";
        } else if (dia >= 19 && dia < 31 && mes.equals("febrero") || dia <= 20 && mes.equals("marzo")) {
            mensaje = "Piscis";
        } else {
            System.err.println("Los datos introducidos son incorrectos.");
        }

        // Imprimimos el mensaje si se ha dado alguna de las condiciones
        if (!mensaje.isEmpty()) {
            System.err.println("Tu horóscopo es " + mensaje);
        }

        sc.close();
    }

}
