import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {


        System.out.println("Este es un programa para calcular el sueldo semanal de un trabajador.");

        double workedHours, hourlyPay, weeklyPay;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas en la semana.");
        workedHours = keyboard.nextDouble();

        System.out.println("Ingrese el pago por hora.");
        hourlyPay = keyboard.nextDouble();

        weeklyPay = hourlyPay * workedHours;

        System.out.println("El pago de la semana indicada es " + weeklyPay);


    }

}
