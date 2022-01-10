package week2.day1.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

    //Storing elements into an ArrayList
        //Instantiate and add
        Integer myInt = new Integer(10);
        intList.add(myInt);

        //Autoboxing (automatically creates object out of a primitive)
        //Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intList.add(anotherInt);

        //Autoboxing + add (one line)
        intList.add(9);
        intList.add(1);
        intList.add(10);
        intList.add(15);

    //Retrieve elements of an ArrayList
        //Positional Access - Only Applicable for List implementations
        for (int i = 0; i < intList.size(); i++){
            System.out.println("Element at the position "+i+ " is "+intList.get(i));
        }

        //Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }


    }
}
