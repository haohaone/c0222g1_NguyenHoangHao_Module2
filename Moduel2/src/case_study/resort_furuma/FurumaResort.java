package case_study.resort_furuma;

public abstract class FurumaResort {
    private String nameService, areaUse, rentType, standardService;
    private int floor, feeRent, amountCustomer;
    private final static String year, month, day, hour;

    public FurumaResort(String nameService, String areaUse, String rentType, String standardService, int floor, int feeRent, int amountCustomer) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentType = rentType;
        this.standardService = standardService;
        this.floor = floor;
        this.feeRent = feeRent;
        this.amountCustomer = amountCustomer;
    }

    public FurumaResort(String nameService, String areaUse, String rentType, int feeRent, int amountCustomer) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentType = rentType;
        this.feeRent = feeRent;
        this.amountCustomer = amountCustomer;
    }

    static {
        year = "Year";
        month ="Month";
        day = "Day";
        hour = "Hours";
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(String areaUse) {
        this.areaUse = areaUse;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getStandardService() {
        return standardService;
    }

    public void setStandardService(String standardService) {
        this.standardService = standardService;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(int feeRent) {
        this.feeRent = feeRent;
    }

    public int getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }
}
