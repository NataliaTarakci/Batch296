package day05ifstatements;

import java.util.Scanner;

public class HW {

    public static void main(String[] args) {

        /*
                 A company decided to give bonus of 5% of salary to the employee if his/her year of
            service is 5 and more than 5 years.

            Ask user for their salary and year of service and print the net bonus amount.
            If employee can not get bonus, print how many years he/she should work more.

            EXAMPLE:
            INPUT  :   Year     => 4 years service
                       Salary   => 4000

            OUTPUT:   You need to work 1 more year(s) to get bonus
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of service");
        int years = scanner.nextInt();
        System.out.println("Enter your salary");
        double salary1 = scanner.nextDouble();
        if (years>=5) {
            double bonus = salary1*0.05;
            System.out.println("Your bonus is: " + bonus);
            double newSalary = salary1+bonus;
            System.out.println("Your new salary is: " + newSalary);
        }else {
            System.out.println("You should work " + (5-years) + " more year(s) to get bonus");
        }


        // 1st way
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of years of your job");
//        int year = scan.nextInt();
//        System.out.println("Enter your salary");
//        double salary = scan.nextDouble();
//
//        if (year>=5) {
//            // calculate the bonus
//            double bonus = salary*5/100;
//            System.out.println("Your bonus = " + bonus);
//            double newSalary = salary+bonus;
//            System.out.println("Your new salary = " + newSalary);
//        }else {
//            System.out.println("You need to work " + (5-year) + " year(s) more to qualify for a bonus");
//        }

        // 2nd way:

//        System.out.println("Please enter your years of service: ");
//        byte yService = scan.nextByte();
//
//        if (yService<5) {
//            System.out.println("Ohhh, sorry. You have no bonus for now. You have to work " + (5-yService) +
//                    " more year(s) to get a bonus");
//
//        }else {
//            System.out.println("Please enter your salary: ");
//            double salary2 = scan.nextDouble();
//            System.out.println("Well done! You have " + salary2*0.05 + " bonus");
//        }

    }
}
