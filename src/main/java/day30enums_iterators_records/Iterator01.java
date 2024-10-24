package day30enums_iterators_records;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Cherry");
        myList.add("Fig");
        myList.add("Lychee");
        System.out.println("myList = " + myList);
        //myList.clear();

//        for (String w: myList){
//            System.out.println(w+"s");
//        }

        Iterator<String> myIter = myList.iterator();

        while (myIter.hasNext()){
            myIter.next();
            //myIter.remove();
        }
        System.out.println("myList = " + myList);
    }
}
