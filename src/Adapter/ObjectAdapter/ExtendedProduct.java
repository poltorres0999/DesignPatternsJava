package Adapter.ObjectAdapter;

public abstract class ExtendedProduct {

    private int Id;
    private String productName;
    private double euroPrice;

    public ExtendedProduct(int Id, String productName, double euroPrice) {
        this.Id = Id;
        this.productName = productName;
        this.euroPrice = euroPrice;
    }

    public abstract double getPriceKunas();
    public abstract double getPriceDollars();
    public abstract double getPricePounds();
}
