package _07_abstract_class_interface.exercise.interface_colorable;

public class Square extends Shape implements  Colorable {
    private double size1 , size2;

    public Square(String color, boolean filled, double size1, double size2) {
        super(color, filled);
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

    @Override
    public String getColor() {
        return super.getColor();
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
        return getSize1() * getSize2();
    }

    @Override
    public String howToColor() {
        if (isFilled()){
            return  "Color all four sides";
        }else {
            return  "Can't fill";
        }
    }

    @Override
    public String toString() {
        return "Square "+super.toString() + " area = "+getArea() + "\n" +howToColor();
    }
}
