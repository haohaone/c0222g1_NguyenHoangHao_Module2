package _07_abstract_class_interface.exercise.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Square("BLue",true,4,5);
        shapes[1] = new Circle("Red",true,4.5);
        shapes[2] = new Square("BLue",false,4,3);
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println();
        }
    }
}
