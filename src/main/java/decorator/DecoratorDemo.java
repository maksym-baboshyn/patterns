package decorator;

import static decorator.attribute.Color.BLUE;

import adapter.shape.Circle;
import adapter.shape.Rectangle;
import adapter.shape.Shape;
import decorator.attribute.Style;

public class DecoratorDemo {
    public static void main(String[] args) {
        final Shape rectangle = new Rectangle();
        final Shape circle = new Circle();

        System.out.println("Drawing Simple Shape Objects...");
        System.out.println();
        rectangle.draw();
        System.out.println();
        circle.draw();
        System.out.println();
        System.out.println("Creating Decorated Skeuomorph Circle with Blue Color...");

        final Shape blueCircle = new StyleDecorator(
                new ColorDecorator(new Circle(), BLUE), Style.SKEUOMORPH);

        blueCircle.draw();
    }
}
