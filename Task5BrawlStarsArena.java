package semester1.practice04.homework;

import java.util.Scanner;

public class Task5BrawlStarsArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Brawl Stars: Boss Fight");
        System.out.println("Оберіть свого бійця:");
        System.out.println("1. Шеллі     - HP: 4000 | Атака: 1200 | Супер: 2800");
        System.out.println("2. Кольт     - HP: 3000 | Атака: 1600 | Супер: 3600");
        System.out.println("3. Ель Прімо - HP: 6000 | Атака: 1100 | Супер: 2200");

        int choice;
        do {
            System.out.print("Ваш вибір (1-3): ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Немає такого бійця!");
            }
        } while (choice < 1 || choice > 3);

        String name = "";
        int playerMaxHp = 0;
        int attack = 0;
        int superDamage = 0;

        if (choice == 1) {
            name = "Шеллі";
            playerMaxHp = 4000;
            attack = 1200;
            superDamage = 2800;
        } else if (choice == 2) {
            name = "Кольт";
            playerMaxHp = 3000;
            attack = 1600;
            superDamage = 3600;
        } else {
            name = "Ель Прімо";
            playerMaxHp = 6000;
            attack = 1100;
            superDamage = 2200;
        }

        System.out.println("Ви обрали бійця: " + name + "! Бій починається!");

        int playerHp = playerMaxHp;
        int bossMaxHp = 10000;
        int bossHp = bossMaxHp;
        int ammo = 3;
        int superCharge = 0;
        int cubes = 0;
        int round = 0;
        boolean bossStunned = false;
        boolean bossWeak = false;

        while (playerHp > 0 && bossHp > 0) {
            round++;

            // шкода з урахуванням кубів
            double multiplier = 1 + 0.15 * cubes;
            int myAttack = (int) (attack * multiplier);
            int mySuper = (int) (superDamage * multiplier);

            // фаза боса
            int bossDamage = 700;
            String phase;
            double bossPercent = (double) bossHp / bossMaxHp * 100;

            if (bossPercent > 60) {
                phase = "СПОКІЙНИЙ";
            } else if (bossPercent >= 30) {
                phase = "ANGRY! (+30% атаки)";
                bossDamage = (int) (bossDamage * 1.3);
            } else {
                phase = "ENRAGED! (+70% атаки)";
                bossDamage = (int) (bossDamage * 1.7);
            }

            System.out.println();
            System.out.println("-------------------- РАУНД " + round + " --------------------");

            // смужка HP гравця
            int bars = (int) (((double) playerHp / playerMaxHp) * 10);
            System.out.print("[" + name + "] HP: [");
            for (int i = 0; i < bars; i++) {
                System.out.print("#");
            }
            for (int i = 0; i < 10 - bars; i++) {
                System.out.print(".");
            }
            System.out.print("] " + playerHp + "/" + playerMaxHp + " | Набої: " + ammo + "/3 | Супер: [");

            int superBars = superCharge / 10;
            if (superBars > 10) {
                superBars = 10;
            }
            for (int i = 0; i < superBars; i++) {
                System.out.print("#");
            }
            for (int i = 0; i < 10 - superBars; i++) {
                System.out.print(".");
            }
            System.out.print("] " + superCharge + "%");
            if (superCharge >= 100) {
                System.out.print(" (ГОТОВИЙ!)");
            }
            System.out.println();

            // смужка HP боса
            int bossBars = (int) (((double) bossHp / bossMaxHp) * 10);
            System.out.print("[Робо-Бос] HP: [");
            for (int i = 0; i < bossBars; i++) {
                System.out.print("#");
            }
            for (int i = 0; i < 10 - bossBars; i++) {
                System.out.print(".");
            }
            System.out.println("] " + bossHp + "/" + bossMaxHp + " | Фаза: " + phase + " (Шкода: " + bossDamage + ")");
            System.out.println("Куби підсилення: " + cubes + " шт.");

            System.out.println();
            System.out.println("Оберіть дію:");
            System.out.println("1 - Базова атака (-1 набій)");
            if (superCharge >= 100) {
                System.out.println("2 - СУПЕР АТАКА (Готово!)");
            } else {
                System.out.println("2 - СУПЕР АТАКА (Не заряджено!)");
            }
            System.out.println("3 - Захисний маневр (відновлення набоїв та +15% HP)");
            System.out.println("4 - Ризик: пошук Енергетичного куба");

            int action;
            while (true) {
                System.out.print("Ваш хід: ");
                action = scanner.nextInt();
                if (action < 1 || action > 4) {
                    System.out.println("Оберіть дію від 1 до 4!");
                } else if (action == 2 && superCharge < 100) {
                    System.out.println("Супер ще не заряджено!");
                } else {
                    break;
                }
            }

            System.out.println();

            // хід гравця
            switch (action) {
                case 1:
                    if (ammo >= 1) {
                        ammo--;
                        bossHp = bossHp - myAttack;
                        superCharge = superCharge + 35;
                        System.out.println(name + " влучно стріляє! Завдано " + myAttack + " шкоди!");
                        System.out.println("Заряд супера: +35% (Поточний: " + superCharge + "%)");
                    } else {
                        System.out.println("Набоїв немає! Перезарядка, хід втрачено.");
                    }
                    break;
                case 2:
                    bossHp = bossHp - mySuper;
                    superCharge = 0;
                    System.out.println("СУПЕР-АТАКА! Завдано " + mySuper + " шкоди!");
                    if (choice == 1) {
                        bossWeak = true;
                        System.out.println("Боса відкинуто вибухом! Його наступна атака слабша на 50%!");
                    }
                    if (choice == 3) {
                        bossStunned = true;
                        System.out.println("Боса оглушено! Він пропустить наступний хід!");
                    }
                    break;
                case 3:
                    ammo = ammo + 2;
                    if (ammo > 3) {
                        ammo = 3;
                    }
                    int heal = (int) (playerMaxHp * 0.15);
                    playerHp = playerHp + heal;
                    if (playerHp > playerMaxHp) {
                        playerHp = playerMaxHp;
                    }
                    System.out.println("Захисний маневр! +2 набої та +" + heal + " HP.");
                    break;
                case 4:
                    if (Math.random() < 0.6) {
                        cubes++;
                        System.out.println("Знайдено Power Cube! Уся шкода +15% (кубів: " + cubes + ").");
                    } else {
                        System.out.println("Куб не знайдено...");
                    }
                    break;
            }

            // хід боса
            if (bossHp > 0) {
                System.out.println();
                System.out.println("Хід Боса:");
                if (bossStunned) {
                    System.out.println("Робо-Бос оглушений і пропускає хід!");
                    bossStunned = false;
                } else {
                    if (bossWeak) {
                        bossDamage = (int) (bossDamage * 0.5);
                        bossWeak = false;
                    }
                    if (Math.random() < 0.15) {
                        System.out.println(name + " ухиляється від удару!");
                    } else {
                        playerHp = playerHp - bossDamage;
                        System.out.println("Робо-Бос б'є механічним кулаком! " + name + " отримує " + bossDamage + " шкоди!");
                    }
                }
            }

            if (ammo < 3) {
                ammo++;
            }
        }

        System.out.println();
        if (bossHp <= 0) {
            System.out.println("ПЕРЕМОГА! РОБО-БОСА ЗНИЩЕНО!");
            System.out.println("Раундів зіграно: " + round);
            System.out.println("Зібрано Power Cubes: " + cubes + " шт.");
        } else {
            System.out.println("ПОРАЗКА! Сейф зруйновано...");
            System.out.println("Спробуйте витривалішого бійця - Ель Прімо!");
        }

        scanner.close();
    }
}