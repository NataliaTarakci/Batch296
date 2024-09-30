package day06switch_ternary;

import java.util.Scanner;

public class HW_NestedIF {

    public static void main(String[] args) {
        /*
         Ask user to enter a password

            If the initial of the password is uppercase
          Check if it is 'A' or not.
          If it is 'A' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; Ali ==> Valid password    -    Mark ==> Invalid

           If the initial of the password is lowercase
          Check if it is 'z' or not.
          If it is 'z' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; zoe ==> Valid password  -   john ==> Invalid


         NOTE: Use NESTED IF statements

         HINTS:
         Primary condition => uppercase or lowercase
         Secondary / nested condition => starts with 'A' or 'z'
         charAt() method returns single character on the given index
         indexes start from 0

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        char initial = password.charAt(0);
        if (initial >= 'A' && initial <= 'Z') {
            if (initial == 'A') {
                System.out.println("Valid Password");
            }else {
                System.out.println("Invalid Password");
            }
        }else if (initial >= 'a' && initial <= 'z') {
            if (initial == 'z') {
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid Password");
            }
        }else {
            System.out.println("Password should start with uppercase or lowercase letter");
        }

        String result = initial >= 'A' && initial <= 'Z' ?
                (initial == 'A' ? "Valid Password" : "Invalid Password"):
                initial >= 'a' && initial <= 'z' ? (initial == 'z' ? "Valid Password" : "Invalid Password") :
                        "Password should start with uppercase or lowercase letter";
        System.out.println(result);

//
//        //        NESTED IF statements
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your password");
//
//        char pwdInitial = scan.next().charAt(0);
//
//        if ( pwdInitial >= 'A' && pwdInitial <= 'Z'){
//            if (pwdInitial == 'A'){
//                System.out.println("Valid Password");
//            } else {
//                System.out.println("Invalid Password");
//            }
//
//
//        } else if (pwdInitial >= 'a' && pwdInitial <= 'z') {
//
//            if (pwdInitial == 'z'){
//                System.out.println("Valid Password");
//            } else {
//                System.out.println("Invalid Password");
//            }
//
//
//        } else {
//            System.out.println("Password should start with uppercase or lowercase letter");
//        }
//
//
//        System.out.println("=== Nested Ternary ===");
//
//        // Nested Ternary
//
//        String check = ( pwdInitial >= 'A' && pwdInitial <= 'Z') ? (pwdInitial == 'A' ? "Valid Password" : "Invalid Password") : (pwdInitial >= 'a' && pwdInitial <= 'z') ? (pwdInitial == 'z' ? "Valid Password" : "Invalid Password"):"Invalid Password";
//
//        System.out.println(check);

    }
}
