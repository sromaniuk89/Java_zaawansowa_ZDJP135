import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        System.out.println(5*findOddOptional(integerList).orElse(0));
        System.out.println(5*findOdd(integerList));

        System.out.println("test");
    }

    private static Integer findOdd(List<Integer> list){
        for (int a: list){
            if(a%2==1){
                return a;
            }
        }

        return null;
    }

    private static Optional<Integer> findOddOptional(List<Integer> list){
        Optional<Integer> opt = Optional.empty();

        for(int a: list){
            if(a%2==1){
                opt=Optional.of(a);
                return opt;
            }
        }

        return opt;
    }
}
