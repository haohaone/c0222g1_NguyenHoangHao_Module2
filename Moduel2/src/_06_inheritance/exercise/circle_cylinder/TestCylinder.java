package _06_inheritance.exercise.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        System.out.println("Circle created");
        Circle testCircle = new Circle(5,"blue");
        System.out.println(testCircle.toString());
        System.out.println("Cylinder created");
        Cylinder testCylinder = new Cylinder(8,"red",15);
        System.out.println(testCylinder.toString());
    }
}
