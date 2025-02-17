package tema09POO.E04;

import java.util.Scanner;

public class MainE05 {

    public static void main(String[] args) {

        // Inicializamos el Scanenr
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int kilometros;
        // Declaramos las variables

        // Creamos los objetos de las clases
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();

        // Creamos el menú
        do {
            System.out.println("1- Anda con la bicicleta ");
            System.out.println("2- Haz el caballito con la bicicleta ");
            System.out.println("3- Anda con el coche ");
            System.out.println("4- Quema rueda con el coche ");
            System.out.println("5- Ver kilometraje de la bicicleta .");
            System.out.println("6- Ver kilometraje del coche.");
            System.out.println("7- Ver kilemetraje total.");
            System.out.println("8- Ver cantidad de vehiculos creados");
            System.out.println("9-Salir");

            // Leemos la opcion que se ha introducido
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1: {
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    kilometros = sc.nextInt();
                    bicicleta.andar(kilometros);
                    System.out.println("");
                }
                    break;
                case 2: {
                    bicicleta.hacerCaballito();
                    System.out.println();

                }
                    break;
                case 3: {
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    kilometros = sc.nextInt();
                    coche.andar(kilometros);
                    System.out.println();
                }
                    break;
                case 4: {
                    coche.quemarRueda();
                    System.out.println();
                }
                    break;
                case 5: {
                    System.out.println("La bicicleta ha recorrido " + bicicleta.kilometrosRecorridos + " kilometros");
                    System.out.println();
                }
                    break;
                case 6: {
                    System.out.println("El coche ha recorrido " + coche.kilometrosRecorridos + " kilometros");
                    System.out.println();
                }
                    break;
                case 7: {
                    System.out.println(
                            "Los vehículos llevan recorridos " + Vehiculo.getKilometrosTotales() + " kilometros");
                }
                case 8: {
                    Vehiculo.getVechiculosCreados();
                }
                    break;

                default:
                    break;
            }

        } while (opcion != 9);

    }
}
