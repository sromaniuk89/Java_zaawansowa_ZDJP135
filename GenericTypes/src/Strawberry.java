public class Strawberry implements IEat, IJuiceMaker{
    @Override
    public void eat() {
        System.out.println("Mmmm... very good strawberry");
    }

    @Override
    public void makeJuice() {
        System.out.println("Strawberries were used to make a nice juice :)");
    }
}
