public class CW1 {
    @FunctionalInterface
    public interface MathOperation {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        MathOperation addition = (x,y) -> x+y; //dodawanie
        MathOperation subtraction = (x, y) -> x - y; // odejmowanie
        MathOperation multiply = (x, y) -> x * y; // mnożenie
        MathOperation divide = (x, y) -> {
            if(y!=0){
                return x/y;
            } else {
                return 0;
            }
        };

        System.out.println(addition.calculate(2.0, 3.0));
        System.out.println(subtraction.calculate(5.0, 2.0));
        System.out.println(multiply.calculate(3.0, 4.0));
        System.out.println(divide.calculate(10.0, 5.0));
    }

}
