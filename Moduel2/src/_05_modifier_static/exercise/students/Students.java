package _05_modifier_static.exercise.students;

public class Students {
    private String name = "Jonh";
    private String classes = "C02";

    Students(){

    }

    protected Students(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getClasses() {
        return classes;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
