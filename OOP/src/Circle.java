public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        area=Math.PI * Math.pow(radius, 2.0);
    }
}
