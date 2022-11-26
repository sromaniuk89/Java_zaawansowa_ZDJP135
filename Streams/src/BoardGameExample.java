import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoardGameExample {
    public static void main(String[] args) {
        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        //rozwiazanie bez stream
        for (BoardGame game : games) {
            if (game.maxPlayers > 4) {
                if (game.rating > 8) {
                    if (new BigDecimal(150).compareTo(game.price) > 0) {
                        System.out.println(game.name.toUpperCase());
                    }
                }
            }
        }


        //rozwiazanie z uzyciem streamow
        games.stream() //tworzymy strumien z listy gier
                .filter(g -> g.maxPlayers > 4) //sprawdzamy czy liczba graczy w danej grze jest wieksza niz 4
                .filter(g -> g.rating > 8)  //sprawdzamy czy ocena gry jest wieksza niz 8
                //sprawdzamy czy cena jest nizsza niz 150
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                //metoda zmieniajaca elementy klasy BoardGame na Stringi okreslajace nazwe gry
                //w wyniku zamiast obiektow BoardGame mamy w strumieniu Stringi
                //.map(g -> g.name.toUpperCase()) //mapa zamienia nam obiekty jednego typu na obiekty innego typu
                //.map(g -> g.price) // zamiana strumienia BoardGame na strumien BigDecimal
                .forEach(System.out::println); //dla kazdego elementu uzyj metody println z System.out

        Stream<BoardGame> boardGameStream = games.stream();

        //taka operacja tez rowniez zablokuje dalsze korzystanie ze strumienia
        //gdy zakonczymy wykonywanie operacji na strumieniu (nawet uzywaj metod niekonczacych)
        //to rowniez blokujemy mozliwosc dalszego korzystania ze strumienia!!
        //boardGameStream.filter(g->g.rating<12);
        //tutaj zwraca mi liste
        List<BoardGame> boardList = boardGameStream.collect(Collectors.toList());

        //kiedy strumien zostanie zamkniety, to juz nie mozemy z niego korzystac
        //proba skorzysta z zamknietego strumienia skonczy sie fiaskiem
        //odkomentowanie ponizszej linii spowoduje rzucenie wyjatku:
        //boardGameStream.forEach(System.out::println);


    }
}
