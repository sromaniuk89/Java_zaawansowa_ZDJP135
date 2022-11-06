public class Square extends Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area=length*length;
    }

    @Override
    public void calculatePerimeter() {
        perimeter=4*length;
    }
}
