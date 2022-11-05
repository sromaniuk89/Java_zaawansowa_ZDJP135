public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        super(); //wywolujemy konstruktor bezargumentowy z klasy nadrzednej Point2D
        z=0.0; //tutaj pole z nie jest niczym przesloniete -> dlatego nie ma potrzeby uzycia "this"
    }

    public Point3D(double x, double y, double z) {
        super(x, y); //wywolujemy konstruktor dwuargumentowy z klasy nadrzednej Point2D
        this.z = z; //inicjalizacja z, z uzyciem slowa kluczowego this, bo argument metody z przesłania pole z klasy
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getWhatUWant(){
//        return this.x; //pole x nie jest dostepne w klasie dziedziczacej bo jest private w klasie Point2D
        return this.y; //pole y jest dostepne w klasie dziedziczacej bo jest protected w klasie Point2D
    }

    public double getBiggerValue(){
        return 2*super.getValue(); //super przenosi nam kontekst wywolania na klase bazowa
    }

    @Override
    public String toString() {
        String str = super.toString(); //tutaj wywolujemy metode toString z klasy bazowej Point2D zapisujac wynik
        //potem ten wynik dolaczamy do ostatecznie zwracanego stringa
        return "Point3D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + z +
                '}';
    }
}
