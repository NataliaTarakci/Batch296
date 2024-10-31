package practices.practice06.warm_up;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q01_ListBasics {


    /*
Create an ArrayList and a LinkedList:
	Add three initial color names (e.g., "Red", "Green", "Blue") to each list.
	Print the initial contents of both lists.

Add Elements to Different Positions:
	Add "Yellow" at the beginning of each list.
	Add "Purple" in the middle of each list.
	Add "Orange" at the end of each list.
	Print the lists after each addition to observe any changes.

Remove Elements from Different Positions:
	Remove an element from the beginning of each list.
	Remove an element from the middle of each list.
	Remove an element from the end of each list.
	Print the lists after each removal to observe any changes.

     */

    public static void main(String[] args) {

        // Step 1: Initialize ArrayList and LinkedList with initial colors
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Adding initial colors
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");

        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList = " + linkedList);

        //Step 2: Adding elements at different positions
        // Adding at the beginning
        arrayList.add(0, "Yellow");
        linkedList.add(0, "Yellow");

        // Adding at the middle
        arrayList.add(2,"Purple");
        linkedList.add(2,"Purple");

        // Adding at the end
        arrayList.add("Orange");
        linkedList.add("Orange");

        System.out.println("ArrayList after additions = " + arrayList);
        System.out.println("LinkedList after additions = " + linkedList);

        //Step 3: Removing elements at different positions
        // Removing from beginning
        arrayList.remove(0);
        linkedList.remove(0);

        // Removing from middle
        arrayList.remove(1);
        linkedList.remove(1);

        // Removing from the end
        arrayList.remove(arrayList.size() -1);
        linkedList.remove(linkedList.size() - 1);

        System.out.println("ArrayList after removals = " + arrayList);
        System.out.println("LinkedList after removals = " + linkedList);



    }

}
