import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class StreamMethodExample {
    public static void main(String[] args) {
        //Strumien na podstawie kolekcji
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();
        Stream<Integer> stream1A = Arrays.asList(1, 2, 3).stream();
        stream1A.forEach(System.out::println); //wypisywanie zawartosci strumienia

        //Strumien na podstawie tablicy
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{4, 5, 6});
        stream2.forEach(System.out::println); //wypisywanie zawartosci strumienia

        //Strumien na podstawie łańcucha znaków, który jest rozdzielony z użyciem RegEx
        Stream<String> stream3 = Pattern.compile(" ").splitAsStream("some longer sentence");
        stream3.forEach(System.out::println); //wypisywanie zawartosci strumienia

        //Strumienie typów prostych
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
        IntStream intStream = IntStream.range(5, 10);
        //metoda generate tworzy strumien nieskonczonych danych
        LongStream longStream = LongStream.generate(() -> 1L);
        doubleStream.forEach(System.out::println); //wypisywanie zawartosci strumienia
        intStream.forEach(System.out::println); //wypisywanie zawartosci strumienia
        //metoda limit ogranicza liczbe elementow w strumieniu
        longStream.limit(5).forEach(System.out::println); //wypisywanie zawartosci strumienia

        //Tworzenie strumieni danych losowych
        DoubleStream randomDoubles = new Random().doubles();
        IntStream randomInts = new Random().ints();
        LongStream randomLongs = new Random().longs();
        //metoda limit ogranicza liczbe elementow w strumieniu
        randomDoubles.limit(3).forEach(System.out::println); //wypisywanie zawartosci strumienia
        randomInts.limit(3).forEach(System.out::println); //wypisywanie zawartosci strumienia
        randomLongs.limit(3).forEach(System.out::println); //wypisywanie zawartosci strumienia


        //tworzymy strumien losowych intów a następnie filtrujemy ten strumień
        //zeby uzyskać liczby w danym zakresie
        //ograniczamy ilosc liczb do 5
        System.out.println("Filter of random values: ");
        new Random().ints()
//                .limit(5)
                .filter(x->x<10)
                .filter(x->x>0)
                .limit(5) //losuje az nazbiera 5 liczb spelniajacych powyzsze warunki
                .forEach(System.out::println);

        System.out.println("random in range: ");
        new Random().ints(5, 10).limit(3).forEach(System.out::println);

        //Stworzenie pustego strumienia
        Stream.empty();

        //Strumień danych z pliku:
//        try (Stream<String> lines = new BufferedReader(new FileReader("file.txt")).lines()) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Tworzymy strumien nieskonczonych danych losowych typu Double
        DoubleStream randomNumbers = new Random().doubles();

        List<Double> listOfRandomNumbers = randomNumbers
                .map(x->x*2-1) //przemnazamy wszystkie liczby razy 2 i odejmujemy 1
                .filter(x->x<0) //wybieramy tylko liczby mniejsze od 1
                .boxed() //opakowanie typu
                .limit(10) //ograniczamy ilosc liczb do 10
                .collect(Collectors.toList()); //zamieniamy na liste

        System.out.println(listOfRandomNumbers);


        OptionalInt minVal = IntStream.range(14,100)
                .reduce((a,b)->a>=b?a:b); //a - akumulator (element ktory przechodzi przy uzywaniu reduce na poszczegolnych)

        System.out.println(minVal.orElse(-1));

    }
}