package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E20CalculaMinutosFinDeSemana {
    public static void main(String[] args) {

        /**
         * 
         * 
         * 20. Realiza un programa que, dado un día de la semana (de lunes a viernes) y
         * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
         * semana.
         * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
         * por hecho que el usuario introducirá un día y hora correctos, anterior al
         * viernes a las 15:00h.
         * 
         * Ejemplo I:
         * Introduzca un día de la semana (de lunes a viernes): jueves.
         * A continuación introduzca la hora (hora y minutos)
         * Hora: 15
         * Minutos: 0
         * Faltan 1440 minutos para llegar al fin de semana.
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca un dia de la semana
        System.out.println("Introduzca un día de la semana (de lunes a viernes): ");
        String dia = sc.nextLine();

        // Declaramos la sentencia
        if (dia.equals("lunes")) {
            System.out.println(" A continuación introduzca la hora (hora y minutos) ");
            System.out.println("Hora:");
            float hora = sc.nextFloat();
            sc.nextLine();
            System.out.println("Minutos:");
            float minutos = sc.nextFloat();
            sc.nextLine();

            // Declaramos variables
            float diasRestantes = 3 * 24 * 60;
            float viernes = diasRestantes - (15 * 60);
            float minutosIntroducidos = (hora * 60) + minutos;
            float minutosRestantes = (diasRestantes + viernes) - minutosIntroducidos;

            // Imprimimos por pantalla
            System.out.println("Faltan " + minutosRestantes + " minutos para llegar al fin de semana.");

        } else if (dia.equals("martes")) {
            System.out.println(" A continuación introduzca la hora (hora y minutos) ");
            System.out.println("Hora:");
            float hora = sc.nextFloat();
            sc.nextLine();
            System.out.println("Minutos:");
            float minutos = sc.nextFloat();
            sc.nextLine();
            float totalMinutos = (hora * 60 * 60) - (minutos * 60);
            float minutosTotales = (4 * (24 * 60 * 60)) + (15 * 60 + 60);
            float minutosRestantes = minutosTotales - totalMinutos;

            // Imprimimos por pantalla
            System.out.println("Faltan" + minutosRestantes + "minutos para llegar al fin de semana.");

        } else if (dia.equals("miercoles")) {
            System.out.println(" A continuación introduzca la hora (hora y minutos) ");
            System.out.println("Hora:");
            float hora = sc.nextFloat();
            sc.nextLine();
            System.out.println("Minutos:");
            float minutos = sc.nextFloat();
            sc.nextLine();
            float totalMinutos = (hora * 60 * 60) - (minutos * 60);
            float minutosTotales = (4 * (24 * 60 * 60)) + (15 * 60 + 60);
            float minutosRestantes = minutosTotales - totalMinutos;

            // Imprimimos por pantalla
            System.out.println("Faltan" + minutosRestantes + "minutos para llegar al fin de semana.");

        } else if (dia.equals("jueves")) {
            System.out.println(" A continuación introduzca la hora (hora y minutos) ");
            System.out.println("Hora:");
            float hora = sc.nextFloat();
            sc.nextLine();
            System.out.println("Minutos:");
            float minutos = sc.nextFloat();
            sc.nextLine();
            float totalMinutos = (hora * 60 * 60) - (minutos * 60);
            float minutosTotales = (4 * (24 * 60 * 60)) + (15 * 60 + 60);
            float minutosRestantes = minutosTotales - totalMinutos;

            // Imprimimos por pantalla
            System.out.println("Faltan" + minutosRestantes + "minutos para llegar al fin de semana.");

        } else if (dia.equals("viernes")) {
            System.out.println(" A continuación introduzca la hora (hora y minutos) ");
            System.out.println("Hora:");
            float hora = sc.nextFloat();
            sc.nextLine();
            System.out.println("Minutos:");
            float minutos = sc.nextFloat();
            sc.nextLine();
            float totalMinutos = (hora * 60 * 60) - (minutos * 60);
            float minutosTotales = (4 * (24 * 60 * 60)) + (15 * 60 + 60);
            float minutosRestantes = minutosTotales - totalMinutos;

            // Imprimimos por pantalla
            System.out.println("Faltan " + minutosRestantes + "minutos para llegar al fin de semana.");

        }
        sc.close();

    }
}
