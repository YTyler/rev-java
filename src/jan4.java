import java.util.Scanner;

public class jan4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        while (selection < 3 && selection >= 0) {
            System.out.println("Menu");
            System.out.println("1. Geometric Calculations");
            System.out.println("2. Convert a value");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            selection = scan.nextInt();
            switch(selection) {
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
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }

    }
}
