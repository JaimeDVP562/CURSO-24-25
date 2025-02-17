package Tema10ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {

    public static void main(String[] args) {
        // Creamos el Scanner y el array list de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        int numeroIn = 1;
        int posicion;

        // Creamos el menú para introducir los datos
        System.out.println("Por favor introduzca un número y luego presione enter. Para salir presione 0+Enter");
        while (numeroIn != 0) {
            numeroIn = sc.nextInt();
            sc.nextLine();
            numeros.add(numeroIn);
        }
        // Mostramos la lista
        System.out.println("\n");
        System.out.println("Esta es la lista original " + numeros);

        // 1. Agregar nuevo dato en una posición especifica
        System.out.println("Por favor introduzca el nuevo numero y luego presione enter. Para salir presione 0+Enter");
        numeroIn = sc.nextInt();
        sc.nextLine();

        System.out.println(
                "Por favor introduzca la  posicion en la que quiere introducir el nuevo numero y luego presione enter. Para salir presione 0+Enter");
        posicion = sc.nextInt() - 1;
        sc.nextLine();

        System.out.println("\n");
        numeros.add(posicion, numeroIn);

        // Mostramos la lista
        System.out.println("Esta es la lista con el nuevo numero introducido en la posicion deseada " + numeros);

        // Cerramos el Scanner
        sc.close();
    }

}
