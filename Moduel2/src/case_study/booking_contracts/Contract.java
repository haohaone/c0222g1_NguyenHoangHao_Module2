package case_study.booking_contracts;

public class Contract {
    private int idBooking, idCustomer, preFee, totalFeeRent;

    public Contract(int idBooking, int idCustomer, int preFee, int totalFeeRent) {
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.preFee = preFee;
        this.totalFeeRent = totalFeeRent;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPreFee() {
        return preFee;
    }

    public void setPreFee(int preFee) {
        this.preFee = preFee;
    }

    public int getTotalFeeRent() {
        return totalFeeRent;
    }

    public void setTotalFeeRent(int totalFeeRent) {
        this.totalFeeRent = totalFeeRent;
    }
}
