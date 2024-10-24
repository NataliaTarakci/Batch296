package day18arraylist;

import java.util.ArrayList;

public class HW2 {

    public static void main(String[] args) {

        /*
             Task 2:
            Write a Java method that takes an ArrayList<Integer>  and returns the element that appears
            the most times in the list. If there are multiple elements with the same highest frequency,
            return the first one that appears in the list.

            Real life implementation:
            Imagine you are running a customer survey for a new product, and customers are rating the product
            on a scale of 1 to 5. You've collected the survey responses and stored the ratings in an ArrayList<Integer>.
            Now, you want to find out which rating was given most frequently, so you can understand the general
            sentiment of your customers.
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(3);

        System.out.println("list = " + list);

        int mostFrequent = list.get(0); // Assume the first element is the most frequent
        int maxCount = 0;

// Outer loop to go through each element

        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);
            int count = 0;

            // Inner loop to count occurrences of currentElement
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(currentElement)) {
                    count++;
                }
            }

            // Update mostFrequent if currentElement has a higher frequency
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentElement;
            }
        }
        System.out.println("mostFrequent = " + mostFrequent);

    }
             /*
         Task 2:
        Write a Java method that takes an ArrayList<Integer>  and returns the element that appears
        the most times in the list. If there are multiple elements with the same highest frequency,
        return the first one that appears in the list.

        Real life implementation:
        Imagine you are running a customer survey for a new product, and customers are rating the product
        on a scale of 1 to 5. You’ve collected the survey responses and stored the ratings in an ArrayList<Integer>.
        Now, you want to find out which rating was given most frequently, so you can understand the general
        sentiment of your customers.

         */




}
