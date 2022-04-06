package _06_inheritance.pratice.geometric;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Circle created");
        Circle testCircle = new Circle("blue",true,15);
        System.out.println(testCircle.toString());
        System.out.println("Rectangle created");
        Rectangle testRectangle = new Rectangle("red",false,6,8);
        System.out.println(testRectangle.toString());
        System.out.println("Square created");
        Square testSquare = new Square("black",true,10);
        System.out.println(testSquare.toString());
    }
}
