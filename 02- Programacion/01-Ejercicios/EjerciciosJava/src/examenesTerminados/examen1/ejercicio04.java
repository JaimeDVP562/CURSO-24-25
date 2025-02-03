package examen1;

public class ejercicio04 {
        public static void main(String[] args) {

                // Definición de códigos ANSI para colores

                String letraRojo = "\033[38;5;1m"; // Letra de color
                String letraNaranja = "\033[38;5;1;196m"; // Letra de color
                String letraAmarillo = "\033[38;5;3m"; // Letra de color
                String letraVerde = "\033[38;5;2m"; // Letra de color
                String letraAzul = "\033[38;5;4m"; // Letra de color
                String letraMorado = "\033[38;5;5m"; // Letra de color
                String letraMagenta = "\033[38;5;1m"; // Letra de color

                String resetColor = "\033[0m"; // Restablece el color

                // Imprimimos con color de letra

                System.out.println(("   ") + ("   ") + ("   ") + ("   ") + (letraRojo + " * " + resetColor));
                System.out.println(("   ") + ("   ") + ("   ") + (letraRojo + " * " + resetColor)
                                + (letraNaranja + " * " + resetColor) + (letraAmarillo + " * " + resetColor));
                System.out.println(("   ") + ("   ") + (letraRojo + " * " + resetColor)
                                + (letraNaranja + " * " + resetColor)
                                + (letraAmarillo + " * " + resetColor) + (letraVerde + " * " + resetColor)
                                + (letraAzul + " * " + resetColor));
                System.out.println(("   ") + (letraRojo + " * " + resetColor) + (letraNaranja + " * " + resetColor)
                                + (letraAmarillo + " * " + resetColor) + (letraVerde + " * " + resetColor)
                                + (letraAzul + " * " + resetColor) + (letraRojo + " * " + resetColor)
                                + (letraRojo + " * " + resetColor));
                System.out.println((letraRojo + " * " + resetColor) + (letraNaranja + " * " + resetColor)
                                + (letraAmarillo + " * " + resetColor) + (letraVerde + " * " + resetColor)
                                + (letraAzul + " * " + resetColor) + (letraRojo + " * " + resetColor)
                                + (letraMorado + " * " + resetColor) + (letraMagenta + " * " + resetColor)
                                + (letraRojo + " * " + resetColor));

        }

}
