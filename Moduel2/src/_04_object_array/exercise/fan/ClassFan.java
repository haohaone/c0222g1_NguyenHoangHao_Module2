package _04_object_array.exercise.fan;

public class ClassFan {
    public static class Fan{
        private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
        int speed;
        private boolean status;
        private double radius;
        private String color;

        Fan(){
            this.speed = SLOW;
            this.status = false;
            this.radius = 5;
            this.color = "blue";
        }

        Fan(int speed,boolean status,double radius,String color){
            this.speed = speed;
            this.status = status;
            this.radius = radius;
            this.color = color;
        }

        public  String toString(){
            if (this.status){
                return  "Fan is on \n"+" speed is: "+this.speed+"\n color is: "+this.color+"\n radius is: "+this.radius;
            }else {
                return "Fan is off \n"+"color is: "+this.color+"\n radius í: "+this.radius;
            }
        }
    }
}
