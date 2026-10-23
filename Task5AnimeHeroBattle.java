package semester1.practice06.homework;

import java.util.Scanner;

public class Task5AnimeHeroBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asta asta = new Asta();

        int bossHp = 1200;
        int bossMaxHp = 1200;
        int round = 1;

        System.out.println("============ АРЕНА КОРОЛІВСТВА КОНЮШИНИ ============");
        System.out.println("Бос: Патри (Маг Світла) [HP: " + bossHp + "/" + bossMaxHp + "]");
        asta.showStatus();

        while (asta.isAlive() && bossHp > 0) {
            System.out.println();
            System.out.println("--- Раунд " + round + " ---");
            System.out.println("[1] Удар мечем Демоноборця");
            System.out.println("[2] Застосувати навичку");
            System.out.println("[3] Захисна стійка");
            System.out.println("[4] Переглянути статус");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            int damage = 0;
            boolean defend = false;

            switch (choice) {
                case 1 -> damage = asta.basicSwordAttack();
                case 2 -> {
                    System.out.print("Номер навички (0-3): ");
                    damage = asta.useSkill(scanner.nextInt());
                }
                case 3 -> {
                    defend = true;
                    System.out.println("Аста стає в захисну стійку: частину удару приймає меч.");
                }
                case 4 -> asta.showStatus();
                default -> System.out.println("Невідома дія.");
            }

            if (damage > 0) {
                bossHp = Math.max(0, bossHp - damage);
                System.out.println("Бос Патри: " + bossHp + "/" + bossMaxHp + " HP");
            }
            if (bossHp <= 0) {
                break;
            }

            int bossAttack = defend ? 60 : 120;
            System.out.println();
            System.out.println("Патри атакує «Променями Покарання Світла»!");
            asta.takeDamage(bossAttack);
            asta.pushLimits();
            asta.showStatus();
            round++;
        }

        System.out.println();
        if (asta.isAlive() && bossHp <= 0) {
            System.out.println("ПЕРЕМОГА! Аста переміг Патри і вийшов з арени живим!");
        } else {
            System.out.println("ПОРАЗКА. Аста впав на арені, але не здався...");
        }
        scanner.close();
    }
}
