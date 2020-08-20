import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para encontrar el área de un cuadrado.");

        double squareSide, squareArea;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la medida del lado del cuadrado.");
        squareSide = keyboard.nextDouble();

        squareArea = Math.pow(squareSide, 2);

        System.out.println("El área del cuadrado es " + squareArea);

    }
}
