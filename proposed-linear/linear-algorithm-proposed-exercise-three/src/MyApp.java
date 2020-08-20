import java.time.Year;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        // Establece variables

        int birthday;
        int currentYear;

        // Imprime para qué es el programa
        System.out.println("Este es un programa para calcular la edad de los empleados.");

        // Habilita teclado
        Scanner keyboard = new Scanner(System.in);

        // Solicita edad de nacimiento

        System.out.println("Ingrese el año de nacimiento y apriete enter");
        birthday = keyboard.nextInt();

        // Solicita año actual

        //System.out.println("Ingrese el año actual y apriete enter");
        currentYear = Year.now().getValue();

        // Imprime la edad del empleado

        System.out.println("La edad del empleado es " +  (currentYear - birthday));

    }
}
