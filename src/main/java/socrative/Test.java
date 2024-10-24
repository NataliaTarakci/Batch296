package socrative;

public class Test {

    public static void main(String[] args) {

        Parent p = new Child();

        System.out.println(p.nonStaticVariable);//10 => from Parent class
        p.displayNonStaticMethod();//Child class => from Child class

        //System.out.println(p.staticVariable);//10 => from Parent class
        //p.displayStaticMethod();//Parent class => from Parent class

    }
}
