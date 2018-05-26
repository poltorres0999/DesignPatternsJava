package CompositeBuilderVisitor.exam20142015;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getWidth() {
        return width;
    }
}
