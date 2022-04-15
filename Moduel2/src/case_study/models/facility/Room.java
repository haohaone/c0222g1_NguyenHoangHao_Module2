package case_study.models.facility;

import case_study.service.FacilityService;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService,
                String rentType,
                int areaUse,
                int feeRent,
                int maximumCustomer,
                String freeService) {

        super(nameService, rentType, areaUse, feeRent, maximumCustomer);
        this.freeService = freeService;
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
    public String toString() {
        return super.toString() + ", free service = " + freeService +"]";
    }
}
