package Composite.Problem_6;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {
    private List<Figure> figuresToDraw;
    public Drawing(float x, float y) {
        super(x, y);
        this.figuresToDraw = new ArrayList<>();
    }

    public Drawing (Drawing drawing) {
        super(drawing);
        this.figuresToDraw = drawing.figuresToDraw;
    }

    //Reference Copy
    @Override
    public Figure Copy() {
        return new Drawing(this);
    }
    /*
    Deep Copy
    @Override
    public Figure Copy() {
        return new Drawing(this);
    }
    */

    public void addFigure(Figure figure) {
        this.figuresToDraw.add(figure);
    }
}
