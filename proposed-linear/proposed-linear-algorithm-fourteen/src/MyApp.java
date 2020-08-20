import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular gastos del viaje a Monterrey.");

        double food, hotel, daysStayed, totalExpenses, dailyExpenses;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese los gastos de la comida.");
        food = keyboard.nextDouble();

        System.out.println("Ingrese los gastos del hotel.");
        hotel = keyboard.nextDouble();

        System.out.println("Ingrese la cantidad de días del viaje.");
        daysStayed = keyboard.nextDouble();

        dailyExpenses = daysStayed * 100;

        totalExpenses = food + hotel + dailyExpenses;

        System.out.println("El monto de la comida es " + food + " pesos. El monto del hotel es " + hotel + " pesos. " +
                "Los gastos diarios son " + dailyExpenses + " pesos. El total es " + totalExpenses + " pesos.");
    }
}
