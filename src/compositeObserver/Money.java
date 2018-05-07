package compositeObserver;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Money {
    private BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCurrency() {
        return this.amount;
    }

    public void increase (BigDecimal bd) {
        this.amount = this.amount.add(bd);
    }


    public String toString () {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double doublePayment = this.amount.doubleValue();
        String s = n.format(doublePayment);
        return s;
    }


}
