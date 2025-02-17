import java.util.Scanner;

public class EjercicioT303RepasoExamen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;                      

        System.out.println("Introduzca una longitud en metros: ");    // Esta linea nos pide por pantalla que introduzcamos un numero 
        int metros = Integer.parseInt(sc.nextLine());    

        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;

        // Definición de códigos ANSI para colores

        String letraVerde = "\033[38;5;10m";     // Letra de color
        String letraAmarillo = "\033[38;5;3m";  // Letra de color
        String letraAzul = "\033[38;5;6m";     // Letra de color 

        String fondoVerde = "\033[48;5;3m";      // Fondo de color 
        String fondoAmarillo = "\033[48;5;11m"; // Fondo de color 
        String fondoMagenta = "\033[48;5;10m"; // Fondo de color 

        String resetColor = "\033[0m";     // Restablece el color

        // Creación de cadenas de formato de decimales
        String tresDecimales = "%.3f";
        String dosDecimales = "%.2f";
        String unDecimal = "%.1f";

        
        // Imprimimos con color de letra
        System.out.println(letraVerde + pulgadas + resetColor);
        System.out.println(letraAmarillo + pies + resetColor);
        System.out.println(letraAzul + yardas + resetColor + " yardas");

        // Imprimimos con color de fondo
        System.out.println(fondoVerde + pulgadas + resetColor);
        System.out.println(fondoAmarillo + pies + resetColor);
        System.out.println(fondoMagenta + unDecimal + yardas + resetColor);
        
        // Usamos las cadenas de formato con String.format() para aplicar los decimales dinámicamente
        System.out.println(letraVerde + String.format(tresDecimales, pulgadas) + " pulgadas" + resetColor);
        System.out.println(letraAmarillo + String.format(dosDecimales, pies) + " pies" + resetColor);
        System.out.println(letraAzul + String.format(unDecimal, yardas) + " yardas" + resetColor);
        
        //Cerramos el scanner IMPORTANTE!!!
        sc.close();

    }

}

