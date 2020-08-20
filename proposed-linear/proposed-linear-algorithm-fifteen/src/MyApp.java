import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular la potencia eléctrica de un circuito.");

        Scanner keyboard = new Scanner(System.in);

        double voltage, resistance, current, electricPotency;

        System.out.println("Ingrese el valor del Voltaje.");
        voltage = keyboard.nextDouble();

        System.out.println("Ingrese el valor de la resistencia.");
        resistance = keyboard.nextDouble();

        current = voltage / resistance;
        electricPotency = voltage * current;

        System.out.println("La potencia eléctrica es " + electricPotency);

    }

}
