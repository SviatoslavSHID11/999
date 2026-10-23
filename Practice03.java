package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання (1-40): ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        switch (taskNumber) {

            case 1 -> {
                System.out.print("Ім'я: ");
                String name = scanner.nextLine();
                System.out.print("Прізвище: ");
                String surname = scanner.nextLine();
                System.out.print("Вік: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Місто: ");
                String city = scanner.nextLine();

                System.out.println("=== ВХІДНІ ДАНІ ===");
                System.out.println("Ім'я: " + name);
                System.out.println("Прізвище: " + surname);
                System.out.println("Вік: " + age);
                System.out.println("Місто: " + city);
                System.out.println("-------------------");
                System.out.println("Привіт, " + name + " " + surname + " з міста " + city
                        + "! Твій вік: " + age + " р.");
            }
            case 2 -> {
                System.out.print("Введіть перше число: ");
                int a = scanner.nextInt();
                System.out.print("Введіть друге число: ");
                int b = scanner.nextInt();
                System.out.println("Сума: " + (a + b));
                System.out.println("Різниця: " + (a - b));
                System.out.println("Добуток: " + (a * b));
                System.out.println("Остача від ділення: " + (a % b));
            }
            case 3 -> {
                System.out.print("Введіть суму в гривнях (UAH): ");
                double uah = scanner.nextDouble();
                System.out.print("Введіть курс USD: ");
                double rate = scanner.nextDouble();
                double usd = uah / rate;
                System.out.printf("Сума до видачі: %.2f USD%n", usd);
            }
            case 4 -> {
                System.out.print("Введіть номер квитка: ");
                int ticket = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть повне ім'я студента: ");
                String fullName = scanner.nextLine();
                System.out.print("Введіть спеціальність: ");
                String speciality = scanner.nextLine();
                System.out.println("Студент: " + fullName + ", квиток №" + ticket + ", спеціальність: " + speciality);
            }
            case 5 -> {
                System.out.print("Ваш зріст (м): ");
                double height = scanner.nextDouble();
                System.out.print("Ваша вага (кг): ");
                double weight = scanner.nextDouble();
                double bmi = weight / (height * height);
                System.out.printf("Розрахований BMI: %.2f%n", bmi);
            }
            case 6 -> {
                System.out.print("Введіть символ: ");
                char ch = scanner.next().charAt(0);
                System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
            }
            case 7 -> {
                System.out.print("Катет A: ");
                double legA = scanner.nextDouble();
                System.out.print("Катет B: ");
                double legB = scanner.nextDouble();
                double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
                System.out.println("Гіпотенуза: " + hypotenuse);
                System.out.println("Периметр: " + (legA + legB + hypotenuse));
                System.out.println("Площа: " + (legA * legB / 2));
            }
            case 8 -> {
                System.out.print("Товар: ");
                String product = scanner.nextLine();
                System.out.print("Ціна: ");
                double price = scanner.nextDouble();
                System.out.print("Кількість: ");
                int count = scanner.nextInt();
                double total = price * count;
                double vat = total * 0.2;
                System.out.println("Товар: " + product);
                System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
            }

            case 9 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                if (n > 0) {
                    System.out.println("Число додатне.");
                } else if (n < 0) {
                    System.out.println("Число від'ємне.");
                } else {
                    System.out.println("Число дорівнює нулю.");
                }
            }
            case 10 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                if (n == 0) {
                    System.out.println("Число є нулем");
                } else if (n % 2 == 0) {
                    System.out.println("Число " + n + " є парним.");
                } else {
                    System.out.println("Число " + n + " є непарним.");
                }
            }
            case 11 -> {
                System.out.print("Введіть вік: ");
                int age = scanner.nextInt();
                if (age < 0 || age > 120) {
                    System.out.println("Некоректний вік");
                } else if (age <= 12) {
                    System.out.println("Дитина");
                } else if (age <= 17) {
                    System.out.println("Підліток");
                } else if (age <= 64) {
                    System.out.println("Дорослий");
                } else {
                    System.out.println("Пенсіонер");
                }
            }
            case 12 -> {
                System.out.print("Введіть бал (0-100): ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Помилка: некоректний бал!");
                } else if (score >= 90) {
                    System.out.println("Відмінно (A)");
                } else if (score >= 82) {
                    System.out.println("Дуже добре (B)");
                } else if (score >= 74) {
                    System.out.println("Добре (C)");
                } else if (score >= 64) {
                    System.out.println("Задовільно (D)");
                } else if (score >= 60) {
                    System.out.println("Достатньо (E)");
                } else {
                    System.out.println("Незадовільно (F)");
                }
            }
            case 13 -> {
                System.out.print("Введіть 3 числа: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int max = a;
                if (b > max) {
                    max = b;
                }
                if (c > max) {
                    max = c;
                }
                int min = a;
                if (b < min) {
                    min = b;
                }
                if (c < min) {
                    min = c;
                }
                System.out.println("Максимум: " + max);
                System.out.println("Мінімум: " + min);
            }
            case 14 -> {
                System.out.print("Введіть X: ");
                double x = scanner.nextDouble();
                System.out.print("Введіть Y: ");
                double y = scanner.nextDouble();
                if (x == 0 && y == 0) {
                    System.out.println("Точка в початку координат (0; 0).");
                } else if (x == 0 || y == 0) {
                    System.out.println("Точка лежить на осі координат.");
                } else if (x > 0 && y > 0) {
                    System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
                } else if (x < 0 && y > 0) {
                    System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
                } else if (x < 0 && y < 0) {
                    System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
                } else {
                    System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
                }
            }
            case 15 -> {
                int x = 5;
                int y = 20;
                if (x > 10)
                    if (y > 10)
                        System.out.println("x > 10 і y > 10");
                    else
                        System.out.println("Цей else належить внутрішньому if (y > 10)!");

                if (x > 10) {
                    if (y > 10) {
                        System.out.println("x > 10 і y > 10");
                    }
                } else {
                    System.out.println("x не більше 10 (else зовнішнього if)");
                }
            }
            case 16 -> {
                System.out.print("Спожито (кВт·год): ");
                double kwh = scanner.nextDouble();
                if (kwh <= 100) {
                    System.out.printf("Сума до сплати: %.0f * 2.64 = %.2f грн%n", kwh, kwh * 2.64);
                } else {
                    double overLimit = kwh - 100;
                    double sum = 100 * 2.64 + overLimit * 4.32;
                    System.out.printf("Сума до сплати: 100 * 2.64 + %.0f * 4.32 = %.2f грн%n", overLimit, sum);
                }
            }

            case 17 -> {
                System.out.print("Введіть x і y: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int max = (x > y) ? x : y;
                System.out.println("Більше число: " + max);
            }
            case 18 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                int abs = (n < 0) ? -n : n;
                System.out.println("Модуль: " + abs);
            }
            case 19 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                String result = (n % 2 == 0) ? "Парне" : "Непарне";
                System.out.println(result);
            }
            case 20 -> {
                System.out.print("Введіть бал: ");
                int score = scanner.nextInt();
                System.out.println("Результат: " + (score >= 60 ? "Зараховано" : "Незараховано"));
            }
            case 21 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
                System.out.println(status);
            }
            case 22 -> {
                System.out.print("Сума покупки: ");
                double sum = scanner.nextDouble();
                double finalSum = (sum > 1000) ? sum * 0.9 : sum * 0.98;
                System.out.println("До сплати зі знижкою: " + finalSum + " грн");
            }
            case 23 -> {
                System.out.print("Введіть ділене a і дільник b: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                String result = (b != 0) ? String.valueOf((double) a / b) : "Помилка: ділення на нуль неможливе!";
                System.out.println(result);
            }
            case 24 -> {
                System.out.print("Кількість помилок: ");
                int count = scanner.nextInt();
                String text = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";
                System.out.println(text);
            }

            case 25 -> {
                int x = 10;
                int divisor = 0;
                if (divisor != 0 && (x / divisor > 1)) {
                    System.out.println("Успішне ділення");
                } else {
                    System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
                }
            }
            case 26 -> {
                int counter1 = 0;
                int counter2 = 0;
                boolean b1 = false && (++counter1 > 0);
                boolean b2 = false & (++counter2 > 0);
                System.out.println("counter1 (&&) = " + counter1);
                System.out.println("counter2 (&)  = " + counter2);
            }
            case 27 -> {
                int number = 5;
                int zero = 0;
                if (number > 0 || (10 / zero == 0)) {
                    System.out.println("Умова виконана, аварійне ділення не викликалося!");
                }
            }
            case 28 -> {
                int counterA = 0;
                int counterB = 0;
                boolean test1 = true || (++counterA > 0);
                boolean test2 = true | (++counterB > 0);
                System.out.println("counterA (||) = " + counterA);
                System.out.println("counterB (|)  = " + counterB);
            }
            case 29 -> {
                System.out.print("Години (0-23): ");
                int hours = scanner.nextInt();
                System.out.print("Хвилини (0-59): ");
                int minutes = scanner.nextInt();
                boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
                if (isValidTime) {
                    System.out.printf("Час: %02d:%02d%n", hours, minutes);
                } else {
                    System.out.println("Помилка: некоректний час!");
                }
            }
            case 30 -> {
                System.out.print("Введіть сторони a b c: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
                System.out.println("Трикутник існує: " + exists);
            }
            case 31 -> {
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                boolean isEvenBitwise = (n & 1) == 0;
                boolean isEvenMod = n % 2 == 0;
                System.out.println("Двійковий вигляд: " + Integer.toBinaryString(n));
                System.out.println("Парне через & : " + isEvenBitwise);
                System.out.println("Парне через % : " + isEvenMod);
                System.out.println("Операція n & 1 залишає лише останній біт: 0 - парне, 1 - непарне.");
            }
            case 32 -> {
                System.out.print("PIN правильний? (true/false): ");
                boolean isPinCorrect = scanner.nextBoolean();
                System.out.print("Картка активна? (true/false): ");
                boolean isCardActive = scanner.nextBoolean();
                System.out.print("Балансу вистачає? (true/false): ");
                boolean hasSufficientBalance = scanner.nextBoolean();
                System.out.print("Добовий ліміт перевищено? (true/false): ");
                boolean isDailyLimitExceeded = scanner.nextBoolean();
                if (isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded) {
                    System.out.println("Транзакцію дозволено.");
                } else {
                    System.out.println("Транзакцію відхилено.");
                }
            }

            case 33 -> {
                System.out.print("Введіть номер дня (1-7): ");
                int day = scanner.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("Понеділок");
                        break;
                    case 2:
                        System.out.println("Вівторок");
                        break;
                    case 3:
                        System.out.println("Середа");
                        break;
                    case 4:
                        System.out.println("Четвер");
                        break;
                    case 5:
                        System.out.println("П'ятниця");
                        break;
                    case 6:
                        System.out.println("Субота");
                        break;
                    case 7:
                        System.out.println("Неділя");
                        break;
                    default:
                        System.out.println("Некоректний номер дня");
                        break;
                }
            }
            case 34 -> {
                System.out.print("Введіть номер дня (1-7): ");
                int day = scanner.nextInt();
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Будній (робочий) день");
                        break;
                    case 6:
                    case 7:
                        System.out.println("Вихідний день");
                        break;
                    default:
                        System.out.println("Некоректний день");
                        break;
                }
            }
            case 35 -> {
                System.out.print("Введіть номер місяця (1-12): ");
                int month = scanner.nextInt();
                int days = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> 28;
                    default -> 0;
                };
                if (days == 0) {
                    System.out.println("Такого місяця не існує");
                } else {
                    System.out.println("Днів у місяці: " + days);
                }
            }
            case 36 -> {
                System.out.print("Введіть місяць: ");
                String month = scanner.nextLine().toLowerCase();
                String season = switch (month) {
                    case "грудень", "січень", "лютий" -> "Зима";
                    case "березень", "квітень", "травень" -> "Весна";
                    case "червень", "липень", "серпень" -> "Літо";
                    case "вересень", "жовтень", "листопад" -> "Осінь";
                    default -> "Невідомий місяць";
                };
                System.out.println("Пора року: " + season);
            }
            case 37 -> {
                System.out.print("Спосіб доставки (1 - Самовивіз, 2 - Кур'єр, 3 - Поштомат): ");
                int method = scanner.nextInt();
                System.out.print("Вага товару (кг): ");
                double weight = scanner.nextDouble();
                int cost = switch (method) {
                    case 1 -> 0;
                    case 2 -> {
                        if (weight > 5) {
                            yield 150;
                        } else {
                            yield 90;
                        }
                    }
                    case 3 -> 60;
                    default -> -1;
                };
                if (cost == -1) {
                    System.out.println("Некоректний вибір");
                } else {
                    System.out.println("Вартість доставки: " + cost + " грн");
                }
            }
            case 38 -> {
                System.out.print("Число 1: ");
                double a = scanner.nextDouble();
                System.out.print("Оберіть операцію (+, -, *, /): ");
                char op = scanner.next().charAt(0);
                System.out.print("Число 2: ");
                double b = scanner.nextDouble();
                if (op == '/' && b == 0) {
                    System.out.println("Помилка: ділення на нуль!");
                } else {
                    double result = switch (op) {
                        case '+' -> a + b;
                        case '-' -> a - b;
                        case '*' -> a * b;
                        case '/' -> a / b;
                        default -> 0;
                    };
                    System.out.println("Результат: " + result);
                }
            }
            case 39 -> {
                System.out.print("Введіть команду (start, pause, stop, exit): ");
                String command = scanner.nextLine();
                System.out.println("command == \"start\"         : " + (command == "start"));
                System.out.println("equalsIgnoreCase(\"start\")  : " + command.equalsIgnoreCase("start"));
                switch (command.toLowerCase()) {
                    case "start" -> System.out.println("Система успішно запущена!");
                    case "pause" -> System.out.println("Система на паузі.");
                    case "stop" -> System.out.println("Систему зупинено.");
                    case "exit" -> System.out.println("Вихід із програми.");
                    default -> System.out.println("Невідома команда!");
                }
            }
            case 40 -> {
                System.out.println("================ БАНКОМАТ ================");
                System.out.print("Введіть PIN: ");
                int pin = scanner.nextInt();
                if (pin != 1234) {
                    System.out.println("Невірний PIN. Роботу завершено.");
                } else {
                    System.out.println("Авторизація успішна!");
                    double balance = 5000.0;
                    boolean working = true;
                    while (working) {
                        System.out.print("\nОберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
                            case 2 -> {
                                System.out.print("Введіть суму поповнення: ");
                                double amount = scanner.nextDouble();
                                if (amount > 0) {
                                    balance = balance + amount;
                                    System.out.println("Рахунок поповнено. Баланс: " + balance + " грн");
                                } else {
                                    System.out.println("Некоректна сума.");
                                }
                            }
                            case 3 -> {
                                System.out.print("Введіть суму зняття: ");
                                double amount = scanner.nextDouble();
                                double commission = (amount > 1000) ? amount * 0.01 : 0;
                                if (amount > 0 && amount + commission <= balance) {
                                    balance = balance - amount - commission;
                                    System.out.println("Комісія операції: " + commission + " грн");
                                    System.out.println("Видано: " + amount + " грн. Залишок на рахунку: "
                                            + balance + " грн");
                                } else {
                                    System.out.println("Помилка: некоректна сума або недостатньо коштів.");
                                }
                            }
                            case 4 -> {
                                System.out.println("Дякуємо, до побачення!");
                                working = false;
                            }
                            default -> System.out.println("Невідома дія.");
                        }
                    }
                }
                System.out.println("==========================================");
            }

            default -> System.out.println("Завдання з таким номером немає (потрібно 1-40).");
        }

        scanner.close();
    }
}
