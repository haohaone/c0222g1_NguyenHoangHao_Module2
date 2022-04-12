package case_study.models.facility;

import case_study.service.FacilityService;

public class Villa extends Facility implements FacilityService {
    private int sizePool;

    Villa (){

    }

    public Villa(String nameService, String rentType, String standardService, String floor, int areaUse, int feeRent, int maximumCustomer, int sizePool) {
        super(nameService, rentType, standardService, floor, areaUse, feeRent, maximumCustomer);
        this.sizePool = sizePool;
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
    public String getFloor() {
        return super.getFloor();
    }

    @Override
    public void setFloor(String floor) {
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
    public int getMaximumCustomer() {
        return super.getMaximumCustomer();
    }

    @Override
    public void setMaximumCustomer(int maximumCustomer) {
        super.setMaximumCustomer(maximumCustomer);
    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
