package practices.practice02;

import java.util.Scanner;

public class Q02_IfStatement_SalaryBonus {

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
        System.out.println("Enter the number of years of your job");
        int year = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        if( year>= 5){
            //calculate the bonus
            double bonus = salary*5/100;
            System.out.println("bonus = " + bonus);
            double newSalary = salary+bonus;
            System.out.println("newSalary = " + newSalary);
        }else {
            System.out.println("You need to work "+ (5-year) + "year(s) more to qualify for a bonus");
        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of the years of the service in the company");
        int yearsOfServ = scanner2.nextInt();
        System.out.println("Enter your salary");
        double salary2 = scanner2.nextDouble();

        if (yearsOfServ>=5) {
            double bonus = salary2 *0.05;
            System.out.println("Your bonus is: " + bonus);
            double newSal = salary2+bonus;
            System.out.println("Your new salary: " + newSal);
        }else {
            System.out.println("You should work " + (5-yearsOfServ) + " more year(s) to get bonus");
        }
























    }
}
