package patterns.structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.print("Circle filled with color: ");
        color.fillColor();
    }
}