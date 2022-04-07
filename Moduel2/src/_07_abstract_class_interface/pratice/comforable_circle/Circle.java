package _07_abstract_class_interface.pratice.comforable_circle;

public abstract class Circle {
    private String color;
    private double radius;
    private boolean filled;

    public Circle() {
    }

    public Circle(String color, double radius, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Double getArea(){
        return radius * radius * Math.PI;
    }

    public Double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", filled=" + filled +
                ", area =" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}
