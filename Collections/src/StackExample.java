import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.add(1);
        integerStack.add(3);
        integerStack.add(30);

        //zwraca element z podanego indeksu, bez zdejmowania ze stosu
        System.out.println(integerStack.get(0));

        integerStack.push(444); //wstawienie elementu na stos (na szczyt)
        System.out.println(integerStack.peek());//wyswietla wartosc ze szczytu stosu, ale jej nie pobiera
        System.out.println(integerStack.peek());
        System.out.println(integerStack.pop());//pobieramy wartosc (element) ze stosu, zdejmujemy
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.size());
        //System.out.println(integerStack.get(0));

    }
}
