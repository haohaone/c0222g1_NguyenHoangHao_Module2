package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.person.Customer;
import case_study.service.ContractService;

import java.util.*;

public class ContractServiceImp implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Queue <Booking> bookingQueue = new LinkedList<>();
    Set <Booking> bookingSet = BookingServiceImp.getBookingSet();

    @Override
    public void createNewContract() {
        for (Booking booking : bookingSet) {
            if(!booking.isStatusContract()){
                bookingQueue.add(booking);
                booking.setStatusContract(true);
            }
        }
        if (!bookingQueue.isEmpty()){
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Creating contract by booking have information: \n" + booking.toString());
            System.out.println("Creating contract by customer : \n" + customer.toString());
            System.out.println("Input id contract");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Input pre-fee");
            double preFee = Double.parseDouble(scanner.nextLine());

            System.out.println("Input total fee");
            double totalFee = Double.parseDouble(scanner.nextLine());

            Contract contract = new Contract(
                    booking,
                    customer,
                    id,
                    preFee,
                    totalFee);
            contractList.add(contract);
            System.out.println("Create contract successful");
        }else {
            System.out.println("Bookings in list was created contract");
        }
    }

    @Override
    public void displayContract() {
        for (Contract contract: contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editNewContract() {
        BookingServiceImp bookingServiceImp = new BookingServiceImp();
        int id;
        boolean flag = true;
        while (flag){
            System.out.println("Input id contract need to edit");
            id = Integer.parseInt(scanner.nextLine());
            for (Contract contract : contractList) {
                if (contract.getIdContract() == id){
                    System.out.println("Input pre-fee to edit");
                    double preFee = Double.parseDouble(scanner.nextLine());
                    contract.setPreFee(preFee);

                    System.out.println("Input total fee to edit");
                    double totalFee = Double.parseDouble(scanner.nextLine());
                    contract.setTotalFeeRent(totalFee);

                    System.out.println("Do you want edit booking");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int yesNo = Integer.parseInt(scanner.nextLine());
                    if (yesNo == 1){
                        Booking booking = bookingServiceImp.editBooking();
                        contract.setBooking(booking);
                        contract.setCustomer(booking.getCustomer());

                    }
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Your id input is not in list");
            }
        }
    }

    public static List<Contract> getContractList() {
        return contractList;
    }
}
