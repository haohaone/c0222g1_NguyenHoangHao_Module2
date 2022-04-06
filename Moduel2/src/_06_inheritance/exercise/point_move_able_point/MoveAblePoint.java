package _06_inheritance.exercise.point_move_able_point;

public class MoveAblePoint extends Point {
    private float xSpeed, ySpeed;

    MoveAblePoint(){

    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
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
