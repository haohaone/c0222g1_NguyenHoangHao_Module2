package _07_abstract_class_interface.exercise.interface_colorable;

public class Circle extends Shape implements Colorable {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String howToColor() {
        if (isFilled()){
            return  "Color all Circle area";
        }else {
            return  "Can't fill";
        }
    }

    @Override
    public String toString() {
        return "Circle "+super.toString() + " area = "+getArea() + "\n" +howToColor();
    }
}
