package day10stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

    public static void main(String[] args) {

             /*
         Example: Check the given password if it meets the following conditions:

        // it shouldn't be empty
        // it shouldn't contain just space characters, there must be other characters as well
        // it shouldn't contain starting and ending spaces

        NOTE: use isEmpty() or isBlank() method
         */
        /*

        String s = "";
        System.out.println(s.isEmpty()); // true
        System.out.println(s.isBlank()); // true

        String str = " ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true  because space is considered invisible value


         */

        // Let's solve the question now
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password ");
        String pwd = scanner.nextLine();

        // it shouldn't be empty
        // boolean firstCondition = pwd.isEmpty(); => this will return false because our pwd is not empty
        boolean firstCondition = !pwd.isEmpty(); // false
        System.out.println("firstCondition = " + firstCondition); // true

        if (!firstCondition){
            System.out.println("Password shouldn't be empty");
        }

        /*
         boolean firstCondition = pwd.isEmpty(); // true
       // System.out.println("firstCondition = " + firstCondition); // true

        if (firstCondition){
            System.out.println("Password shouldn't be empty");
        }
         */

        // it shouldn't contain just space characters, there must be other characters as well
        boolean secondCondition = !pwd.isBlank();
        System.out.println("secondCondition = " + secondCondition); // true


        if (!secondCondition){
            System.out.println("Password shouldn't contain just space characters");
        }

        /*

        boolean secondCondition = pwd.isBlank();
        System.out.println("secondCondition = " + secondCondition); // false


        if (secondCondition){
            System.out.println("Password shouldn't contain just space characters");
        }
         */

        // it shouldn't contain starting and ending spaces
        boolean thirdCondition = pwd.trim().equals(pwd);
        System.out.println("thirdCondition = " + thirdCondition); // false

        if (!thirdCondition){
            System.out.println("Password shouldn't contain starting and ending spaces");
        }



    }
}
