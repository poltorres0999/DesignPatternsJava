package Obvserver.Problem7;

public class Register {

    private static final String logPath = "";

    private Store store;
    private Sale currentSale;
    private concreteObserver cObserver;

    public Register(Store store) {
        this.store = store;
        this.cObserver = new concreteObserver(logPath);
    }

    public void createNewSale() {
        currentSale = new Sale();
        currentSale.addObserver(cObserver);
    }
}
