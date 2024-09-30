package practices.practice01;

public class Q03_SwapNumbers {

    public static void main(String[] args) {
        //Type code to swap two integers
        //a=12 and b=5 ==> a=5 and b=12

        //1. way: Swapping with Temporary Variable
        int a = 12;
        int b = 5;
        System.out.println("Before swap: " + a + " " + b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        //2. way

        int x = 17 , y = 9;

        System.out.println("Before swap: " + x + " " + y );
        x = x+y;  // 17+9= 26
        y= x-y;   // 26-9= 17
        x= x-y;    // 26-17= 9

        System.out.println("After swap: " + x + " " + y );

        System.out.println("*** My practice ***");

        int num1 = 25;
        int num2 = 125;
        int temp2 = 0;
        System.out.println("Before swapping: " + num1 + " " + num2);
        temp2 = num1;
        num1 = num2;
        num2 = temp2;
        System.out.println("After swapping: " + num1 + " " + num2);
        System.out.println(temp2);

        System.out.println("***2nd way***");
        System.out.println("Before swapping: " + num1 + " " + num2);
        num1 = num1+num2; //25+125 num1=150
        num2 = num1-num2; //150-125 num2=25
        num1 = num1-num2; //150-25 num1=125
        System.out.println("After swapping: " + num1 + " " + num2);



    }
}
