package practices.practice03;

import java.util.Random;
import java.util.Scanner;

public class Q06_DoWhile_GuessGame {

    public static void main(String[] args) {

        /*
                HOMEWORK

                Type code for a game that finds random numbers between 0 and 100
                Hint:
                   If the number you entered is less than random number, print => Enter a greater number
                   If the number you entered is greater than random number, print => Enter a smaller number
                   If the number you entered is equal to the random number, print => Congratulations! You found the number
         */

        Random random = new Random();
        int randomNum = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        int num;
        boolean isGuessed = true;

        do {
            System.out.println("Enter a number");
            num = scanner.nextInt();
            if (num<randomNum){
                System.out.println("Enter a greater number");
            }else if (num>randomNum){
                System.out.println("Enter a smaller number");
            }else {
                System.out.println("Congratulations! You found the number");
                isGuessed = false;
            }

        }while (isGuessed);


    }
}
