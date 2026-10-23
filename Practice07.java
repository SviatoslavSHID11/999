package semester1.practice07.homework;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання (1-40): ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1 -> {
                Book first = new Book();
                Book second = new Book("Кобзар", "Тарас Шевченко", 1840, 250.0);
                first.printInfo();
                second.printInfo();
            }
            case 2 -> {
                Student good = new Student("Денис", 19, 4.75);
                Student bad = new Student("Тест", 120, 7.5);
                good.printStudent();
                bad.printStudent();
            }
            case 3 -> {
                BankAccount account = new BankAccount("UA123456", "Іван Петренко", 1000.0);
                account.deposit(500.0);
                System.out.println("Зняття 2000 грн: " + account.withdraw(2000.0));
                account.printAccount();
            }
            case 4 -> {
                Point2D origin = new Point2D();
                Point2D point = new Point2D(3.0, 4.0);
                origin.printPoint();
                point.printPoint();
                System.out.printf("Відстань до початку координат: %.2f%n", point.distanceToOrigin());
                System.out.printf("Відстань до (0; 0): %.2f%n", point.distanceTo(0.0, 0.0));
            }
            case 5 -> {
                Product product = new Product("Монітор", 6500.0, 8, "Електроніка");
                product.printProduct();
                product.applyDiscount(20);
                product.printProduct();
            }
            case 6 -> {
                Time time = new Time(23, 59, 58);
                System.out.println(time.toUniversalString());
                System.out.println(time.toStandardString());
                time.tick();
                time.tick();
                System.out.println(time.toUniversalString());
                System.out.println(time.toStandardString());
            }
            case 7 -> {
                Rectangle unit = new Rectangle();
                Rectangle square = new Rectangle(4.0);
                Rectangle rect = new Rectangle(3.0, 5.0);
                System.out.printf("1x1: площа %.2f, периметр %.2f, квадрат %b%n",
                        unit.getArea(), unit.getPerimeter(), unit.isSquare());
                System.out.printf("4x4: площа %.2f, периметр %.2f, квадрат %b%n",
                        square.getArea(), square.getPerimeter(), square.isSquare());
                System.out.printf("3x5: площа %.2f, периметр %.2f, квадрат %b%n",
                        rect.getArea(), rect.getPerimeter(), rect.isSquare());
            }
            case 8 -> {
                Employee employee = new Employee(7, "Олена Коваль", "QA Engineer", 30000.0);
                employee.printBadge();
                employee.raiseSalary(15);
                employee.printBadge();
                System.out.printf("Річний дохід: %.2f грн%n", employee.getAnnualSalary());
            }
            case 9 -> {
                User full = new User("denys", "denys@mail.com", "ADMIN", true);
                User twoArgs = new User("olena", "olena@mail.com");
                User oneArg = new User("taras");
                User empty = new User();
                full.printProfile();
                twoArgs.printProfile();
                oneArg.printProfile();
                empty.printProfile();
            }
            case 10 -> {
                Fraction fraction = new Fraction(8, 12);
                Fraction whole = new Fraction(5);
                Fraction zero = new Fraction();
                fraction.print();
                whole.print();
                zero.print();
                System.out.printf("8/12 = %.4f%n", fraction.toDouble());
            }
            case 11 -> {
                Car car = new Car();
                car.drive(150);
                car.startEngine();
                car.drive(150);
                System.out.printf("%s %s, %d р., пробіг %.1f км%n", car.brand, car.model, car.year, car.mileage);
            }
            case 12 -> {
                SmartBulb first = new SmartBulb();
                SmartBulb second = new SmartBulb(80);
                SmartBulb third = new SmartBulb(150, 9000, false);
                first.printStatus();
                second.printStatus();
                third.printStatus();
            }
            case 13 -> {
                String sql = new QueryBuilder("users")
                        .select("id, name, email")
                        .where("age >= 18")
                        .build();
                System.out.println(sql);
            }
            case 14 -> {
                CoffeeOrder latte = new CoffeeOrder("Лате");
                CoffeeOrder espresso = new CoffeeOrder("Еспресо", "Small");
                CoffeeOrder cappuccino = new CoffeeOrder("Капучино", "Large", 2, true);
                latte.printReceipt();
                espresso.printReceipt();
                cappuccino.printReceipt();
            }
            case 15 -> {
                Box cube = new Box(2.0, "Картон");
                Box copy = new Box(cube);
                cube.printBox();
                copy.printBox();
                System.out.printf("Об'єми рівні: %b%n", cube.getVolume() == copy.getVolume());
            }
            case 16 -> {
                FlightTicket ticket = new FlightTicket("T-001", "Іван Петренко", "PS101", "Київ", "Львів");
                ticket.assignSeat("12A");
                ticket.printBoardingPass();
            }
            case 17 -> {
                MathOperations ops = new MathOperations();
                System.out.println(ops.add(2, 3));
                System.out.println(ops.add(2.5, 3.5));
                System.out.println(ops.add(1, 2, 3));
                System.out.println(ops.add("Java", "практика"));
                System.out.println(ops.multiply(4, 5));
                System.out.println(ops.multiply(2.5, 4.0));
                System.out.println(ops.multiply("ab", 3));
            }
            case 18 -> {
                DocumentPrinter printer = new DocumentPrinter();
                printer.print("Звіт готовий");
                printer.print(42);
                printer.print(3.14159, 2);
                printer.print(new String[]{"Перший рядок", "Другий рядок"});
                printer.print("увага", true);
            }
            case 19 -> {
                AreaCalculator sizes = new AreaCalculator();
                System.out.printf("Квадрат 5: %.2f%n", sizes.calculateArea(5.0));
                System.out.printf("Прямокутник 4x6: %.2f%n", sizes.calculateArea(4.0, 6.0));
                System.out.printf("Коло r=3: %.2f%n", sizes.calculateArea(3.0, true));
                System.out.printf("Трикутник 3,4,5: %.2f%n", sizes.calculateArea(3.0, 4.0, 5.0));
                System.out.printf("Трапеція 4,6,h=5: %.2f%n", sizes.calculateArea(4.0, 6.0, 5.0, true));
            }
            case 20 -> {
                Logger logger = new Logger();
                logger.log("Сервіс запущено");
                logger.log("WARN", "Мало пам'яті");
                logger.log("ERROR", 500, "Внутрішня помилка");
                logger.log("DEBUG", "Крок виконано", true);
            }
            case 21 -> {
                ArraySearcher searcher = new ArraySearcher();
                int[] numbers = {5, 10, 15, 20, 15};
                System.out.println(searcher.find(numbers, 15));
                System.out.println(searcher.find(numbers, 15, 3));
                String[] words = {"Java", "C", "Python"};
                System.out.println(searcher.find(words, "Python"));
                System.out.println(searcher.find(words, "python", true));
            }
            case 22 -> {
                DateService date = new DateService(15, 3, 2024);
                date.printDate();
                date.add(20);
                date.printDate();
                date.add(0, 3);
                date.printDate();
            }
            case 23 -> {
                SalaryCalculator salary = new SalaryCalculator();
                System.out.printf("%.2f%n", salary.calculate(30000.0));
                System.out.printf("%.2f%n", salary.calculate(30000.0, 5000.0));
                System.out.printf("%.2f%n", salary.calculate(30000.0, 15.0, true));
                System.out.printf("%.2f%n", salary.calculate(30000.0, 10, 250.0));
            }
            case 24 -> {
                ArrayFilter filter = new ArrayFilter();
                int[] data = {12, 5, 8, 19, 24, 3, 16};
                System.out.println(Arrays.toString(filter.filter(data, 10)));
                System.out.println(Arrays.toString(filter.filter(data, 5, 19)));
                System.out.println(Arrays.toString(filter.filter(data, true)));
                System.out.println(Arrays.toString(filter.filter(data, false)));
            }
            case 25 -> {
                UserAccount first = new UserAccount("denys", "denys@mail.com");
                UserAccount second = new UserAccount("olena", "olena@mail.com");
                UserAccount third = new UserAccount("taras", "taras@mail.com");
                System.out.println(first.getId());
                System.out.println(second.getId());
                System.out.println(third.getId());
                System.out.println("Наступний ID: " + UserAccount.getNextAvailableId());
            }
            case 26 -> {
                for (int i = 1; i <= 6; i++) {
                    System.out.println("Підключення " + i + ": " + ServerConfig.connect());
                }
                ServerConfig.printServerStatus();
            }
            case 27 -> {
                System.out.println(MathUtils.factorial(5));
                System.out.printf("%.4f%n", MathUtils.power(2, -2));
                System.out.println(MathUtils.gcd(48, 18));
                System.out.println(MathUtils.clamp(150, 0, 100));
                System.out.printf("PI = %.4f, E = %.4f%n", MathUtils.PI, MathUtils.E);
            }
            case 28 -> {
                System.out.printf("%.2f USD за 4150 грн%n", CurrencyExchange.uahToUsd(4150));
                System.out.printf("%.2f грн за 100 USD%n", CurrencyExchange.usdToUah(100));
                CurrencyExchange.updateRates(42.0, 46.0);
                System.out.printf("%.2f USD за 4200 грн після зміни курсу%n", CurrencyExchange.uahToUsd(4200));
            }
            case 29 -> {
                FleetCar first = new FleetCar("VIN1", 10000.0);
                FleetCar second = new FleetCar("VIN2", 20000.0);
                FleetCar third = new FleetCar("VIN3", 5000.0);
                first.addTrip(500.0);
                second.addTrip(300.0);
                third.addTrip(1200.0);
                FleetCar.printFleetSummary();
            }
            case 30 -> {
                System.out.println(StringUtils.isPalindrome("А роза упала на лапу Азора"));
                System.out.println(StringUtils.reverse("Java"));
                System.out.println(StringUtils.countVowels("Програмування"));
                System.out.println(StringUtils.maskCardNumber("1234567812345678"));
            }
            case 31 -> {
                GameSession first = GameSession.createSession("Іван");
                GameSession second = GameSession.createSession("Марія");
                GameSession third = GameSession.createSession("Олег");
                GameSession fourth = GameSession.createSession("Тарас");
                System.out.println(first.sessionToken + " " + third.sessionToken);
                System.out.println("Четверта сесія: " + fourth);
            }
            case 32 -> {
                System.out.printf("E = %.4e%n", PhysicsEngine.restEnergy(0.001));
                System.out.printf("h = %.2f м%n", PhysicsEngine.freeFallDistance(5));
            }
            case 33 -> {
                LineSegment segment = new LineSegment(0.0, 0.0, 3.0, 4.0);
                segment.printSegment();
                Point middle = segment.getMidPoint();
                System.out.printf("Середина: (%.1f; %.1f)%n", middle.getX(), middle.getY());
            }
            case 34 -> {
                ClientAccount ivan = new ClientAccount("UA1", "Іван", 10000.0);
                ClientAccount maria = new ClientAccount("UA2", "Марія", 2000.0);
                System.out.println("Переказ 3500 грн: " + ivan.transferTo(maria, 3500.0));
                ivan.printAccount();
                maria.printAccount();
            }
            case 35 -> {
                Engine engine = new Engine("E-7781", 150);
                CarWithEngine car = new CarWithEngine("Toyota", "Camry", engine);
                car.startCar();
                car.printSpecs();
                car.turnOff();
                car.printSpecs();
            }
            case 36 -> {
                Processor cpu = new Processor("Intel i7-12700", 3.6, 400.0);
                Memory ram = new Memory(16, 3200, 80.0);
                Computer pc = new Computer("Gaming PC", cpu, ram, 50.0);
                pc.printSpecs();
                pc.upgradeMemory(new Memory(32, 3600, 160.0));
                pc.printSpecs();
            }
            case 37 -> {
                Hero knight = new Hero("Лицар", 100, 25, 10);
                Hero orc = new Hero("Орк", 120, 20, 15);
                while (knight.isAlive() && orc.isAlive()) {
                    knight.attack(orc);
                    if (orc.isAlive()) {
                        orc.attack(knight);
                    }
                }
                System.out.println(knight.isAlive() ? "Переміг Лицар" : "Переміг Орк");
            }
            case 38 -> {
                Customer rich = new Customer("Олег", 500.0);
                Order firstOrder = new Order(rich, 5);
                firstOrder.addProduct(new ShopProduct(1, "Клавіатура", 300.0));
                firstOrder.addProduct(new ShopProduct(2, "Мишка", 150.0));
                System.out.println("Оплата: " + firstOrder.checkout());

                Customer poor = new Customer("Ірина", 100.0);
                Order secondOrder = new Order(poor, 5);
                secondOrder.addProduct(new ShopProduct(3, "Монітор", 5000.0));
                System.out.println("Оплата: " + secondOrder.checkout());
            }
            case 39 -> {
                Vector3D a = new Vector3D(1, 0, 0);
                Vector3D b = new Vector3D(0, 1, 0);
                Vector3D sum = a.add(b);
                sum.printVector();
                System.out.println(a.dotProduct(b));
                System.out.println(a.isOrthogonalTo(b));
                Vector3D cross = a.crossProduct(b);
                cross.printVector();
                System.out.println(a.isEqualTo(new Vector3D(1, 0, 0)));
            }
            case 40 -> {
                LibraryCatalog catalog = new LibraryCatalog(5);
                catalog.addBook(new BookItem("111", "Кобзар", "Тарас Шевченко"));
                catalog.addBook(new BookItem("222", "Місто", "Валер'ян Підмогильний"));
                catalog.addBook(new BookItem("333", "Тигролови", "Іван Багряний"));
                System.out.println("Видача Кобзаря: " + catalog.borrowBook("Кобзар"));
                System.out.println("Повторна видача: " + catalog.borrowBook("Кобзар"));
                catalog.printCatalog();
            }
            default -> System.out.println("Завдання з таким номером немає (потрібно 1-40).");
        }

        scanner.close();
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
        title = "Невідомо";
        author = "Невідомий";
        year = 2000;
        price = 0.0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = (year < 0) ? 2000 : year;
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public void printInfo() {
        System.out.printf("%s — %s, %d р., %.2f грн%n", title, author, year, price);
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = (age < 15 || age > 80) ? 18 : age;
        this.gpa = (gpa < 0.0 || gpa > 5.0) ? 0.0 : gpa;
    }

    public boolean isHonorStudent() {
        return gpa >= 4.5;
    }

    public void printStudent() {
        System.out.printf("%s, вік %d, середній бал %.2f — %s%n",
                name, age, gpa, isHonorStudent() ? "Відмінник" : "Звичайний студент");
    }
}

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = (initialBalance < 0) ? 0.0 : initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance = balance - amount;
        return true;
    }

    public void printAccount() {
        System.out.printf("Рахунок %s (%s): %.2f грн%n", accountNumber, ownerName, balance);
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0.0, 0.0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double targetX, double targetY) {
        return Math.sqrt(Math.pow(x - targetX, 2) + Math.pow(y - targetY, 2));
    }

    public void printPoint() {
        System.out.printf("Point(%.1f; %.1f)%n", x, y);
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = (price < 0) ? 0.0 : price;
        this.quantity = (quantity < 0) ? 0 : quantity;
        this.category = category;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        price = price * (1 - percent / 100);
    }

    public void printProduct() {
        System.out.printf("%s (%s): %.2f грн x %d = %.2f грн%n", name, category, price, quantity, getTotalValue());
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : 0;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toStandardString() {
        int hour12 = hours % 12;
        if (hour12 == 0) {
            hour12 = 12;
        }
        String period = (hours < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", hour12, minutes, seconds, period);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double size) {
        this(size, size);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}

class Employee {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id, String fullName, String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public void raiseSalary(double percent) {
        monthlySalary = monthlySalary * (1 + percent / 100);
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public void printBadge() {
        System.out.printf("#%d %s — %s, %.2f грн/міс%n", id, fullName, position, monthlySalary);
    }
}

class User {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login, String email, String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public User(String login, String email) {
        this(login, email, "USER", true);
    }

    public User(String login) {
        this(login, login + "@domain.com");
    }

    public User() {
        this("guest");
    }

    public void printProfile() {
        System.out.printf("%s (%s), роль %s, активний: %b%n", login, email, role, isActive);
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            denominator = 1;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int divisor = gcd(Math.abs(numerator), denominator);
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;
    }

    public Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }
}

class Car {
    String brand;
    String model;
    int year;
    double mileage;
    boolean engineStarted;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Car() {
        this("Unknown", "Standard", 2024);
    }

    public void startEngine() {
        engineStarted = true;
    }

    public void stopEngine() {
        engineStarted = false;
    }

    public void drive(double distance) {
        if (engineStarted) {
            mileage = mileage + distance;
        } else {
            System.out.println("Спершу заведіть двигун!");
        }
    }
}

class SmartBulb {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness, int colorTemp, boolean isOn) {
        this.brightness = (brightness < 0) ? 0 : Math.min(brightness, 100);
        this.colorTemp = (colorTemp < 2700) ? 2700 : Math.min(colorTemp, 6500);
        this.isOn = isOn;
    }

    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }

    public SmartBulb() {
        this(50);
    }

    public void printStatus() {
        System.out.printf("Яскравість %d%%, температура %d K, увімкнена: %b%n", brightness, colorTemp, isOn);
    }
}

class QueryBuilder {
    private String table;
    private String fields = "*";
    private String whereClause = "";

    public QueryBuilder(String table) {
        this.table = table;
    }

    public QueryBuilder select(String fields) {
        this.fields = fields;
        return this;
    }

    public QueryBuilder where(String condition) {
        this.whereClause = condition;
        return this;
    }

    public String build() {
        return "SELECT " + fields + " FROM " + table
                + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
    }
}

class CoffeeOrder {
    String type;
    String size;
    int sugarCount;
    boolean withSyrup;
    double finalPrice;

    public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
        this.finalPrice = calculatePrice();
    }

    public CoffeeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {
        double base = switch (type) {
            case "Еспресо" -> 40;
            case "Капучино" -> 55;
            default -> 60;
        };
        double factor = switch (size) {
            case "Small" -> 1.0;
            case "Large" -> 1.6;
            default -> 1.3;
        };
        double price = base * factor;
        if (withSyrup) {
            price = price + 15;
        }
        return price;
    }

    public void printReceipt() {
        System.out.printf("%s, %s, цукор: %d, сироп: %b — %.2f грн%n",
                type, size, sugarCount, withSyrup, finalPrice);
    }
}

class Box {
    private double width;
    private double height;
    private double depth;
    private String material;

    public Box(double width, double height, double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public Box(double size, String material) {
        this(size, size, size, material);
    }

    public Box(Box other) {
        this(other.width, other.height, other.depth, other.material);
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public void printBox() {
        System.out.printf("Коробка %.1fx%.1fx%.1f (%s), об'єм %.2f, площа %.2f%n",
                width, height, depth, material, getVolume(), getSurfaceArea());
    }
}

class FlightTicket {
    String ticketNumber;
    String passengerName;
    String flightNumber;
    String departureCity;
    String arrivalCity;
    String seatNumber;
    boolean hasBaggage;

    public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                        String arrivalCity, String seatNumber, boolean hasBaggage) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }

    public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                        String arrivalCity) {
        this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
    }

    public void assignSeat(String seat) {
        this.seatNumber = seat;
    }

    public void printBoardingPass() {
        System.out.printf("%s %s: %s -> %s, рейс %s, місце %s, багаж: %b%n",
                ticketNumber, passengerName, departureCity, arrivalCity, flightNumber, seatNumber, hasBaggage);
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String text, int times) {
        return text.repeat(times);
    }
}

class DocumentPrinter {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println("[INT]: " + number);
    }

    public void print(double number, int decimals) {
        System.out.println(String.format("%." + decimals + "f", number));
    }

    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }
    }

    public void print(String message, boolean uppercase) {
        System.out.println(uppercase ? message.toUpperCase() : message);
    }
}

class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculateArea(double radius, boolean isCircle) {
        return isCircle ? Math.PI * radius * radius : 0.0;
    }

    public double calculateArea(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double calculateArea(double base1, double base2, double height, boolean isTrapezoid) {
        return (base1 + base2) / 2 * height;
    }
}

class Logger {
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    public void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }

    public void log(String level, int errorCode, String message) {
        System.out.println("[" + level + "] (Code: " + errorCode + "): " + message);
    }

    public void log(String tag, String message, boolean timestamp) {
        if (timestamp) {
            System.out.println("[" + System.currentTimeMillis() + "] [" + tag + "] " + message);
        } else {
            System.out.println("[" + tag + "] " + message);
        }
    }
}

class ArraySearcher {
    public int find(int[] arr, int target) {
        return find(arr, target, 0);
    }

    public int find(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target) {
        return find(arr, target, false);
    }

    public int find(String[] arr, String target, boolean ignoreCase) {
        for (int i = 0; i < arr.length; i++) {
            boolean match = ignoreCase ? arr[i].equalsIgnoreCase(target) : arr[i].equals(target);
            if (match) {
                return i;
            }
        }
        return -1;
    }
}

class DateService {
    int day;
    int month;
    int year;

    public DateService(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void add(int days) {
        day = day + days;
        while (day > 30) {
            day = day - 30;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void add(int days, int months) {
        add(days);
        month = month + months;
        while (month > 12) {
            month = month - 12;
            year++;
        }
    }

    public void add(int days, int months, int years) {
        add(days, months);
        year = year + years;
    }

    public void printDate() {
        System.out.printf("%02d.%02d.%04d%n", day, month, year);
    }
}

class SalaryCalculator {
    public double calculate(double baseRate) {
        return baseRate;
    }

    public double calculate(double baseRate, double fixedBonus) {
        return baseRate + fixedBonus;
    }

    public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
        double gross = baseRate * (1 + bonusPercent / 100);
        return isTaxDeducted ? gross * 0.805 : gross;
    }

    public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
        return baseRate + overtimeHours * overtimeHourlyRate;
    }
}

class ArrayFilter {
    public int[] filter(int[] arr, int threshold) {
        int count = 0;
        for (int value : arr) {
            if (value > threshold) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value > threshold) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }

    public int[] filter(int[] arr, int min, int max) {
        int count = 0;
        for (int value : arr) {
            if (value >= min && value <= max) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value >= min && value <= max) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }

    public int[] filter(int[] arr, boolean keepEvens) {
        int count = 0;
        for (int value : arr) {
            if ((value % 2 == 0) == keepEvens) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if ((value % 2 == 0) == keepEvens) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }
}

class UserAccount {
    private int id;
    private String username;
    private String email;
    private static int nextId = 1001;

    public UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
        this.id = nextId++;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {
        nextId = startId;
    }

    public int getId() {
        return id;
    }
}

class ServerConfig {
    public static final String SERVER_NAME = "AlphaEnterprise";
    public static final int MAX_CONNECTIONS = 5;
    private static int activeConnections = 0;

    public static boolean connect() {
        if (activeConnections < MAX_CONNECTIONS) {
            activeConnections++;
            return true;
        }
        return false;
    }

    public static void disconnect() {
        activeConnections--;
        if (activeConnections < 0) {
            activeConnections = 0;
        }
    }

    public static void printServerStatus() {
        System.out.printf("%s: підключень %d з %d, вільних слотів %d%n",
                SERVER_NAME, activeConnections, MAX_CONNECTIONS, MAX_CONNECTIONS - activeConnections);
    }
}

class MathUtils {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private MathUtils() {
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static double power(double base, int exp) {
        return Math.pow(base, exp);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int clamp(int val, int min, int max) {
        if (val < min) {
            return min;
        }
        if (val > max) {
            return max;
        }
        return val;
    }
}

class CurrencyExchange {
    private static double usdToUahRate = 41.5;
    private static double eurToUahRate = 45.2;

    public static void updateRates(double newUsd, double newEur) {
        if (newUsd > 0) {
            usdToUahRate = newUsd;
        }
        if (newEur > 0) {
            eurToUahRate = newEur;
        }
    }

    public static double uahToUsd(double uah) {
        return uah / usdToUahRate;
    }

    public static double usdToUah(double usd) {
        return usd * usdToUahRate;
    }

    public static double eurToUah(double eur) {
        return eur * eurToUahRate;
    }
}

class FleetCar {
    private String vinCode;
    private double currentMileage;
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    public FleetCar(String vinCode, double initialMileage) {
        this.vinCode = vinCode;
        this.currentMileage = initialMileage;
        totalCars++;
        totalCompanyMileage = totalCompanyMileage + initialMileage;
    }

    public void addTrip(double km) {
        currentMileage = currentMileage + km;
        totalCompanyMileage = totalCompanyMileage + km;
    }

    public static void printFleetSummary() {
        System.out.printf("Авто в парку: %d, загальний пробіг: %.1f км%n", totalCars, totalCompanyMileage);
    }
}

class StringUtils {
    private StringUtils() {
    }

    public static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-zа-яіїєґ]", "");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int countVowels(String s) {
        String vowels = "аоуеиіяюєїaeiou";
        String lower = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vowels.indexOf(lower.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static String maskCardNumber(String cardNumber) {
        String digits = cardNumber.replaceAll("\\D", "");
        String masked = "*".repeat(digits.length() - 4) + digits.substring(digits.length() - 4);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < masked.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                result.append(' ');
            }
            result.append(masked.charAt(i));
        }
        return result.toString();
    }
}

class GameSession {
    String sessionToken;
    String hostPlayer;
    boolean isActive;
    private static int activeSessionsCount = 0;
    public static final int MAX_SESSIONS = 3;

    private GameSession(String host) {
        this.hostPlayer = host;
        this.isActive = true;
        this.sessionToken = "SESS-" + activeSessionsCount;
    }

    public static GameSession createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new GameSession(host);
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            activeSessionsCount--;
        }
    }
}

class PhysicsEngine {
    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    private PhysicsEngine() {
    }

    public static double freeFallDistance(double seconds) {
        return G * seconds * seconds / 2;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        return massKg * velocityMs * velocityMs / 2;
    }

    public static double restEnergy(double massKg) {
        return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point getMidPoint() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    public void printSegment() {
        System.out.printf("Відрізок (%.1f; %.1f) - (%.1f; %.1f), довжина %.2f%n",
                start.getX(), start.getY(), end.getX(), end.getY(), getLength());
    }
}

class ClientAccount {
    String iban;
    String owner;
    double balance;

    public ClientAccount(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean transferTo(ClientAccount recipient, double amount) {
        if (recipient == null || recipient == this) {
            return false;
        }
        if (amount <= 0 || balance < amount) {
            return false;
        }
        balance = balance - amount;
        recipient.balance = recipient.balance + amount;
        return true;
    }

    public void printAccount() {
        System.out.printf("%s (%s): %.2f грн%n", iban, owner, balance);
    }
}

class Engine {
    String serialNumber;
    int horsePower;
    boolean isRunning;

    public Engine(String serialNumber, int horsePower) {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

class CarWithEngine {
    String brand;
    String model;
    Engine engine;

    public CarWithEngine(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println(brand + " готовий до руху!");
    }

    public void turnOff() {
        engine.stop();
    }

    public void printSpecs() {
        System.out.printf("%s %s, двигун %s, %d к.с., працює: %b%n",
                brand, model, engine.serialNumber, engine.horsePower, engine.isRunning());
    }
}

class Processor {
    String model;
    double frequencyGHz;
    double price;

    public Processor(String model, double frequencyGHz, double price) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Memory {
    int sizeGB;
    int frequencyMHz;
    double price;

    public Memory(int sizeGB, int frequencyMHz, double price) {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Computer {
    String title;
    Processor cpu;
    Memory ram;
    double casePrice;

    public Computer(String title, Processor cpu, Memory ram, double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {
        return cpu.getPrice() + ram.getPrice() + casePrice;
    }

    public void upgradeMemory(Memory newRam) {
        ram = newRam;
        System.out.printf("Пам'ять замінено на %d GB%n", newRam.sizeGB);
    }

    public void printSpecs() {
        System.out.printf("%s: %s %.1f GHz, %d GB %d MHz, ціна %.2f грн%n",
                title, cpu.model, cpu.frequencyGHz, ram.sizeGB, ram.frequencyMHz, calculateTotalPrice());
    }
}

class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(Hero target) {
        int damage = attackPower - target.defense;
        if (damage <= 0) {
            damage = 1;
        }
        target.health = target.health - damage;
        if (target.health < 0) {
            target.health = 0;
        }
        System.out.printf("%s б'є %s на %d шкоди, у %s залишилось %d HP%n",
                name, target.name, damage, target.name, target.health);
    }

    public boolean isAlive() {
        return health > 0;
    }
}

class ShopProduct {
    int id;
    String title;
    double price;

    public ShopProduct(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}

class Customer {
    String name;
    double walletBalance;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean pay(double amount) {
        if (walletBalance < amount) {
            return false;
        }
        walletBalance = walletBalance - amount;
        return true;
    }
}

class Order {
    Customer customer;
    ShopProduct[] items;
    int itemCount;

    public Order(Customer customer, int maxItems) {
        this.customer = customer;
        this.items = new ShopProduct[maxItems];
    }

    public void addProduct(ShopProduct p) {
        items[itemCount] = p;
        itemCount++;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total = total + items[i].price;
        }
        return total;
    }

    public boolean checkout() {
        double total = calculateTotal();
        if (customer.pay(total)) {
            System.out.printf("Чек для %s: %.2f грн, позицій %d%n", customer.name, total, itemCount);
            return true;
        }
        System.out.println("Недостатньо коштів для оплати");
        return false;
    }
}

class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D(y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x);
    }

    public boolean isOrthogonalTo(Vector3D other) {
        return dotProduct(other) == 0;
    }

    public boolean isEqualTo(Vector3D other) {
        return x == other.x && y == other.y && z == other.z;
    }

    public void printVector() {
        System.out.printf("(%.1f; %.1f; %.1f)%n", x, y, z);
    }
}

class BookItem {
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    public BookItem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void printBook() {
        System.out.printf("%s — %s (ISBN %s), доступна: %b%n", title, author, isbn, isAvailable);
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

class LibraryCatalog {
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity) {
        books = new BookItem[capacity];
    }

    public void addBook(BookItem book) {
        books[size] = book;
        size++;
    }

    public BookItem findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String title) {
        BookItem book = findBookByTitle(title);
        if (book == null || !book.isAvailable()) {
            return false;
        }
        book.borrowBook();
        return true;
    }

    public void printCatalog() {
        for (int i = 0; i < size; i++) {
            books[i].printBook();
        }
    }
}
