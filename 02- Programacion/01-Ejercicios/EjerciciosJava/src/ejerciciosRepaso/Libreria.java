package ejerciciosRepaso;

public class Libreria {

    public static String pintarLinea(char caracter, int veces) {
        String linea = "";

        for (int i = 0; i < veces; i++) {
            linea += caracter;
        }

        return linea;
    }

    public static String pintarPrimerYUltimoCaracterDeLaLinea(char caracter, int veces) {
        String linea = "";

        for (int i = 0; i < veces; i++) {
            linea += obtenerCharQueCorresponde(i, veces, caracter);
        }

        return linea;
    }

    public static char obtenerCharQueCorresponde(int i, int veces, char caracter) {
        char caracterCorresponde = ' ';

        if (i == 0 || i == veces - 1) {
            caracterCorresponde = caracter;
        }

        return caracterCorresponde;
    }

}
