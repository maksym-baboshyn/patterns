package bridge.circle;

import bridge.DrawCircleApi;

public class RedCircle implements DrawCircleApi {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.printf("Drawing Circle (color: red, radius: %d, x: %d, %d) %n", radius, x, y);
   }
}