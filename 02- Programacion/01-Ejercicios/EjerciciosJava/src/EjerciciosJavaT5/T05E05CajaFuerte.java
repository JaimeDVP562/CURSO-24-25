package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E05CajaFuerte {
    public static void main(String[] args) {

        // Declaraciones
        final int OPORTUNIDADES = 4;
        int contador = 1;
        String combinacion = "0000";
        boolean acierto = false;

        Scanner sc = new Scanner(System.in);

        while (!acierto && contador <= OPORTUNIDADES) {
            System.out.println("Introduce la clave de la caja fuerte: ");
            String intento = sc.nextLine();

            // Comprueba
            if (intento.equals(combinacion)) {
                System.out.println("\033[1mSe ha abierto la caja fuerte.\033[0m");

            } else {
                System.out.println("Clave incorrecta. ");
            }

            // Incrementa contador
            contador++;
        }

        if (!acierto) {
            System.out.println("Lo siento,  ha agotado las cuatro oportunidades.");
        }

        sc.close();
        if (!acierto) {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.\r\n" + //
                    "Se ha emitido un aviso a la policía.");
        }

    }

}