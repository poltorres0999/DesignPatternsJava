package VisitorTemplate.Exam20152016;

import java.util.ArrayList;
import java.util.List;

public class SumVisitor implements Visitor {

    private int infoCounter = 0;
    List<Component> visited = new ArrayList<>();

    @Override
    public void visit(Leaf l) {

        if (!visited.contains(l)) {
            infoCounter += l.getInfo();
            visited.add(l);
        }

    }

    @Override
    public void visit(Composite c) {

        if (!visited.contains(c)) {
            visited.add(c);
            for (Component co: c.getComponents()) {
                co.accept(this);
            }
        }

    }

    public int getInfoCounter () {
        return this.infoCounter;
    }
}
