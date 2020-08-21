import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo de un viaje de estudios.");

        int studentsTotal;
        double individualStudentCost, totalCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos que realizarán el  viaje.");
        studentsTotal = keyboard.nextInt();

        if (studentsTotal >= 100) {
            individualStudentCost = 65.0;
        } else {
            if (studentsTotal >= 50) {
                individualStudentCost = 70.0;
            } else {
                if (studentsTotal >= 30) {
                    individualStudentCost = 95.0;
                } else {
                    individualStudentCost = (4000 / studentsTotal);
                }
            }
        }
        totalCost = studentsTotal * individualStudentCost;

        System.out.printf("El pago individual es %2f y el pago total es %2f.", individualStudentCost, totalCost);
    }


}
