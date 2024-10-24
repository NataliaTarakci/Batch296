package day29exceptions;

public class E06 {

    public static void main(String[] args) {

        String s = "Java is not easy :)";
        String str = null;

        numOfChars(s);
        numOfChars(str);
    }

    public static void numOfChars(String s){
        try {
            int length = s.length();
            System.out.println("length = " + length);
        }catch (NullPointerException e){
            System.err.println("Can't count the length of a null variable");
        }
    }
}
