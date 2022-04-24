package case_study.models.booking_contracts;

import case_study.models.facility.Facility;
import case_study.models.person.Customer;

import java.io.Serializable;

public class Booking implements Serializable {
    private int idBooking;
    private String starTime, endTime;
    private Customer customer;
    private Facility facility;
    private boolean statusContract;

    public Booking(int idBooking,
                   String starTime,
                   String endTime,
                   Customer customer,
                   Facility facility) {
        this.idBooking = idBooking;
        this.starTime = starTime;
        this.endTime = endTime;
        this.customer = customer;
        this.facility = facility;
        this.statusContract = false;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public boolean isStatusContract() {
        return statusContract;
    }

    public void setStatusContract(boolean statusContract) {
        this.statusContract = statusContract;
    }

    @Override
    public String toString() {
        return  "[" +
                "idBooking = " + idBooking +
                ", idCustomerNumber = " + customer.getIdCustomerNumber() +
                ", starTime = " + starTime + '\'' +
                ", endTime = " + endTime + '\'' +
                ", nameService = " + facility.getNameService() +
                ", status Contract = " + isStatusContract();
    }
}
