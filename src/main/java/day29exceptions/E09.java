package day29exceptions;

public class E09 {

    public static void main(String[] args) {

        String[] arr = {"Java", "is", "not", "easy."};

        int a = 12;
        int b = 0;

        getElementFromArray(arr, a, b);

    }

    public static void getElementFromArray(String[] s, int a, int b){
        try {
            int idx = a/b;
            String element = s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of array which is "+(s.length-1));
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //Connection.close;
            System.out.println("Cut the connection with the database.");
        }

    }
}
