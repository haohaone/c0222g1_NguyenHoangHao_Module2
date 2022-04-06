package _06_inheritance.exercise.point2d_point3d;

public class Point3d extends Point2d{
    protected double z;

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        super.setXY(x, y);
        this.z = z;
    }

    public double[] getXYZ(){
        return new double[]{x, y, z};
    }

    @Override
    public String toString() {
        return super.toString() + " z="+z;
    }
}
