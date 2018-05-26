package CompositeBuilderVisitor.exam20142015;

public abstract class Figure {

    private final double x;
    private final double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void accept (Visitor v);

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
