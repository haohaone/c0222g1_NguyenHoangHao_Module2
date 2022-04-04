package _04_object_array.exercise;

public class ClassFan {
    public static class Fan{
        private static final int slow = 1, medium = 2, fast = 3;
        int speed;
        boolean status;
        double radius;
        String color;

        Fan(){
            this.speed = slow;
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
                return "Fan is off";
            }
        }
    }

    public static void main(String[] args) {
        Fan vinaFan = new Fan(3,true,10,"yellow");
        System.out.println(vinaFan.toString());
        Fan appleFan = new Fan(2,false,5,"blue");
        System.out.println(appleFan.toString());
    }
}
