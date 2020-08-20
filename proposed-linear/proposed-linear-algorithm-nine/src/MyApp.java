import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo de una llamada según su duración.");

        Scanner keyboard = new Scanner(System.in);

        double callMinutes, minuteCost, totalCost;

        System.out.println("Ingrese el total de minutos hablados.");
        callMinutes = keyboard.nextDouble();

        System.out.println("Ingrese el costo por minuto.");
        minuteCost = keyboard.nextDouble();

        totalCost = minuteCost * callMinutes;

        System.out.println("El costo de la llamada es " + totalCost + " pesos.");

    }

}