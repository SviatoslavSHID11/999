package semester1.practice06.homework;

import java.util.Locale;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання (1-40): ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {

            case 1 -> {
                Student s1 = new Student();
                s1.name = "Денис";
                s1.age = 19;
                s1.gpa = 4.75;
                System.out.println("Студент: " + s1.name + ", вік: " + s1.age + ", середній бал: " + s1.gpa);
            }
            case 2 -> {
                Car car1 = new Car();
                car1.brand = "Toyota";
                car1.model = "Camry";
                car1.year = 2021;
                car1.speed = 180;

                Car car2 = new Car();
                car2.brand = "BMW";
                car2.model = "M5";
                car2.year = 2023;
                car2.speed = 250;

                System.out.println("Авто 1: " + car1.brand + " " + car1.model + ", " + car1.year + " р., "
                        + car1.speed + " км/год");
                System.out.println("Авто 2: " + car2.brand + " " + car2.model + ", " + car2.year + " р., "
                        + car2.speed + " км/год");
                String newer = (car1.year > car2.year) ? car1.brand + " " + car1.model : car2.brand + " " + car2.model;
                System.out.println("Новіший рік випуску: " + newer);
            }
            case 3 -> {
                Book emptyBook = new Book();
                System.out.println("title: " + emptyBook.title);
                System.out.println("author: " + emptyBook.author);
                System.out.println("pages: " + emptyBook.pages);
                System.out.println("isRead: " + emptyBook.isRead);
            }
            case 4 -> {
                Rectangle rect = new Rectangle();
                rect.width = 7.5;
                rect.height = 4.0;
                double area = rect.width * rect.height;
                double perimeter = 2 * (rect.width + rect.height);
                System.out.printf("Площа: %.2f%n", area);
                System.out.printf("Периметр: %.2f%n", perimeter);
            }
            case 5 -> {
                Product product = new Product();
                product.name = "Монітор";
                product.price = 6500.0;
                product.quantity = 8;
                double total = product.price * product.quantity;
                System.out.printf("Партія \"%s\": %.2f грн%n", product.name, total);
            }
            case 6 -> {
                Smartphone phone = new Smartphone();
                phone.model = "Samsung Galaxy S23";
                phone.batteryLevel = 100;
                phone.isTurnedOn = true;

                phone.batteryLevel = phone.batteryLevel - 35;
                if (phone.batteryLevel <= 0) {
                    phone.batteryLevel = 0;
                    phone.isTurnedOn = false;
                }
                System.out.println("Модель: " + phone.model);
                System.out.println("Заряд: " + phone.batteryLevel + "%");
                System.out.println("Увімкнений: " + phone.isTurnedOn);
            }
            case 7 -> {
                Point2D a = new Point2D();
                a.x = 0;
                a.y = 0;
                Point2D b = new Point2D();
                b.x = 3;
                b.y = 4;
                double distance = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
                System.out.println("Точка A: (" + a.x + "; " + a.y + ")");
                System.out.println("Точка B: (" + b.x + "; " + b.y + ")");
                System.out.printf("Відстань між точками: %.2f%n", distance);
            }
            case 8 -> {
                Student first = new Student();
                first.name = "Іван";
                Student second = first;
                second.name = "Петро";
                System.out.println("first.name = " + first.name);
                System.out.println("second.name = " + second.name);
                System.out.println("Це один і той самий об'єкт: " + (first == second));
            }

            case 9 -> {
                Greeter greeter = new Greeter();
                greeter.sayHello();
                greeter.sayHelloTo("Олена");
            }
            case 10 -> {
                Animal cat = new Animal();
                cat.species = "Кіт";
                cat.name = "Мурчик";

                Animal dog = new Animal();
                dog.species = "Пес";
                dog.name = "Рекс";

                cat.printInfo();
                cat.makeSound();
                dog.printInfo();
                dog.makeSound();
            }
            case 11 -> {
                Counter counter = new Counter();
                counter.increment();
                counter.increment();
                counter.increment();
                counter.printCount();
                counter.decrement();
                counter.printCount();
                counter.reset();
                counter.printCount();
            }
            case 12 -> {
                TrafficLight light = new TrafficLight();
                light.changeColor("Червоний");
                light.showSignal();
                light.changeColor("Жовтий");
                light.showSignal();
                light.changeColor("Зелений");
                light.showSignal();
            }
            case 13 -> {
                Player player = new Player();
                player.nickname = "Тінь";
                player.takeDamage(30);
                System.out.println("HP після шкоди: " + player.health);
                player.heal(50);
                System.out.println("HP після лікування: " + player.health);
                player.takeDamage(150);
                System.out.println("HP після смертельної шкоди: " + player.health);
            }
            case 14 -> {
                Lamp lamp = new Lamp();
                lamp.turnOn();
                lamp.status();
                lamp.toggle();
                lamp.status();
                lamp.toggle();
                lamp.status();
            }
            case 15 -> {
                Stopwatch watch = new Stopwatch();
                watch.tick();
                watch.addSeconds(124);
                System.out.println("Секунд: " + watch.seconds);
                System.out.print("Час: ");
                watch.displayTime();
            }
            case 16 -> {
                Printer printer = new Printer();
                printer.model = "HP LaserJet Pro";
                printer.paperCount = 10;
                printer.printDocument("Звіт", 6);
                printer.printDocument("Договір", 5);
            }

            case 17 -> {
                SimpleCalculator calc = new SimpleCalculator();
                System.out.println("15 + 4 = " + calc.add(15, 4));
                System.out.println("15 - 4 = " + calc.subtract(15, 4));
                System.out.println("15 * 4 = " + calc.multiply(15, 4));
                System.out.printf("15 / 4 = %.2f%n", calc.divide(15, 4));
                System.out.println("10 / 0 = " + calc.divide(10, 0));
            }
            case 18 -> {
                Circle circle = new Circle();
                circle.radius = 5.0;
                System.out.printf("Площа круга: %.2f%n", circle.getArea());
                System.out.printf("Довжина кола: %.2f%n", circle.getCircumference());
            }
            case 19 -> {
                TemperatureConverter converter = new TemperatureConverter();
                double fahrenheit = converter.celsiusToFahrenheit(25);
                System.out.printf("25°C = %.1f°F%n", fahrenheit);
                System.out.printf("%.1f°F = %.1f°C%n", fahrenheit, converter.fahrenheitToCelsius(fahrenheit));
            }
            case 20 -> {
                NumberChecker checker = new NumberChecker();
                int[] numbers = {7, 12, -5};
                for (int n : numbers) {
                    System.out.println("Число " + n + ": парне=" + checker.isEven(n)
                            + ", додатне=" + checker.isPositive(n) + ", просте=" + checker.isPrime(n));
                }
            }
            case 21 -> {
                CurrencyExchange exchange = new CurrencyExchange();
                System.out.printf("10000 грн = %.2f USD (курс %.2f)%n", exchange.toUSD(10000), exchange.usdRate);
                System.out.printf("100 USD = %.2f грн%n", exchange.toUAH(100));
            }
            case 22 -> {
                Employee employee = new Employee();
                employee.name = "Олена";
                employee.baseSalary = 30000;
                employee.bonusPercentage = 15;
                System.out.printf("Зарплата %s: %.2f грн%n", employee.name, employee.calculateTotalSalary());
                System.out.printf("Податок 19.5%%: %.2f грн%n", employee.calculateTax());
            }
            case 23 -> {
                TextFormatter formatter = new TextFormatter();
                System.out.println(formatter.formatTitle("java практика"));
                System.out.println("Голосних у слові \"Програмування\": " + formatter.countVowels("Програмування"));
            }
            case 24 -> {
                Triangle triangle = new Triangle();
                triangle.a = 3;
                triangle.b = 4;
                triangle.c = 5;
                System.out.println("Сторони 3, 4, 5 — трикутник існує: " + triangle.isValid());
                System.out.printf("Периметр: %.2f%n", triangle.getPerimeter());
                System.out.printf("Площа: %.2f%n", triangle.getArea());
            }

            case 25 -> {
                SecretVault vault = new SecretVault();
                System.out.println("Код \"Pass123\" правильний: " + vault.verifyCode("Pass123"));
                System.out.println("Код \"hacked\" правильний: " + vault.verifyCode("hacked"));
            }
            case 26 -> {
                UserAccount account = new UserAccount();
                account.setCredentials("denys", "qwerty");
                System.out.println("Вхід denys/qwerty: " + account.login("denys", "qwerty"));
                System.out.println("Вхід denys/123: " + account.login("denys", "123"));
                account.changePassword("wrong", "newpass");
                account.changePassword("qwerty", "newpass");
                System.out.println("Вхід denys/newpass: " + account.login("denys", "newpass"));
            }
            case 27 -> {
                BankAccount bankAccount = new BankAccount();
                bankAccount.deposit(500);
                System.out.println("Зняття 3000 грн: " + bankAccount.withdraw(3000));
                System.out.println("Зняття 200 грн: " + bankAccount.withdraw(200));
                System.out.printf("Залишок: %.2f грн%n", bankAccount.getBalance());
            }
            case 28 -> {
                Thermometer thermometer = new Thermometer();
                thermometer.setTemperature(36.6);
                System.out.println("Температура: " + thermometer.getTemperature());
                thermometer.setTemperature(-300);
                System.out.println("Температура після некоректного вводу: " + thermometer.getTemperature());
            }
            case 29 -> {
                CarSpeedometer speedometer = new CarSpeedometer();
                speedometer.accelerate(100);
                System.out.println("Швидкість: " + speedometer.getSpeed());
                speedometer.accelerate(200);
                System.out.println("Швидкість: " + speedometer.getSpeed());
                speedometer.brake(300);
                System.out.println("Швидкість: " + speedometer.getSpeed());
            }
            case 30 -> {
                Person first = new Person();
                first.setName("Ірина");
                first.setAge(25);

                Person second = new Person();
                second.setName("Олег");
                second.setAge(34);
                second.setAge(150);

                first.printSummary();
                second.printSummary();
            }
            case 31 -> {
                DiscountCard card = new DiscountCard();
                card.addPurchase(3000);
                card.printCardInfo();
                card.addPurchase(4000);
                card.printCardInfo();
            }
            case 32 -> {
                SmartDoorLock lock = new SmartDoorLock();
                lock.enterPin(1111);
                lock.enterPin(2222);
                lock.enterPin(3333);
                lock.enterPin(1234);
            }

            case 33 -> {
                GradeBook book = new GradeBook();
                book.setData("Денис", new int[]{85, 92, 78, 96, 65});
                System.out.printf("Середній бал: %.2f%n", book.getAverage());
                System.out.println("Найвища оцінка: " + book.getHighestGrade());
                System.out.println("Найнижча оцінка: " + book.getLowestGrade());
            }
            case 34 -> {
                ArrayStats stats = new ArrayStats();
                stats.setNumbers(new int[]{4, 7, 10, 13, 22, 9, 18, 5, 30, 11});
                System.out.println("Парних: " + stats.countEvens());
                System.out.println("Непарних: " + stats.countOdds());
                System.out.println("Сума: " + stats.calculateSum());
            }
            case 35 -> {
                ShoppingCart cart = new ShoppingCart();
                cart.addItem(250.50);
                cart.addItem(120.00);
                cart.addItem(899.99);
                cart.printCheck();
                cart.applyDiscount(15);
                cart.printCheck();
            }
            case 36 -> {
                TemperatureTracker tracker = new TemperatureTracker();
                tracker.setTemps(new double[]{-3.5, 0.0, 4.2, 7.8, 12.1, 9.4, 5.0});
                System.out.println("Днів тепліше за 5°C: " + tracker.countDaysAbove(5.0));
                tracker.printWeeklyReport();
            }
            case 37 -> {
                ArraySearcher searcher = new ArraySearcher();
                searcher.setData(new int[]{12, 45, 7, 45, 89});
                System.out.println("Масив містить 7: " + searcher.contains(7));
                System.out.println("Перший індекс числа 45: " + searcher.findIndex(45));
                System.out.println("Масив містить 100: " + searcher.contains(100));
                System.out.println("Індекс числа 100: " + searcher.findIndex(100));
            }
            case 38 -> {
                Vector3D vector = new Vector3D();
                vector.setCoords(2, 3, 6);
                vector.printVector();
                System.out.printf("Довжина: %.2f%n", vector.getMagnitude());
                vector.multiplyByScalar(2);
                System.out.print("Після множення на 2: ");
                vector.printVector();
            }
            case 39 -> {
                Matrix2D matrix = new Matrix2D();
                matrix.setGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
                matrix.printMatrix();
                System.out.println("Сума всіх елементів: " + matrix.getTotalSum());
                System.out.println("Сума другого рядка: " + matrix.getRowSum(1));
            }
            case 40 -> {
                MatrixDiagonals diagonals = new MatrixDiagonals();
                diagonals.setMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
                System.out.println("Сума головної діагоналі: " + diagonals.getMainDiagonalSum());
                System.out.println("Сума побічної діагоналі: " + diagonals.getAntiDiagonalSum());
                System.out.println("Діагоналі симетричні: " + diagonals.isDiagonalSymmetric());
            }

            default -> System.out.println("Завдання з таким номером немає (потрібно 1-40).");
        }

        scanner.close();
    }
}

class Student {
    public String name;
    public int age;
    public double gpa;
}

class Car {
    public String brand;
    public String model;
    public int year;
    public int speed;
}

class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isRead;
}

class Rectangle {
    public double width;
    public double height;
}

class Product {
    public String name;
    public double price;
    public int quantity;
}

class Smartphone {
    public String model;
    public int batteryLevel;
    public boolean isTurnedOn;
}

class Point2D {
    public double x;
    public double y;
}

class Greeter {

    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }
}

class Animal {
    public String species;
    public String name;

    public void makeSound() {
        System.out.println(name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Вид: " + species + ", кличка: " + name);
    }
}

class Counter {
    public int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Поточне значення лічильника: " + count);
    }
}

class TrafficLight {
    public String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if (currentColor.equals("Червоний")) {
            System.out.println(currentColor + ": Стій!");
        } else if (currentColor.equals("Жовтий")) {
            System.out.println(currentColor + ": Увага!");
        } else if (currentColor.equals("Зелений")) {
            System.out.println(currentColor + ": Їдь!");
        }
    }
}

class Player {
    public String nickname;
    public int health = 100;

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health = health + amount;
        if (health > 100) {
            health = 100;
        }
    }
}

class Lamp {
    public boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}

class Stopwatch {
    public int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds = seconds + s;
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int rest = seconds % 60;
        System.out.printf("%02d:%02d%n", minutes, rest);
    }
}

class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount < pages) {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
            return;
        }
        paperCount = paperCount - pages;
        System.out.println("Надруковано: " + title + " (" + pages + " стор.). Залишилось паперу: " + paperCount);
    }
}

class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Помилка: ділення на нуль!");
            return 0.0;
        }
        return (double) a / b;
    }
}

class Circle {
    public double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class TemperatureConverter {

    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }
}

class NumberChecker {

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class CurrencyExchange {
    public double usdRate = 41.5;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}

class Employee {
    public String name;
    public double baseSalary;
    public double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }
}

class TextFormatter {

    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        String vowels = "аоуеиіяюєїaeiou";
        String lower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vowels.indexOf(lower.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }
}

class Triangle {
    public double a;
    public double b;
    public double c;

    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) {
            return 0.0;
        }
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return attempt.equals(secretCode);
    }
}

class UserAccount {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        username = u;
        password = p;
    }

    public boolean login(String enteredUser, String enteredPass) {
        return username != null && username.equals(enteredUser) && password.equals(enteredPass);
    }

    public void changePassword(String oldPass, String newPass) {
        if (!password.equals(oldPass)) {
            System.out.println("Помилка: старий пароль вказано неправильно!");
            return;
        }
        password = newPass;
        System.out.println("Пароль успішно змінено.");
    }
}

class BankAccount {
    private String accountNumber = "UA1234567";
    private double balance = 1500.0;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: сума поповнення має бути більшою за 0!");
            return;
        }
        balance = balance + amount;
        System.out.printf("Рахунок %s поповнено на %.2f грн. Баланс: %.2f грн%n", accountNumber, amount, balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: сума зняття має бути більшою за 0!");
            return false;
        }
        if (amount > balance) {
            System.out.printf("Відмова: на рахунку %.2f грн, а потрібно %.2f грн%n", balance, amount);
            return false;
        }
        balance = balance - amount;
        System.out.printf("Знято %.2f грн. Залишок: %.2f грн%n", amount, balance);
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

class Thermometer {
    private double temperature = 20.0;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура не може бути нижчою за абсолютний нуль (-273.15°C)!");
            return;
        }
        temperature = t;
    }

    public double getTemperature() {
        return temperature;
    }
}

class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        speed = speed + delta;
        if (speed > 240) {
            speed = 240;
            System.out.println("Досягнуто максимальної швидкості 240 км/год");
        }
    }

    public void brake(int delta) {
        speed = speed - delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("Помилка: вік має бути в межах 0-120!");
            return;
        }
        this.age = age;
    }

    public void printSummary() {
        System.out.println("Особа: " + name + ", вік: " + age);
    }
}

class DiscountCard {
    private String ownerName = "Денис Коваль";
    private double totalSpent;
    private int discountPercent = 1;

    public void addPurchase(double cost) {
        if (cost <= 0) {
            System.out.println("Помилка: сума покупки має бути більшою за 0!");
            return;
        }
        totalSpent = totalSpent + cost;
        if (totalSpent >= 10000) {
            discountPercent = 10;
        } else if (totalSpent >= 5000) {
            discountPercent = 5;
        } else {
            discountPercent = 1;
        }
        System.out.printf("Покупка на %.2f грн додана. Всього витрачено: %.2f грн%n", cost, totalSpent);
    }

    public void printCardInfo() {
        System.out.println("Власник картки: " + ownerName);
        System.out.printf("Витрачено: %.2f грн%n", totalSpent);
        System.out.println("Поточна знижка: " + discountPercent + "%");
    }
}

class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;

    public void enterPin(int enteredPin) {
        if (failedAttempts >= 3) {
            System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            return;
        }
        if (enteredPin == pinCode) {
            isLocked = false;
            failedAttempts = 0;
            System.out.println("PIN вірний. Замок відчинено.");
        } else {
            failedAttempts++;
            System.out.println("Невірний PIN. Невдалих спроб: " + failedAttempts + " з 3");
            if (failedAttempts >= 3) {
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            }
        }
    }
}

class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }

    public double getAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / grades.length;
    }

    public int getHighestGrade() {
        if (grades == null || grades.length == 0) {
            return 0;
        }
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public int getLowestGrade() {
        if (grades == null || grades.length == 0) {
            return 0;
        }
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }
}

class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdds() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int calculateSum() {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}

class ShoppingCart {
    private final double[] itemPrices = new double[10];
    private int count;

    public void addItem(double price) {
        itemPrices[count] = price;
        count++;
        System.out.printf("Додано товар за %.2f грн%n", price);
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = total + itemPrices[i];
        }
        return total;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] = itemPrices[i] * (1 - percent / 100);
        }
        System.out.println("Застосовано знижку " + percent + "%");
    }

    public void printCheck() {
        System.out.println("------------- ЧЕК -------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("Товар %d: %.2f грн%n", i + 1, itemPrices[i]);
        }
        System.out.printf("Разом: %.2f грн%n", getTotalCost());
        System.out.println("-------------------------------");
    }
}

class TemperatureTracker {
    private double[] dailyTemps;

    public void setTemps(double[] temps) {
        dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
        int count = 0;
        for (double temp : dailyTemps) {
            if (temp > threshold) {
                count++;
            }
        }
        return count;
    }

    public void printWeeklyReport() {
        int warmest = 0;
        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.printf("День %d: %.1f°C%n", i + 1, dailyTemps[i]);
            if (dailyTemps[i] > dailyTemps[warmest]) {
                warmest = i;
            }
        }
        System.out.printf("Найтепліший день тижня: день %d (%.1f°C)%n", warmest + 1, dailyTemps[warmest]);
    }
}

class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        return findIndex(target) != -1;
    }

    public int findIndex(int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class Vector3D {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public double getMagnitude() {
        return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
    }

    public void multiplyByScalar(double scalar) {
        coords[0] = coords[0] * scalar;
        coords[1] = coords[1] * scalar;
        coords[2] = coords[2] * scalar;
    }

    public void printVector() {
        System.out.printf("(%.2f, %.2f, %.2f)%n", coords[0], coords[1], coords[2]);
    }
}

class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        for (int[] row : grid) {
            System.out.print("[ ");
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ]");
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (int[] row : grid) {
            for (int value : row) {
                sum = sum + value;
            }
        }
        return sum;
    }

    public int getRowSum(int rowIndex) {
        int sum = 0;
        for (int value : grid[rowIndex]) {
            sum = sum + value;
        }
        return sum;
    }
}

class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
        }
        return sum;
    }

    public int getAntiDiagonalSum() {
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            sum = sum + matrix[i][size - 1 - i];
        }
        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}
