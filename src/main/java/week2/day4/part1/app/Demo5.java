package week2.day4.part1.app;

import week2.day4.part1.beans.MyFunctionalInterface;

public class Demo5 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface1 = (a)->System.out.println("The argument is "+a); // Calling printlnmethod
        MyFunctionalInterface myFunctionalInterface2 = a -> System.out.println("This time arg is "+a); // Calling printlnmethod
        MyFunctionalInterface myFunctionalInterface3 = System.out::println ; // Assigning method reference to functional interface
        myFunctionalInterface1.meth(10);
        myFunctionalInterface2.meth(15);
        myFunctionalInterface3.meth(20);
    }
}
