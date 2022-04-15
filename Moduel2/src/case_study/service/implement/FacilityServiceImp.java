package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImp implements FacilityService {
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    public Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void displayMaintain() {

    }

//    String nameService,
//    String rentType,
//    String standardService,
//    String floor,
//    int areaUse,
//    int feeRent,
//    int maximumCustomer,
//    int sizePool
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

        System.out.println("Input size pool");
        int sizePool = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, sizePool);
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

        House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer);
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

        facilityList.put(house, 1);
        System.out.println("Add successful");
    }
}
