import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {


        System.out.println("Programa para convertir pesos mexicanos a dólares.");

        double mexicanPesos, totalDollars, dollarValue;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos mexicanos disponibles.");
        mexicanPesos = keyboard.nextDouble();

        dollarValue = 0.045;
        totalDollars = mexicanPesos *400 dollarValue;

        System.out.println("Ud. puede comprar " + totalDollars);

    }
}
