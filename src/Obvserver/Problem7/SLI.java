package Obvserver.Problem7;

public class SLI {

    private ProductDescription desc;
    private int quantity;

    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal () {
        return desc.getPrice() * this.quantity;
    }

    public String toString () {
        String s = desc.toString() + " " +  "subTotal: " + Integer.toString(this.subTotal());
        return s;
    }
}
