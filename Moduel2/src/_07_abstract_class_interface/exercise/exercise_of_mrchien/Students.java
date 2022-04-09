package _07_abstract_class_interface.exercise.exercise_of_mrchien;

public class Students extends Person {
    private double point;


    public Students(String name, int age, boolean gender, double point) {
        super(name, age, gender);
        this.point = point;
        setAmount(getAmount() + 1);
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Students() {
        super();
    }

    public Students(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public void display() {
        System.out.println("Student: " + "name = " +
                            getName() +
                            " age =" + getAge() +
                            " gender =" + isGender() +
                            " point = " + point);
    }
}
