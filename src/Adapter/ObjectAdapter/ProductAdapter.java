package Adapter.ObjectAdapter;

import Adapter.ClassAdapter.CurrencyEchange;

public class ProductAdapter extends ExtendedProduct {

    public static final double euroToKuna = 7.39770757;
    public static final double euroToDollar = 1.228848;
    public static final double euroToPound = 0.877249792;
    private Product product;

    public ProductAdapter(Product product) {
        super(product.getId(), product.getName(), product.getPrice());
        this.product = product;
    }

    @Override
    public double getPriceKunas() {
        return  this.product.getPrice() * euroToKuna;
    }

    @Override
    public double getPriceDollars() {

        return this.product.getPrice() * euroToDollar;
    }

    @Override
    public double getPricePounds() {

        return this.product.getPrice() * euroToPound;
    }
}
