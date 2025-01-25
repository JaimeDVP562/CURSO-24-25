package EjerciciosJavaT4;

/**
 * 
 * 
 * Clase para demostrar el uso de operadores unarios
 */

public class T4OperadoresUnarios {
    public static void main(String[] args) {

        // Prueba de operadores unarios
        int numero = 100;

        /**
         * 
         * Operador incremento sufijo (numero++)
         */
        int incrementoSufijo = numero++;
        System.err.println(incrementoSufijo);

        /**
         * 
         * Operador incremento prefijo (++numero)
         */
        int incrementoPrefijo = ++numero;
        System.err.println(incrementoPrefijo);

    }

}
