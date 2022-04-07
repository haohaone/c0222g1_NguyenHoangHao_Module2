package _06_inheritance.exercise.triangle;

public class Shape {
    private double size1 = 1, size2 = 1, size3 = 1;

    Shape(){

    }

    protected Shape(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    @Override
    public String toString() {
        return "size1 = " +size1+ " size2 = " +size2+ " size3 = " +size3;
    }
}
