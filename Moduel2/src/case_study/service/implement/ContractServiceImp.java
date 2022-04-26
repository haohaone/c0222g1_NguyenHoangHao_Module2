package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.person.Customer;
import case_study.service.ContractService;
import case_study.service.implement.regex.ContractRegex;
import case_study.utils.ReadAndWrite;
import java.io.Serializable;
import java.util.*;

public class ContractServiceImp implements ContractService, Serializable {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Contract> list = getContractList();

    public static List<Contract> getContractList(){
        List<Contract> list = new ArrayList<>();
        try {
            list = ReadAndWrite.readFileArrayList("src\\case_study\\data\\contract.csv");
        }catch (NullPointerException ignored){
        }
        return list;
    }

    @Override
    public void createNewContract() {
        TreeSet <Booking> bookingSet = BookingServiceImp.getBookingSet();
        Queue <Booking> bookingQueue = new LinkedList<>();
        for (Booking booking : bookingSet) {
            if(!booking.isStatusContract()){
                bookingQueue.add(booking);
                booking.setStatusContract(true);
            }
        }
        ReadAndWrite.writeFileTree("src\\case_study\\data\\booking.csv", bookingSet);
        boolean check = true;
        while (check){
            if (!bookingQueue.isEmpty()){
                Booking booking = bookingQueue.poll();
                Customer customer = booking.getCustomer();

                System.out.println("Creating contract by booking have information: \n" + booking.toString());
                System.out.println("Creating contract by customer : \n" + customer.toString());
                int id = 1;
                if (!list.isEmpty()) {
                    id = list.size() + 1;
                }

                System.out.println("Input pre-fee");
                double preFee = ContractRegex.fee();

                System.out.println("Input total fee");
                double totalFee = ContractRegex.fee();

                Contract contract = new Contract(
                        booking,
                        customer,
                        id,
                        preFee,
                        totalFee);
                list.add(contract);
                ReadAndWrite.writeFileArrayList("src\\case_study\\data\\contract.csv",list);
                System.out.println("Create contract successful");
                check = true;
            }else {
                System.out.println("Bookings in list was created contract");
                check = false;
            }
        }
    }

    @Override
    public void displayContract() {
        List<Contract> list = getContractList();
        for (Contract contract: list) {
            System.out.println(contract);
        }
    }

    @Override
    public void editNewContract() {
        BookingServiceImp bookingServiceImp = new BookingServiceImp();
        int id;
        boolean flag = true;
        while (flag){
            if (list.isEmpty()){
                System.out.println("contract list is not contract in list");
                break;
            }
            System.out.println("Input id contract need to edit");
            id = ContractRegex.id();

            for (Contract contract : list) {
                if (contract.getIdContract() == id){
                    System.out.println("Input pre-fee to edit");
                    double preFee = ContractRegex.fee();
                    contract.setPreFee(preFee);

                    System.out.println("Input total fee to edit");
                    double totalFee = ContractRegex.fee();
                    contract.setTotalFeeRent(totalFee);

                    System.out.println("Do you want edit booking");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int yesNo = ContractRegex.id();

                    if (yesNo == 1){
                        Booking booking = bookingServiceImp.editBooking();
                        contract.setBooking(booking);
                        contract.setCustomer(booking.getCustomer());
                        ReadAndWrite.writeFileArrayList("src\\case_study\\data\\contract.csv",list);
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
}
