package day13loops;

import java.util.Scanner;

public class HW {

    public static void main(String[] args) {

        /*
        Ask user for the number of rows and columns

        Draw the following pattern on the console:

        *
        * *
        * * *
        * * * *

         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int rows = scanner.nextInt();
//
//        for (int i = 1; i <= rows; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print!");
        int rows = scan.nextInt();

        for (int i = 1; i <=  rows; i++) {

            for (int j = 1; j <= i; j++) {   // NOTE: i in  j<=i; is used to control the number of repetition and keep it according to outer loop
                System.out.print("* ");

            }

            System.out.println();

        }




    }
}
