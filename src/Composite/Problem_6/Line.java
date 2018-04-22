package Composite.Problem_6;

public class Line extends Figure {

    private float x2;
    private float y2;

    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line (Line line) {
        super(line);
        this.x2 = line.x2;
        this.y2 = line.y2;
    }
    //Reference Copy
    @Override
    public Figure Copy() {
        return this;
    }
    /*
    Deep Copy
    @Override
    public Figure Copy() {
        return new Line(this);
    }
    */
}
