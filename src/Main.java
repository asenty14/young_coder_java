
import figures.Circle;
import figures.Rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 4);
        int area = rectangle1.getArea();
        System.out.println("Площа прямокутника = " + area);

        Rectangle rectangle2 = new Rectangle(9, 4);
        int perimeter = rectangle2.getPerimeter();
        System.out.println("Периметр прямокутника = " + perimeter);

        Circle circle1 = new Circle(8);
        double circumference = circle1.getCircumference();
        System.out.println("Довжина окружності кола = " + circumference);

        Circle circle2 = new Circle(9);
        double areaofacircle = circle2.getCircumference();
        System.out.println("Площа кола = " + areaofacircle);
    }
}






