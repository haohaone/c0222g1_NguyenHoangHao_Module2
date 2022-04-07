package _07_abstract_class_interface.exercise.resizeable.geometric;

public class Square extends Geometric {

    public Square(String name,double size1, double size2) {
        super(name, size1, size2);
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
    public void resize(double percent) {
        this.setSize1(getSize1() * (1+ percent/100));
        this.setSize2(getSize2() * (1+ percent/100));
    }

    @Override
    public String toString() {
        return super.toString() + " area = "+getArea();
    }


}
