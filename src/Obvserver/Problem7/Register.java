package Obvserver.Problem7;

import java.util.Observer;

public class Register {

    private static final String logPath = "";

    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    public void createNewSale() {
        currentSale = new Sale();
    }

    public void addObserverToCurrentSale(concreteObserver obs) {
        currentSale.addObserver(obs);
    }
}
