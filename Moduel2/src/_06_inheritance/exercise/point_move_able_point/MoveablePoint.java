package _06_inheritance.exercise.point_move_able_point;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    MoveablePoint(){

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public MoveablePoint move(){
        this.setX(getX() + xSpeed);
        this.setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Speed=("+
                xSpeed+
                ','+
                ySpeed+
                ')';
    }
}
