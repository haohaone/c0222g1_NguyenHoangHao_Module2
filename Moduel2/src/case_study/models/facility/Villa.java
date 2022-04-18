package case_study.models.facility;

import case_study.service.FacilityService;

public class Villa extends Facility {
    private int sizePool;

    public Villa(String nameService,
                 String rentType,
                 String standardService,
                 int floor,
                 int areaUse,
                 int feeRent,
                 int maximumCustomer,
                 int id,
                 int sizePool) {

        super(nameService, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
        this.sizePool = sizePool;
    }

    @Override
    public int getMaintain() {
        return super.getMaintain();
    }

    @Override
    public void setMaintain(int maintain) {
        super.setMaintain(maintain);
    }

    public int getSizePool() {
        return sizePool;
    }

    public void setSizePool(int sizePool) {
        this.sizePool = sizePool;
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
    public int getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(int areaUse) {
        super.setAreaUse(areaUse);
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
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getMaximumCustomer() {
        return super.getMaximumCustomer();
    }

    @Override
    public void setMaximumCustomer(int maximumCustomer) {
        super.setMaximumCustomer(maximumCustomer);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", standard service = " + getStandardService() +
                ", size pool = " +
                sizePool+ ", floor = " + getFloor();
    }
}
