package _05_modifier_static.practice;

public class Students {
    private int rollno;
    private String name;
    private static String collage = "BBDIT";

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        collage = "CODEGYM";
    }

    void display(){
        System.out.println(rollno+" "+name+" "+collage);
    }
}
