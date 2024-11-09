package practicies_qa_mentor_team.simple_warehouse_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WarehouseSystem {

    static Scanner scanner = new Scanner(System.in);
    public static Map<Integer, Product> warehouseItems = new HashMap<>();
    public static Integer productId = 1000;

    public static void productMenu(){
        System.out.println("===========================================" +
                            "\nCHOOSE AN OPERATION FROM THE LIST BELOW" +
                            "\n===========================================" +
                            "\nTo define the product: press 1" +
                            "\nTo list the products: press 2" +
                            "\nTo add the product to the list: press 3" +
                            "\nTo put the product on a shelf: press 4" +
                            "\nTo exit the product: press 5" +
                            "\nTo exit the program: press 6" +
                            "\n==========================================");
        System.out.println("Enter the number of the operation:");
        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                productDefinition();
                productMenu();
                break;
            case "2":
                listProducts();
                productMenu();
                break;
            case "3":
                productInput();
                listProducts();
                productMenu();
                break;
            case "4":
                putProductOnShelf();
                listProducts();
                productMenu();
                break;
            case "5":
                exitProduct();
                listProducts();
                productMenu();
                break;
            case "6":
                System.out.println("The process has finished.");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }


    // 1 productDefinition ==> the name, manufacturer and unit of the product will be entered. id will be taken.
    public static void productDefinition(){
        System.out.println("***** Product description page *****");
        System.out.println("Enter the product name");
        String productName = scanner.nextLine();
        System.out.println("Enter the manufacturer of the product");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter the unit of the product");
        String productUnit = scanner.nextLine();
        int quantity = 0;
        String shelf = "-";
        Product newProduct = new Product(productName, manufacturer, quantity, productUnit, shelf);
        warehouseItems.put(productId, newProduct);
        System.out.println("The new product: " + newProduct.getProductName() +
                " has been successfully added to the warehouse system with product ID: " + productId);
        productId++;
    }

    // 2 List product ==> the defined products will be listed. If the quantity and shelf number of the product are not defined, the default value will be displayed.
    // printf(%10)
    public static void listProducts(){
        System.out.println("==============================================================================");
        System.out.println("ID       Product Name       Manufacturer       Quantity       Unit       Shelf");
        System.out.println("==============================================================================");
        for (Map.Entry<Integer, Product> entry : warehouseItems.entrySet()){
            Integer key = entry.getKey();
            System.out.printf("%-8d %-18s %-18s %-14d %-10s %-10s\n",
                    key, warehouseItems.get(key).getProductName(),
                    warehouseItems.get(key).getManufacturer(),
                    warehouseItems.get(key).getQuantity(),
                    warehouseItems.get(key).getUnit(),
                    warehouseItems.get(key).getShelf());
        }
    }

    // 3 productInput ==> we will enter the id number of the product we want to enter.
    public static void productInput(){
        System.out.println("Enter the product ID you want to add to the list");
        Integer id = scanner.nextInt();
        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        if (warehouseItems.keySet().contains(id)){
            warehouseItems.get(id).setQuantity(quantity + warehouseItems.get(id).getQuantity());
        }else {
            System.out.println("Invalid input: This ID: " + id +
                    " doesn't exist in the warehouse system. Please try again.");
        }
    }

    // 4 PutProductOnShelve ==> we will select the product from the list and put the product on the shelf according to the id number.
    public static void putProductOnShelf(){
        System.out.println("Enter the product ID you want to put on the shelf");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the shelf number");
        String shelfNumber = scanner.nextLine();
        if (warehouseItems.keySet().contains(id)){
            warehouseItems.get(id).setShelf(shelfNumber);
        }else {
            System.out.println("Invalid input: This ID: " + id +
                    " doesn't exist in the warehouse system. Please try again.");
        }
    }

    // 5 ProductExit ==> we will select the product from the list and exit the product. Here, only the quantity will be changed from the product list.
    public static void exitProduct() {
        System.out.println("Enter the product ID you want to exit");
        Integer id = scanner.nextInt();
        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        if (warehouseItems.keySet().contains(id)) {
            if (warehouseItems.get(id).getQuantity() < quantity) {
                System.out.println("There is not enough of this product left in stock." +
                        "\nThe remaining quantity of this product at the moment is: " +
                        warehouseItems.get(id).getQuantity() + " " +
                        warehouseItems.get(id).getUnit() + ". Please try again.");
            } else {
                warehouseItems.get(id).setQuantity(warehouseItems.get(id).getQuantity() - quantity);
                System.out.println("The remaining quantity of this product is: " +
                        warehouseItems.get(id).getQuantity() + " " +
                        warehouseItems.get(id).getUnit());
            }
        }else {
            System.out.println("Invalid input: This ID: " + id +
                    " doesn't exist in the warehouse system. Please try again.");
        }
    }

}
