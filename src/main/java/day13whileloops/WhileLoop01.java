package day13whileloops;

public class WhileLoop01 {

    public static void main(String[] args) {

        int startingValue = 3;
        while (startingValue<=9) {
            System.out.println(startingValue);
            startingValue++;
        }

        int i = 68;
        while (i>34) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();
        int j = 12;
        int sum = 0;
        while (j<28) {
            sum = sum + j;
            j++;
        }
        System.out.println(sum);

    }
}
