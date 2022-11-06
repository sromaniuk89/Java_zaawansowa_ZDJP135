public class GenericClassExample {
    public static void main(String[] args) {
        //parametryzujemy klase generyczna BoxForFruits typem Apple i tworzymy jej instancje
        BoxForFruits<Apple> appleBox = new BoxForFruits<Apple>(new Apple());
        //typ referencji: klasa BoxForFruits sparametryzowana typem Strawberry:
        BoxForFruits<Strawberry> strawberryBox = new BoxForFruits<>(new Strawberry());

        //dziala bez potrzeby rzutowania bo appleBox przechowuje jablka
        Apple apple = appleBox.getFruit();
        Apple apple1 = new Apple();
        Strawberry strawberry = strawberryBox.getFruit();

        //nie chcialbym zeby tak sie dalo zrobic. Nie taki byl zamiar tworzenia klasy BoxForFruits:
        //moge ograniczyc stosowanie niechcianych typow (np. String) uzywajac wlasnie slowek:
        //extends - ograniczenie z gory
        //super - ograniczenie z dolu (stosowane niezmiernie rzadko, dosc specyficzne zastosowania)
        //BoxForFruits<String> box = new BoxForFruits<>("ssda");

        //Cherry nie implementuje IJuiceMaker dlatego nie mozemy go uzyc do sparametryzowania BoxForFruits
        //BoxForFruits<Cherry> box

        //zadziala rowniez dla klas z drugiego dziedziczenia itd.
        BoxForFruits<RedApple> boxForRedApple = new BoxForFruits<>(new RedApple());


        //w przypadku uzycia metody generycznej, nie dokonujemy recznego generyzowania
        Apple appleSelected = randomSelection(apple, apple1);
        String selectedString = randomSelection("white", "red");
        System.out.println(selectedString);

        method1(new BoxForFruits<>(new Apple()));
        method1(new BoxForFruits<>(new Strawberry()));
        //nie zadziala bo ograniczenia zostaly nadane na poziomie klasy!!!
        //method1(new BoxForFruits<>("abc"));

        method2(new BoxForFruits<>(new Apple()));
        method2(new BoxForFruits<>(new RedApple()));
        //nie zadziala bo ograniczenia zostaly nadane na poziomie metody!!!
        //method2(new BoxForFruits<>(new Strawberry()));
    }

    public static <T> T randomSelection(T x, T y) {
        return Math.random() > 0.5 ? x : y;
    }

    //w tym kontekscie ? oznacza wildcard
    public static void method1(BoxForFruits<?> box){
        Object object = box.getFruit();
        System.out.println(object);
        //nie ma tu takiej metody bo zakres mozliwych typow jest obszerniejszy
        //box.getFruit().throwApple();
    }

    public static void method2(BoxForFruits<? extends Apple> box){
        box.getFruit().throwApple();
    }
}
