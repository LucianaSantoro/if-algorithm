import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo de una llamada.");

        double partialPay, minuteCost, tax, totalPay;
        int callTime;
        String weekDay, turn;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese los minutos de duración de la llamada en número.");
        callTime = keyboard.nextInt();

        System.out.println("Ingrese el día de la semana.");
        weekDay = keyboard.next().toLowerCase();

        System.out.println("Ingrese el turno del día (matutino o vespertino).");
        turn = keyboard.next().toLowerCase();

        if (callTime < 5) {
            partialPay = (callTime * 1);
        } else if (callTime < 8) {
            partialPay = ((callTime - 5) * 0.8 + 5.0);
        } else if (callTime < 10) {
            partialPay = ((callTime - 8) * 0.7 + 7.4);
        } else {
            partialPay = ((callTime - 10) * 0.5 + 8.8);
        }

        if (weekDay == "domingo") {
            tax = partialPay * 0.05;
        } else {
            if (turn == "matutino") {
                tax = partialPay * 0.15;
            } else {
                tax = partialPay * 0.10;
            }
        }
        totalPay = partialPay + tax;

        System.out.println("El pago por la llamada es $" + totalPay);
    }

}
