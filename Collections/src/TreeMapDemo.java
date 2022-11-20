import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args){

        //reasumujac TreeMap jest posortowana mapa
        TreeMap<String, Double> treeMap=new TreeMap<>();

        treeMap.put("Paradise Lost", 23.56);
        treeMap.put("Golden Treasury", 12.47);
        treeMap.put("Moon and the Sixpence", 65.28);
        treeMap.put("Holinshed", 7.68);
        treeMap.put("Ancient Mariner", 45.36);

        printAll(treeMap);

        //jezeli dany klucz juz w mapie istnieje to dodajac nowy wpis pod tym samym kluczem
        //zostanie zaktualizowana wartosc starego wpisu
        treeMap.put("Paradise Lost", 123.56);
        printAll(treeMap);

        //tak samo jak w mapach klucze musza byc unikalne, ale wartosci juz nie
        //dlatego ponizszy wpis zostanie dodany
        treeMap.put("Paradise Regained", 123.56);
        printAll(treeMap);

    }

    public static void printAll(TreeMap<String, Double> treeMap){
        for(Map.Entry<String, Double> et:treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }
}
