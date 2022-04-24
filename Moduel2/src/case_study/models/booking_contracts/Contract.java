package case_study.models.booking_contracts;

import case_study.models.person.Customer;

import java.io.Serializable;

public class Contract implements Serializable {
    private int  idContract;
    private Booking booking;
    private Customer customer;
    private String discountStatus;
    private double preFee, totalFeeRent;

    public Contract(Booking booking, Customer customer, int idContract, double preFee, double totalFeeRent) {
        this.preFee = preFee;
        this.totalFeeRent = totalFeeRent;
        this.idContract = idContract;
        this.booking = booking;
        this.customer = customer;
        this.discountStatus = "No discount";
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPreFee() {
        return preFee;
    }

    public void setPreFee(double preFee) {
        this.preFee = preFee;
    }

    public double getTotalFeeRent() {
        return totalFeeRent;
    }

    public void setTotalFeeRent(double totalFeeRent) {
        this.totalFeeRent = totalFeeRent;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(String discountStatus) {
        this.discountStatus = discountStatus;
    }

    @Override
    public String toString() {
        return "[" +
                "idBooking=" + booking.getIdBooking() +
                ", idCustomer=" + customer.getIdCustomerNumber() +
                ", preFee=" + preFee +
                ", totalFeeRent=" + totalFeeRent +
                ", idContract=" + idContract +
                ", discount status = " + discountStatus +
                ']';
    }
}
