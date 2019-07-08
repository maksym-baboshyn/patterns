package adapter;

import java.util.ArrayList;
import java.util.List;

import adapter.shape.Shape;

public class Drawing {
    private final List<Shape> shapes = new ArrayList<Shape>();

    void addShape(Shape shape) {
        shapes.add(shape);
    }

    void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.forEach(Shape::draw);
        }
    }
}