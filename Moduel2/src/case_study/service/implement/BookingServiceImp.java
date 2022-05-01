package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.person.Customer;
import case_study.service.BookingService;
import case_study.service.implement.design_pattern.singleton.BookingList;
import case_study.service.implement.design_pattern.singleton.CustomerList;
import case_study.service.implement.design_pattern.singleton.FacilityList;
import case_study.service.implement.regex.BookingRegex;

import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.*;

public class BookingServiceImp implements BookingService {
    public Scanner scanner = new Scanner(System.in);
    public static TreeSet<Booking> bookingSet = BookingList.getBookingSet();
    public static LinkedHashMap<Facility, Integer> facilityList = FacilityList.getFacilityList();


    public void addBooking() {
        bookingSet = BookingList.getBookingSet();
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }

        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start time");
        String startTime = BookingRegex.time();

        System.out.println("Input end time");
        String endTime = BookingRegex.time();

        Booking booking = new Booking(
                id,
                startTime,
                endTime,
                customer.getIdCustomerNumber(),
                facility.getNameService(),
                "false");

        ReadAndWrite.write("src\\case_study\\data\\booking.csv", booking.getLine());
        System.out.println("Add booking successful");
    }

    @Override
    public void displayListBooking() {
        bookingSet = BookingList.getBookingSet();
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public Customer chooseCustomer() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        System.out.println("---------Customer List---------");
        customerServiceImp.display();

        String id;
        while (true) {
            if (CustomerList.getCustomerList().isEmpty()) {
                System.out.println("Customer list is not customer in list");
                break;
            }
            System.out.println("Input id of customer booking");
            id = scanner.nextLine();
            for (Customer customer : CustomerList.getCustomerList()) {
                if (customer.getIdCustomerNumber().equals(id)) {
                    return customer;
                }
            }
            System.out.println("Id is not in list");
            System.out.println();
        }
        return null;
    }

    public Booking editBooking(int id) {
        bookingSet = BookingList.getBookingSet();
        for (Booking booking : bookingSet) {
            if (id == booking.getIdBooking()) {
                Customer customer = chooseCustomer();
                booking.setCustomerId(customer.getIdCustomerNumber());
                Facility facility = chooseFacility();
                booking.setFacilityId(facility.getId());

                System.out.println("Input start rent time");
                String startTime = BookingRegex.time();
                booking.setStarTime(startTime);

                System.out.println("Input end rent time");
                String endTime = BookingRegex.time();
                booking.setEndTime(endTime);

                System.out.println("Edit successful");

                writeBookingList(bookingSet);
                return booking;
            }
        }
        return null;
    }

    public Facility chooseFacility() {
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        System.out.println("---------Facility List---------");
        facilityServiceImp.display();

        facilityList = FacilityList.getFacilityList();

        while (true) {
            System.out.println("Input id of facility");
            String id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
                if (entry.getKey().getId().equals(id)) {
                    if (entry.getValue() <= 5) {

                        entry.setValue(entry.getValue() + 1);

                        FacilityServiceImp.writeFacilityList(facilityList);

                        return entry.getKey();
                    } else {
                        System.out.println("This Facility need to maintain");
                    }
                }
            }
            System.out.println("Id is not in list");
            System.out.println();
        }
    }

    public static void writeBookingList(TreeSet<Booking> bookings) {
        File file = new File("src\\case_study\\data\\booking.csv");
        file.delete();

        for (Booking book : bookings) {
            ReadAndWrite.write("src\\case_study\\data\\booking.csv", book.getLine());
        }
    }
}
