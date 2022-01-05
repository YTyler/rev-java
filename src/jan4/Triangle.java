package jan4;

public class Triangle {
    public static double area(double side1,double side2, double side3) {
        double s = Triangle.perimeter(side1, side2, side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
