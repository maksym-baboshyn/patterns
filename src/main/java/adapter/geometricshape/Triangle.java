package adapter.geometricshape;

public class Triangle implements GeometricShape {
    private final double a;
    private final double b;
    private final double c;

    private Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void drawGeometricShape() {
        System.out.println(String.format("Drawing Triangle with perimeter: %s", calculatePerimeter()));
    }
}