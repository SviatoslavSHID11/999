package semester1.practice04.homework;

import java.util.Scanner;

public class Task2DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Аналізатор розрядів числа");

        int number;
        do {
            System.out.print("Введіть додатне ціле число: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Помилка: число має бути додатним!");
            }
        } while (number <= 0);

        int originalNumber = number;
        int temp = number;

        int count = 0;
        int sum = 0;
        int maxDigit = 0;
        int reversedNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;
            count++;
            sum = sum + digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            reversedNumber = reversedNumber * 10 + digit;
            temp = temp / 10;
        }

        System.out.println();
        System.out.println("Початкове число: " + originalNumber);
        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);
        System.out.println("Найбільша цифра: " + maxDigit);
        System.out.println("Перевернуте число: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("Це число є паліндромом!");
        } else {
            System.out.println("Це звичайне число (не паліндром).");
        }

        scanner.close();
    }
}