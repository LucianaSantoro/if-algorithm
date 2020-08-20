import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio de la estadía del huesped.");

        double stayedDays, dayPrice, totalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio por día.");
        dayPrice = keyboard.nextDouble();

        System.out.println("Ingrese la cantidad de días hospedados.");
        stayedDays = keyboard.nextDouble();

        totalPrice = stayedDays * dayPrice;

        System.out.println("El valor de la estadía es " + totalPrice + " pesos.");

    }

}
