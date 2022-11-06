public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area=Math.PI*Math.pow(radius,2.0);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=2*Math.PI*radius;
    }
}
