package composite.Problem_6;

public class Rectangle extends Figure {

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;

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
        return new Rectangle(this);
    }
    */
}
