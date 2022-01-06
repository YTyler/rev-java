package week1.day3.polymorph;

public class Triangle extends Polygon{
    private int dim3;

    public Triangle() {
    }

    public Triangle(int dim1, int dim2, int dim3) {
        super(dim1, dim2);
        this.dim3 = dim3;
    }

    public int getDim3() {
        return dim3;
    }

    public void setDim3(int dim3) {
        this.dim3 = dim3;
    }

    @Override
    int getArea() {
        int s = this.getPerimeter() / 2;
        return (int) Math.sqrt(s * (s - this.dim1) * (s - this.dim2) * (s - this.dim3));
    }

    @Override
    int getPerimeter() {
        return super.getDim1() + super.getDim2() + this.dim3;
    }
}
