package case_study.service.implement.regex;

import java.util.Scanner;

public class FacilityRegex {
    public static final String VILLA, HOUSE, ROOM, FIRST_CHARACTER_UPPER, RENT_TYPE;
    public static Scanner scanner = new Scanner(System.in);

    static {
        VILLA = "^SVVL-[0-9]{4}$";
        HOUSE = "^SVHO-[0-9]{4}$";
        ROOM = "^SVRO-[0-9]{4}$";
        FIRST_CHARACTER_UPPER = "^[A-Z][\\w]+$";
        RENT_TYPE = "^(Day|Month|Year)$";
    }

    public static String name() {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("Your format is wrong");
            }
        }
        return name;
    }

    public static String rentType() {
        String rentType;
        while (true) {
            rentType = scanner.nextLine();
            if (rentType.matches(RENT_TYPE)) {
                break;
            } else {
                System.out.println("Your format should be Day, Month or Year");
            }
        }
        return rentType;
    }

    public static String standardService() {
        String standardService;
        while (true) {
            standardService = scanner.nextLine();
            if (standardService.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("Your format is wrong");
            }
        }
        return standardService;
    }

    public static String idVilla() {
        String id;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(VILLA)) {
                break;
            } else {
                System.out.println("Your input should be SVVl-xxxx");
            }
        }
        return id;
    }

    public static String idHouse() {
        String id;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(HOUSE)) {
                break;
            } else {
                System.out.println("Your input should be SVHO-xxxx");
            }
        }
        return id;
    }

    public static String idRoom() {
        String id;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(ROOM)) {
                break;
            } else {
                System.out.println("Your input should be SVRO-xxxx");
            }
        }
        return id;
    }

    public static int floor() {
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("Floor should be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
        }
        return floor;
    }

    public static double areaUse(){
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
        return areaUse;
    }

    public static int feeRent(){
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
        return feeRent;
    }

    public static int maximumCustomer(){
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
        return maximumCustomer;
    }

    public static double sizePool(){
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
        return sizePool;
    }

    public static String freeService(){
        String freeService;
        while (true){
            freeService = scanner.nextLine();
            if (freeService.matches(FIRST_CHARACTER_UPPER)){
                break;
            }else {
                System.out.println("Input wrong format");
            }
        }
        return freeService;
    }
}
