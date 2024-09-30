package day13loops;

public class NestedForLoop01 {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("   Day: " + j);

            }

        }

          /*
         Example: Print the following pattern on the console:
                    * * * *
                    * * * *
                    * * * *
                    * * * *
         */

        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
