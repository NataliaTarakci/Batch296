package practices.practice01;

import java.util.Scanner;

public class Q04_HW_Scanner {

    public static void main(String[] args) {
  /*
        Task: Ask user to enter his/her first name, age, height,
        and weight then print them on the console in this format:
            First Name: …
            Last Name: …
            Age: …
            Height: …
            Weight: …
            Note: Use only on “System.out.println();”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name please");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name please");
        String lastName = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        // byte age = scan.nextByte();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.print("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nHeight: "+ height+ "\nWeight: "+ weight +"\n");

        System.out.println("***My practice***");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String firstName = scanner.next();
//        System.out.println("Enter your last name");
//        String lastName = scanner.next();
//        System.out.println("Enter your age");
//        int age = scanner.nextInt();
//        System.out.println("Enter your height");
//        int height = scanner.nextInt();
//        System.out.println("Enter your weight");
//        int weight = scanner.nextInt();
//        System.out.println("First Name: "+firstName+ "\nLast Name: "+lastName+ "\nAge: "+age+ "\nHeight: "+height+ "\nWeight: "+weight);


    }
}
