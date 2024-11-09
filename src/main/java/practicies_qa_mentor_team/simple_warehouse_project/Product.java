package practicies_qa_mentor_team.simple_warehouse_project;

public class Product {


    private String productName;
    private String manufacturer;
    private int quantity;
    private String unit;
    private String shelf;

    public Product() {
    }

    public Product(String productName, String manufacturer, int quantity, String unit, String shelf) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelf = shelf;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}


