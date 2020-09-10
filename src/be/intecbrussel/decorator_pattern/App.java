package be.intecbrussel.decorator_pattern;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();

        redCircle.draw();
        redRectangle.draw();
    }
}
