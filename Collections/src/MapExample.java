import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();

        stringStringMap.put("John","Red");
        stringStringMap.put("Kate","Pink");
        stringStringMap.put("Adam","Black");

        System.out.println(stringStringMap.get("John"));
        System.out.println(stringStringMap.containsKey("Kate"));
        System.out.println(stringStringMap.containsKey("Boris"));
        System.out.println(stringStringMap.size());

        System.out.println(stringStringMap);

        for(Map.Entry<String, String> entry: stringStringMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //gdy uzyjemy put na juz istniejacym kluczu, to wartosc jemu przypisana zostanie zaktualizowana
        stringStringMap.put("John", "Black");

        System.out.println(stringStringMap);
    }
}
