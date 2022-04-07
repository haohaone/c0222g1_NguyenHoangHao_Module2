package _07_abstract_class_interface.pratice.comforable_circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super.setRadius(radius);
    }

    public ComparableCircle(String color, double radius, boolean filled) {
        super(color, radius, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if (getRadius() < o.getRadius()){
            return -1;
        }else {
            return 1;
        }
    }
}
