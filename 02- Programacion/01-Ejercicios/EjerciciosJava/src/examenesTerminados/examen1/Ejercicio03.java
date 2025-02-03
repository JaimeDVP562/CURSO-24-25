package examen1;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el radio mayor (cms): "); // Esta linea nos pide por pantalla que introduzcamos
                                                                 // un numero
        double radioMayor = Integer.parseInt(sc.nextLine());

        System.out.println("Introduzca el radio menor (cms): "); // Esta linea nos pide por pantalla que introduzcamos
                                                                 // un numero
        double radioMenor = Integer.parseInt(sc.nextLine());

        double total = 2 * (Math.PI * Math.PI) * radioMayor * (radioMenor * radioMenor); // V=2π2Rr2. FORMULA DEL
                                                                                         // TORIOIDE

        System.out.println("\033[1m VOLUMEN DE UN TOROIDE ");
        System.out.println("-------------------------------");
        System.out.println("El volumen del toroide es de  " + "\033[38;5;1m" + total + "\033[0m");

        sc.close();
    }

}
