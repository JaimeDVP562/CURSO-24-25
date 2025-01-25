package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Inicializamos el Scanner

        System.out.println("Introduce el primer numero: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                            // numero
        int num1 = Integer.parseInt(s.nextLine()); // Esta linea pasa a entero el numero que hemos introducido por
                                                   // pantalla

        System.out.println("Introduce el segundo numero: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                             // numero
        int num2 = Integer.parseInt(s.nextLine()); // Esta linea pasa a entero el numero que hemos introducido por
                                                   // pantalla

        int resultado = num1 * num2; // Esta linea multiplica los valores que le hemos asignado a las variables num1
                                     // y num2 y guarda el valor en la variable resultado

        // Imprimimos por pantalla el resultado
        System.out.println("El resultado de la multiplicacion de " + num1 + (" x ") + num2 + " es " + resultado);

        s.close(); // Aunque no es necesario (de momento), cerramos la entrada de datos para evitar
                   // warnings

    }

}
