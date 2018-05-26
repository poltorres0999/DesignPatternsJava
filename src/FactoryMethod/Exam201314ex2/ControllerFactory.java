package FactoryMethod.Exam201314ex2;

public class ControllerFactory {

    public Visualizer CreateVisualizer (Resolution r) {

        if (r == Resolution.Hi) {
            return new VisualizerHiRes();
        } else {
            return new VisualizerLowRes();
        }
    }

    public Printer createPrinter (Resolution r) {

        if (r == Resolution.Hi) {
            return new PrinterHiRes();
        } else {
            return new PrinterLowRes();
        }
    }
}
