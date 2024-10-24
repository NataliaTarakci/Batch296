package practices_extra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q02 {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 1);
        myMap.put("b", 2);
        myMap.put("c", 3);

        // Using an iterator with a while loop
        Iterator<Map.Entry<String, Integer>> iterator = myMap.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println("entry = " + entry);

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


}
