import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ZAD1 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList(new String[]{"ebc","Dcd","cde"});

//        data.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2){
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        data.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(data);
    }
}