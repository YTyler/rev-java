package week1.day2;

import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the top of the range: ");
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
