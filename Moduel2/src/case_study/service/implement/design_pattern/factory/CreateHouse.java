package case_study.service.implement.design_pattern.factory;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.service.implement.regex.FacilityRegex;
import case_study.utils.ReadAndWrite;

public class CreateHouse implements CreateFacility {

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
        String id = FacilityRegex.idHouse();

        House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
        return house;
    }
}
