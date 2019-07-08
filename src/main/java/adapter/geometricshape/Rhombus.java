package adapter.geometricshape;

import static java.lang.String.format;

public class Rhombus implements GeometricShape {
    private final double a;
    private final double b;

    private Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rhombus() {
        this(1.0d, 1.0d);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void drawGeometricShape() {
        System.out.println(format("Drawing Rhombus with perimeter: %s", calculatePerimeter()));
    }
}