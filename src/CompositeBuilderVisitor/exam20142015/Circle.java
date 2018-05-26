package CompositeBuilderVisitor.exam20142015;

public class Circle extends Figure {

    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getRadius() {
        return radius;
    }
}
