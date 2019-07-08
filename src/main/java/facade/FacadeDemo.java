package facade;

public class FacadeDemo {
   public static void main(String[] args) {
      final ShapeDrawingFacade facade = new ShapeDrawingFacade();

      System.out.println("Drawing...");

      facade.drawCircle();
      facade.drawRectangle();
      facade.drawSquare();
   }
}