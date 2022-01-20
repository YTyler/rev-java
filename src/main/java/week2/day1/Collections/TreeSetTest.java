package week2.day1.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> intSet = new TreeSet<>();

        //Instantiate and add
        intSet.add(new Integer(5));

        //Autoboxing (automatically creates object out of a primitive)
        //Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intSet.add(anotherInt);

        //Autoboxing + add
        intSet.add(9);
        intSet.add(1);
        intSet.add(10);
        intSet.add(15);

        //Retrieve elements of an ArrayList
        //Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }
    }
}
