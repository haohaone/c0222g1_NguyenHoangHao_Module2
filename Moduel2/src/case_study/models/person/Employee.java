package case_study.models.person;

import case_study.models.service.EmployeeService;

public class Employee extends Person implements EmployeeService {
    private String level, position;
    private int idEmployeeNumber, salary;
    private static final String SECONDARY_GRADUATION, COLLEGE_GRADUATION, GRADUATE, POST_GRADUATE;
    private static final String RECEPTIONIST, SERVANTS, SUPERVISOR, MANAGER, DIRECTOR;

    static {
        SECONDARY_GRADUATION = "Secondary Graduation";
        COLLEGE_GRADUATION = "College Graduation";
        GRADUATE = "Graduate";
        POST_GRADUATE = "Post-Graduate";

        RECEPTIONIST = "Receptionist";
        SERVANTS = "Servants";
        SUPERVISOR = "Supervisor";
        MANAGER = "Manager";
        DIRECTOR = "Director";
    }

    public Employee(String name, String dateOfBirth, String gender, String email, int idCardNumber, int phoneNumber, String level, String position, int idEmployeeNumber, int salary) {
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
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
