package _05_modifier_static.practice;

public class StaticMethod {
    public static void main(String[] args) {
        Students.change();
        Students s1 = new Students(111,"hao");
        Students s2 = new Students(222,"hoang");
        Students s3 = new Students(333,"trung");
        s1.display();
        s2.display();
        s3.display();
    }
}
