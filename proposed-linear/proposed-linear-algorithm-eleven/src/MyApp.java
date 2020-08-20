import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el pago por el consumo de energía eléctrica.");

        double kwQuantity, kwPrice, totalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indique la cantidad de KW consumidos.");
        kwQuantity = keyboard.nextDouble();

        System.out.println("Indique el precio por KW.");
        kwPrice = keyboard.nextDouble();

        totalPrice = kwPrice * kwQuantity;

        System.out.println("El pago del servicio es " + totalPrice + " pesos.");

    }

}
