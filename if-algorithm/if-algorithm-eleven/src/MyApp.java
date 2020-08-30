import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo de la comida.");

        double hamburgerPrice, cardCharge, partialTotal, totalCharge;
        String hamburgerType, payType;
        int hamburgerNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tipo de hamburguesa: sencilla, doble o triple.");
        hamburgerType = keyboard.next().toLowerCase();

        System.out.println("Ingrese la cantidad de hamburguesas.");
        hamburgerNumber = keyboard.nextInt();

        System.out.println("Ingrese el tipo de pago: efectivo o tarjeta.");
        payType = keyboard.next().toLowerCase();

        if (hamburgerType == "sencilla") {
            hamburgerPrice = 20.00;
        } else {
            if (hamburgerType == "doble") {
                hamburgerPrice = 25.00;
            } else {
                hamburgerPrice = 28.00;
            }
        }

        partialTotal = hamburgerPrice * hamburgerNumber;

        if (payType == "tarjeta") {
            cardCharge = hamburgerPrice * 0.05;
        } else {
            cardCharge = 0;
        }

        totalCharge = partialTotal + cardCharge;

        System.out.println("La hamburguesa cuesta $" + hamburgerPrice);
        System.out.println("El total sin cargo es $" + partialTotal);
        System.out.println("El cargo por tarjeta es $" + cardCharge);
        System.out.println("El total a pagar es $" + totalCharge);

    }
}
