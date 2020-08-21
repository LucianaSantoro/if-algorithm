import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para determnar el precio de la uva.");

        double totalGain, kilogramsTotal, grapeSize, grapeValue;
        String grapeType, result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tipo de uva (A o B)");
        grapeType = keyboard.next().toUpperCase();

        System.out.println("Ingrese el tamaño de la uva (1 o 2)");
        grapeSize = keyboard.nextInt();

        System.out.println("Ingrese el total de kilogramos producidos en número y sin la unidad.");
        kilogramsTotal = keyboard.nextInt();

        System.out.println("Ingrese el valor de la uva por kilo en pesos sin unidad.");
        grapeValue = keyboard.nextInt();

        if (grapeType == "A") {
            if (grapeSize == 1) {
                grapeValue = grapeValue + 20;
            } else {
                grapeValue = grapeValue + 30;
            }
        } else {
            if (grapeSize == 1) {
                grapeValue = grapeValue + 30;
            } else {
                grapeValue = grapeValue + 50;
            }
        }

        totalGain = kilogramsTotal * grapeValue;

        System.out.println("La ganancia total es de $" + totalGain);

    }
}
