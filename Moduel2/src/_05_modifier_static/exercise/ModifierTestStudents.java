package _05_modifier_static.exercise;

public class ModifierTestStudents {
    public static void main(String[] args) {
        Students students1 = new Students("hao","C0222g2");
        System.out.println("students1 name is: "+students1.getName()+"\n calsses is: "+students1.getClasses());
        students1.setClasses("c0222g1");
        System.out.println("students1 fixed:");
        System.out.println("students1 name is: "+students1.getName()+"\n calsses is: "+students1.getClasses());
        Students students2 = new Students("trung","C0222g1");
        System.out.println("students1 name is: "+students2.getName()+"\n calsses is: "+students2.getClasses());
        students2.setName("hoang");
        System.out.println("students2 fixed:");
        System.out.println("students1 name is: "+students2.getName()+"\n calsses is: "+students2.getClasses());
    }
}
