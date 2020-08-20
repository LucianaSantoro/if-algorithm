import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {

        System.out.println("Programa para calcular el tiempo de pedaleo de una ciudad a otra.");

        Scanner keyboard = new Scanner(System.in);

        double totalKilometers, totalTime, timePerKilometer;

        System.out.println("Ingrese el total de kilometros por recorrer.");
        totalKilometers = keyboard.nextDouble();

        System.out.println("Ingrese la cantidad de tiempo en minutos que toma en recorrer un kilómetro.");
        timePerKilometer = keyboard.nextDouble();

        totalTime = totalKilometers * timePerKilometer;

        System.out.println("El tiempo de viaje total sería " + totalTime + " minutos");

    }
}
