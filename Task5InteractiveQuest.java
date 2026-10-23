package semester1.practice03.homework;

import java.util.Scanner;

public class Task5InteractiveQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/************************************************************\\");
        System.out.println("|               ПРИГОДА: ВТЕЧА З ТЕМНИЦІ ЧАКЛУНА             |");
        System.out.println("\\************************************************************/");

        System.out.print("Введіть ім'я вашого героя: ");
        String name = scanner.nextLine();
        System.out.print("Оберіть клас героя (1 - Воїн, 2 - Маг, 3 - Розбійник): ");
        int classChoice = scanner.nextInt();
        scanner.nextLine();

        int hp;
        int strength;
        int mana;
        int agility;
        String className;

        switch (classChoice) {
            case 1 -> {
                className = "Воїн";
                hp = 120;
                strength = 15;
                mana = 10;
                agility = 8;
            }
            case 2 -> {
                className = "Маг";
                hp = 75;
                strength = 6;
                mana = 50;
                agility = 10;
            }
            case 3 -> {
                className = "Розбійник";
                hp = 90;
                strength = 10;
                mana = 15;
                agility = 18;
            }
            default -> {
                className = "Волоцюга";
                hp = 60;
                strength = 8;
                mana = 5;
                agility = 8;
            }
        }
        boolean hasSpellBook = (classChoice == 2);
        System.out.println("[Створено персонажа]: " + className + " " + name
                + " (HP: " + hp + ", STR: " + strength + ", MP: " + mana + ", AGI: " + agility + ")");

        System.out.println();
        System.out.println("Ви прокидаєтеся в сирій камері. Перед вами 3 проходи.");
        System.out.print("Куди ви прямуєте? (північ / схід / захід): ");
        String direction = scanner.nextLine();

        boolean passed = false;
        String artifact = "немає";

        switch (direction.toLowerCase()) {
            case "північ" -> {
                System.out.println();
                System.out.println("Ви в Кімнаті Стародавньої Загадки. Кристал запитує:");
                System.out.print("Скільки буде 2 + 2 * 2 ? ");
                int answer = scanner.nextInt();
                scanner.nextLine();
                boolean isCorrect = (answer == 6);
                hp = isCorrect ? (hp + 20) : (hp - 30);
                if (isCorrect) {
                    System.out.println("Вірно! Кристал відновлює сили (+20 HP). Поточне здоров'я: " + hp);
                    passed = true;
                    artifact = "Кристал Мудрості";
                } else {
                    System.out.println("Невірно! Кристал б'є блискавкою (-30 HP). Поточне здоров'я: " + hp);
                }
            }
            case "схід" -> {
                System.out.println();
                System.out.println("Ви зайшли до арсеналу вартового. Тут стоїть кована скриня!");
                if (agility >= 16 || (mana >= 25 && hasSpellBook)) {
                    System.out.println("Успіх! Скриня відчинилася (спритність або магія спрацювали).");
                    hp = hp + 20;
                    strength = strength + 5;
                    artifact = "Амулет Світла";
                    passed = true;
                    System.out.println("Знайдено: Амулет Світла (+20 HP, +5 до сили). Поточне здоров'я: " + hp);
                } else {
                    hp = hp - 25;
                    System.out.println("Пастка зі стрілами: -25 HP. Поточне здоров'я: " + hp);
                }
            }
            case "захід" -> {
                System.out.println();
                System.out.println("Ви в Печері кам'яного голема. Він перегороджує шлях!");
                System.out.print("Тактика: 1 - Лобова атака, 2 - Магічний бар'єр, 3 - Прослизнути повз: ");
                int tactic = scanner.nextInt();
                scanner.nextLine();
                boolean success = switch (tactic) {
                    case 1 -> strength >= 12;
                    case 2 -> mana >= 30;
                    case 3 -> agility >= 12;
                    default -> false;
                };
                if (success) {
                    System.out.println("Тактика спрацювала! Голема вдалося обійти.");
                    passed = true;
                    artifact = "Серце Голема";
                } else {
                    hp = hp - 40;
                    System.out.println("Тактика не спрацювала. Голем б'є кулаком (-40 HP). Поточне здоров'я: " + hp);
                }
            }
            default -> {
                hp = hp - 10;
                System.out.println("Ви заблукали в темряві і поранилися (-10 HP). Поточне здоров'я: " + hp);
            }
        }

        System.out.println();
        if (hp <= 0) {
            System.out.println("Кінцівка: ПОРАЗКА. Герой загинув у темряві підземелля...");
        } else if (passed) {
            System.out.println("Ви знайшли таємний важіль і відкрили головні ворота!");
            System.out.println("ВІТАЄМО! ВИ УСПІШНО ВИБРАЛИСЯ З ТЕМНИЦІ!");
        } else {
            System.out.println("Кінцівка: Ви вижили, але вихід так і не знайшли. Чаклун знайде вас ще до ранку...");
        }

        String rank = (hp >= 100) ? "Легенда" : (hp > 0 && passed) ? "Герой" : (hp > 0) ? "Невдаха" : "Загиблий";
        System.out.println();
        System.out.println("-------- ФІНАЛЬНА СТАТИСТИКА --------");
        System.out.println("Герой:        " + name + " (" + className + ")");
        System.out.println("Здоров'я:     " + Math.max(hp, 0));
        System.out.println("Артефакт:     " + artifact);
        System.out.println("Ранг:         " + rank);
        System.out.println("-------------------------------------");

        scanner.close();
    }
}
