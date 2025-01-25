package EjerciciosJavaT8;

import java.util.Scanner;

public class T08E05decimalBinario {
    public static int decimalBinario(int decimal) {
        // Paso 1: Crear una variable para almacenar el binario como número entero
        int binario = 0;
        int posicion = 1; // Posición decimal inicial (unidades)

        // Paso 2: Convertir de decimal a binario
        while (decimal > 0) {
            int resto = decimal % 2; // Obtener el resto de la división por 2 (0 o 1)
            binario += resto * posicion; // Agregar el dígito binario en la posición correspondiente
            decimal /= 2; // Dividir el número decimal por 2
            posicion *= 10; // Avanzar a la siguiente posición decimal (decenas, centenas, etc.)
        }
        return binario;
    }

    // =======================================================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedir al usuario un número decimal
        System.out.println("Introduce un número decimal: ");
        int decimal = sc.nextInt(); // Leer el número decimal
        int binario = decimalBinario(decimal);

        // Paso : Mostrar el resultado
        System.out.println("El número " + decimal + " en binario es: " + binario);

        sc.close();
    }

}
