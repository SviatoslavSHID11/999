package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task4SmartHomeClimate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ПАНЕЛЬ КЛІМАТ-КОНТРОЛЮ SMART HOME ===");
        System.out.print("Поточна температура (°C): ");
        double currentTemp = scanner.nextDouble();
        System.out.print("Бажана температура (°C): ");
        double desiredTemp = scanner.nextDouble();
        System.out.print("Вологість повітря (%): ");
        int humidity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Сезон (зима/літо/міжсезоння): ");
        String season = scanner.nextLine();
        System.out.print("Режим будинку (1-Standby, 2-Eco, 3-Party, 4-Night, 5-Vacation): ");
        int mode = scanner.nextInt();
        System.out.print("Чи відчинені вікна? (true/false): ");
        boolean isWindowOpen = scanner.nextBoolean();

        boolean blocked = isWindowOpen && (mode != 5);
        if (blocked) {
            System.out.println("ПОПЕРЕДЖЕННЯ: Відчинені вікна! Обігрів та кондиціонування примусово заблоковано!");
        }

        double effectiveTargetTemp = switch (mode) {
            case 1 -> desiredTemp;
            case 2 -> {
                if (season.equalsIgnoreCase("зима")) {
                    yield desiredTemp - 2.0;
                } else if (season.equalsIgnoreCase("літо")) {
                    yield desiredTemp + 2.0;
                } else {
                    yield desiredTemp;
                }
            }
            case 3 -> desiredTemp - 1.5;
            case 4 -> 19.0;
            case 5 -> {
                if (season.equalsIgnoreCase("зима")) {
                    yield 12.0;
                } else {
                    yield 28.0;
                }
            }
            default -> desiredTemp;
        };

        String modeName = switch (mode) {
            case 1 -> "Standby (Звичайний)";
            case 2 -> "Eco (Енергозбереження)";
            case 3 -> "Party (Гості)";
            case 4 -> "Night (Ніч)";
            case 5 -> "Vacation (Відпустка)";
            default -> "Невідомий (Standby)";
        };

        String climateState;
        if (blocked) {
            climateState = "ЗАБЛОКОВАНО (відчинені вікна)";
        } else if (currentTemp - effectiveTargetTemp > 0.5) {
            climateState = "Кондиціонер УВІМКНЕНО (Охолодження)";
        } else if (effectiveTargetTemp - currentTemp > 0.5) {
            climateState = "Опалення УВІМКНЕНО (Обігрів)";
        } else {
            climateState = "Температура в зоні комфорту (Кліматичні прилади в очікуванні)";
        }

        String humidityState = (humidity < 40) ? "Зволожувач УВІМКНЕНО"
                : (humidity > 65) ? "Осушувач УВІМКНЕНО" : "Вологість оптимальна";

        System.out.println();
        System.out.println("------------- СТАТУС СИСТЕМИ -------------");
        System.out.println("Режим роботи:              " + modeName);
        System.out.printf("Цільова температура:       %.2f°C (бажана: %.1f°C)%n", effectiveTargetTemp, desiredTemp);
        System.out.printf("Поточна температура:       %.2f°C%n", currentTemp);
        System.out.println("Стан терморегуляції:       " + climateState);
        System.out.println("Стан мікроклімату:         " + humidityState + " (вологість " + humidity + "%)");
        System.out.println("==========================================");

        scanner.close();
    }
}
