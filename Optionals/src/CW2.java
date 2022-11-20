import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CW2 {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();

        integerStringMap.put(1, "a");
        integerStringMap.put(2, "b");
        integerStringMap.put(3, "c");
        integerStringMap.put(4, "d");
        integerStringMap.put(5, "e");

        System.out.println(findValueByKey(integerStringMap, 1).orElse("<key not found in map>"));
        System.out.println(findValueByKey(integerStringMap, 2).orElse("<key not found in map>"));
        System.out.println(findValueByKey(integerStringMap, 3).orElse("<key not found in map>"));
        //metoda .orElse() sprawdza czy optional ma nulla lub jest pusty
        //wowczas zwraca wartosc domyslna
        System.out.println(findValueByKey(integerStringMap, 10).orElse("<key not found in map>"));

    }

    private static Optional<String> findValueByKey(Map<Integer, String> map, Integer key){
        Optional<String> opt = Optional.empty();

        opt = Optional.ofNullable(map.get(key));

        return opt;
    }
}
