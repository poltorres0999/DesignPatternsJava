package CompositeBuilderVisitor.exam20142015;

import java.util.ArrayList;
import java.util.List;

public class AreaDoubler implements Visitor {
    private Circle circle;
    private Rectangle rectangle;
    private Drawing drawing;
    private List<Drawing> visited = new ArrayList<>();

    @Override
    public void visit(Circle c) {
        double radiusDoubled = c.getRadius() * Math.sqrt(2.0);
        this.circle = new Circle(c.getX(), c.getY(), radiusDoubled);
    }

    @Override
    public void visit(Rectangle r) {

        double widthDoubled = r.getWidth() * Math.sqrt(2.0);
        double heightDoubled = r.getHeight() * Math.sqrt(2.0);
        this.rectangle = new Rectangle(r.getX(), r.getY(), widthDoubled, heightDoubled);

    }

    @Override
    public void visit(Drawing dr) {

        Drawing.drowingBuilder db = new Drawing.drowingBuilder(dr.getX(), dr.getY());
        if (!this.visited.contains(dr)) {

            for (Figure f: dr.getFigures()) {
                f.accept(this);
                if (f instanceof Circle) db.addFigure(circle);
                if (f instanceof  Rectangle) db.addFigure(rectangle);
                if (f instanceof  Drawing) db.addFigure(drawing);
            }

            drawing = db.create();

        }
    }

    public Circle getCircle() {
        return circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Drawing getDrawing() {
        return drawing;
    }
}
