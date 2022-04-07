package _07_abstract_class_interface.exercise.interface_colorable;

public abstract class Geometric {
    private double size1, size2;

    public Geometric(double size1, double size2) {
        this.size1 = size1;
        this.size2 = size2;
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

    public abstract double getArea();

    @Override
    public String toString() {
        return "Geometric: " +
                "size1=" + size1 +
                ", size2=" + size2;
    }
}
