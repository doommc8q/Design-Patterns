package patterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("red");
    }
}

