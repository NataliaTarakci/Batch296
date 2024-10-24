package day29exceptions;

public class E02 {

    public static void main(String[] args) {

        String s = "1234";

        String str = "123abc87";

        convertStringToInt(s);
        convertStringToInt(str);
    }

    public static void convertStringToInt(String s){
        try {
            int numbers = Integer.valueOf(s);
            System.out.println("numbers in int data type = " + numbers);
        }catch (NumberFormatException e){
            System.out.println("Strings with mix of numbers and letters can't be converted to int data");
            System.out.println(e.getMessage());

        }

    }
}
