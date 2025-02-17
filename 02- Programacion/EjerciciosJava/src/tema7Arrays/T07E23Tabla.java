package tema7Arrays;

public class T07E23Tabla {

    /**
     * 
     * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
     * asigna los valores según la siguiente tabla. Muestra el contenido de todos
     * los elementos del array dispuestos en forma de tabla.
     * 
     * 
     */

    public static void main(String[] args) {
        // int fila;
        // int columna;
        int[][] tabla = new int[3][6];

        tabla[0][0] = 0;
        tabla[0][1] = 30;
        tabla[0][2] = 2;
        tabla[1][0] = 75;
        tabla[1][4] = 0;
        tabla[2][2] = -2;
        tabla[2][3] = 9;
        tabla[2][5] = 11;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.println(tabla[i][j]);
            }
        }
    }
}
