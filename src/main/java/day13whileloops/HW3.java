package day13whileloops;

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {

        /*

        Create a multiplication table using the number given by user.
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16
        ....
        4 x 10 = 40

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int result = 0;
        int i = 1;
        while (i < 11) {
            if (number <1 || number> 10) {
                System.out.println("Enter the number between 1 and 10");
                break;
            }else {
                result = number*i;
                System.out.println(number + " x " + i + " = " + result);
            }
            i++;
        }
    }
}
