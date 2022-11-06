public class CompositionExample {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(new Processor(3, "YouBanana"), new Camera(20, 12));

        //poprzez operator . dostajemy sie do poszczegolnych sklaodwych obiektu smartphone a nastepnie do
        //skladowych obiektu procesor
        System.out.println(smartphone.processor.getName());
    }
}
