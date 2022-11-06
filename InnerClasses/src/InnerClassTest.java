public class InnerClassTest {
    public static void main(String[] args) {
        OuterClassA outerClassA = new OuterClassA(); //obiekt klasy zewnetrznej

        //klase wewnetrzna (non-static) tworzymy z poziomu obiektu klasy zewnetrznej!!!
        OuterClassA.InnerClassA innerClassA = outerClassA.new InnerClassA();

        //obiekt klasy zagniezdzonej statycznej mozemy utworzyc bezposrednio z poziomu klasy zewnetrznej
        //nie potrzebujemy do tego obiektu!
        OuterClassA.NestedClassA nestedClassA = new OuterClassA.NestedClassA();
        //nie utworzymy obiektu klasy zagniezdzonej statycznej z poziomu obiektu klasy zewnetrznej
        //OuterClassA.NestedClassA nestedClassA1 = outerClassA.new NestedClassA();

        System.out.println(outerClassA.num1);
        System.out.println(innerClassA.num3);
        System.out.println(nestedClassA.num2);

        //klasy wewnetrzne (non-static) maja dostep do pol i metod klasy okalajacej (zewnetrznej)
        innerClassA.printNum1();
    }
}
