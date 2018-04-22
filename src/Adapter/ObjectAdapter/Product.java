package Adapter.ObjectAdapter;

public class Product {

    private int Id;
    private String name;
    private String description;
    private double price;

    public Product (int Id, String name, String description, double price) {
        this.Id = Id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
