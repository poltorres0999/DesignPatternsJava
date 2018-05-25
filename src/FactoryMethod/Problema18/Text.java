package FactoryMethod.Problema18;

public class Text extends Figure {
    @Override
    public figureVisualitzation createFigureVisualitzation() {
        return new textVisualitzation(this);
    }

    @Override
    public void clockButtonOn() {

    }

    @Override
    public void move() {

    }

    @Override
    public void drag() {

    }

    @Override
    public void drop() {

    }
}
