import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio del tratamiento y el costo de la consulta.");

        double appointmentCost, treatmentCost;
        int appointmentNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el número de consulta");
        appointmentNumber = keyboard.nextInt();

        if (appointmentNumber <= 3) {
            appointmentCost = 200;
            treatmentCost = appointmentCost * appointmentNumber;
        } else {
            if (appointmentNumber <= 5) {
                appointmentCost = 150;
                treatmentCost = (appointmentNumber - 3) * 150 + 600;
            } else {
                if (appointmentNumber <= 8) {
                    appointmentCost = 100;
                    treatmentCost = (appointmentNumber - 5) * 100 + 900;
                } else {
                    appointmentCost = 50;
                    treatmentCost = (appointmentCost - 8) * 50 + 1200;
                }
            }
        }

        System.out.println("El costo de la consulta es $" + appointmentCost);
        System.out.println("El costo del tratamiento es $" + treatmentCost);
    }
}
