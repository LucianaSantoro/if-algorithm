import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para evaluar qué número es mas alto.");

        double firstNumber, secondNumber;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer número.");
        firstNumber = keyboard.nextDouble();

        System.out.println("Ingrese el segundo número.");
        secondNumber = keyboard.nextDouble();

        if (firstNumber > secondNumber) {
            result = "El número " + firstNumber + " es el más grande";
        } else if (firstNumber == secondNumber) {
            result = "Los números son iguales";
        } else {
            result = "El número " + secondNumber + " es el más grande";
        }

        System.out.println(result);
    }
}
