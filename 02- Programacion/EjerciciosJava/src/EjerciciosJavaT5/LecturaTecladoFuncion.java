package EjerciciosJavaT5;

import EjerciciosJavaT8.MiLibreria;

public class LecturaTecladoFuncion {

    public static void main(String[] args) {
        System.out.println("Introduzca un valor mayor que 2:");
        int valor = MiLibreria.leerValor();

        System.out.println("El valor es " + valor);
    }
}
