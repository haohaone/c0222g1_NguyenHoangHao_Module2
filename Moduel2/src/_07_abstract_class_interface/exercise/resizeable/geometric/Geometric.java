package _07_abstract_class_interface.exercise.resizeable.geometric;

import _07_abstract_class_interface.exercise.resizeable.Resizeable;

public abstract class Geometric implements Resizeable {
    private double size1, size2, radius;
    private String name;

    public Geometric(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    public Geometric(String name, double size1, double size2) {
        this.name = name;
        this.size1 = size1;
        this.size2 = size2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public String toString(){
        return name +" size 1 = " + this.size1 + " size 2 = "+ this.size2;
    }
}
