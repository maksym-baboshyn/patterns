package facade;

import facade.shape.Circle;
import facade.shape.Rectangle;
import facade.shape.Shape;
import facade.shape.Square;

public class ShapeDrawingFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeDrawingFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}