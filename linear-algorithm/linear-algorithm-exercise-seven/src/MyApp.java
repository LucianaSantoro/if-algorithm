import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Este es un programa para calcular la ganancia de la producción de leche.");

        double litres, totalGallon, pricePerGalon, totalGain;

        System.out.println("Ingrese el total de litros.");

        Scanner keyboard = new Scanner(System.in);
        litres = keyboard.nextDouble();

        System.out.println("Ingrese el precio por galón.");
        pricePerGalon = keyboard.nextDouble();

        totalGallon = litres /  3.785;

        totalGain = totalGallon * pricePerGalon;

        System.out.println("La ganancia total es " + totalGain);

    }
}
