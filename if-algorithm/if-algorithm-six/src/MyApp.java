import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el costo del plato por persona.");

        int totalPeople;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el total de invitados.");
        totalPeople = keyboard.nextInt();

        if (totalPeople > 300) {
            result = "El precio por persona es de $750 y el total es " + (totalPeople * 750);
        } else {
            if (totalPeople > 200) {
                result = "El precio por persona es $850 y el total es " + (totalPeople * 850);
            } else {
                result = "El precio por persona es $950 y el total es " + (totalPeople * 950);
            }
        }
        System.out.println(result);
    }
}