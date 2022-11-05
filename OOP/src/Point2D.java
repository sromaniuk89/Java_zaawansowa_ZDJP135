public class Point2D {
    private double x; //pole x nie jest dostepne dla klasy dziedziczacej, jest dostepne dla klasy Point2D
    protected double y; //pole y jest dostepne dla klasy dziedziczacej, jest dostepne dla klasy Point2D
    //protected ma mniejsza dostepnosc niz public. Public jest dostepny nawet dla klas spoza pakietu
    double pi; //nie ma modyfikatora dostepu, to jaki mamy dostep?

    public Point2D() {
        x=0.0;
        y=0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    protected double getValue(){
        return 3.14;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
