package week1.day3.polymorph;

public abstract class Polygon {
    protected int dim1;
    protected int dim2;

    public Polygon() {
    }

    public Polygon(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    abstract int getArea();

    abstract int getPerimeter();
}
