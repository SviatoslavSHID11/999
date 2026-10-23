package semester1.practice04.homework;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int task;
        do {
            System.out.println();
            System.out.print("Номер завдання (1-40, 0 - вихід): ");
            task = scanner.nextInt();
            scanner.nextLine();

            switch (task) {

                // ===== DRY =====

                case 1: {
                    for (int i = 0; i < 7; i++) {
                        System.out.println("Java - надійна та кросплатформна мова!");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Введіть текст: ");
                    String text = scanner.nextLine();
                    System.out.print("Введіть N: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("[" + i + "] " + text);
                    }
                    break;
                }

                case 3: {
                    // щомісяця +500 грн
                    int balance = 0;
                    for (int month = 1; month <= 12; month++) {
                        balance = balance + 500;
                        System.out.println("Місяць " + month + ": " + balance + " грн");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Введіть курс євро: ");
                    double rate = scanner.nextDouble();
                    for (int euro = 10; euro <= 100; euro += 10) {
                        double result = Math.round(euro * rate * 100) / 100.0;
                        System.out.println(euro + " EUR = " + result + " грн");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Введіть ширину W: ");
                    int w = scanner.nextInt();
                    for (int i = 0; i < w; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    break;
                }

                // ===== while =====

                case 6: {
                    int count = 10;
                    while (count >= 1) {
                        System.out.println(count);
                        count--;
                    }
                    System.out.println("Поїхали!");
                    break;
                }

                case 7: {
                    int sum = 0;
                    System.out.print("Введіть число (0 - кінець): ");
                    int number = scanner.nextInt();
                    while (number != 0) {
                        sum = sum + number;
                        System.out.print("Введіть число (0 - кінець): ");
                        number = scanner.nextInt();
                    }
                    System.out.println("Сума: " + sum);
                    break;
                }

                case 8: {
                    System.out.print("Введіть M: ");
                    int m = scanner.nextInt();
                    long power = 1;
                    while (power <= m) {
                        System.out.print(power + " ");
                        power = power * 2;
                    }
                    System.out.println();
                    break;
                }

                case 9: {
                    System.out.print("Введіть число N: ");
                    int n = scanner.nextInt();
                    int count = 0;
                    int sum = 0;
                    while (n > 0) {
                        sum = sum + n % 10;
                        count++;
                        n = n / 10;
                    }
                    System.out.println("Кількість цифр: " + count);
                    System.out.println("Сума цифр: " + sum);
                    break;
                }

                case 10: {
                    System.out.print("Введіть число: ");
                    int n = scanner.nextInt();
                    int reversed = 0;
                    while (n > 0) {
                        reversed = reversed * 10 + n % 10;
                        n = n / 10;
                    }
                    System.out.println("Число навпаки: " + reversed);
                    break;
                }

                case 11: {
                    System.out.print("Введіть суму S: ");
                    double s = scanner.nextDouble();
                    System.out.print("Введіть відсоток P: ");
                    double p = scanner.nextDouble();

                    if (s <= 0 || p <= 0) {
                        System.out.println("S і P мають бути > 0");
                    } else {
                        double money = s;
                        int years = 0;
                        while (money < s * 2) {
                            money = money + money * p / 100;
                            years++;
                        }
                        System.out.println("Сума подвоїться через " + years + " р.");
                    }
                    break;
                }

                case 12: {
                    System.out.print("Введіть N (>1): ");
                    int n = scanner.nextInt();
                    int d = 2;
                    while (n % d != 0) {
                        d++;
                    }
                    System.out.println("Найменший дільник: " + d);
                    break;
                }

                case 13: {
                    // гра "вгадай число"
                    int secret = (int) (Math.random() * 100) + 1;
                    int attempts = 0;
                    int guess = 0;

                    System.out.println("Я загадав число від 1 до 100");
                    while (guess != secret) {
                        System.out.print("Ваша здогадка: ");
                        guess = scanner.nextInt();
                        attempts++;
                        if (guess < secret) {
                            System.out.println("Більше!");
                        } else if (guess > secret) {
                            System.out.println("Менше!");
                        }
                    }
                    System.out.println("Вгадали! Спроб: " + attempts);
                    break;
                }

                // ===== do-while =====

                case 14: {
                    int choice;
                    do {
                        System.out.println("1. Нова гра");
                        System.out.println("2. Завантажити");
                        System.out.println("3. Налаштування");
                        System.out.println("0. Вихід");
                        System.out.print("Ваш вибір: ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                            System.out.println("Нова гра!");
                        } else if (choice == 2) {
                            System.out.println("Збереження завантажено.");
                        } else if (choice == 3) {
                            System.out.println("Налаштування.");
                        } else if (choice != 0) {
                            System.out.println("Немає такого пункту!");
                        }
                    } while (choice != 0);
                    break;
                }

                case 15: {
                    int age;
                    do {
                        System.out.print("Введіть вік: ");
                        age = scanner.nextInt();
                    } while (age < 1 || age > 120);
                    System.out.println("Вік підтверджено: " + age);
                    break;
                }

                case 16: {
                    int pin;
                    int attempts = 0;
                    boolean access = false;
                    do {
                        System.out.print("Введіть PIN: ");
                        pin = scanner.nextInt();
                        attempts++;
                        if (pin == 1234) {
                            access = true;
                        }
                    } while (!access && attempts < 3);

                    if (access) {
                        System.out.println("Доступ надано");
                    } else {
                        System.out.println("Карту заблоковано!");
                    }
                    break;
                }

                case 17: {
                    String answer;
                    do {
                        System.out.print("Введіть перше число: ");
                        int a = scanner.nextInt();
                        System.out.print("Введіть друге число: ");
                        int b = scanner.nextInt();
                        System.out.println("Сума: " + (a + b));

                        System.out.print("Бажаєте продовжити? (y/n): ");
                        answer = scanner.next();
                    } while (answer.equals("y"));
                    break;
                }

                case 18: {
                    int cube1;
                    int cube2;
                    int attempts = 0;
                    do {
                        cube1 = (int) (Math.random() * 6) + 1;
                        cube2 = (int) (Math.random() * 6) + 1;
                        attempts++;
                        System.out.println("Кидок " + attempts + ": " + cube1 + " і " + cube2);
                    } while (cube1 != cube2);
                    System.out.println("Дубль! Спроб: " + attempts);
                    break;
                }

                case 19: {
                    System.out.print("Введіть чисельник: ");
                    double a = scanner.nextDouble();
                    double b;
                    do {
                        System.out.print("Введіть знаменник (не 0): ");
                        b = scanner.nextDouble();
                    } while (b == 0);
                    System.out.println("Результат: " + (a / b));
                    break;
                }

                case 20: {
                    int sum = 0;
                    int count = 0;
                    int score;
                    do {
                        System.out.print("Введіть бал (0-100, мінус - кінець): ");
                        score = scanner.nextInt();

                        if (score > 100) {
                            System.out.println("Некоректний бал!");
                            continue;
                        }
                        if (score >= 0) {
                            sum = sum + score;
                            count++;
                        }
                    } while (score >= 0);

                    if (count > 0) {
                        System.out.println("Середній бал: " + (double) sum / count);
                    } else {
                        System.out.println("Балів не було.");
                    }
                    break;
                }

                // ===== for, break, continue =====

                case 21: {
                    System.out.print("Введіть A: ");
                    int a = scanner.nextInt();
                    System.out.print("Введіть B: ");
                    int b = scanner.nextInt();
                    for (int i = a; i <= b; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                }

                case 22: {
                    System.out.print("Введіть N (0-20): ");
                    int n = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial = factorial * i;
                    }
                    System.out.println(n + "! = " + factorial);
                    break;
                }

                case 23: {
                    System.out.println("Число\tКвадрат\tКуб");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + "\t" + i * i + "\t" + i * i * i);
                    }
                    break;
                }

                case 24: {
                    for (int i = 1; i <= 50; i++) {
                        if (i % 3 == 0 || i % 5 == 0) {
                            continue;
                        }
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                }

                case 25: {
                    for (int i = 100; i <= 200; i++) {
                        if (i % 13 == 0 && i % 7 == 0) {
                            System.out.println("Знайдено: " + i);
                            break;
                        }
                    }
                    break;
                }

                case 26: {
                    for (char c = 'A'; c <= 'Z'; c++) {
                        System.out.println(c + " = " + (int) c);
                    }
                    break;
                }

                case 27: {
                    System.out.print("Введіть N: ");
                    int n = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 1) {
                            sum = sum + i;
                        } else {
                            sum = sum - i;
                        }
                    }
                    System.out.println("S = " + sum);
                    break;
                }

                case 28: {
                    System.out.print("Введіть a1: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Введіть d: ");
                    int d = scanner.nextInt();
                    System.out.print("Введіть n: ");
                    int n = scanner.nextInt();

                    int sum = 0;
                    int current = a1;
                    for (int i = 1; i <= n; i++) {
                        System.out.print(current + " ");
                        sum = sum + current;
                        current = current + d;
                    }
                    System.out.println();
                    System.out.println("Сума: " + sum);
                    break;
                }

                // ===== приведення типів =====

                case 29: {
                    byte b = 125;
                    for (int i = 1; i <= 6; i++) {
                        b = (byte) (b + 1);
                        System.out.println(i + ": " + b);
                    }
                    System.out.println("Після 127 byte переповнюється і йде в мінус");
                    break;
                }

                case 30: {
                    System.out.print("Скільки чисел? ");
                    int n = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Число " + i + ": ");
                        sum = sum + scanner.nextInt();
                    }

                    double wrong = sum / n;
                    double right = (double) sum / n;
                    System.out.println("Без приведення: " + wrong);
                    System.out.println("З приведенням: " + right);
                    break;
                }

                case 31: {
                    System.out.print("Введіть слово: ");
                    String word = scanner.next();
                    for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        System.out.print((char) (ch + 1));
                    }
                    System.out.println();
                    break;
                }

                case 32: {
                    double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
                    int whole = 0;
                    int kopecks = 0;

                    for (double price : prices) {
                        int part = (int) price;
                        whole = whole + part;
                        kopecks = kopecks + (int) Math.round((price - part) * 100);
                    }

                    System.out.println("Цілих гривень: " + whole);
                    System.out.println("Копійок: " + kopecks);
                    break;
                }

                case 33: {
                    for (int i = 1; i <= 50; i++) {
                        int percent = (int) (((double) i / 50) * 100);
                        System.out.println("Завантажено: " + percent + "%");
                    }
                    break;
                }

                case 34: {
                    long bigNumber = 3_000_000_000L;
                    int small = (int) bigNumber;
                    System.out.println("long: " + bigNumber);
                    System.out.println("int: " + small);
                    break;
                }

                case 35: {
                    System.out.println("Через double:");
                    for (double d = 0.0; d <= 1.0; d += 0.1) {
                        System.out.println(d);
                    }

                    System.out.println("Через int:");
                    for (int i = 0; i <= 10; i++) {
                        double val = i / 10.0;
                        System.out.println(val);
                    }
                    break;
                }

                // ===== вкладені цикли =====

                case 36: {
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print(i * j + "\t");
                        }
                        System.out.println();
                    }
                    break;
                }

                case 37: {
                    System.out.print("Введіть висоту H: ");
                    int h = scanner.nextInt();
                    System.out.print("Введіть ширину W: ");
                    int w = scanner.nextInt();

                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= w; j++) {
                            if (i == 1 || i == h || j == 1 || j == w) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }

                case 38: {
                    System.out.print("Введіть висоту N: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }

                case 39: {
                    System.out.print("Введіть N: ");
                    int n = scanner.nextInt();

                    for (int i = 2; i <= n; i++) {
                        boolean isPrime = true;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                }

                case 40: {
                    System.out.print("Введіть розмір дошки N: ");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if ((i + j) % 2 == 0) {
                                System.out.print("# ");
                            } else {
                                System.out.print("_ ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }

                case 0:
                    System.out.println("Кінець програми.");
                    break;

                default:
                    System.out.println("Такого завдання немає!");
            }
        } while (task != 0);

        scanner.close();
    }
}