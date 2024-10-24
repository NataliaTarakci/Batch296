package day13loops;

import java.util.Random;
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        // Guess the number game => Use FOR LOOP

        Random random = new Random();
        int ranNum = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        for (int i = 1; i < i+1; i++) {

            System.out.println("Enter a whole number");
            int num = scanner.nextInt();
            counter++;

            if (num<0 && num>100) {
                System.out.println("Enter a number between 0 and 100");
            }else if (num<ranNum) {
                System.out.println("Number is smaller than Guessed number");
            }else if (num>ranNum) {
                System.out.println("Number is greater than Guessed number");
            }else if (num == ranNum) {
                System.out.println("Congratulation! You guessed the number!");
                System.out.println("You guessed the number on the " + counter + " try.");
                break;
            }
        }
    }
}
