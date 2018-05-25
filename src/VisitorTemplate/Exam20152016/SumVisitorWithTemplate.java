package VisitorTemplate.Exam20152016;

import Visitor.Exam20152016.VisitorTemplate;

public class SumVisitorWithTemplate extends VisitorTemplate {

    private int total = 0;

    @Override
    protected void templateMethod(Leaf l) {
        total += l.getInfo();
    }
}
