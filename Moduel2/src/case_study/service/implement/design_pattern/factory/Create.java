package case_study.service.implement.design_pattern.factory;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.implement.regex.FacilityRegex;

import java.util.LinkedHashMap;

public class Create {

    public static Facility create(String nameSv, LinkedHashMap<Facility, Integer> facilityList) {

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

        if (nameSv.equals("Villa")){
            System.out.println("Input id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Input size pool");
            double sizePool = FacilityRegex.sizePool();

            System.out.println("Input floor");
            int floor = FacilityRegex.floor();

            System.out.println("Input standard service");
            String standardService = FacilityRegex.standardService();

            Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id, sizePool);
            return villa;
        }else if (nameSv.equals("House")){
            System.out.println("Input id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Input floor");
            int floor = FacilityRegex.floor();

            System.out.println("Input standard service");
            String standardService = FacilityRegex.standardService();

            House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
            return house;
        }else {
            System.out.println("Input id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Input free service");
            String freeSv = FacilityRegex.freeService();

            Room room = new Room(name, rentType, areaUse, feeRent, maximumCustomer, id, freeSv);
            return room;
        }
    }
}
