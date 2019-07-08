package adapter;

import adapter.geometricshape.Rhombus;
import adapter.geometricshape.Triangle;
import adapter.shape.Circle;
import adapter.shape.Rectangle;

public class AdapterDemo {
    public static void main(String[] args) {
        final Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawing...");

        drawing.draw();
    }
}