import java.util.function.UnaryOperator;

public class CW2 {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCase = (text) -> text.toUpperCase();
        System.out.println(toUpperCase.apply("day 26.11.22: day5"));

        UnaryOperator<String> toUpperCase2 = String::toUpperCase; //mozna rowniez odwolac sie do danej metody
        System.out.println(toUpperCase2.apply("this is small example text123 !@#"));
    }
}
