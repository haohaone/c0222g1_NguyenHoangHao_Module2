package case_study.controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayMainMenu {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("----Menu Management----");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    FuramaController.employeeManagement();
                    break;
                case 2:
                    FuramaController.customerManagement();
                    break;
                case 3:
                    FuramaController.facilityManagement();
                    break;
                case 4:
                    FuramaController.bookingManagement();
                    break;
                case 5:
                    FuramaController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
