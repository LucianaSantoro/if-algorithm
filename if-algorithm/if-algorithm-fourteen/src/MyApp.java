import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio por el envío de paquetería.");

        Scanner keyboard = new Scanner(System.in);

        int deliveryZone, packageWeight;
        double deliveryCost;

        System.out.println("Ingrese el número de zona que corresponda: \n 1: América del Norte \n 2: América Central\n" +
                "3: América del Sur \n 4: Europa \n 5: Asia");
        deliveryZone = keyboard.nextInt();

        System.out.println("Ingrese el peso en gramos.");
        packageWeight = keyboard.nextInt();

        if (packageWeight > 5000) {
            System.out.println("No se puede brindar el servicio.");
        } else {
            switch (deliveryZone) {
                case 1:
                    deliveryCost = packageWeight * 11;
                    break;
                case 2:
                    deliveryCost = packageWeight * 10;
                    break;
                case 3:
                    deliveryCost = packageWeight * 12;
                    break;
                case 4:
                    deliveryCost = packageWeight * 24;
                    break;
                default:
                    deliveryCost = packageWeight * 27;
                    break;
            }
            System.out.println("El costo del servicio es $" + deliveryCost);
            }



    }
}
