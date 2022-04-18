package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImp implements FacilityService {
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    public Scanner scanner = new Scanner(System.in);

    static {
        facilityList.put(new Villa("Villa",
                                    "Day",
                                    "VIP",
                                    10,
                                    200,
                                    2500,
                                    20,
                                    1,
                                    50),
                                    0);

        facilityList.put(new House("House",
                        "Day",
                        "VIP",
                        10,
                        200,
                        2500,
                        20,
                        2),
                        0);

        facilityList.put(new Room("Room",
                        "Day",
                        50,
                        200,
                        5,
                        3,
                        "Buffet"),
                        0);
    }

    public static Map<Facility, Integer> getFacilityList() {
        return facilityList;
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            System.out.println(element.getKey() + ", amount rented = " + element.getValue() + "]");
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
        String name = scanner.nextLine();

        System.out.println("Input rent type");
        String rentType = scanner.nextLine();

        System.out.println("Input standard service");
        String standardService = scanner.nextLine();

        System.out.println("Input floor");
        int floor = Integer.parseInt(scanner.nextLine());

        System.out.println("Input area use");
        int areaUse = Integer.parseInt(scanner.nextLine());

        System.out.println("Input rent price");
        int feeRent = Integer.parseInt(scanner.nextLine());

        System.out.println("Input maximum customer");
        int maximumCustomer = Integer.parseInt(scanner.nextLine());

        System.out.println("Input id facility");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Input size pool");
        int sizePool = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id, sizePool);
        facilityList.put(villa, 1);
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
        int floor = Integer.parseInt(scanner.nextLine());

        System.out.println("Input area use");
        int areaUse = Integer.parseInt(scanner.nextLine());

        System.out.println("Input rent price");
        int feeRent = Integer.parseInt(scanner.nextLine());

        System.out.println("Input maximum customer");
        int maximumCustomer = Integer.parseInt(scanner.nextLine());

        System.out.println("Input id facility");
        int id = Integer.parseInt(scanner.nextLine());

        House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
        facilityList.put(house, 1);
        System.out.println("Add successful");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Input name service");
        String name = scanner.nextLine();

        System.out.println("Input rent type");
        String rentType = scanner.nextLine();

        System.out.println("Input standard service");
        String standardService = scanner.nextLine();

        System.out.println("Input floor");
        int floor = Integer.parseInt(scanner.nextLine());

        System.out.println("Input area use");
        int areaUse = Integer.parseInt(scanner.nextLine());

        System.out.println("Input rent price");
        int feeRent = Integer.parseInt(scanner.nextLine());

        System.out.println("Input maximum customer");
        int maximumCustomer = Integer.parseInt(scanner.nextLine());

        System.out.println("Input id facility");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Input free service");
        String freeService = scanner.nextLine();

        Room room = new Room(name, rentType, areaUse, feeRent, maximumCustomer, id, freeService);
        facilityList.put(room, 1);
        System.out.println("Add successful");
    }
}
