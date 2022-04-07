package _07_abstract_class_interface.exercise.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Square square = new Square(9,8);
        System.out.println(square.toString());
        square.howToColor();
    }
}
