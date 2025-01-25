package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej6 {
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Area de un triángulo");
        System.out.println("---------------------------");
        System.out.println("Introduce la longitud de la base (cm): "); // Esta linea nos pide por pantalla que
                                                                       // introduzcamos un numero
        float num1 = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por pantalla

        System.out.println("Introduzca la altura (cm): "); // Esta linea nos pide por pantalla que introduzcamos un
                                                           // numero
        float num2 = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por pantalla

        float resultado = (num1 * num2) / 2; // Esta linea multiplica los valores que le hemos asignado a las variables
                                             // num1 y num2 y guarda el valor en la variable resultado

        // Imprimimos por pantalla el resultado
        System.out.println("El area del rectángulo es " + resultado + " cm cuadrados");

        floatScanner.close(); // Aunque no es necesario (de momento), cerramos la entrada de datos para evitar
                              // warnings

    }

}
