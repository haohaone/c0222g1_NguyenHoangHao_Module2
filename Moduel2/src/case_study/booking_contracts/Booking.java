package case_study.booking_contracts;

import case_study.models.facility.Facility;
import case_study.models.person.Customer;

public class Booking {
    private int idBooking, idCustomerNumber;
    private String starTime, endTime, nameService, standardService;
    private Customer customer;
    private Facility facility;

    public Booking(int idBooking,
                   int idCustomerNumber,
                   String starTime,
                   String endTime,
                   String nameService,
                   String standardService,
                   Customer customer,
                   Facility facility) {
        this.idBooking = idBooking;
        this.idCustomerNumber = idCustomerNumber;
        this.starTime = starTime;
        this.endTime = endTime;
        this.nameService = nameService;
        this.standardService = standardService;
        this.customer = customer;
        this.facility = facility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getIdCustomerNumber() {
        return idCustomerNumber;
    }

    public void setIdCustomerNumber(int idCustomerNumber) {
        this.idCustomerNumber = idCustomerNumber;
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

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getStandardService() {
        return standardService;
    }

    public void setStandardService(String standardService) {
        this.standardService = standardService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Facility getFacility() {
        return facility;
    }

    @Override
    public String toString() {
        return  "[" +
                "idBooking = " + idBooking +
                ", idCustomerNumber = " + idCustomerNumber +
                ", starTime = " + starTime + '\'' +
                ", endTime = " + endTime + '\'' +
                ", nameService = " + nameService;
    }
}
