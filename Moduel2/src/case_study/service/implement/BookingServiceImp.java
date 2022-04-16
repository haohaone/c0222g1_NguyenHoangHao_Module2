package case_study.service.implement;

import case_study.booking_contracts.Booking;
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
        if (!bookingSet.isEmpty()){
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
                        customer.getIdCustomerNumber(),
                        startTime,
                        endTime,
                        facility.getNameService(),
                        facility.getStandardService(),
                        customer,
                        facility);

        bookingSet.add(booking);
        System.out.println("Add booking successful");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            if (booking.getFacility() instanceof Room){
                System.out.println(booking.toString() + "]");
            }else {
                System.out.println(booking.toString() +
                        ", standard service = " + booking.getFacility().getStandardService() +
                        "]");
            }
        }
    }

    public Customer chooseCustomer(){
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        System.out.println("---------Customer List---------");
        customerServiceImp.display();

        boolean check = true;
        int id;
        while (check){
            System.out.println("Input id of customer booking");
            id = Integer.parseInt(scanner.nextLine());
            for (Customer customer : CustomerServiceImp.getCustomerList()) {
                if (id == customer.getIdCustomerNumber()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Id is not in list");
                System.out.println();
            }
        }
        return null;
    }

    public Facility chooseFacility(){
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        System.out.println("---------Facility List---------");
        facilityServiceImp.display();

        boolean check = true;
        int id;
        while (check){
            System.out.println("Input id of facility");
            id = Integer.parseInt(scanner.nextLine());
            for (Map.Entry<Facility, Integer> entry: FacilityServiceImp.getFacilityList().entrySet()){
                if (id == entry.getKey().getId()){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Id is not in list");
                System.out.println();
            }
        }
        return null;
    }
}
