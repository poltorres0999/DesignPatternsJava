package Builder.Exam20152016;

public class FigureBuilder {

    private double x;
    private double y;
    private double width;
    private double height;
    private double radious;

    private boolean withRadious = false;
    private boolean withDimensions = false;
    private boolean at = false;

    public FigureBuilder at(double x, double y) {
        if (!at) {
            at = true;
            this.x = x;
            this.y = y;
        }
        return this;
    }
    public FigureBuilder withRadious(double radious) {

        if (!this.withDimensions) {
            this.radious = radious;
            this.withRadious = true;
        }
        throw new IllegalStateException();
    }

    public FigureBuilder withDimensions(double width, double height) {

        if (!this.withRadious) {
            this.width = width;
            this.height = height;
        }
        throw new IllegalStateException();
    }

    public Figure execute() {
        if (!this.at) throw new IllegalStateException();
        if (!this.withRadious && !this.withDimensions) throw new IllegalStateException();
        if (this.withDimensions) {
            return new Rectangle(this.x,this.y, this.width, this.height);
        }
        return new Circle(this.x, this.y, this.radious);
    }
}
