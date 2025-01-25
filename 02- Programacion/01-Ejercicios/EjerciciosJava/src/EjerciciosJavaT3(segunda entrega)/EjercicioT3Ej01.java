import java.util.Scanner;

public class EjercicioT3Ej01 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in) ;                      

        System.out.println("Introduzca el numero de dias: ");    // Esta linea nos pide por pantalla que introduzcamos un numero 
        int dias = Integer.parseInt(floatScanner.nextLine());    
                                               // Esta linea pasa a entero el numero que hemos introducido por pantalla 

        double horas = dias * 24;
        double minutos = horas * 60;
        double segundos = minutos * 60;

        System.out.println("\033[1mSEGUNDOS QUE TIENE UN DIA");  // Sirve para mostrar en negrita esta linea
        System.out.println(dias + " equivalen a " + segundos + " segundos.");
        
        //Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();


    }

}
