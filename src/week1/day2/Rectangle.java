package week1.day2;

public class Rectangle {
    private int dimension1;
    private int dimension2;

    public Rectangle() { //Empty Constructor
    }

    public Rectangle(int dimension1, int dimension2) { //Constructor with members
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    //Getters and Setters
    public int getDimension1() {
        return dimension1;
    }

    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    //Functions for Area and Perimeter
    public int area() {
        return this.dimension1 * this.dimension2;
    }

    public int perimeter() {
        return 2 * this.dimension1 + 2 * this.dimension2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "dimension1=" + dimension1 +
                ", dimension2=" + dimension2 +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
