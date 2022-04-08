package case_study.booking_contracts;

public class Booking {
    private int idBooking, idCustomerNumber;
    private String starTime, endTime, nameService, standardService;

    public Booking(int idBooking, int idCustomerNumber, String starTime, String endTime, String nameService, String standardService) {
        this.idBooking = idBooking;
        this.idCustomerNumber = idCustomerNumber;
        this.starTime = starTime;
        this.endTime = endTime;
        this.nameService = nameService;
        this.standardService = standardService;
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
}
