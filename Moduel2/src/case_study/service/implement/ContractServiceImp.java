package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.person.Customer;
import case_study.service.ContractService;
import case_study.utils.ReadAndWrite;

import java.io.Serializable;
import java.util.*;

public class ContractServiceImp implements ContractService, Serializable {
    static Scanner scanner = new Scanner(System.in);

    public static List<Contract> getContractList(){
        List<Contract> list = null;
        try {
            list = ReadAndWrite.readFileArrayList("src\\case_study\\data\\contract.csv");
        }catch (NullPointerException ignored){
        }
        return list;
    }

    @Override
    public void createNewContract() {
        List<Contract> contractList = getContractList();
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
                System.out.println("Input id contract");
                int id;
                while (true){
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Input wrong format");
                    }
                }

                System.out.println("Input pre-fee");
                double preFee;
                while (true){
                    try {
                        preFee = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Input wrong format");
                    }
                }

                System.out.println("Input total fee");
                double totalFee;
                while (true){
                    try {
                        totalFee = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Input wrong format");
                    }
                }

                Contract contract = new Contract(
                        booking,
                        customer,
                        id,
                        preFee,
                        totalFee);
                contractList.add(contract);
                ReadAndWrite.writeFileArrayList("src\\case_study\\data\\contract.csv",contractList);
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
        List<Contract> contractList = getContractList();
        for (Contract contract: contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editNewContract() {
        List<Contract> contractList = getContractList();
        BookingServiceImp bookingServiceImp = new BookingServiceImp();
        int id;
        boolean flag = true;
        while (flag){
            if (contractList.isEmpty()){
                System.out.println("contract list is not contract in list");
                break;
            }
            System.out.println("Input id contract need to edit");
            while (true){
                try {
                    id = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                }
            }
            for (Contract contract : contractList) {
                if (contract.getIdContract() == id){
                    System.out.println("Input pre-fee to edit");
                    double preFee;
                    while (true){
                        try {
                            preFee = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("Input wrong format");
                        }
                    }
                    contract.setPreFee(preFee);

                    System.out.println("Input total fee to edit");
                    double totalFee;
                    while (true){
                        try {
                            totalFee = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("Input wrong format");
                        }
                    }
                    contract.setTotalFeeRent(totalFee);

                    System.out.println("Do you want edit booking");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int yesNo;
                    while (true){
                        try {
                            System.out.println("Input your choice");
                            yesNo = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("Input wrong format");
                        }
                    }
                    if (yesNo == 1){
                        Booking booking = bookingServiceImp.editBooking();
                        contract.setBooking(booking);
                        contract.setCustomer(booking.getCustomer());
                        ReadAndWrite.writeFileArrayList("src\\case_study\\data\\contract.csv",contractList);
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
