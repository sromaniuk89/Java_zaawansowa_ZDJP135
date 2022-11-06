public class Apple implements IEat, IJuiceMaker{
    @Override
    public void eat() {
        System.out.println("Mmmm very good apple!");
    }

    @Override
    public void makeJuice() {
        System.out.println("The best juice is made of apples");
    }

    public void throwApple(){
        System.out.println("Apple landed in the bin. It's lost now.");
    }
}
