package day13whileloops;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

        /*
            Example: Ask user to enter a number. Find the sum of the digits of the given number.
            123 => 1+2+3 => 6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number>0) {
            sum = sum + number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}
