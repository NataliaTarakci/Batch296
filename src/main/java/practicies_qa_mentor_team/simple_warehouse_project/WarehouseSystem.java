package practicies_qa_mentor_team.simple_warehouse_project;

import java.util.ArrayList;
import java.util.List;

public class WarehouseSystem {

    private static List<Product> productList = new ArrayList<>();

    public static void productDefinition(String productName, String manufacturer, String unit){
        Product product = new Product(productName, manufacturer, unit);
        productList.add(product);
    }

    public static void productList(){
        for (Product product : productList){
            System.out.println(product.toString());
        }
    }

    public static void productInput(){
        int productId = 1000;
        for (Product product : productList){
            product.setProductId(productId);
            productId++;
        }
    }

    public static void putProductOnShelve(){
        int shelfId = 1;
        for (Product product : productList) {
            product.setShelf("shelf" + shelfId);
            shelfId++;
        }
    }

    public static void displayAllProducts() {
        System.out.println("id   -  name  -  manufacturer  -   quantity  -   unit   -   shelf");
        for (Product product : productList) {
            System.out.println(product.getProductId() + " - " + product.getProductName() + "   -  " + product.getManufacturer() + "    -      " + product.getQuantity() + "     -   " + product.getUnit() + "   -   " + product.getShelf());
        }
    }


}
