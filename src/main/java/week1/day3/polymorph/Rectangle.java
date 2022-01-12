package week1.day3.polymorph;

public class Rectangle extends Polygon {
    public Rectangle() {
    }

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    int getArea() {
        return 0;
    }

    @Override
    int getPerimeter() {
        return 0;
    }
}
