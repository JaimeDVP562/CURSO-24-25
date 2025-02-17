package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E1conIfDiasDeLaSemana {

    public static void main(String[] args) {

        /**
         * Escribe un programa que pida por teclado un dia de la semana y muestre la
         * asignatura que toca a primera hora
         * 
         */

        // Inicializamos el Scanner
        System.out.println("Introduce un dia de la semana: ");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        if (dia.equals("lunes")) {
            System.out.println("Entornos de desarrollo");
        } else if (dia.equals("martes")) {
            System.out.println("Base de datos");
        } else if (dia.equals("miercoles")) {
            System.out.println("Lenguajes de marcas");
        } else if (dia.equals("jueves")) {
            System.out.println("Programacion");
        } else if (dia.equals("viernes")) {
            System.out.println("Programacion");
        } else if (dia.equals("sabado")) {
            System.out.println("cerveza");
        } else if (dia.equals("domingo")) {
            System.out.println("vino");
        }
        sc.close();
    }
}