package _07_abstract_class_interface.exercise.interface_colorable;

public class Square extends Geometric implements  Colorable {
    public Square(double size1, double size2) {
        super(size1, size2);
    }

    @Override
    public double getSize1() {
        return super.getSize1();
    }

    @Override
    public void setSize1(double size1) {
        super.setSize1(size1);
    }

    @Override
    public double getSize2() {
        return super.getSize2();
    }

    @Override
    public void setSize2(double size2) {
        super.setSize2(size2);
    }

    @Override
    public double getArea() {
        return getSize1() * getSize2();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return super.toString() + " area = "+getArea();
    }
}
