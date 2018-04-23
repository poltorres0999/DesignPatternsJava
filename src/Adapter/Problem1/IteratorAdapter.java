package Adapter.Problem1;

import java.util.Iterator;
import java.util.StringTokenizer;

public class IteratorAdapter implements Iterator {

    private StringTokenizer st;

    public IteratorAdapter(StringTokenizer stringTokenizer) {

        this.st = stringTokenizer;

    }

    @Override
    public boolean hasNext() {
        return this.st.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.st.nextElement();
    }
}
