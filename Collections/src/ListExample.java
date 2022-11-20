import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> listWithNames = new LinkedList<>();

        listWithNames.add("John");
        listWithNames.add("John");
        listWithNames.add("Kate");
        listWithNames.add("Adam");

        //mozemy petla foreach iterowac po elementach kolekcji:
        for(String name: listWithNames){
            System.out.println(name);
        }

        //mozemy odrazu wydrukowac cala liste
        System.out.println(listWithNames);

        listWithNames.sort(String::compareTo);

        System.out.println(listWithNames);
    }
}
