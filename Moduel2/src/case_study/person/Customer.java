package case_study.person;

public class Customer extends Person {
    private int idCustomerNumber;
    private String address, customerType;
    private final static String diamond, platinum, gold, sliver, member;

    static {
        diamond = "Diamond";
        platinum = "Platinum";
        gold = "Gold";
        sliver = "Sliver";
        member = "member";
    }

    public Customer(String name, String dateOfBirth, String email, boolean gender, int idCardNumber, int phone, int idCustomerNumber, String address, String customerType) {
        super(name, dateOfBirth, email, gender, idCardNumber, phone);
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
