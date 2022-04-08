package _07_abstract_class_interface.exercise.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Square [] squaresList = new Square[2];
         squaresList[0] = new Square(9,8);
         squaresList[1] = new Square(15,6);
        for (Square square : squaresList) {
            System.out.println(square.toString());
            square.howToColor();
        }
    }
}
