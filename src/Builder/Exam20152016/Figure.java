package Builder.Exam20152016;

public class Figure {

    private double x;
    private double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public FigureBuilder create() {
        return new FigureBuilder();
    }
}
