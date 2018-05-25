package VisitorTemplate.Exam20152016;

public class Leaf implements Component {

    private int info;

    public int getInfo () {
        return this.info;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

