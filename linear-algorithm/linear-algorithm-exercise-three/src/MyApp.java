import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {


        // Imprimo para qué es el programa
        System.out.println("Programa para calcular el área de un rectángulo");

        // Defino tipo de las variables
        int alturaRectangulo;
        int baseRectangulo;

        // Habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        // Solicito datos al usuario
        System.out.println("Indique la altura del rectángulo en cm y apriete enter");
        alturaRectangulo =keyboard.nextInt();

        System.out.println("Indique la base del rectángulo en cm y apriete enter");
        baseRectangulo =keyboard.nextInt();

        System.out.println("El área del rectángulo es: " + baseRectangulo * alturaRectangulo);

    }
}
