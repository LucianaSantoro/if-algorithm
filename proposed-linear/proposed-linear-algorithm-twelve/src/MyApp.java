import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el 20% descuento y 15% de IVA.");

        double discount, originalPrice, taxes, finalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio.");
        originalPrice = keyboard.nextDouble();

        discount = originalPrice * 0.20;
        taxes = (originalPrice - discount) * 0.15;
        finalPrice = originalPrice - discount + taxes;

        System.out.println("El descuento es de " + discount + " pesos.");

        System.out.println("El precio final es " + finalPrice + " pesos");


    }
}
