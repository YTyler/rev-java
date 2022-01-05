package jan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//The Basic Landing Menu
        int selection = 0;
        while (selection != 3) {
            System.out.println("Menu");
            System.out.println("1. Geometric Calculations");
            System.out.println("2. Convert a value");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            selection = scan.nextInt();
            switch(selection) {
//Geometric Calculations
                case 1:
                    scan.nextLine();
                    System.out.println("Select a Shape");
                    System.out.println("1. Triangle");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Circle");
                    System.out.print("Enter your choice: ");
                    int shape = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Select a property");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    System.out.print("Enter your choice: ");
                    int property = scan.nextInt();
                    scan.nextLine();
                    if (shape == 1 && property == 1) { //Triangle Perimeter
                        System.out.print("Enter the length of the first side of the triangle: ");
                        double side1 = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the length of the second side of the triangle: ");
                        double side2 = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the length of the third side of the triangle: ");
                        double side3 = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The Triangle's Perimeter is " + Triangle.perimeter(side1, side2, side3)); //print triangle perimeter
                    } else if (shape == 1 && property == 2) { //Triangle Area
                        System.out.print("Enter the length of the first side of the triangle: ");
                        double side1 = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the length of the second side of the triangle: ");
                        double side2 = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the length of the third side of the triangle: ");
                        double side3 = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The Triangle's Area is " + Triangle.area(side1, side2, side3)); //print triangle area
                    } else if (shape == 2 && property == 1) { //Rectangle Perimeter
                        System.out.print("Enter the length of the rectangle: ");
                        double length = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the width of the rectangle: ");
                        double width = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The Rectangle's Perimeter is " + Rectangle.perimeter(length, width)); //print rectangle perimeter
                    } else if (shape == 2 && property == 2) { //Rectangle Area
                        System.out.print("Enter the length of the rectangle: ");
                        double length = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter the width of the rectangle: ");
                        double width = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The Rectangle's Perimeter is " + Rectangle.area(length, width)); //print rectangle area
                    } else if (shape == 3 && property == 1) { //Circle Perimeter
                        System.out.print("Enter the radius of the circle: ");
                        double radius = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The Perimeter of the circle is " + Circle.perimeter(radius));
                    } else if (shape == 3 && property == 2) { //Circle Area
                        System.out.print("Enter the radius of the circle: ");
                        double radius = scan.nextInt();
                        scan.nextLine();
                        System.out.println("The area of the circle is " + Circle.area(radius));
                    } else {
                        System.out.println("One of the values entered was invalid");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("That is an invalid choice");
                    break;
            }
        }
    }
}
