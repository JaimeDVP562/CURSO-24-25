package EjerciciosJavaT5;

public class T05E02bucleWhileBasico {

    public static void main(String[] args) {

        /**
         * Crea un bucle basico que muestre por pantalla los múltiplos de 5, del 0 al
         * 100 con un bucle while
         */

        // Declara las variables
        int i = 0;

        // Crea el bucle while
        while (i <= 100) {
            System.out.println(i);
            i = i + 5;
        }
    }
}