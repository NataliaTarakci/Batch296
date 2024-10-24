package day18arraylist;

import java.util.ArrayList;

public class HW1 {

    public static void main(String[] args){

        ArrayList<String> arr = new ArrayList<>();
        arr.add("London");
        arr.add("Manchester");
        arr.add("Cambridge");
        System.out.println("arr = " + arr);//arr = [London, Manchester, Cambridge]
        System.out.println(reversedArrayList(arr));//[Cambridge, Manchester, London]


        System.out.println("===HW Solution from Saima===");
        /*

         Task 1:
        Write a Java method that takes an ArrayList<String> as input and returns a new
        ArrayList<String> with the elements in reverse order.
        You are not allowed to use any built-in reverse method.
         */

// Create a String ArrayList and assign values
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Orange");

        System.out.println("Original fruitList: " + fruitList);

// Create a new ArrayList to hold the reversed elements
        ArrayList<String> reversedList = new ArrayList<>();

// Traverse the list from the end to the beginning
        for (int i = fruitList.size() - 1; i >= 0; i--) {
            reversedList.add(fruitList.get(i));
        }
// Print the reversed list
        System.out.println("Reversed list: " + reversedList);

// 2nd way
        for (String w : fruitList) {
            reversedList.add(0, w);
        }

// Print the reversed list
        System.out.println("Reversed list: " + reversedList);
        System.out.println("===HW Solution from Saima===");

    }
        /*
         Task 1:
        Write a Java method that takes an ArrayList<String> as input and returns a new
        ArrayList<String> with the elements in reverse order.
        You are not allowed to use any built-in reverse method.
         */

    public static ArrayList<String> reversedArrayList(ArrayList<String> a){
        ArrayList<String> b = new ArrayList<>();
        for (int i = a.size()-1; i >=0 ; i--) {
            b.add(a.get(i));
        }
        return b;
    }










}
