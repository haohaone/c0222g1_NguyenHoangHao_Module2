package _05_modifier_static.exercise.circle;

public class TestCircle {
    private double radius;
    private String color;

    TestCircle(){
        this.radius = 1;
        this.color = "Red";
    }

    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
