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
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWrite;
import java.io.Serializable;
import java.util.*;

public class BookingServiceImp implements BookingService, Serializable {
    public Scanner scanner = new Scanner(System.in);
    public static TreeSet<Booking> bookingSet = BookingList.getBookingSet();

    public void addBooking() {
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
                customer,
                facility);

        bookingSet.add(booking);
        ReadAndWrite.writeFileTree("src\\case_study\\data\\booking.csv", bookingSet);
        System.out.println("Add booking successful");
    }

    @Override
    public void displayListBooking() {
        TreeSet<Booking> bookingSet = BookingList.getBookingSet();
        for (Booking booking : bookingSet) {
            if (booking.getFacility() instanceof Room) {
                System.out.println(booking.toString() + "]");
            } else {
                System.out.println(booking.toString() +
                        ", standard service = " + booking.getFacility().getStandardService() +
                        "]");
            }
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

    public Booking editBooking() {
        int id;
        while (true) {
            if (bookingSet.isEmpty()) {
                System.out.println("Booking list is not booking in list");
                break;
            }
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            System.out.println("Input id booking need to edit");
            displayListBooking();
            id = Integer.parseInt(scanner.nextLine());
            for (Booking booking : bookingSet) {
                if (id == booking.getIdBooking()) {
                    Customer customer = chooseCustomer();
                    booking.setCustomer(customer);
                    Facility facility = chooseFacility();
                    booking.setFacility(facility);

                    System.out.println("Input start rent time");
                    String startTime = BookingRegex.time();
                    booking.setStarTime(startTime);

                    System.out.println("Input end rent time");
                    String endTime = BookingRegex.time();
                    booking.setEndTime(endTime);

                    System.out.println("Edit successful");
                    ReadAndWrite.writeFileTree("src\\case_study\\data\\booking.csv", bookingSet);
                    return booking;
                }
            }
            System.out.println("Your id input is not in list");
        }
        return null;
    }

    public Facility chooseFacility() {
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        System.out.println("---------Facility List---------");
        facilityServiceImp.display();
        LinkedHashMap<Facility, Integer> facilityList = FacilityList.getFacilityList();
        while (true) {
            System.out.println("Input id of facility");
            String id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
                if (entry.getKey().getId().equals(id)) {
                    if (entry.getValue() <= 5) {
                        entry.setValue(entry.getValue() + 1);
                        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv",facilityList);
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
}
