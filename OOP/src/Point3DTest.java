public class Point3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0, 4.0);
        Point3D point3D = new Point3D(1.0,2.0,3.0);

        System.out.println(point2D.getX()); //wywolywana jest metoda getX z klasy Point2D
        System.out.println(point2D.getY()); //wywolywana jest metoda getY z klasy Point2D

        System.out.println(point3D.getX()); //wywolywana jest metoda getX odziedziczona z klasy Point2D
        System.out.println(point3D.getY()); //wywolywana jest metoda getY odziedziczona z klasy Point2D
        System.out.println(point3D.getZ()); //wywolywana jest metoda getZ z klasy Point3D

        System.out.println(point2D);
        System.out.println(point3D);
    }
}
