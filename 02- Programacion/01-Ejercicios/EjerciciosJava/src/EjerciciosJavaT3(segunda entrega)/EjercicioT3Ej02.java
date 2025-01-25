import java.util.Scanner;

public class EjercicioT3Ej02 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in) ;                      

        System.out.println("Introduzca el radio de la esfera: ");    // Esta linea nos pide por pantalla que introduzcamos un numero 
        int radio = Integer.parseInt(floatScanner.nextLine());    

        double volumen = 4/3 * Math.PI * Math.pow(radio, .3) ; // Importante que si ponemos un double tennemos que poner el numero entero seguido de un .0 para que nos lo calcule bien 

        System.out.println("\033[1m VOLUMEN DE UNA ESFERA");
        System.out.println("El volumen del toroide es " + ( "\033[38m" + volumen)+  " cm ");
        
        //Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();

    }

}
