import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio por m2 de trabajos de pintura.");

        Scanner keyboard = new Scanner(System.in);

        double totalSquareMeter, squareMeterValue, totalValue;

        System.out.println("Ingrese el total de metros cuadrados.");
        totalSquareMeter = keyboard.nextDouble();

        System.out.println("Ingrese el valor por metro cuadrado.");
        squareMeterValue = keyboard.nextDouble();

        totalValue = totalSquareMeter * squareMeterValue;

        System.out.println("El total por los trabajos es " + totalValue);

    }
}
