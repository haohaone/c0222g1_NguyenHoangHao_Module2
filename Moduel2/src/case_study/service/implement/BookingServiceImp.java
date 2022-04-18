package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.person.Customer;
import case_study.service.BookingService;
import case_study.utils.BookingComparator;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImp implements BookingService {
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public Scanner scanner = new Scanner(System.in);

    public static Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }

        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start rent time");
        String startTime = scanner.nextLine();
        System.out.println("Input end rent time");
        String endTime = scanner.nextLine();
        Booking booking = new Booking(
                id,
                startTime,
                endTime,
                customer,
                facility);

        bookingSet.add(booking);
        System.out.println("Add booking successful");
    }

    @Override
    public void displayListBooking() {
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

        boolean check = true;
        int id;
        while (check) {
            System.out.println("Input id of customer booking");
            id = Integer.parseInt(scanner.nextLine());
            for (Customer customer : CustomerServiceImp.getCustomerList()) {
                if (id == customer.getIdCustomerNumber()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Id is not in list");
                System.out.println();
            }
        }
        return null;
    }

    public Booking editBooking() {
        int id;
        boolean flag = true;
        while (flag) {
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
                    String startTime = scanner.nextLine();
                    booking.setStarTime(startTime);
                    System.out.println("Input end rent time");
                    String endTime = scanner.nextLine();
                    booking.setEndTime(endTime);
                    System.out.println("Edit successful");
                    return booking;
                }
            }
            if (flag){
                System.out.println("Your id input is not in list");
            }
        }
        return null;
    }

    public Facility chooseFacility() {
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        System.out.println("---------Facility List---------");
        facilityServiceImp.display();

        boolean check = true;
        int id;
        while (check) {
            System.out.println("Input id of facility");
            id = Integer.parseInt(scanner.nextLine());
            for (Map.Entry<Facility, Integer> entry : FacilityServiceImp.getFacilityList().entrySet()) {
                if (id == entry.getKey().getId()) {
                    if (entry.getValue() <= 5) {
                        check = false;
                        entry.setValue(entry.getValue() + 1);
                        return entry.getKey();
                    } else {
                        System.out.println("This Facility need to maintain");
                    }
                }
            }
            if (check) {
                System.out.println("Id is not in list");
                System.out.println();
            }
        }
        return null;
    }
}
