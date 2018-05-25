package FactoryMethod.Problema18;

public abstract class figureVisualitzation {

    private Figure figure;

    public figureVisualitzation(Figure figure) {

        this.figure = figure;
    }

    public abstract void display();
    public abstract void scale();

}
