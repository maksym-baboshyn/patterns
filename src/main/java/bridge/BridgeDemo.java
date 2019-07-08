package bridge;

import bridge.circle.BlueCircle;
import bridge.circle.Circle;
import bridge.circle.RedCircle;

public class BridgeDemo {
    public static void main(String[] args) {
        System.out.println("Drawing...");
        final Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        final Shape blueCircle = new Circle(100, 100, 10, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}