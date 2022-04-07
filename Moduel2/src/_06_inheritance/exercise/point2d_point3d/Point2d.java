package _06_inheritance.exercise.point2d_point3d;

public class Point2d {
    private double x;
    private double y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        return new double[]{x, y};
    }


    @Override
    public String toString() {
        return "Point2d " +
                "x=" + x +
                ", y=" + y;
    }
}
