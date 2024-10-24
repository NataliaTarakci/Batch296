package day29exceptions;

public class E07 {

    public static void main(String[] args) {

        printAge(12);
        printAge(1);
        //printAge(0);

        try {
            printAge(-5);
        }catch (IllegalArgumentException e){
            System.out.println("What kind of age is that.");
        }


    }

    public static void printAge(int age){
        if (age<=0){
           throw new IllegalArgumentException("Age can't be zero");
        }else {
            System.out.println("age = " + age);
        }
    }
}
