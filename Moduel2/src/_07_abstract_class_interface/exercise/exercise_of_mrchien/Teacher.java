package _07_abstract_class_interface.exercise.exercise_of_mrchien;

public class Teacher extends Person {
    private float salary;

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, boolean gender, float salary) {
        super(name, age, gender);
        this.salary = salary;
        setAmount(getAmount()+1);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, boolean gender) {
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
        System.out.println("Teacher: " + "name = " +
                getName() +
                " age =" + getAge() +
                " gender =" + isGender() +
                " salary = " + salary);
    }
}
