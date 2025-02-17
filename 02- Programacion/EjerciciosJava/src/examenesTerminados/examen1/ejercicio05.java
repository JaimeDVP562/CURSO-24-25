package examen1;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una cantidad en segundos: "); // Esta linea nos pide por pantalla que
                                                                    // introduzcamos un numero
        float segundos = Integer.parseInt(s.nextLine()); // Esta linea pasa a entero el numero que hemos introducido por
                                                         // pantalla

        float factor = 60;
        float hora = (segundos / factor) / factor; // Esta linea multiplica los valores que le hemos asignado a las
                                                   // variables num1 y num2 y guarda el valor en la variable resultado
        float minutos = factor / factor; // Esta linea multiplica los valores que le hemos asignado a las variables num1
                                         // y num2 y guarda el valor en la variable resultado

        // Imprimimos por pantalla el resultado
        System.out.println(segundos + " segundos son " + "\033[48;5;3m" + hora + " horas, " + "\033[0m" + " "
                + "\033[48;5;1m" + minutos + " minutos " + "\033[0m" + "  " + "\033[48;5;2m" + segundos + " y segundos."
                + "\033[0m");

        s.close(); // aunque no es necesario (de momento), cerramos la entrada de datos para evitar
                   // warnings

    }

}