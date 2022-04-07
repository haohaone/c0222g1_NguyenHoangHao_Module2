package _07_abstract_class_interface.exercise.resizeable;

import _07_abstract_class_interface.exercise.resizeable.geometric.Circle;
import _07_abstract_class_interface.exercise.resizeable.geometric.Square;
import _07_abstract_class_interface.exercise.resizeable.geometric.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle",8,6,4);
        System.out.println(triangle.toString());
        triangle.resize(Math.floor(Math.random()*100)+1);
        System.out.println("Triangle resized");
        System.out.println(triangle.toString());
        System.out.println();

        Square square = new Square("Square",10,10);
        System.out.println(square.toString());
        square.resize(Math.floor(Math.random()*100)+1);
        System.out.println("Square resized");
        System.out.println(square.toString());
        System.out.println();

        Circle circle = new Circle("Circle",10);
        System.out.println(circle.toString());
        circle.resize(Math.floor(Math.random()*100)+1);
        System.out.println("Circle resized");
        System.out.println(circle.toString());
    }
}
