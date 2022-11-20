import java.util.HashMap;
import java.util.Map;

public class CW2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Polska", "Warszawa");
        map.put("Niemcy", "Berlin");
        map.put("Francja", "Paryż");

        //metoda keySet() zwraca zbior kluczy z mapy
        for(String s : map.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();

        //metoda values zwraca kolekcje wartosci
        for(String s: map.values()){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println(map);

    }
}