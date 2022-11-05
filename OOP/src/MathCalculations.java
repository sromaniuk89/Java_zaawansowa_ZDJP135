public class MathCalculations {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static int factorial(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i; //a*=b -> a = a*b
        }

        return result;
    }

    public static double funcA(double a, double b) {
        return 3.0 * a * a + 7 * a * b + 1.5 * b;
    }
}
