package semester1.practice02.homework;

public class Practice02 {
    public static void main(String[] args) {

        int age=18;
        double height = 1.78;
        char firstLetter='S';
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);

        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 810000000000L;
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);

        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);

        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);

        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);

        int intVal = 250;
        double doubleVal = intVal;
        System.out.println("int: " + intVal);
        System.out.println("double: " + doubleVal);

        double priceWithPennies = 49.99;
        int roundedPrice = (int)priceWithPennies;
        System.out.println(roundedPrice);

        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(firstNumber + ", " + userWeight + ", " + userCity + ", " + isValidUser);

        String firstName = "Тарас";
        String lastName = "Шевченко";
        int personAge = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + personAge + " років.");

        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b);
        System.out.println("Сума з дужками: " + (a + b));

        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);

        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\nТовар: " + productName + "\nКількість: " + quantity + " шт.\nЦіна: " + pricePerUnit + " грн");

        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на: " + protocol + host + endpoint + "/" + userId);

        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);

        int n17 = 19;
        int remainder = n17 % 2;
        System.out.println("Число " + n17 + " при діленні на 2 дає остачу: " + remainder);

        int totalSeconds = 385;
        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + min + " хв " + sec + " сек");

        int n19 = 47;
        int tens = n19 / 10;
        int units = n19 % 10;
        System.out.println("Число: " + n19 + ". Десятки: " + tens + ", Одиниці: " + units + ". Сума цифр: " + (tens + units));

        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);

        int counter1 = 5;
        System.out.println(counter1++);
        System.out.println(counter1);

        int counter2 = 5;
        System.out.println(++counter2);

        int g1 = 4;
        int g2 = 5;
        int g3 = 4;
        double avg = (g1 + g2 + g3) / 3.0;
        System.out.println("Середній бал: " + avg);

        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");

        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);

        int x = 15, y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));

        int speed = 75;
        boolean isSafeSpeed = speed>=20 && speed<=80;
        System.out.println(isSafeSpeed);

        int pAge = 70;
        boolean hasFreePass = pAge < 7 || pAge >= 65;
        System.out.println("Вік: " + pAge + ". Право на безкоштовний проїзд: " + hasFreePass);

        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);

        int num30 = 30;
        boolean isDivisibleByBoth = num30 % 3 == 0 && num30 % 5 == 0;
        System.out.println(isDivisibleByBoth);

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println(canLogin);

        int yr = 2024;
        boolean isLeapYear = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0);
        System.out.println(isLeapYear);

        double sideA = 3.0;
        double sideB = 4.0;
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        System.out.println("Катети: " + sideA + " та " + sideB + ". Гіпотенуза: " + hypotenuse);

        double r = 5.0;
        System.out.println("Радіус: " + r);
        System.out.println("Довжина кола: " + (2 * Math.PI * r));
        System.out.println("Площа круга: " + (Math.PI * r * r));

        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println(Math.abs(dayTemp - nightTemp));
        System.out.println(Math.max(dayTemp, nightTemp));
        System.out.println(Math.min(dayTemp, nightTemp));

        double num36 = 5.67;
        double negNum36 = -5.67;
        System.out.println(Math.round(num36));
        System.out.println(Math.ceil(num36));
        System.out.println(Math.floor(num36));
        System.out.println(Math.round(negNum36));
        System.out.println(Math.ceil(negNum36));
        System.out.println(Math.floor(negNum36));

        double coefA = 1.0, coefB = -7.0, coefC = 10.0;
        double d = coefB * coefB - 4 * coefA * coefC;
        double x1 = (-coefB + Math.sqrt(d)) / (2 * coefA);
        double x2 = (-coefB - Math.sqrt(d)) / (2 * coefA);
        System.out.println("Дискримінант D=" + d);
        System.out.println("Корінь x1=" + x1);
        System.out.println("Корінь x2=" + x2);

        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);

        int minTemp = -10;
        int maxTemp = 35;
        int randomTemp = (int)(Math.random() * (maxTemp - minTemp + 1)) + minTemp;
        System.out.println("Погода на завтра: " + randomTemp + "°C");

        double p = 10000.0;
        double rate = 12.0;
        int period = 3;
        double s = p * Math.pow(1 + rate / 100, period);

        System.out.println("+------------------------------------+");
        System.out.println("|      ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР        |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + p + " грн");
        System.out.println("Термін: " + period + " роки під " + rate + "% річних");
        System.out.println("Підсумкова сума: " + Math.round(s * 100.0) / 100.0 + " грн");
        System.out.println("Чистий прибуток: " + Math.round((s - p) * 100.0) / 100.0 + " грн");
        System.out.println("+------------------------------------+");







        System.out.println("Демид Дмитрович, я старався робити сам але трохи підправив рядки коду щоб його можна було прочитати, дякую за увагу");









































    }
}









