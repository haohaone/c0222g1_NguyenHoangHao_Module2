package _07_abstract_class_interface.exercise.resizeable.geometric;

public  class Triangle extends Geometric {
    private double size3;

    public Triangle(String name, double size1, double size2, double size3) {
        super(name, size1, size2);
        this.size3 = size3;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getPerimeter(){
        return getSize1() + getSize2() + getSize3();
    }

    @Override
    public void resize(double percent) {
        this.setSize1(getSize1() * (1+ percent/100));
        this.setSize2(getSize2() * (1+ percent/100));
        this.setSize3(getSize3() * (1+ percent/100));
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p*(p-getSize1())*(p-getSize2())*(p-getSize3()));
    }

    @Override
    public String toString() {
        return super.toString() + " size3 = "+size3 + " area = "+getArea();
    }
}
