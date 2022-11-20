import java.util.Objects;

public class Person implements Comparable<Person>{
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //a
//    @Override
//    public int compareTo(Person o) {
//        return this.age-o.age;
//    }

    //b
//    @Override
//    public int compareTo(Person o) {
//        return this.surname.compareTo(o.surname);
//    }

    //c
    @Override
    public int compareTo(Person o) {
        int result = this.surname.compareTo(o.surname);
        if(result==0){
            return this.name.compareTo(o.name);
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
