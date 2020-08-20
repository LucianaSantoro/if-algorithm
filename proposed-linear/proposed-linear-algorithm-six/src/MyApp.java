import java.util.Scanner;



public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para determinar la hipotenusa de un triángulo rectánculo ");

        double triangleHypotenuse, triangleSideA, triangleSideB;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indique la base o lado a del triángulo");
        triangleSideA = keyboard.nextDouble();

        System.out.println("Indique la medida del lado b del triángulo");
        triangleSideB = keyboard.nextDouble();

        triangleHypotenuse = Math.hypot(triangleSideA, triangleSideB);

        System.out.println("La hipotenusa del triángulo es " + triangleHypotenuse);

    }
}
