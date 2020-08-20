import java.util.Scanner;

public class MyClass {


    public static void main(String[] args) {

        System.out.println("Este es un programa para calcular el largo de las telas en pulgadas.");

        double clothMeters, clothInches;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese los metros de tela.");
        clothMeters = keyboard.nextDouble();

        clothInches = clothMeters / 2.54;

        System.out.println("El largo en pulgadas es " + clothInches);



    }
}
