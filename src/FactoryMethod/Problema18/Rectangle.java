package FactoryMethod.Problema18;

public class Rectangle extends Figure {
    @Override
    public figureVisualitzation createFigureVisualitzation() {
        return new rectangleVisualitzation(this);
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
