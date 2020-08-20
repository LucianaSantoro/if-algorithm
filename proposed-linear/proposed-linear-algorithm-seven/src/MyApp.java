import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo del viaje.");

        Scanner keyboard = new Scanner(System.in);

        double costPerKilometer, totalKilometers, totalValue;

        System.out.println("Ingrese el total de kilómetros por recorrer.");
        totalKilometers = keyboard.nextDouble();

        System.out.println("Ingrese el valor por kilómetro.");
        costPerKilometer = keyboard.nextDouble();

        totalKilometers = costPerKilometer * totalKilometers;

        System.out.println("El costo total del viaje es " + totalKilometers);

    }


}



