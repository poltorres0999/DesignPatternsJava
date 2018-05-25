package VisitorTemplate.Exam20152016;

public interface Visitor {

    void visit (Leaf l);
    void visit (Composite c);
}
