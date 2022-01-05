package week1.day2;

public class Main {
    public static void main(String[] args) {

        //Calculator Class Example
        System.out.println("Calculator Example");
        Calculator cal1 = new Calculator();
        cal1.setNum1(2);
        cal1.setNum2(3);
        System.out.println("Result = " + cal1.add());
        System.out.println();

        //Rectangle Class Example
        System.out.println("Rectangle Class Example");
        Rectangle rect = new Rectangle(); //Empty Constructed Rectangle
        rect.setDimension1(2);
        rect.setDimension2(3);
        Rectangle wrecked = new Rectangle(4,5); //Member Constructed Rectangle
        System.out.println("Describe Rectangle 'rect'");
        System.out.println(rect);
        System.out.println("Describe Rectangle 'wrecked'");
        System.out.println(wrecked);
    }
}
