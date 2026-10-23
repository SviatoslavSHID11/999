package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");
        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();
        System.out.print("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();

        if (distance <= 0 || fuelConsumption <= 0) {
            System.out.println("Помилка: відстань і витрата мають бути більшими за 0!");
            scanner.close();
            return;
        }

        double pricePerLiter = switch (fuelType) {
            case 1 -> 56.50;
            case 2 -> 52.80;
            case 3 -> 29.40;
            default -> -1;
        };
        if (pricePerLiter == -1) {
            System.out.println("Помилка: невідомий тип пального!");
            scanner.close();
            return;
        }
        String fuelName = switch (fuelType) {
            case 1 -> "Бензин А-95";
            case 2 -> "Дизель";
            default -> "Газ";
        };

        double neededFuel = distance * fuelConsumption / 100.0;
        double baseCost = neededFuel * pricePerLiter;
        double finalCost = (baseCost >= 2000.0) ? baseCost * 0.95 : baseCost;
        double discount = baseCost - finalCost;

        System.out.println();
        System.out.println("---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.printf("Обране пальне:               %s (%.2f грн/л)%n", fuelName, pricePerLiter);
        System.out.printf("Необхідно пального:          %.2f л%n", neededFuel);
        System.out.printf("Базова вартість:             %.2f грн%n", baseCost);
        System.out.printf("Знижка АЗС (5%%):             %.2f грн%n", discount);
        System.out.println("----------------------------------------------");
        System.out.printf("Підсумкова сума до сплати:   %.2f грн%n", finalCost);
        System.out.println("==============================================");

        scanner.close();
    }
}
