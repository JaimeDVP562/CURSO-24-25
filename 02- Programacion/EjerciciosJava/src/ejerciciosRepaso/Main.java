package ejerciciosRepaso;

import java.util.Scanner;

public class Main {

    /*
     * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
     * ejemplos.
     * El usuario debe introducir la altura de la figura. Este ejercicio ya se
     * realizó en el tema de bucles,
     * ahora se trata de usar una función para que la implementación sea más
     * sencilla.
     */

    /*
     *
     * 1.- Pedir al usuario la altura del triángulo
     * 2.- Del ejercicio lo unico repetitivo es el pintar las lineas del triángulo
     * 3.- Crear una función que reciba que caracter usar y cuantas veces pintar
     */

    /**
     *
     * if bucles while y do-while
     * -> Se usan condiciones
     * -> ¿Que son las condiciones?
     * -> Son una expresión que se evalua a verdadero o falso (true/false) -> un
     * boolean
     * -> condicion1 || condicion2 -> true || false -> true
     * -> condicion1 && condicion2 -> true && false -> false
     * -> condición1 -> true -> true
     *
     * -> !condición1 -> true -> false
     * -> !condición1 -> false -> true
     * -> Negar una condición es lo mismo que hacer (condición1 == false)
     *
     */

    /*
     *
     *
     * Lo que hay entre las dos llaves se ejecutará mientras que la condición
     * que hay entre los paréntesis sea verdadera
     * -> ¿cual es la condición?
     * -> relleno.equalsIgnoreCase("SI") || relleno.equalsIgnoreCase("NO")
     * -> (true/false) || (true/false)
     * -> Si cualquiera de los dos es true, al estar en un OR (||) el resultado será
     * true
     *
     * do {
     * System.out.println("¿Quieres rellenar el triángulo? (SI/NO)");
     * relleno = scanner.next();
     * } while(!relleno.equalsIgnoreCase("SI") && !relleno.equalsIgnoreCase("NO"));
     *
     *
     *
     *
     */

    public static final char CARACTER = '*';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int altura = 0;
        String relleno = "NO";

        System.out.println("Introduce la altura del triángulo: ");
        altura = scanner.nextInt();

        do {
            System.out.println("¿Quieres rellenar el triángulo? (SI/NO)");
            relleno = scanner.next();
        } while (!relleno.equalsIgnoreCase("SI")
                && !relleno.equalsIgnoreCase("NO"));

        scanner.close();

        System.out.println(Libreria.pintarLinea(CARACTER, altura));

        for (int i = altura - 1; i > 0; i--) {

            if (relleno.equalsIgnoreCase("SI")) {
                System.out.println(Libreria.pintarLinea(CARACTER, i));
            } else {
                System.out.println(Libreria.pintarPrimerYUltimoCaracterDeLaLinea(CARACTER, i));
            }

        }

    }

}