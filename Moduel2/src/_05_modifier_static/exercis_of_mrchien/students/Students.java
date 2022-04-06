package _05_modifier_static.exercis_of_mrchien.students;

public class Students {
    private String name;
    private int age;
    private String address;
    private double point;

    protected Students(String name, int age, String address, double point) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected double getPoint() {
        return point;
    }

    protected void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Học sinh{" +
                "Tên='" + name + '\'' +
                ", Tuổi=" + age +
                ", Địa chỉ='" + address + '\'' +
                ", Điểm=" + point +
                '}';
    }
}
