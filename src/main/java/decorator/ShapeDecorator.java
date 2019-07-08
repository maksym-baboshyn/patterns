package decorator;

import adapter.shape.Shape;

/**
 * We would like to have some additional functionality for the {@linkplain Shape}.
 * Maybe COLOR and STYLE?
 */
public abstract class ShapeDecorator implements Shape {
    Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}