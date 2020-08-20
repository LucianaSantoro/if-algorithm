import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para determinar si un número es positivo o negativo.");

        double userNumber;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un número.");
        userNumber = keyboard.nextDouble();

        if (userNumber < 0) {
            result = "El número es negativo.";
        } else {
            result = "El número es positivo.";
        }

        System.out.println(result);
    }
}
