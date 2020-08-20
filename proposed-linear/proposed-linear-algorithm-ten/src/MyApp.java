import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo del agua.");

        double waterCubicMeters, pricePerCubicmeter, totalPay;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indique la cantidad de metros cúbicos de agua.");
        waterCubicMeters = keyboard.nextDouble();

        System.out.println("Indique el valor por métro cúbico.");
        pricePerCubicmeter = keyboard.nextDouble();

        totalPay = waterCubicMeters * pricePerCubicmeter;

        System.out.println("El precio total es " + totalPay);


    }
}
