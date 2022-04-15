package case_study.models.person;

import case_study.service.EmployeeService;

public class Employee extends Person {
    private String level, position;
    private int idEmployeeNumber, salary;


    public Employee(String name,
                    String dateOfBirth,
                    String gender,
                    String email,
                    int idCardNumber,
                    String phoneNumber,
                    String level,
                    String position,
                    int idEmployeeNumber,
                    int salary) {

        super(name, dateOfBirth, gender, email, idCardNumber, phoneNumber);
        this.level = level;
        this.position = position;
        this.idEmployeeNumber = idEmployeeNumber;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdEmployeeNumber() {
        return idEmployeeNumber;
    }

    public void setIdEmployeeNumber(int idEmployeeNumber) {
        this.idEmployeeNumber = idEmployeeNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public int getIdCardNumber() {
        return super.getIdCardNumber();
    }

    @Override
    public void setIdCardNumber(int idCardNumber) {
        super.setIdCardNumber(idCardNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", level =" + level +
                ", position = " + position +
                ", employee id = " + idEmployeeNumber +
                ", salary = " + salary +
                "]";
    }
}
