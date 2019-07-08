package adapter;

import adapter.geometricshape.GeometricShape;
import adapter.shape.Shape;

/**
 * Use the Java composition for adapting the {@linkplain GeometricShape} to the {@linkplain Shape}.
 * The composition is used as a reference to the wrapped class within the adapter.
 *
 */
public class GeometricShapeObjectAdapter implements Shape {
    private GeometricShape geometricShapeToAdapt;

    GeometricShapeObjectAdapter(GeometricShape geometricShape) {
        super();
        this.geometricShapeToAdapt = geometricShape;
    }

    @Override
    public void draw() {
        geometricShapeToAdapt.drawGeometricShape();
    }
}