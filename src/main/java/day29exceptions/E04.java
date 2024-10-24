package day29exceptions;

public class E04 {

    public static void main(String[] args) {

        String[] arr = {"J", "a", "v", "a"};

        getElementFromArray(arr, 2);
        getElementFromArray(arr, 4);
    }

    public static void getElementFromArray(String[] s, int idx){
        try {
            String element = s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of array which is "+(s.length-1));
        }

    }
}
