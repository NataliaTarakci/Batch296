package practices.practice06.warm_up;

import java.util.HashSet;
import java.util.TreeSet;

public class Q03_UniqueColorsSet {

    /*
    Create a HashSet to Store Colors:
    Initialize a HashSet to store color names.
    Add several color names to the set, including some duplicate entries (e.g., "Red," "Blue," "Green," "Yellow," "Blue," "Green").
    Print the contents of the HashSet to observe how duplicates are handled and notice the random order of elements.

    Create a TreeSet to Store Colors in Sorted Order:
    Initialize a TreeSet with the same set of color names, including duplicates.
    Print the TreeSet to observe how it handles duplicates and maintains a sorted (natural) order of elements.

    Observe and Compare Behavior:
    Compare the outputs of HashSet and TreeSet:
    Notice that HashSet removes duplicates but doesn’t keep any specific order.
    Observe that TreeSet removes duplicates and also keeps the elements sorted in natural order.
     */


    public static void main(String[] args) {

        // Step 1 : Create a HashSet to store colors
        HashSet<String> colorSet = new HashSet<>();

        //Adding  colors, including some duplicates
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");
        colorSet.add("Blue");   //duplicate
        colorSet.add("Green");  //duplicate

        System.out.println("colorSet = " + colorSet);

        // Step 2: Create a TreeSet to store colors in sorted order
        TreeSet<String> sortedColorSet = new TreeSet<>();
        sortedColorSet.add("Red");
        sortedColorSet.add("Blue");
        sortedColorSet.add("Green");
        sortedColorSet.add("Yellow");
        sortedColorSet.add("Blue");     //duplicate
        sortedColorSet.add("Green");    //duplicate

        System.out.println("sortedColorSet = " + sortedColorSet);



    }

}
