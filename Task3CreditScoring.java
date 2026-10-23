package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task3CreditScoring {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== СИСТЕМА БАНКІВСЬКОГО СКОРИНГУ ===");
        System.out.print("Введіть вік позичальника: ");
        int age = scanner.nextInt();
        System.out.print("Введіть офіційний місячний дохід (грн): ");
        double monthlyIncome = scanner.nextDouble();
        System.out.print("Чи є негативна кредитна історія? (true/false): ");
        boolean hasBadCreditHistory = scanner.nextBoolean();
        System.out.print("Введіть запитувану суму кредиту (грн): ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Введіть бажаний термін (місяців): ");
        int loanMonths = scanner.nextInt();

        boolean isAgeOk = (age >= 21 && age <= 65);
        boolean isHistoryOk = !hasBadCreditHistory;
        boolean isPaymentAffordable = (loanMonths > 0) && ((loanAmount / loanMonths) <= (monthlyIncome * 0.5));

        double rate = (monthlyIncome >= 35000) ? 14.5 : 21.0;

        System.out.println();
        System.out.println("------------- РІШЕННЯ СКОРИНГУ -------------");
        if (isAgeOk && isHistoryOk && isPaymentAffordable) {
            double payment = loanAmount / loanMonths;
            double percent = payment / monthlyIncome * 100;
            System.out.println("Статус заявки:               СХВАЛЕНО");
            System.out.printf("Орієнтовний платіж/міс:      %.2f грн (%.1f%% від доходу)%n", payment, percent);
            System.out.printf("Персональна ставка:          %.1f%% річних%n", rate);
            System.out.printf("Максимально допустимий платіж: %.2f грн/міс%n", monthlyIncome * 0.5);
        } else {
            System.out.println("Статус заявки:               ВІДХИЛЕНО");
            if (!isAgeOk) {
                System.out.println("Відмова: вік не відповідає критеріям (21-65 років)");
            } else if (!isHistoryOk) {
                System.out.println("Відмова: виявлено негативну кредитну історію");
            } else if (loanMonths <= 0) {
                System.out.println("Відмова: некоректний термін кредиту");
            } else {
                System.out.println("Відмова: термін кредиту некоректний або щомісячний платіж перевищує 50% доходу");
            }
        }
        System.out.println("=============================================");

        scanner.close();
    }
}
