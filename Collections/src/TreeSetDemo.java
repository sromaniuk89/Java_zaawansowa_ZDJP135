import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Integer[] nums = {1,7,3,8,12,3};

        //TreeSet jest (automatycznie) posortowanym zbiorem
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(nums));

        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        printTreeSet(sortedSet);

        sortedSet.add(1);//1 nie zostanie dodane bo juz sie znajduje w tej kolekcji
        sortedSet.add(5);

        printTreeSet(sortedSet);

        //zakres: <l, p)
        System.out.println(sortedSet.headSet(5));
        System.out.println(sortedSet.headSet(12));
    }

    public static void printTreeSet(SortedSet<? extends Number> set){
        for(Number n : set){
            System.out.print(n + ", ");
        }
        System.out.println();
    }
}
