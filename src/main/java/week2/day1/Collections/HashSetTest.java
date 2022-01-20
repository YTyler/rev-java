package week2.day1.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();

        Integer myInt = new Integer(10);
        intSet.add(myInt);

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
        //3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }
    }
}
