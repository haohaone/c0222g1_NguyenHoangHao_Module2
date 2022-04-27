package case_study.service.implement.design_pattern.factory;

import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.service.implement.regex.FacilityRegex;

public class CreateRoom implements CreateFacility{
    @Override
    public Facility create() {
        System.out.println("Input name service");
        String name = FacilityRegex.name();

        System.out.println("Input rent type");
        String rentType = FacilityRegex.rentType();

        System.out.println("Input area use");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("Input rent price");
        int feeRent = FacilityRegex.feeRent();

        System.out.println("Input maximum customer");
        int maximumCustomer = FacilityRegex.maximumCustomer();

        System.out.println("Input id facility");
        String id = FacilityRegex.idRoom();

        System.out.println("Input free service");
        String freeService = FacilityRegex.freeService();

        Room room = new Room(name, rentType, areaUse, feeRent, maximumCustomer, id, freeService);
        return room;
    }
}
