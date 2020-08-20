import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        // Impresión función del programa
        System.out.println("Este es un programa para calcular el área de un cuadrilátero irregular.");

        // definición de variables
        double shortSide, longSide, base, area;

        // Solicitud de datos
        System.out.println("Ingrese la altura total del lado más largo en centímetros (sin colocar la unidad) y presione enter");

        // habilitación entrada de datos  -  asignación del valor ingresado a la variable longSide
        Scanner keyboard = new Scanner(System.in);
        longSide = keyboard.nextDouble();

        // solicitud de dato - asignación del valor ingresado a la variable longSide
        System.out.println("Ingrese la altura total del lado más corto en centímetros (sin colocar la unidad) y presione enter");
        shortSide = keyboard.nextDouble();

        System.out.println("Ingrese la base de la figura (sin colocar la unidad) y presione enter");
        base = keyboard.nextDouble();

        area = ((longSide - shortSide) * base) / 2 + shortSide * base;

        System.out.println("El área del cuadrilátero es " + area);




    }

}