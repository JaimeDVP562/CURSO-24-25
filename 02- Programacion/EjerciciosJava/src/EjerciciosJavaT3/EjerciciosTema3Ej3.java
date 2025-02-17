package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej3 {
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la cantidad de pesetas que quiere convertir a euro: "); // Esta linea nos pide por
                                                                                              // pantalla que
                                                                                              // introduzcamos un numero
        double peseta = Integer.parseInt(s.nextLine()); // Esta linea pasa a entero el numero que hemos introducido por
                                                        // pantalla

        float factor = 166.84f;
        double resultado = factor / peseta; // Esta linea multiplica los valores que le hemos asignado a las variables
                                            // num1 y num2 y guarda el valor en la variable resultado

        // Imprimimos por pantalla el resultado
        System.out.println("El resultado es " + resultado);

        s.close(); // aunque no es necesario (de momento), cerramos la entrada de datos para evitar
                   // warnings

    }

}
