package semester1.practice04.homework;

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Числа Фібоначчі та золотий перетин");

        int n;
        do {
            System.out.print("Скільки чисел згенерувати (від 3 до 30): ");
            n = scanner.nextInt();
            if (n < 3 || n > 30) {
                System.out.println("Помилка: N має бути від 3 до 30!");
            }
        } while (n < 3 || n > 30);

        int f1 = 1;
        int f2 = 1;
        double ratio = 0;

        System.out.println();
        System.out.println("№ 1 | Число: " + f1);
        System.out.println("№ 2 | Число: " + f2);

        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            ratio = (double) next / f2;
            ratio = Math.round(ratio * 1000000) / 1000000.0;

            System.out.println("№ " + i + " | Число: " + next + " | Відношення: " + ratio);

            f1 = f2;
            f2 = next;
        }

        System.out.println();
        System.out.println("Наближення золотого перетину: " + ratio);
        System.out.println("Еталонне значення: 1.618034");

        scanner.close();
    }
}