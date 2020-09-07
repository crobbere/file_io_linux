package be.intecbrussel.factory_pattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside the square:: draw method");
    }
}
