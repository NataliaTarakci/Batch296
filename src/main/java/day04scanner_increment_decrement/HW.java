package day04scanner_increment_decrement;

import java.util.Scanner;

public class HW {

    public static void main(String[] args) {

      /*
         Q.1: Type a code which calculates the area and the perimeter of a square
              whose side length is entered by user.
        Q.2: Type a code which calculates the cube of a number which is entered by user.
        Q.3: Type a code which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
        Q.4: Type a code which converts the mile to kilometer. Mile value will be
            entered by user. (Use double)
        Q.5: Type a code which converts the hours to seconds. Hours value will be
            entered by user. (Use long)
        Q.6: Type a program which asks user to enter his/her full name, and address
             then print them on the console like the full name should be in the first line,
             and the address will be in the second line.
       */

        //Q.1: Type a code which calculates the area and the perimeter of a square
        //              whose side length is entered by user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the square");
        double length = scanner.nextDouble();
        double area1 = 2*length;
        double perimeter1 = 4*length;
        System.out.println("The area of the square: " + area1 + "\nThe perimeter of the square: " + perimeter1);

        //Q.2: Type a code which calculates the cube of a number which is entered by user.
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int cube = number*number*number;
        System.out.println("cube = " + cube);

        //Q.3: Type a code which calculates the area and the perimeter of a circle
        //            whose radius is entered by user. (Use float)
        System.out.println("Enter a radius of a circle");
        float radius = scanner.nextFloat();
        float area2 = 3.14f*radius*radius;
        float perimeter2 = 2*3.14f*radius;
        System.out.println("The area of a circle: " + area2 + "\nThe perimeter of a circle: " + perimeter2);

        //Q.4: Type a code which converts the mile to kilometer. Mile value will be
        //            entered by user. (Use double)
        System.out.println("Enter the mile value");
        double mile = scanner.nextDouble();
        double km = 1.60934*mile;
        System.out.println("In " + mile + " mile(s) " + km + " kilometer(s)");

        //Q.5: Type a code which converts the hours to seconds. Hours value will be
        //            entered by user. (Use long)
        System.out.println("Enter the hour value");
        long hours = scanner.nextLong();
        long seconds = 60*60*hours;
        System.out.println("In " + hours + " hour(s) " + seconds + " second(s)");

        //Q.6: Type a program which asks user to enter his/her full name, and address
        //             then print them on the console like the full name should be in the first line,
        //             and the address will be in the second line.
        System.out.println("Enter your full name and address");
        String fullName = scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println("Fullname: " + fullName + "\nAddress: " + address);


    }
}
