import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el aumento del cupo de tarjeta de crédito");

        int cardType;
        double actualCreditLimit, newCreditLimit, creditIncrease;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tipo de tarjeta (1, 2, 3, etc).");
        cardType = keyboard.nextInt();

        System.out.println("Ingrese el límite de tarjeta actual.");
        actualCreditLimit = keyboard.nextDouble();

        switch (cardType) {
            case 1:
                creditIncrease = actualCreditLimit * 0.25;
                break;
            case 2:
                creditIncrease = actualCreditLimit * 0.35;
                break;
            case 3:
                creditIncrease = actualCreditLimit * 0.40;
                break;
            default:
                creditIncrease = actualCreditLimit * 0.50;
                break;
        }

        newCreditLimit = actualCreditLimit + creditIncrease;

        System.out.printf("El aumento de crédito es %f y el nuevo límite de crédito es %f", creditIncrease, newCreditLimit);
    }
}
