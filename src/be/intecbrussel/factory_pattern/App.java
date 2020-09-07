package be.intecbrussel.factory_pattern;

public class App {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();

    }
}
