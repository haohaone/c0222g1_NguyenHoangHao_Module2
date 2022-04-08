package case_study.models.person;

import case_study.models.service.CustomerService;

public class Customer extends Person implements CustomerService {
    private int idCustomerNumber;
    private String address, customerType;
    private static final String GOLD, SILVER, MEMBER, PLATINUM, DIAMOND;

    static {
        GOLD = "Gold";
        SILVER = "Silver";
        MEMBER = "Member";
        PLATINUM = "Platinum";
        DIAMOND = "Diamond";
    }

    public Customer(String name, String dateOfBirth, String gender, String email, int idCardNumber, int phoneNumber, int idCustomerNumber, String address, String customerType) {
        super(name, dateOfBirth, gender, email, idCardNumber, phoneNumber);
        this.idCustomerNumber = idCustomerNumber;
        this.address = address;
        this.customerType = customerType;
    }

    public int getIdCustomerNumber() {
        return idCustomerNumber;
    }

    public void setIdCustomerNumber(int idCustomerNumber) {
        this.idCustomerNumber = idCustomerNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
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
