package EjerciciosJavaT5;

public class T05E01bucleForBasico {

    public static void main(String[] args) {

        /**
         * Crea un bucle basico que muestre por pantalla los múltiplos de 5, del 0 al
         * 100 con un bucle FOR
         */

        // Para realizar un for no tenemos que declarar antes las variables si no que se
        // declaran en la misma sentencia for

        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }

    }

}
