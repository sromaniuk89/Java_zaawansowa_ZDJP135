import java.util.Arrays;
import java.util.List;

public class CW1 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3,4,5,6,300);

        System.out.println(getMeanValue(integerList));
    }

    public static double getMeanValue(List<Integer> list){
        double sum = 0.0;

        for(int n : list){
            sum+=n;
        }

        return sum/list.size();
    }
}
