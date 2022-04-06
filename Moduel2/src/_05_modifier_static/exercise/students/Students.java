package _05_modifier_static.exercise.students;

public class Students {
    private String name = "Jonh";
    private String classes = "C02";

    Students(){

    }

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
