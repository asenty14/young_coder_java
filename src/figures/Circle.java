package figures;

public class Circle {
   int r;
   public Circle(int radius) {
       r = radius;
   }
   public double getCircumference() {
       return 2 * Math.PI * r;
   }

}
