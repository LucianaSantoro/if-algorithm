import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el pago de consumo metros cùbicos de agua.");

        double poolHeight, poolWidth, poolLenght, poolVolume, metricCubePrice, totalPay;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el largo de la pileta.");
        poolLenght = keyboard.nextDouble();

        System.out.println("Ingrese el ancho de la pileta.");
        poolWidth = keyboard.nextDouble();

        System.out.println("Ingrese el alto de la pileta.");
        poolHeight = keyboard.nextDouble();

        System.out.println("Ingrese el valor del metro cuadrado de agua.");
        metricCubePrice = keyboard.nextDouble();

        poolVolume = poolHeight * poolLenght * poolWidth;

        totalPay = poolVolume * metricCubePrice;

        System.out.println("El costo de llenar la pileta es " + totalPay);


    }
}
