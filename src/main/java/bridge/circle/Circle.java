package bridge.circle;

import bridge.DrawCircleApi;
import bridge.Shape;

public class Circle extends Shape {
    private int x, y, radius;
    private DrawCircleApi drawCircleApi;

    public Circle(int x, int y, int radius, DrawCircleApi drawCircleApi) {
        super(drawCircleApi);
        this.drawCircleApi = drawCircleApi;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawCircleApi.drawCircle(radius, x, y);
    }
}