import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        // Imprimo para qué es el programa
        System.out.println("Programa para realizar promedio de 4 notas");

        // defino el tipo de variable

        int firstGrade;
        int secondGrade;
        int thirdGrade;
        int fourthGrade;

        // Habilito ingreso por teclado de datos
        Scanner keyboard = new Scanner(System.in);

        // Imprimo la solicitud de notas y le asigno el valor a cada variable

        System.out.println("Ingrese la primera nota y apriete enter");
        firstGrade= keyboard.nextInt();

        System.out.println("Ingrese la segunda nota y apriete enter");
        secondGrade= keyboard.nextInt();

        System.out.println("Ingrese la tercera nota y apriete enter");
        thirdGrade= keyboard.nextInt();

        System.out.println("Ingrese la cuarta nota y apriete enter");
        fourthGrade= keyboard.nextInt();

        System.out.println("Su promedio es: " + (firstGrade + secondGrade + thirdGrade + firstGrade)/4);
    }
}
