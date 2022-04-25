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
    public static final String VILLA, HOUSE, ROOM, FIRST_CHARACTER_UPPER, RENT_TYPE;
    static {
        VILLA = "^SVVL-[0-9]{4}$";
        HOUSE = "^SVHO-[0-9]{4}$";
        ROOM = "^SVRO-[0-9]{4}$";
        FIRST_CHARACTER_UPPER = "^[A-Z][\\w]+$";
        RENT_TYPE = "^(Day|Month|Year)$";
    }
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
        String name;
        while (true){
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Your format is wrong");
            }
        }

        System.out.println("Input rent type");
        String rentType;
        while (true){
            rentType = scanner.nextLine();
            if (rentType.matches(RENT_TYPE)){
                break;
            }else {
                System.out.println("Your format should be Day, Month or Year");
            }
        }

        System.out.println("Input standard service");
        String standardService;
        while (true){
            standardService = scanner.nextLine();
            if (standardService.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Your format is wrong");
            }
        }

        System.out.println("Input floor");
        int floor;
        while (true){
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0){
                    break;
                }else {
                    System.out.println("Floor should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input area use");
        double areaUse;
        while (true){
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30){
                    break;
                }else {
                    System.err.println("Minimum area is 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input format wrong");
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                if (feeRent > 0){
                    break;
                }else {
                    System.out.println("Price should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                if (maximumCustomer > 0 && maximumCustomer < 20){
                    break;
                }else {
                    System.out.println("Maximum customer is 19");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(VILLA)){
                break;
            }else {
                System.out.println("Your input should be SVVl-xxxx");
            }
        }

        System.out.println("Input size pool");
        double sizePool;
        while (true){
            try {
                sizePool = Double.parseDouble(scanner.nextLine());
                if (sizePool > 30){
                    break;
                }else {
                    System.out.println("Minimum size is 30m2");
                }
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
        String name;
        while (true){
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Your format is wrong");
            }
        }

        System.out.println("Input rent type");
        String rentType;
        while (true){
            rentType = scanner.nextLine();
            if (rentType.matches(RENT_TYPE)){
                break;
            }else {
                System.out.println("Your format should be Day, Month or Year");
            }
        }

        System.out.println("Input standard service");
        String standardService;
        while (true){
            standardService = scanner.nextLine();
            if (standardService.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Your format is wrong");
            }
        }

        System.out.println("Input floor");
        int floor;
        while (true){
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0){
                    break;
                }else {
                    System.out.println("Floor should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input area use");
        double areaUse;
        while (true){
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30){
                    break;
                }else {
                    System.err.println("Minimum area is 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input format wrong");
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                if (feeRent > 0){
                    break;
                }else {
                    System.out.println("Price should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                if (maximumCustomer > 0 && maximumCustomer < 20){
                    break;
                }else {
                    System.out.println("Maximum customer is 19");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(HOUSE)){
                break;
            }else {
                System.out.println("Your input should be SVVl-xxxx");
            }
        }

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
        String name;
        while (true){
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Your format is wrong");
            }
        }

        System.out.println("Input rent type");
        String rentType;
        while (true){
            rentType = scanner.nextLine();
            if (rentType.matches(RENT_TYPE)){
                break;
            }else {
                System.out.println("Your format should be Day, Month or Year");
            }
        }

        System.out.println("Input area use");
        double areaUse;
        while (true){
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30){
                    break;
                }else {
                    System.err.println("Minimum area is 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input format wrong");
            }
        }

        System.out.println("Input rent price");
        int feeRent;
        while (true){
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                if (feeRent > 0){
                    break;
                }else {
                    System.out.println("Price should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
        }

        System.out.println("Input maximum customer");
        int maximumCustomer;
        while (true){
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                if (maximumCustomer > 0 && maximumCustomer < 20){
                    break;
                }else {
                    System.out.println("Maximum customer is 19");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }

        System.out.println("Input id facility");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(ROOM)){
                break;
            }else {
                System.out.println("Your input should be SVVl-xxxx");
            }
        }

        System.out.println("Input free service");
        String freeService;
        while (true){
            freeService = scanner.nextLine();
            if (freeService.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Input wrong format");
            }
        }


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
