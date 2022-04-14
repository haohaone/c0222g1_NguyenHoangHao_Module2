package _11_stack_queue.exercise.demerging;

import java.util.Date;

public abstract class Person implements Comparable<Person> {
    private String name;
    private int dateOfBirth;
    private boolean gender;

    public Person(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Person o) {
        if (dateOfBirth > o.dateOfBirth){
            return -1;
        }else if (dateOfBirth < o.dateOfBirth){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' + ", dateOfBirth = " + dateOfBirth;
    }
}
