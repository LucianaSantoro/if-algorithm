import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo del estacionamiento.");

        double hoursQuantity, hoursValue, totalValue;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas.");
        hoursQuantity = keyboard.nextDouble();

        System.out.println("Ingrese el precio por hora.");
        hoursValue = keyboard.nextDouble();

        totalValue = hoursValue * hoursQuantity;

        System.out.println("El valor de la estadía es " + totalValue);

    }
}
