package case_study.booking_contracts;

public class Contract {
    private int idBooking, idCustomer, preFee, totalFeeRent, idContract;

    public Contract(int idBooking, int idCustomer, int idContract, int preFee, int totalFeeRent) {
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.preFee = preFee;
        this.totalFeeRent = totalFeeRent;
        this.idContract = idContract;
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

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    @Override
    public String toString() {
        return "[" +
                "idBooking=" + idBooking +
                ", idCustomer=" + idCustomer +
                ", preFee=" + preFee +
                ", totalFeeRent=" + totalFeeRent +
                ", idContract=" + idContract +
                ']';
    }
}
