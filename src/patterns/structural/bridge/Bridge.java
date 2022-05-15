package patterns.structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Shape circle = new Circle(new BlueColor());
        circle.fillColor();

        Shape rectangle = new Rectangle(new RedColor());
        rectangle.fillColor();
    }
}
