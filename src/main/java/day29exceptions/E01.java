package day29exceptions;

public class E01 {

    public static void main(String[] args) {

        divide(8, 4);
        divide(8, 0);
        divide1(6, 0);


    }
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("Division is not possible by zero");
        }else {
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");
        }
    }

    public static void divide1(int a, int b){
        try {
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");
        }catch (ArithmeticException e){
            System.out.println("Division is not possible by zero");
        }

    }
}
