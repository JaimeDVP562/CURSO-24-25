package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E41PosicionDigito {
    public static void main(String[] args) {
        /**
         * 
         * Escribe un programa que sea capaz de insertar un dígito dentro de un número
         * indicando la posición. El nuevo dígito se colocará en la posición indicada y
         * el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan
         * de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
         * correctamente los datos. Se recomienda usar long en lugar de int ya que el
         * primero admite números más largos.
         * 
         * Ejemplo I:
         * 
         * Introduce un número entero positivo: 406783
         * 
         * Introduce la posición donde quiere insertar: 3
         * 
         * Introduce el dígito que quiere insertar: 5
         * 
         * El número resultante es 4056783.
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        long numero = sc.nextLong();
        String numeroString = "" + numero;

        // Sentencia de seleccion
        if (numero < 0) {
            System.out.println("ERROR: Introduzca un numero positivo.");
        } else {
            try {
                System.out.println("Introduce la posición donde quiere insertar: ");
                int posicion = sc.nextInt();
                System.out.println("Introduce el dígito que quiere insertar:  ");
                long digito = sc.nextLong();

                // A un string vacio le concateno un número

                String parteIzquierda = numeroString.substring(0, posicion - 1);
                String parteDerecha = numeroString.substring(posicion - 1);

                System.out.println(parteIzquierda + digito + parteDerecha);
            } catch (Exception e) {
                System.out.println("ERROR: No se pueden poner mas posiciones de las que tiene el numero. ");
            }
        }
        sc.close();
    }
}
