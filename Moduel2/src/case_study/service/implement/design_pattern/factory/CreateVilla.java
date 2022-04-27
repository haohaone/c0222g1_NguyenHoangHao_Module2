package case_study.service.implement.design_pattern.factory;

import case_study.models.facility.Facility;
import case_study.models.facility.Villa;
import case_study.service.implement.regex.FacilityRegex;

public class CreateVilla implements CreateFacility{
    @Override
    public Facility create() {
        System.out.println("Input name service");
        String name = FacilityRegex.name();

        System.out.println("Input rent type");
        String rentType = FacilityRegex.rentType();

        System.out.println("Input standard service");
        String standardService = FacilityRegex.standardService();

        System.out.println("Input floor");
        int floor = FacilityRegex.floor();

        System.out.println("Input area use");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("Input rent price");
        int feeRent = FacilityRegex.feeRent();

        System.out.println("Input maximum customer");
        int maximumCustomer = FacilityRegex.maximumCustomer();

        System.out.println("Input id facility");
        String id = FacilityRegex.idVilla();

        System.out.println("Input size pool");
        double sizePool = FacilityRegex.sizePool();

        Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id, sizePool);
        return villa;
    }
}
