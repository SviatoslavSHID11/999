package semester1.practice06.homework;

public class Task1Fraction {
    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Fraction first = new Fraction();
        first.setValues(8, 12);
        System.out.print("Дріб 1: ");
        first.printFraction();

        first.simplify();
        System.out.printf("Після скорочення: %d/%d (десятковий вигляд: %.4f)%n",
                first.getNumerator(), first.getDenominator(), first.toDecimal());

        Fraction second = new Fraction();
        second.setValues(3, 4);

        int a = first.getNumerator();
        int b = first.getDenominator();
        int c = second.getNumerator();
        int d = second.getDenominator();

        System.out.println();
        System.out.println("Додаємо дріб 3/4 до 2/3...");
        first.add(c, d);
        System.out.printf("Формула: %d/%d + %d/%d = (%d*%d + %d*%d) / (%d*%d) = %d/%d%n",
                a, b, c, d, a, d, c, b, b, d, first.getNumerator(), first.getDenominator());
        System.out.printf("Результат додавання: %d/%d (десятковий вигляд: %.4f)%n",
                first.getNumerator(), first.getDenominator(), first.toDecimal());
        System.out.println("=====================================");
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            numerator = num;
            denominator = 1;
            return;
        }
        if (den < 0) {
            numerator = -num;
            denominator = -den;
        } else {
            numerator = num;
            denominator = den;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int divisor = gcd(numerator, denominator);
        if (divisor > 0) {
            numerator = numerator / divisor;
            denominator = denominator / divisor;
        }
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        numerator = numerator * otherDen + otherNum * denominator;
        denominator = denominator * otherDen;
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
