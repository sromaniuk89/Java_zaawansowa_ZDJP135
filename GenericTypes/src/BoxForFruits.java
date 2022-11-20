//extends:
//1.ogranicza mozliwy zakres typow parametryzujących
//2.okresla jakie metody sa dostepne na wprowadzonych typach parametryzujacych
public class BoxForFruits <T extends IEat & IJuiceMaker> {
    private T fruit;
    //private String someText;

    public BoxForFruits(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void eatFruitFromTheBox(){
        fruit.eat();
    }

    public void makeJuiceFromTheFruit(){
        fruit.makeJuice();
    }
}
