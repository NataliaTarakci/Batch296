package practices_extra;

import java.util.LinkedList;
import java.util.Random;

public class Q01 {

    /*
        (Use Random class)
        Write a program that creates a Random object with seed 1000
        and displays the first 50 random integers between 0 and 100
        using the nextInt(100) method.
     */

    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        while (list.size()<1001){
            int randomNumbers = random.nextInt(100);
            list.add(randomNumbers);
        }

        System.out.println("list = " + list);

        for (int i = 0; i < 50; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
