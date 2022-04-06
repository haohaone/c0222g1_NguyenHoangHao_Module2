package _06_inheritance.exercise.triangle;

public class Triangle extends Shape {
    String color;

    public Triangle(double size1, double size2, double size3, String color) {
        super(size1, size2, size3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
    }

    public  double getPerimeter(){
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        return super.toString()+" color = "+color+" area = "+getArea()+" perimeter = "+getPerimeter();
    }
}
