package _06_inheritance.exercise.triangle;

public class Triangle extends Shape {
    private String color;

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
        return Math.sqrt(p*(p-getSize1())*(p-getSize2())*(p-getSize3()));
    }

    public  double getPerimeter(){
        return getSize1() + getSize2() + getSize3();
    }

    @Override
    public String toString() {
        return super.toString()+" color = "+color+" area = "+getArea()+" perimeter = "+getPerimeter();
    }
}
