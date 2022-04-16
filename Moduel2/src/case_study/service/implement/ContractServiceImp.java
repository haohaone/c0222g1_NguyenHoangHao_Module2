package case_study.service.implement;

import case_study.booking_contracts.Booking;
import case_study.booking_contracts.Contract;
import case_study.models.person.Customer;
import case_study.service.ContractService;

import java.util.*;

public class ContractServiceImp implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue <Booking> bookingQueue = new LinkedList<>();
        Set <Booking> bookingSet = BookingServiceImp.getBookingSet();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        Booking booking = bookingQueue.poll();
        Customer customer = booking.getCustomer();

        System.out.println("Creating contract by booking have information: \n" + booking.toString());
        System.out.println("Creating contract by customer : \n" + customer.toString());
        System.out.println("Input id contract");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Input pre-fee");
        int preFee = Integer.parseInt(scanner.nextLine());

        System.out.println("Input total fee");
        int totalFee = Integer.parseInt(scanner.nextLine());

        Contract contract = new Contract(
                booking.getIdBooking(),
                customer.getIdCustomerNumber(),
                id,
                preFee,
                totalFee);
        contractList.add(contract);
        System.out.println("Creat contract successful");
    }

    @Override
    public void displayContract() {
        for (Contract contract: contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editNewContract() {

    }
}
