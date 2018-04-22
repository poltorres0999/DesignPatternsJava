package composite.Problem_6;

public class Circle extends Figure {

    private float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }


    public Circle (Circle circle) {
        super(circle);
        this.r = circle.r;

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
        return new Circle(this);
    }
    */

}
