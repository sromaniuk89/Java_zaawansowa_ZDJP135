public class Square extends Shape {
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        area=length*length;
    }
}
