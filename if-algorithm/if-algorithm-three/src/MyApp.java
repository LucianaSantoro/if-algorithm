import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio de lápices.");

        double totalPencils;
        String result = null;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de lápices.");
        totalPencils = keyboard.nextDouble();

        if (totalPencils < 1000 && totalPencils > 0) {
            result = "El precio por lápiz es $90. El precio total es " + (totalPencils * 90);
        } else if (totalPencils > 1000) {
            result = "El precio por lápiz es $85. El precio total es " + (totalPencils * 85);
        } else {
            result = "El número es inválido.";
        }

        System.out.println(result);
    }
}
