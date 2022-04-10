package _07_abstract_class_interface.exercise.resizeable;

import _07_abstract_class_interface.exercise.resizeable.geometric.Circle;
import _07_abstract_class_interface.exercise.resizeable.geometric.Geometric;
import _07_abstract_class_interface.exercise.resizeable.geometric.Square;
import _07_abstract_class_interface.exercise.resizeable.geometric.Triangle;

public class Main {
    public static void main(String[] args) {
        Geometric [] geometricList = new Geometric[3];
        geometricList[0] = new Triangle("Triangle", 8, 6, 4);
        geometricList[1] = new Square("Square",10,10);
        geometricList[2] = new Circle("Circle", 10);
        for (Geometric geometric : geometricList) {
            geometric.resize(Math.floor(Math.random() * 100) + 1);
        }

        for (Geometric geometric : geometricList) {
            System.out.println(geometric.toString());
        }
    }
}
