import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el mayor de tres valores.");

        Scanner keyboard = new Scanner(System.in);

        double firstValue, secondValue, thirdValue;
        String result = null;

        System.out.println("Ingrese el primer número.");
        firstValue = keyboard.nextDouble();

        System.out.println("Ingrese el segundo número.");
        secondValue = keyboard.nextDouble();

        System.out.println("Ingrese el tercer número.");
        thirdValue = keyboard.nextDouble();

        if (firstValue > secondValue) {
            if (firstValue > thirdValue) {
                result = "El número más grande es " + firstValue;
            } else {
                result = "El número más grande es " + thirdValue;
            }
        } else if (secondValue > firstValue) {
            if (secondValue > thirdValue) {
                result = "El número más grande es " + secondValue;
            } else {
                result = "El número más grande es " + thirdValue;
            }
        } else {
            result = "Los números son iguales.";
        }

        System.out.println(result);
    }
}
