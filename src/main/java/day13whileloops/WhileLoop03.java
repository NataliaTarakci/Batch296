package day13whileloops;

import java.util.Scanner;

public class WhileLoop03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get its multiples");
        int number = scanner.nextInt();

        int i = 1;
        int result = 1;
        while (i<11) {

            if (number<0 || number > 10) {
                System.out.println("Please provide a number between 1 and 10 only");
                break;
            }

            result = i*number;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        }
    }
}
