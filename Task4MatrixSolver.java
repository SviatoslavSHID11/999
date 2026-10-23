package semester1.practice06.homework;

public class Task4MatrixSolver {
    public static void main(String[] args) {
        System.out.println("================ МАТРИЧНИЙ КАЛЬКУЛЯТОР ТА СЛАР ================");

        double[][] coefficients = {{2, 3}, {4, -1}};

        MatrixSolver solver = new MatrixSolver();
        solver.setMatrix(coefficients);
        System.out.println("Початкова матриця 2x2 коефіцієнтів A:");
        solver.printMatrix();
        System.out.printf("%nВизначник det(A) = %.2f%n", solver.getDeterminant2x2());

        solver.transpose();
        System.out.println();
        System.out.println("Транспонована матриця A^T:");
        solver.printMatrix();

        System.out.println();
        System.out.println("--- РОЗВ'ЯЗАННЯ СИСТЕМИ ЛІНІЙНИХ РІВНЯНЬ (МЕТОД КРАМЕРА) ---");
        System.out.println("Рівняння:");
        System.out.printf("  %.2f*x + %.2f*y = %.2f%n", coefficients[0][0], coefficients[0][1], 8.0);
        System.out.printf("  %.2f*x + %.2f*y = %.2f%n", coefficients[1][0], coefficients[1][1], 2.0);
        System.out.println();

        solver.setMatrix(coefficients);
        solver.solveSystem2x2(8, 2);

        MatrixSolver big = new MatrixSolver();
        big.setMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 10}});
        System.out.println();
        System.out.println("Матриця 3x3:");
        big.printMatrix();
        System.out.printf("Визначник 3x3 = %.2f%n", big.getDeterminant3x3());
        System.out.println("===============================================================");
    }
}

class MatrixSolver {
    private double[][] data;

    public void setMatrix(double[][] data) {
        this.data = data;
    }

    public void printMatrix() {
        for (double[] row : data) {
            System.out.print("[ ");
            for (double value : row) {
                System.out.printf("%6.2f ", value);
            }
            System.out.println("]");
        }
    }

    public double getDeterminant2x2() {
        if (data.length != 2 || data[0].length != 2) {
            System.out.println("Помилка: для цього методу потрібна матриця 2x2!");
            return 0.0;
        }
        return data[0][0] * data[1][1] - data[0][1] * data[1][0];
    }

    public double getDeterminant3x3() {
        if (data.length != 3 || data[0].length != 3) {
            System.out.println("Помилка: для цього методу потрібна матриця 3x3!");
            return 0.0;
        }
        double d00 = data[0][0];
        double d01 = data[0][1];
        double d02 = data[0][2];
        double d10 = data[1][0];
        double d11 = data[1][1];
        double d12 = data[1][2];
        double d20 = data[2][0];
        double d21 = data[2][1];
        double d22 = data[2][2];

        return d00 * d11 * d22 + d01 * d12 * d20 + d02 * d10 * d21
                - d02 * d11 * d20 - d00 * d12 * d21 - d01 * d10 * d22;
    }

    public void transpose() {
        double[][] transposed = new double[data[0].length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                transposed[j][i] = data[i][j];
            }
        }
        data = transposed;
    }

    public void solveSystem2x2(double c1, double c2) {
        if (data.length != 2 || data[0].length != 2) {
            System.out.println("Помилка: для методу Крамера потрібна матриця 2x2!");
            return;
        }
        double delta = getDeterminant2x2();
        double deltaX = c1 * data[1][1] - c2 * data[0][1];
        double deltaY = data[0][0] * c2 - data[1][0] * c1;

        System.out.printf("Головний визначник Delta  = %.2f%n", delta);
        System.out.printf("Визначник Delta_x        = %.2f%n", deltaX);
        System.out.printf("Визначник Delta_y        = %.2f%n", deltaY);
        System.out.println();

        if (Math.abs(delta) > 1e-9) {
            double x = deltaX / delta;
            double y = deltaY / delta;
            System.out.println("Знайдено єдиний розв'язок:");
            System.out.printf("  x = Delta_x / Delta = %.2f%n", x);
            System.out.printf("  y = Delta_y / Delta = %.2f%n", y);
            System.out.printf("Перевірка: %.0f*%.0f + %.0f*%.0f = %.0f (ВІРНО!)%n",
                    data[0][0], x, data[0][1], y, data[0][0] * x + data[0][1] * y);
        } else if (Math.abs(deltaX) < 1e-9 && Math.abs(deltaY) < 1e-9) {
            System.out.println("Система має безліч розв'язків");
        } else {
            System.out.println("Система несумісна (не має розв'язків)");
        }
    }
}
