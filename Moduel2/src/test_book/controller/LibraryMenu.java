package test_book.controller;

import test_book.service.implement.BookingServiceImp;

import java.util.Scanner;

public class LibraryMenu {
    public static BookingServiceImp bookingServiceImp = new BookingServiceImp();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true){
            System.out.println("----Menu Cinema----");
            System.out.println("1. Display Book in Library");
            System.out.println("2. Borrow Book");
            System.out.println("3. Give back book");
            System.out.println("4. Add new book");
            System.out.println("5. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    bookingServiceImp.display();
                    break;
                case 2:
                    bookingServiceImp.borrow();
                    break;
                case 3:
                    bookingServiceImp.giveBack();
                    break;
                case 4:
                    bookingServiceImp.addNew();
                    break;
                case 5:
                    System.exit(4);
            }
        }
    }
}
