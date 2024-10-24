package socrative;

public class Parent {

    int nonStaticVariable = 10;

    public static int staticVariable = 10;


    public static void displayStaticMethod(){
        System.out.println("Parent class");
    }

    public void displayNonStaticMethod(){
        System.out.println("Parent class");
    }
}
