import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el promedio.");

        double firstNote, secondNote, thirdNote, averageNote;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la primera nota.");
        firstNote = keyboard.nextDouble();

        System.out.println("Ingrese la segunda nota.");
        secondNote = keyboard.nextDouble();

        System.out.println("Ingrese la tercera nota.");
        thirdNote = keyboard.nextDouble();

        averageNote = firstNote * 0.25 + secondNote * 0.25 + thirdNote * 0.50;

        System.out.println("El promedio es " + averageNote);
    }
}
