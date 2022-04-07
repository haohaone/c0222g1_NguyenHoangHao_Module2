package case_study.person;

public class Employee extends Person{
    private int idEmployeeNumber, salary;
    private String literacy , position;
    public final static String secondaryGraduate, collegesGraduate, universityGraduate, afterGraduated;
    public final static String reception, server, expert, supervisor, manager, director;
    static {
        secondaryGraduate = "Secondary Graduate";
        collegesGraduate = "Colleges Graduate";
        universityGraduate = "University Graduate";
        afterGraduated = "After Graduate";

        reception = "Reception";
        server = "Server";
        expert = "Expert";
        supervisor = "Supervisor";
        manager = "Manager";
        director = "Director";
    }

    public Employee(String name, String dateOfBirth, String email, boolean gender, int idCardNumber, int phone, int idEmployeeNumber, int salary, String literacy, String position) {
        super(name, dateOfBirth, email, gender, idCardNumber, phone);
        this.idEmployeeNumber = idEmployeeNumber;
        this.salary = salary;
        this.literacy = literacy;
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

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
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
    public int getIdCardNumber() {
        return super.getIdCardNumber();
    }

    @Override
    public void setIdCardNumber(int idCardNumber) {
        super.setIdCardNumber(idCardNumber);
    }

    @Override
    public int getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone);
    }
}
