import java.util.Scanner;

public class EjercicioT3Ej03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;                      

        System.out.println("Introduzca una longitud en metros: ");    // Esta linea nos pide por pantalla que introduzcamos un numero 
        int metros = Integer.parseInt(sc.nextLine());    

        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;

        System.out.println(pulgadas + "\033[48;5;8m pulgadas. \033[0m\n");

        /*  Importante poner para indicarle que le vamos a dar el color 
        ponemos el \033[ --> para indicarle que va a ser el fondo el 48 (o el 38 si es para la letra); 
        --> el 5 para elegir los colores ANSI --> luego ya el número del 
        color que queramos y m. 
        
        EN RESUMEN PONEMOS 
        --> \033[48 (38/38);5( Elegimos ANSI);8(Elegimos color)m pulgadas. (\033[0m\n)<-- con esto "desactivamos el color"

        */

        System.out.println(pies + " pies. ");
        System.out.println(yardas + " yardas. ");
        System.out.printf("%f\n", pulgadas);
        System.out.printf("%.3f\n", pulgadas);
        System.out.printf("%.6f\n", pulgadas);
        
        //Cerramos el scanner IMPORTANTE!!!
        sc.close();

    }

}
