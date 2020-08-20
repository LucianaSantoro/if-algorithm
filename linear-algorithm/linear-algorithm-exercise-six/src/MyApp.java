import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {

        System.out.println("Este es un programa para calcular el área de un cono con calvicie.");

        double totalArea, circleArea, triangleArea, radio, diameterTriangleBase, triangleHypotenuse, triangleHeight;
        double powTriangleHypotenuse, powTriangleBase, powTriangleHeight;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo sin la unidad y presione enter");
        radio = keyboard.nextDouble();

        System.out.println("Ingrese el valor de H sin la unidad y presione enter");
        triangleHypotenuse = keyboard.nextDouble();

        circleArea = Math.pow((radio * Math.PI), 2);

        powTriangleBase = Math.pow(radio,2);
        powTriangleHypotenuse = Math.pow(triangleHypotenuse,2);
        triangleHeight = Math.sqrt((powTriangleHypotenuse-powTriangleBase));

        triangleArea = ((radio * 2) * triangleHeight) / 2;

        totalArea = triangleArea + circleArea;

        System.out.println("El área del cono con calvicie es " + totalArea);
    }
}
