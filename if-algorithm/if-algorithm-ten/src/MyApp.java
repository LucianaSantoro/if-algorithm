import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo total por el viaje el colectivo.");

        double kilometerCost, costPerPerson, totalCost;
        int kilometers, totalPeople, parcialPeople;
        String busType;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tipo de colectivo (A, B o C).");
        busType = keyboard.next().toLowerCase();

        System.out.println("Ingrese los kilómetros por recorrer.");
        kilometers = keyboard.nextInt();

        System.out.println("Ingrese el total de personas.");
        parcialPeople = keyboard.nextInt();

        if (busType == "a") {
            kilometerCost = 2.0;
        } else {
            if (busType == "b") {
                kilometerCost = 2.50;
            } else {
                kilometerCost = 3.00;
            }
        }

        if (parcialPeople < 20) {
            totalPeople = 20;
        } else {
            totalPeople = parcialPeople;
        }

        totalCost = totalPeople * kilometers * kilometerCost;
        costPerPerson = totalCost / totalPeople;

        System.out.println("Cada persona deberá abonar $" + costPerPerson);
        System.out.println("El costo total del viaje es $" + totalCost);

    }
}

