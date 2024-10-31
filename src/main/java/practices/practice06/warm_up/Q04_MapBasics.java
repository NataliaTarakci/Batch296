package practices.practice06.warm_up;

import java.util.HashMap;
import java.util.Map;

public class Q04_MapBasics {

        /*
    Create a HashMap to Store Country-Capital Pairs:
    Initialize a HashMap to store country names as keys and their capitals as values.
    Add entries for several countries and their capitals using the put() method (e.g., "USA" - "Washington D.C.", "Germany" - "Berlin", "Japan" - "Tokyo", "India" - "New Delhi").
    Print the contents of the HashMap to observe the initial state and note that the order of elements is not guaranteed.
    Manipulate the HashMap with get() and remove() Methods:
    Use the get() method to retrieve the capital of a specific country (e.g., "Japan") and print the result.
    Remove an entry using the remove() method (e.g., remove "Germany" and its capital) and print the updated HashMap to see the changes
    Iterate Through the HashMap Using entrySet():
    Use the entrySet() method to iterate over all key-value pairs in the HashMap.
    Print each pair to show the country name and its corresponding capital during the iteration.
     */

    public static void main(String[] args) {
        // Create a HashMap to Store Country-Capital Pairs
        HashMap<String, String> countryCapitals = new HashMap<>();

        // Adding some countries and their capitals using the put() method
        countryCapitals.put("UK", "London");
        countryCapitals.put("Spain", "Madrid");
        countryCapitals.put("Azerbaijan", "Baku");
        countryCapitals.put("Germany", "Berlin");

        System.out.println("countryCapitals = " + countryCapitals);

        // Step 2: Get the capital of a specific country
        String capitalOfSpain = countryCapitals.get("Spain");
        System.out.println("capitalOfSpain = " + capitalOfSpain);

        // Step 3: Remove an entry from the HashMap
        countryCapitals.remove("Germany");
        System.out.println("countryCapitals = " + countryCapitals);

        //Step 4: Iterate over the HashMap using entrySet()
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()){
            System.out.println("Country: " +  entry.getKey() + " , Capital: " + entry.getValue());
        }
    }

}
