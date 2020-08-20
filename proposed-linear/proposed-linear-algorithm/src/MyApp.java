import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {

        System.out.println("Programa para calcular el área de un triángulo.");

        double triangleHeight, triangleBase, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la altura del triángulo.");
        triangleHeight = keyboard.nextDouble();

        System.out.println("Ingrese la base del triángulo.");
        triangleBase = keyboard.nextDouble();

        area = (triangleBase * triangleHeight) / 2;

        System.out.println("El área del tríangulo es " + area);


    }

}
