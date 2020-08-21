import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el descuento de un traje.");

        Scanner keyboard = new Scanner(System.in);

        double finalPrice, originalPrice;
        String result = null;

        System.out.println("Ingrese el precio del traje.");
        originalPrice = keyboard.nextDouble();

        if (originalPrice > 2500) {
            result = "El descuento es de un 15% y el precio final es " + (originalPrice - originalPrice * 0.15);
        } else {
            result = "El descuento es de un 8% y el precio final es " + (originalPrice - originalPrice * 0.08);
        }

        System.out.println(result);

        }
    }
