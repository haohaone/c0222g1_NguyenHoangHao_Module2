package case_study.resort_furuma;

public class FurumaVilla extends FurumaResort {
    private int areaPool;

    public FurumaVilla(String nameService, String areaUse, String rentType, String standardService, int floor, int feeRent, int amountCustomer, int areaPool) {
        super(nameService, areaUse, rentType, standardService, floor, feeRent, amountCustomer);
        this.areaPool = areaPool;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public String getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(String areaUse) {
        super.setAreaUse(areaUse);
    }

    @Override
    public String getRentType() {
        return super.getRentType();
    }

    @Override
    public void setRentType(String rentType) {
        super.setRentType(rentType);
    }

    @Override
    public String getStandardService() {
        return super.getStandardService();
    }

    @Override
    public void setStandardService(String standardService) {
        super.setStandardService(standardService);
    }

    @Override
    public int getFloor() {
        return super.getFloor();
    }

    @Override
    public void setFloor(int floor) {
        super.setFloor(floor);
    }

    @Override
    public int getFeeRent() {
        return super.getFeeRent();
    }

    @Override
    public void setFeeRent(int feeRent) {
        super.setFeeRent(feeRent);
    }

    @Override
    public int getAmountCustomer() {
        return super.getAmountCustomer();
    }

    @Override
    public void setAmountCustomer(int amountCustomer) {
        super.setAmountCustomer(amountCustomer);
    }
}
