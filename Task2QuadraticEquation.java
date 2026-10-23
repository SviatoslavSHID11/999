package semester1.practice06.homework;

public class Task2QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        QuadraticEquation twoRoots = new QuadraticEquation();
        twoRoots.setCoefficients(1, -5, 6);
        System.out.println("Тест 1:");
        twoRoots.printSolution();
        System.out.println("--------------------------------------");

        QuadraticEquation oneRoot = new QuadraticEquation();
        oneRoot.setCoefficients(1, -4, 4);
        System.out.println("Тест 2:");
        oneRoot.printSolution();
        System.out.println("--------------------------------------");

        QuadraticEquation noRoots = new QuadraticEquation();
        noRoots.setCoefficients(1, 2, 5);
        System.out.println("Тест 3:");
        noRoots.printSolution();
        System.out.println("======================================");
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void setCoefficients(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            this.a = 1.0;
        } else {
            this.a = a;
        }
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    public void printSolution() {
        String bSign = (b >= 0) ? "+" : "-";
        String cSign = (c >= 0) ? "+" : "-";
        System.out.printf("Рівняння: %.1f*x^2 %s %.1f*x %s %.1f = 0%n", a, bSign, Math.abs(b), cSign, Math.abs(c));

        double d = getDiscriminant();
        System.out.printf("Дискримінант D = %.2f%n", d);

        if (d > 0) {
            System.out.println("Рівняння має 2 дійсні корені:");
            System.out.printf("  x1 = %.2f%n", getRoot1());
            System.out.printf("  x2 = %.2f%n", getRoot2());
        } else if (d == 0) {
            System.out.println("Рівняння має один дійсний корінь:");
            System.out.printf("  x = %.2f%n", -b / (2 * a));
        } else {
            System.out.println("Рівняння не має дійсних коренів у множині R.");
        }
    }
}
