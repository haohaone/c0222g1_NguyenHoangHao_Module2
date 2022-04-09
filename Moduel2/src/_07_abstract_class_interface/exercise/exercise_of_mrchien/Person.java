package _07_abstract_class_interface.exercise.exercise_of_mrchien;

public abstract class Person implements Display{
    private String name;
    private int age;
    private boolean gender;
    private static int amount = 0;

    public Person() {
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Person.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public void display() {

    }
}
