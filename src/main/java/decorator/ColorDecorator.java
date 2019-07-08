package decorator;

import static java.lang.String.format;

import adapter.shape.Shape;
import decorator.attribute.Color;

public class ColorDecorator extends ShapeDecorator {
    private Color color;

    ColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println(format("Fill Color: %s", color));
    }
}