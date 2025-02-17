package EjerciciosJavaT8;

import java.util.Scanner;

public class PruebasFuncionesJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedir al usuario un número decimal
        System.out.println("Introduce un número decimal: ");
        int decimal = sc.nextInt(); // Leer el número decimal
        int numeroOriginal = decimal; // Guardar el número original para mostrar después

        // Paso 2: Crear una variable para almacenar el binario como número entero
        int binario = 0;
        int posicion = 1; // Posición decimal inicial (unidades)

        // Paso 3: Convertir de decimal a binario
        while (decimal > 0) {
            int resto = decimal % 2; // Obtener el resto de la división por 2 (0 o 1)
            binario += resto * posicion; // Agregar el dígito binario en la posición correspondiente
            decimal /= 2; // Dividir el número decimal por 2
            posicion *= 10; // Avanzar a la siguiente posición decimal (decenas, centenas, etc.)
        }

        // Paso 4: Mostrar el resultado
        System.out.println("El número " + numeroOriginal + " en binario es: " + binario);

        sc.close();
    }

}
