package _07_abstract_class_interface.exercise.resizeable.geometric;

public class Circle extends Geometric {
    public Circle(String name, double radius) {
        super(name, radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (1+ percent/100));
    }

    @Override
    public String toString() {
        return getName() +" radius = "+getRadius() + " area = " + getArea();
    }
}
