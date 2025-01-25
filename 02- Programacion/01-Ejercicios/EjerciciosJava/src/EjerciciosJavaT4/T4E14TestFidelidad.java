package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E14TestFidelidad {

    public static void main(String[] args) {
        // Inicalizamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        String verdadero = "v";
        String falso = "f";
        int resultado = 0;
        int pregunta = 0;
        System.out.println("\33[1mTEST DE FIDELIDAD\033[m");
        System.out.println("=================");
        System.out.println("\nEste programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");
        // // Comienzo del test
        if (pregunta <= 10) {
            if (pregunta == 0) {
                // Pregunta 1
                System.out.println("Tu pareja parece estar mas inquieta de lo normal sin ningún motivo aparente?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta1 = sc.nextLine();
                if (respuesta1.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta1.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 1) {
                // Pregunta 2
                System.out.println("Ha aumentado sus gastos de vestuario?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta2 = sc.nextLine();
                if (respuesta2.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta2.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 2) {
                // Pregunta 3
                System.out.println("Ha perdido el interés que mostraba anteriormente por ti ?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta3 = sc.nextLine();
                if (respuesta3.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta3.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 3) {
                // Pregunta 4
                System.out.println(
                        "Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer)?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta4 = sc.nextLine();
                if (respuesta4.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta4.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 4) {
                // Pregunta 5
                System.out.println(
                        " No te deja que mires la agenda de su telefono movil?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta5 = sc.nextLine();
                if (respuesta5.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta5.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 5) {
                // Pregunta 6
                System.out.println(
                        " A veces tiene llaamdas que dice no querer contestar cuando estás tu delante?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta6 = sc.nextLine();
                if (respuesta6.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta6.equals(falso)) {
                    pregunta++;
                }
            }
            if (pregunta == 6) {
                // Pregunta 7
                System.out.println(
                        " Ultimamente se preocupa mas en cuidar la línea y/o estar bronceado/a.");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta7 = sc.nextLine();
                if (respuesta7.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta7.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 7) {
                // Pregunta 8
                System.out.println(
                        " Muchos dias viene tarde después de trabajar porque dice tener mucho más trabajo?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta8 = sc.nextLine();
                if (respuesta8.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta8.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 8) {
                // Pregunta 9
                System.out.println(
                        " Has notado que ultimamente se perfuma más?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta9 = sc.nextLine();
                if (respuesta9.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta9.equals(falso)) {
                    pregunta++;
                }

            }
            if (pregunta == 9) {
                // Pregunta 10
                System.out.println(
                        " Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
                System.out.println("(v) verdaedro o (f) falso");
                String respuesta10 = sc.nextLine();
                if (respuesta10.equals(verdadero)) {
                    resultado = resultado + 3;
                    pregunta++;
                } else if (respuesta10.equals(falso)) {
                    pregunta++;
                    sc.close();
                    if (resultado >= 0 && resultado <= 10) {
                        System.out.println("Enhorabuena! Tu pareja parece ser totalmete fiel.");
                    } else if (resultado >= 11 && resultado <= 22) {
                        System.out.println(
                                "Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                    } else if (resultado >= 22 && resultado <= 30) {
                        System.out.println(
                                "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
                    }

                }

            }

        }
        sc.close();
    }
}
