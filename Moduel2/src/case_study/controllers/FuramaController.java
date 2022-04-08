package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void employeeManagement() {
        int choice;
        while (true) {
            System.out.println("-----Employee Menu-----");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.exit(4);
            }
        }
    }

    public static void customerManagement() {
        int choice;
        while (true) {
            System.out.println("-----Customer Menu-----");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.exit(4);
            }
        }
    }

    public static void facilityManagement() {
        int choice;
        while (true) {
            System.out.println("-----Facility Menu-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.exit(4);
            }
        }
    }

    public static void bookingManagement() {
        int choice;
        while (true){
            System.out.println("-----Booking Menu-----");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Created new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit Contracts");
            System.out.println("6. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(4);
            }
        }
    }

    public static void promotionManagement() {
        int choice;
        while (true){
            System.out.println("-----------Promotion Menu-----------");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.exit(4);
            }
        }
    }
}
