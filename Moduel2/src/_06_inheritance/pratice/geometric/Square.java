package _06_inheritance.pratice.geometric;

public class Square extends Shape {
    private double size;

    public Square() {
        this.size = 1;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return size * size;
    }

    public double getPerimeter(){
        return 2 * (size + size);
    }

    @Override
    public String toString() {
        return "A Circle with size = "+ size +", area = "+this.getArea()+", perimeter = "+this.getPerimeter()+", which is a subclass of" + super.toString();
    }
}
