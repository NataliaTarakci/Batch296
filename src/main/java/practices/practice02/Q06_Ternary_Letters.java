package practices.practice02;

import java.util.Scanner;

public class Q06_Ternary_Letters {

    public static void main(String[] args) {
          /*
        Ask the user to enter a character and check if it is a letter.
        If it is not a letter, print "Not Letter" on the console.
        If it is a letter check if it is lowercase or uppercase letter.
        If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = scanner.next().charAt(0);

        String output = (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') ?
                (letter >= 'a' && letter <= 'z') ? "Lowercase Letter" : "Uppercase Letter" :
                "Not Letter";
        System.out.println(output);

        /*
        Ask the user to enter a character and check if it is a letter.
        If it is not a letter, print "Not Letter" on the console.
        If it is a letter check if it is lowercase or uppercase letter.
        If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
         */

        System.out.println("***My practice***");

        Scanner scanner1 =  new Scanner(System.in);
        System.out.println("Enter a character");
        char letter1 = scanner1.next().charAt(0);

        String output1 = (letter1>= 'a' && letter1 <='z') || (letter1>= 'A' && letter1 <='Z') ?
                (letter1>= 'a' && letter1 <='z') ? "Lowercase Letter" : "Uppercase Letter" : "Not Letter";
        System.out.println(output1);





















    }
}
