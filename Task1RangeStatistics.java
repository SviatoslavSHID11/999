package semester1.practice04.homework;

import java.util.Scanner;

public class Task1RangeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Аналізатор діапазону чисел");

        int n;
        do {
            System.out.print("Введіть число N: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Помилка: N має бути більшим за 0!");
            }
        } while (n <= 0);

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (i % 2 == 0) {
                evenSum = evenSum + i;
                evenCount++;
            } else {
                oddSum = oddSum + i;
                oddCount++;
            }
        }

        double average = (double) sum / n;

        System.out.println();
        System.out.println("Результати для діапазону [1.." + n + "]");
        System.out.println("Загальна сума: " + sum);
        System.out.println("Сума парних: " + evenSum + " (кількість: " + evenCount + ")");
        System.out.println("Сума непарних: " + oddSum + " (кількість: " + oddCount + ")");
        System.out.println("Середнє арифметичне: " + average);

        scanner.close();
    }
}