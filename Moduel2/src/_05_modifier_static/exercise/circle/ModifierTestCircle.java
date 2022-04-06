package _05_modifier_static.exercise.circle;

public class ModifierTestCircle {
    public static void main(String[] args) {
        TestCircle circle = new TestCircle(15,"Blue");
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is :" + circle.getArea());
    }
}
