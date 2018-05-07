package Obvserver.Problem7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Observable;
import java.util.Observer;

public class concreteObserver implements Observer {

    private String file;

    public concreteObserver (String path) {
        this.file = path;
    }

    @Override
    public void update(Observable o, Object arg) {

        Sale sale = (Sale) o;
        SLI sli = sale.getLines().get(sale.getLines().size()-1);
        String s = sli.toString();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println(s);
        writer.close();

    }
}
