import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparableTest {
    public static void main(String[] args) {

        Person[] persons=new Person[6];
        persons[0]=new Person("Zbigniew","Czartoryjski",55);
        persons[1]=new Person("Zuzia","Nowak",19);
        persons[2]=new Person("Jan","Kowalski",23);
        persons[3]=new Person("Ola","Niemen",3);
        persons[4]=new Person("Bartosz","Nowak",28);
        persons[5]=new Person("Bartosz","Nowak",21);

        //reczne sprawdzenie dzialania metody compareTo()
        System.out.println(persons[0].compareTo(persons[1]));

        //zrobimy sobie teraz liste z ww. tablicy
        List<Person> personList = new ArrayList<>(Arrays.asList(persons));
        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);

    }
}
