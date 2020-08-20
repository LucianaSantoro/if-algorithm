import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el ahorro de 15% del sueldo por semana.");

        Scanner keyboard = new Scanner(System.in);

        double weeklySalary, weeklySavings, totalSavings;

        System.out.println("Ingrese su salario semanal.");
        weeklySalary = keyboard.nextDouble();
        weeklySavings = weeklySalary * 0.15;
        totalSavings = weeklySavings * 52;

        System.out.println("El ahorro anual es " + totalSavings + " pesos.");


    }
}
