package decorator;

import adapter.shape.Shape;
import decorator.attribute.Style;

public class StyleDecorator extends ShapeDecorator {
    private Style style;

    public StyleDecorator(Shape decoratedShape, Style style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println(String.format("Shape Style: %s", style));
    }
}