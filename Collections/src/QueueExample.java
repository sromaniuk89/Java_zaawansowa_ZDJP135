import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> stringQueue = new ArrayDeque<>();

        //dwie metody do dodawania do kolejki
        stringQueue.add("one"); //jezeli kolejka jest pelna, to rzuci wyjatek
        stringQueue.offer("two"); //jezeli kolejka jest pelna to jedynie zwroci false

        //cztery metody do pobierania/odczytywania elementow z kolejki
        String string = stringQueue.remove(); //jezeli kolejka jest pusta,to rzuci wyjatek, pobiera element
        System.out.println(string);

        string = stringQueue.poll(); //jezeli kolejka jest pusta to zwroci null, pobiera element
        System.out.println(string);

        stringQueue.add("three");
        string = stringQueue.element(); //jezeli kolejka jest pusta rzuci wyjatek, odczytujemy wartosc (bez pobierania)
        System.out.println(string);

        string = stringQueue.peek(); //jezeli kolejka jest pusta zwraca null, odczytujemy wartosc (bez pobierania)
        System.out.println(string);

        System.out.println(stringQueue.size());

        //mozemy definiowac jaki jest poczatkowy rozmiar kolejki
        Queue<Integer> integerQueue = new ArrayDeque<>(2);

        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        System.out.println(integerQueue.size());

    }
}
