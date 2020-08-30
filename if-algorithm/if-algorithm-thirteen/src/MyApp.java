import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {

        System.out.println("Programa para calcular el gasto de fabricación.");

        double materialsCost, fabricationExpenses, productionCost, workforceCost, salePrice;
        int itemCode;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el costo de material prima.");
        materialsCost = keyboard.nextDouble();

        System.out.println("Ingrese la clave del artículo.");
        itemCode = keyboard.nextInt();

        if (itemCode == 3 || itemCode == 4) {
            workforceCost = materialsCost * 0.75;
        } else {
            if (itemCode == 1 || itemCode == 5) {
                workforceCost = materialsCost * 0.8;
            } else {
                workforceCost = materialsCost * 0.85;
            }
        }

        if (itemCode == 2 || itemCode == 5) {
            fabricationExpenses = materialsCost * 0.3;
        } else {
            if (itemCode == 3 || itemCode == 6) {
                fabricationExpenses = materialsCost * 0.35;
            } else {
                fabricationExpenses = materialsCost * 0.28;
            }
        }

        productionCost = materialsCost + workforceCost + fabricationExpenses;
        salePrice = productionCost + productionCost * 0.45;

        System.out.println("El costo de producción es $" + productionCost);
        System.out.println("El precio de venta es $" + salePrice);
    }
}
