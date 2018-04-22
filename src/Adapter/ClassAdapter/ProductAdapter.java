package Adapter.ClassAdapter;

public class ProductAdapter extends Product implements CurrencyEchange {

    public static final double euroToKuna = 7.39770757;
    public static final double euroToDollar = 1.228848;
    public static final double euroToPound = 0.877249792;

    public ProductAdapter(int Id, String name, String description, double price) {
        super(Id, name, description, price);
    }

    @Override
    public double getPriceKunas() {
        return this.getPrice() * euroToKuna;
    }

    @Override
    public double getPriceDollars() {
        return this.getPrice() * euroToDollar;
    }

    @Override
    public double getPricePounds() {
        return this.getPrice() * euroToPound;
    }
}
