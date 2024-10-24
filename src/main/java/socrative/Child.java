package socrative;

public class Child extends Parent{

    int nonStaticVariable = 20;

    public static int staticVariable = 20;

    public static void displayStaticMethod(){
        System.out.println("Child class");
    }

    public void displayNonStaticMethod(){
        System.out.println("Child class");
    }
}
