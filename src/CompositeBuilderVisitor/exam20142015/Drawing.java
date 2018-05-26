package CompositeBuilderVisitor.exam20142015;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {

    private final List<Figure> figures;

    public Drawing(double x, double y, List<Figure> figures) {
        super(x, y);
        this.figures = figures;
    }

    public Drawing(drowingBuilder db) {
        super(db.x, db.y);
        this.figures = db.figures;

    }

    public static class drowingBuilder {

        private final double x;
        private final double y;
        private List<Figure> figures;

        public drowingBuilder(double x, double y, List<Figure> figures) {
            this.x = x;
            this.y = y;
            this.figures = figures;
        }

        public drowingBuilder addFigure(Figure figure) {
            if (!this.figures.contains(figure)) {
                this.figures.add(figure);
                return this;
            } else {
                throw new IllegalStateException("Repeated item not allowed");
            }
        }

        public Drawing create() {

            return new Drawing(this);

        }

    }
}
