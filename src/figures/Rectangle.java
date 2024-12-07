package figures;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int storona1, int storona2) {
        a = storona1;
        b = storona2;


    }

    public int getArea() {
        return a*b;

    }
    public int getPerimeter() {
        return 2*(a+b);
    }



}
