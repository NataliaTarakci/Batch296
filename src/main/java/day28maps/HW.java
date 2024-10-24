package day28maps;

import java.util.Arrays;
import java.util.HashMap;

public class HW {

    public static void main(String[] args) {

        /*
        Homework:  Interview Question (Q09)

        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}
        - Extension: Also count the letters => {m=2, i=3....}
         */

        String str = "Mike is Mike.";
        String[] arr1 = str.toLowerCase().replaceAll("[^a-z ]", "").split(" ");

        System.out.println(Arrays.toString(arr1));//[mike, is, mike]

        HashMap<String, Integer> map1 = new HashMap<>();

        for (String w : arr1){

            if (map1.containsKey(w)){
                map1.replace(w, (map1.get(w) +1));
            }else {
                map1.put(w, 1);
            }
        }
        System.out.println("map1 = " + map1);//map1 = {mike=2, is=1}


        //Extension: Also count the letters => {m=2, i=3....}
        String[] arr2 = str.toLowerCase().replaceAll("[^a-z]", "").split("");
        System.out.println(Arrays.toString(arr2));//[m, i, k, e, i, s, m, i, k, e]

        HashMap<String, Integer> map2 = new HashMap<>();

        for (String w : arr2){

            if (map2.containsKey(w)){
                map2.replace(w, (map2.get(w) +1));
            }else {
                map2.put(w, 1);
            }
        }
        System.out.println("map2 = " + map2);//map2 = {s=1, e=2, i=3, k=2, m=2}


    }
}
