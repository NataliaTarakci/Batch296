package practicies_qa_mentor_team.simple_warehouse_project;

public class Product {

    private int productId;
    private String productName;
    private String manufacturer;
    private int quantity;
    private String unit;
    private String shelf;

    public Product() {
    }

    public Product(String productName, String manufacturer, String unit) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.unit = unit;
    }

    public Product(int productId, String productName, String manufacturer, int quantity, String unit, String shelf) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelf = shelf;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
