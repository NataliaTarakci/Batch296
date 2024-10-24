package day29exceptions;

public class E05 {

    public static void main(String[] args) {

        String s = "Java is easy";
        int a = 20;
        int b = 1;
        getChar(s, a, b);
    }

    public static void getChar(String s, int a, int b){
        try {
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (ArithmeticException e){
            System.out.println("You can't divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of String which is ");
        }
    }
}
