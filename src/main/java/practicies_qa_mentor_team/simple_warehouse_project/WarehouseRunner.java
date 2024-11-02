package practicies_qa_mentor_team.simple_warehouse_project;

import static practicies_qa_mentor_team.simple_warehouse_project.WarehouseSystem.*;

public class WarehouseRunner {

    public static void main(String[] args) {

        productDefinition("Flour", "hekimoglu", "sack");
        productDefinition( "Sugar", "hekimoglu", "sack");
        productDefinition( "Rice", "hekimoglu", "sack");

        productList();// prints list of products
        /* output on the console:
        Product{productId=0, productName='Flour', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
        Product{productId=0, productName='Sugar', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
        Product{productId=0, productName='Rice', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
         */
        System.out.println(" == ");

        productInput();// gives product ID

        productList();// prints list of products
        /* output on the console:
        Product{productId=1000, productName='Flour', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
        Product{productId=1001, productName='Sugar', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
        Product{productId=1002, productName='Rice', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='null'}
         */
        System.out.println(" == ");

        putProductOnShelve();// puts product on the shelf

        productList();// prints list of products
        /* output on the console:
        Product{productId=1000, productName='Flour', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='shelf1'}
        Product{productId=1001, productName='Sugar', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='shelf2'}
        Product{productId=1002, productName='Rice', manufacturer='hekimoglu', quantity=0, unit='sack', shelf='shelf3'}
         */
        System.out.println(" == ");

        displayAllProducts();
        /*
            id   -  name  -  manufacturer  -   quantity  -   unit   -   shelf
            1000 - Flour   -  hekimoglu    -      0     -   sack   -   shelf1
            1001 - Sugar   -  hekimoglu    -      0     -   sack   -   shelf2
            1002 - Rice   -  hekimoglu    -      0     -   sack   -   shelf3
         */


    }
}
