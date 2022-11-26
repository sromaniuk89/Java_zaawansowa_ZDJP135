import java.util.Arrays;
import java.util.List;

public class CW1 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 3, 4, 8, 9, 13, 14);

        num.stream()
                .filter(x->x%2!=0)
                .map(x->x*10)
                .forEach(System.out::println);
    }
}
