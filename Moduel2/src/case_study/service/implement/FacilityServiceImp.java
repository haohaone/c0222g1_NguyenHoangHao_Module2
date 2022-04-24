package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;
import case_study.utils.ReadAndWrite;

import java.io.Serializable;
import java.util.*;

public class FacilityServiceImp implements FacilityService, Serializable {

    public Scanner scanner = new Scanner(System.in);

    public static LinkedHashMap<Facility, Integer> getFacilityList(){
        LinkedHashMap<Facility, Integer> facilityList = null;
        try {
            facilityList = ReadAndWrite.readFileMap("src\\case_study\\data\\facility.csv");
        }catch (NullPointerException e){
        }
        return facilityList;
    }

    @Override
    public void display() {
        Map<Facility, Integer> facilityList = getFacilityList();
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
        Map<Facility, Integer> facilityList = getFacilityList();
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
        String name = scanner.nextLine();

        System.out.println("Input rent type");
        String rentType = scanner.nextLine();

        System.out.println("Input standard service");
        String standardService = scanner.nextLine();

        System.out.println("Input floor");
        int floor;
        while (true){
            try {
                floor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input area use");
        int areaUse;
        while (true){
            try {
                areaUse = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id = scanner.nextLine();

        System.out.println("Input size pool");
        int sizePool;
        while (true){
            try {
                sizePool = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }
        Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id, sizePool);
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
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
        String name = scanner.nextLine();

        System.out.println("Input rent type");
        String rentType = scanner.nextLine();

        System.out.println("Input standard service");
        String standardService = scanner.nextLine();

        System.out.println("Input floor");
        int floor;
        while (true){
            try {
                floor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input area use");
        int areaUse;
        while (true){
            try {
                areaUse = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id = scanner.nextLine();

        House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        if (getFacilityList() != null){
            facilityList = getFacilityList();
        }
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
        String name = scanner.nextLine();

        System.out.println("Input rent type");
        String rentType = scanner.nextLine();

        System.out.println("Input area use");
        int areaUse;
        while (true){
            try {
                areaUse = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id = scanner.nextLine();

        System.out.println("Input free service");
        String freeService = scanner.nextLine();

        Room room = new Room(name, rentType, areaUse, feeRent, maximumCustomer, id, freeService);
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        if (getFacilityList() != null){
            facilityList = getFacilityList();
        }
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
