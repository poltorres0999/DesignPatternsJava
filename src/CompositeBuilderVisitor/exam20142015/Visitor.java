package CompositeBuilderVisitor.exam20142015;

public interface Visitor {

    void visit(Circle c);
    void visit(Rectangle r);
    void visit(Drawing dr);
}
