package be.intecbrussel.factory_pattern;

public interface Shape {
    public default void draw(){
        System.out.println("wow");
    }
}
