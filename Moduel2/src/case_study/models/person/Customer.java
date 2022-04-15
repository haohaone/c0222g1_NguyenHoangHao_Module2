package case_study.models.person;

import case_study.service.CustomerService;

public class Customer extends Person{
    private int idCustomerNumber;
    private String address, customerType;

    public Customer(String name,
                    String dateOfBirth,
                    String gender,
                    String email,
                    int idCardNumber,
                    String phoneNumber,
                    int idCustomerNumber,
                    String address,
                    String customerType) {

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
                ", customer id = " + idCustomerNumber +
                ", address = " + address +
                ", customer type = " + customerType;
    }
}
