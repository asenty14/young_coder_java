
import figures.Rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 4);
        int area = rectangle1.getArea();
        System.out.println(area);

        Rectangle rectangle2 = new Rectangle(9, 4);
        int perimeter = rectangle2.getPerimeter();
        System.out.println(perimeter);
    }
}






