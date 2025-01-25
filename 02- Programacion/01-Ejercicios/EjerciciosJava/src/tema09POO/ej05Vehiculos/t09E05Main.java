package tema09POO.ej05Vehiculos;

import java.util.Scanner;

public class t09E05Main {

    public static void main(String[] args) {

        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int opcion;

        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        // Menu
        do {

            System.out.println("1. Anda con la bicicleta.  ");
            System.out.println("2. Haz el caballito con la bicicleta: ");
            System.out.println("3. Anda con el coche. ");
            System.out.println("4. Quema rueda con el coche.");
            System.out.println("5. Ver kilometraje de la bicicleta. ");
            System.out.println("6. Ver kilometraje del coche.");
            System.out.println("7. Ver kilometraje total. ");
            System.out.println("8. Salir.");

            // Leee la opcion de teclado
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuantos kilometros quiere recoger?");
                    int kilometros = sc.nextLine();
                    bicicleta.kilometrosRecorridos = bicicleta.kilometrosRecorridos + kilometros;
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;

                case 3:
                    System.out.println("¿Cuantos kilometros quiere recoger?");
                    int kilometros = sc.nextLine();
                    bicicleta.kilometrosRecorridos = bicicleta.kilometrosRecorridos;
                case 4:
                    coche.quemarRueda();

            }

        } while (opcion != 8)
        {
            // Cerramos Scanner
            sc.close();
        }
    }
}
