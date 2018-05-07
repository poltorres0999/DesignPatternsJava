package Obvserver.Problem7;

public class ProductDescription {

    private String description;
    private int price;

    public ProductDescription(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription () {
        return description;
    }

    public int getPrice () {
        return this.price;
    }

    public String toString () {
        String s = "Price: " + Integer.toString(this.price) + " " + "description: " + this.description;
        return s;
    }
}
