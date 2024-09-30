package day13dowhileloops;

public class DoWhile01 {

    public static void main(String[] args) {

        int i = 1;
        while (i<1) {
            System.out.println("while loop");
            i++;
        }

        int k = 1;
        do {
            System.out.println("do while loop");
        }while (k<1);

        int j = 3;
        do {
            System.out.println(j);
            j++;
        }while (j<13);
    }
}
