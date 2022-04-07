package case_study.person;

public abstract class Person {
    private String name, dateOfBirth, email;
    private boolean gender;
    private int idCardNumber, phone;

    public Person(String name, String dateOfBirth, String email, boolean gender, int idCardNumber, int phone) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
