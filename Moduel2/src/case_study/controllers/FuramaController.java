package case_study.controllers;

import java.util.Scanner;
import case_study.controllers.DisplayMainMenu;
import case_study.service.implement.*;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public DisplayMainMenu displayMainMenu = new DisplayMainMenu();

    public static void employeeManagement() {
        EmployeeServiceImp employeeServiceImp = new EmployeeServiceImp();
        int choice;
        while (true) {
            System.out.println("-----Employee Menu-----");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeServiceImp.display();
                    break;
                case 2:
                    employeeServiceImp.addNew();
                    break;
                case 3:
                    employeeServiceImp.edit();
                    break;
                case 4:
                    employeeServiceImp.delete();
                    break;
                case 5:
                    DisplayMainMenu.displayMainMenu();
            }
        }
    }

    public static void customerManagement() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        int choice;
        while (true) {
            System.out.println("-----Customer Menu-----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerServiceImp.display();
                    break;
                case 2:
                    customerServiceImp.addNew();
                    break;
                case 3:
                    customerServiceImp.edit();
                    break;
                case 4:
                    customerServiceImp.delete();
                    break;
                case 5:
                    DisplayMainMenu.displayMainMenu();
            }
        }
    }

    public static void facilityManagement() {
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        int choice;
        while (true) {
            System.out.println("-----Facility Menu-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityServiceImp.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityServiceImp.displayMaintain();
                    break;
                case 4:
                    DisplayMainMenu.displayMainMenu();
            }
        }
    }

    public static void addNewFacilityMenu(){
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        int choice;
        while (true) {
            System.out.println("---Add new facility menu--");
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityServiceImp.addNewVilla();
                    facilityManagement();
                    break;
                case 2:
                    facilityServiceImp.addNewHouse();
                    facilityManagement();
                    break;
                case 3:
                    facilityServiceImp.addNewRoom();
                    facilityManagement();
                    break;
                case 4:
                    facilityManagement();
            }
        }
    }

    public static void bookingManagement() {
        BookingServiceImp bookingServiceImp = new BookingServiceImp();
        ContractServiceImp contractServiceImp = new ContractServiceImp();
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
                    bookingServiceImp.addBooking();
                    break;
                case 2:
                    bookingServiceImp.displayListBooking();
                    break;
                case 3:
                    contractServiceImp.createNewContract();
                    break;
                case 4:
                    contractServiceImp.displayContract();
                    break;
                case 5:
                    contractServiceImp.editNewContract();
                    break;
                case 6:
                    DisplayMainMenu.displayMainMenu();
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
                    DisplayMainMenu.displayMainMenu();
            }
        }
    }
}
