package day29exceptions;

public class E03 {

    public static void main(String[] args) {

        String s = "Java is easy";

        getChar(s, 0);
        getChar(s, 3);
        getChar(s, 12);
    }

    public static void getChar(String s, int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Use index according to the length of the String");
            System.err.println("Don't use index out of bound");
            e.printStackTrace();
            System.out.println("Hello");
        }

    }
}
