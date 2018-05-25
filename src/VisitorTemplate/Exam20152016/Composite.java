package VisitorTemplate.Exam20152016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Composite implements Component {

    private List<Component> components = new ArrayList<>();


    public List<Component> getComponents () {

        List<Component> immutablelist = Collections.unmodifiableList(this.components);
        return immutablelist;

    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
