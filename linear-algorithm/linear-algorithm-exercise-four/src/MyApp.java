import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        // Imprimo para que es el programa
        System.out.println("Este es un programa para calcular la circunferencia de tu vieja");
        // YO MAMA SO FAT

        // defino el tipo de variable
        final float PI;
        PI = (float) 3.1416;
        int radio;

        // Habilito el ingreso de datos por teclado
        Scanner keyboard= new Scanner(System.in);

        // Solicito los datos al usuario y les asigno el nombre de la variable
        System.out.println("Indique el radio del círculo en cm");
        radio = keyboard.nextInt();

        System.out.println("La circunferencia del círulo es: " + PI * Math.pow(radio, 2));

    }
}