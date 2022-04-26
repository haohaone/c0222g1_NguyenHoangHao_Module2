package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;
import case_study.service.implement.regex.FacilityRegex;
import case_study.utils.ReadAndWrite;
import java.io.Serializable;
import java.util.*;


public class FacilityServiceImp implements FacilityService, Serializable {
    public Scanner scanner = new Scanner(System.in);
    public static LinkedHashMap<Facility, Integer> facilityList = getFacilityList();

    public static LinkedHashMap<Facility, Integer> getFacilityList(){
        LinkedHashMap<Facility, Integer> facilityList;
        try {
            facilityList = ReadAndWrite.readFileMap("src\\case_study\\data\\facility.csv");
            return facilityList;
        }catch (NullPointerException e){
        }
        return new LinkedHashMap<>();
    }

    @Override
    public void display() {
        LinkedHashMap<Facility, Integer> facilityList = getFacilityList();
        try {
            for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
                System.out.println(element.getKey() + ", amount rented = " + element.getValue() + "]");
            }
        }catch (Exception e){
            System.out.println("Facility list is 0");
        }
    }

    @Override
    public void displayMaintain() {
        System.out.println("--------------Maintain facility ---------------");
        int count = 0;
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println(element.getKey() + ", amount rented = " + element.getValue() + "]");
                count++;
            }
        }
        if (count == 0){
            System.out.println("Not facility need to maintain");
        }
    }

    @Override
    public void addNewVilla() {
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
        if (getFacilityList() != null){
            facilityList = getFacilityList();
        }
        facilityList.put(villa, 0);
        String line = name + "," +
                rentType + "," +
                standardService + "," +
                floor + "," +
                areaUse + "," +
                feeRent + "," +
                maximumCustomer + "," +
                id + "," +
                sizePool;
        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\villa.csv", line);
        System.out.println("Add successful");
    }

    @Override
    public void addNewHouse() {
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

        facilityList.put(house, 0);

        String line = name + "," +
                rentType + "," +
                standardService + "," +
                floor + "," +
                areaUse + "," +
                feeRent + "," +
                maximumCustomer + "," +
                id;
        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\house.csv", line);
        System.out.println("Add successful");
    }

    @Override
    public void addNewRoom() {
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

        facilityList.put(room, 0);

        String line = name + "," +
                rentType + "," +
                areaUse + "," +
                feeRent + "," +
                maximumCustomer + "," +
                id + "," +
                freeService;
        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\room.csv", line);
        System.out.println("Add successful");
    }
}
