package Obvserver.Problem7;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Sale extends Observable {

    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem (ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        setChanged();
        notifyObservers(); // --> pull
        //notifyObservers(sli); --> push
    }

    public List<SLI> getLines() {
        return lines;
    }
}


