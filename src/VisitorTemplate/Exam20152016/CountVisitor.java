package VisitorTemplate.Exam20152016;

import java.util.ArrayList;
import java.util.List;

public class CountVisitor implements Visitor {

    private int totalLeafs = 0;
    List<Component> visited = new ArrayList<>();

    @Override
    public void visit(Leaf l) {

        if (!visited.contains(l)) {
            totalLeafs += 1;
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

    public int getTotalLeafs () {
        return this.totalLeafs;
    }
}
