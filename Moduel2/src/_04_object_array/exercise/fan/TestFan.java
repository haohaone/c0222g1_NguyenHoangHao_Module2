package _04_object_array.exercise.fan;

public class TestFan {
    public static void main(String[] args) {
        ClassFan.Fan vinaFan = new ClassFan.Fan(3,true,10,"yellow");
        System.out.println(vinaFan.toString());
        ClassFan.Fan appleFan = new ClassFan.Fan(2,false,5,"blue");
        System.out.println(appleFan.toString());
    }
}
