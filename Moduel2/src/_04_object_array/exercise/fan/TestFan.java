package _04_object_array.exercise.fan;

public class TestFan {
    public static void main(String[] args) {
        Fan vinaFan = new Fan(Fan.FAST,true,10,"yellow");
        System.out.println(vinaFan.toString());
        Fan appleFan = new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println(appleFan.toString());
    }
}
