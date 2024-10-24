package day30enums_iterators_records;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Cherry");
        myList.add("Fig");
        myList.add("Lychee");
        System.out.println("myList = " + myList);

        ListIterator<String> myListIterator = myList.listIterator();

        while (myListIterator.hasNext()){
            String element = myListIterator.next();
            myListIterator.set(element+"s");
        }
        System.out.println("myList = " + myList);

        while (myListIterator.hasNext()){
            String element = myListIterator.next();
            if (element.equals("Figs")){
                myListIterator.remove();
            }
        }
        System.out.println("myList = " + myList);
    }
}
