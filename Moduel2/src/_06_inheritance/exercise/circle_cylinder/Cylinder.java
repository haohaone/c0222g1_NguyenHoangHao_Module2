package _06_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + super.getRadius() * height;
    }

    public double getCapacity(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " capacity =" +getCapacity();
    }
}
