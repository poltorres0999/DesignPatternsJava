package VisitorTemplate.Exam20152016;

import java.util.ArrayList;
import java.util.List;

public abstract class VisitorTemplate implements Visitor{

    private List<Component> visited = new ArrayList<>();

    @Override
    public void visit(Leaf l) {

        if (!visited.contains(l)) {
            visited.add(l);
            templateMethod(l);
        }
    }

    @Override
    public void visit(Composite c) {

    }

    protected abstract void templateMethod(Leaf l);
}
