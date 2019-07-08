package bridge;

public abstract class Shape {
    private DrawCircleApi api;

    protected Shape(DrawCircleApi drawCircleApi) {
        this.api = drawCircleApi;
    }

    public abstract void draw();
}