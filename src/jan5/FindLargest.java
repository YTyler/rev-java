package jan5;

import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the third number: ");
        int third = scan.nextInt();
        scan.nextLine();
        int largest = first;
        if (largest < second) { //find larger between first and second
            largest = second;
        }
        if (largest < third) { // find larger between previous comparison and third
            largest = third;
        }
        System.out.println("The largest of these numbers is " + largest);
    }
}
