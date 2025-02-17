package examen1;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero de años: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                              // numero
        int años = Integer.parseInt(sc.nextLine());

        String resetColor = "\033[0m"; // Restablece el color
        int diasAño = 365;
        int total = diasAño * años;

        System.out.println("\033[1m VUELTAS DE LA TIERRA" + resetColor);
        System.out.println("La tierra habrá dado un total de " + total + " vueltas en 45 años.");

        sc.close();
    }

}
