package _06_inheritance.exercise.point_move_able_point;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(8,10);
        System.out.println(point.toString());
        MoveAblePoint moveAblePoint = new MoveAblePoint(8,10,80,100);
        System.out.println(moveAblePoint.toString());
        moveAblePoint.setSpeed(50,150);
        System.out.println("moveAblePoint is fixed");
        System.out.println(moveAblePoint.toString());
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
