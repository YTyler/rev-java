package week1.day4;

import java.util.Scanner;

public class ArrayPractice {

    //example of array with one dimension
    public static void dim1() {
        Scanner scan = new Scanner(System.in);
        int[] arr;
        int sum = 0;
        System.out.println("One Dimensional Array Example");
        System.out.print("How many elements are there: ");
        int size = scan.nextInt();
        arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        System.out.println("These are the elements you entered");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
            sum+=arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Maximum: " + max);
        System.out.println("Minimum " + min);
        System.out.println("Sum: " + sum);
    }
    //
    public static void dim2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Two Dimensional Array Example");
        System.out.println("How many arrays?"); //get number of arrays
        int num_of_arrays = scan.nextInt();

        int[][] arr = new int[num_of_arrays][]; //instantiate 2d array

        //fill the arrays
        for(int i = 0; i < num_of_arrays; i++) {
            System.out.println("How many elements are in array " + (i + 1) +"?"); //input number of elements for an array
            int n = scan.nextInt();
            arr[i] = new int[n];
            System.out.println("Enter values for array " + (i + 1));
            for(int j=0; j < arr[i].length; j++) { //input elements2
                System.out.print("value " + (j + 1) + ": ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Resulting Arrays and their Sums");
        int grand_sum = 0;
        for(int i=0; i < arr.length; i++) {
            int row_sum = 0;
            System.out.print("{ ");
            for(int j=0; j < arr[i].length; j++) {
                row_sum += arr[i][j];
                grand_sum += arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("} ");
            System.out.println("Sum: " + row_sum);
        }
        System.out.println("Total of All Elements: " + grand_sum);

    }

    public static void main(String[] args) {
        dim1();
        dim2();
    }
}
