package EjerciciosJavaT8;

import java.util.Scanner;

public class T08E03numeroCapicuaEnUnRango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el primer numero del rango: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.println("introduce el segundo numero del rango: ");
        int numero2 = sc.nextInt();
        sc.nextLine();
        String numerosCapicuaEnRango = "";

        for (int i = numero1; i <= numero2; i++) {
            if (MiLibreria.esCapicua(i)) {
                numerosCapicuaEnRango += " " + i;
            }
        }
        System.out.println(numerosCapicuaEnRango);
        sc.close();
    }
}
