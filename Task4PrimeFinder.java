package semester1.practice04.homework;

import java.util.Scanner;

public class Task4PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Детектор простих чисел");

        int n;
        do {
            System.out.print("Введіть верхню межу N (не менше 2): ");
            n = scanner.nextInt();
            if (n < 2) {
                System.out.println("Помилка: N має бути не менше 2!");
            }
        } while (n < 2);

        int count = 0;
        int sum = 0;

        System.out.println();
        System.out.println("Прості числа у проміжку від 2 до " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                count++;
                sum = sum + i;
            }
        }
        System.out.println();

        int total = n - 1;
        double percent = (double) count / total * 100;
        percent = Math.round(percent * 100) / 100.0;

        System.out.println();
        System.out.println("Усього чисел у діапазоні: " + total);
        System.out.println("Знайдено простих чисел: " + count);
        System.out.println("Сума всіх простих чисел: " + sum);
        System.out.println("Частка простих чисел: " + percent + "%");

        scanner.close();
    }
}