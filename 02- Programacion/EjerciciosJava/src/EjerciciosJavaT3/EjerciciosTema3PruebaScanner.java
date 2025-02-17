package EjerciciosJavaT3;

public class EjerciciosTema3PruebaScanner {
    public static void main(String[] args) {

        String nombre;
        System.out.println("Dime como te llamas: ");
        nombre = System.console().readLine();

        System.out.print("Dime tu edad: "); /*
                                             * En esta parte no "declaramos" la variable edad
                                             * porque en la siguiente linea de abajo le diremos
                                             * que nos pase la edad que introducimos a un int
                                             * que es el que vamos a asignarle luego el valor a la variable edad
                                             */
        String edadString = System.console().readLine();
        int edad = Integer.parseInt(edadString);

        System.out.println("Hola " + nombre + ", encantado de conocerte! y tu edad es " + edad);

    }

}
