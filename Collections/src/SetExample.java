import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Double> doubleSet = new HashSet<>();

        doubleSet.add(3.13);
        doubleSet.add(3.14);
        doubleSet.add(7.77);
        doubleSet.add(0.35);
        doubleSet.add(0.35);
        doubleSet.add(12.34);

        //nie zostaje zapamietana kolejnosc dodawania
        //nie moga wystepowac duplikaty elementow w zbiorze
        System.out.println(doubleSet);

        List<Double> doubleList = new LinkedList<>(Arrays.asList(4.0, 4.0, 9.0, 10.0));
        doubleSet.addAll(doubleList); //dodaje elementy z innej kolekcji (pomija duplikaty)

        System.out.println(doubleSet);

    }
}
