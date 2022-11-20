import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //mozemy tworzyc kolekcje kolekcji
        //lista list
        List<List<String>> lists = new LinkedList<>();

        lists.add(new LinkedList<>(Arrays.asList("a1","b1")));
        lists.add(new LinkedList<>(Arrays.asList("a2","b2")));

        System.out.println(lists);
    }
}