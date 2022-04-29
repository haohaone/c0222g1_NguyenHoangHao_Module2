package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.service.ContractService;
import case_study.service.implement.design_pattern.singleton.BookingList;
import case_study.service.implement.design_pattern.singleton.ContractList;
import case_study.service.implement.regex.ContractRegex;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.*;

public class ContractServiceImp implements ContractService{
    public static Scanner scanner = new Scanner(System.in);
    public static List<Contract> contractList = ContractList.getContractList();
    public static TreeSet <Booking> bookingSet = BookingList.getBookingSet();

    @Override
    public void createNewContract() {
        contractList = ContractList.getContractList();
        bookingSet = BookingList.getBookingSet();
        Queue <Booking> bookingQueue = new LinkedList<>();
        for (Booking booking : bookingSet) {
            if(booking.getStatusContract().equals("false")){
                bookingQueue.add(booking);
                booking.setStatusContract("true");
            }
        }

        BookingServiceImp.writeBookingList(bookingSet);

        boolean check = true;
        while (check){
            if (!bookingQueue.isEmpty()){
                Booking booking = bookingQueue.poll();
                String customerId = booking.getCustomerId();

                System.out.println("Creating contract by booking have information: \n" + booking.toString());
                int id = 1;
                if (!contractList.isEmpty()) {
                    id = contractList.size() + 1;
                }

                System.out.println("Input pre-fee");
                double preFee = ContractRegex.fee();

                System.out.println("Input total fee");
                double totalFee = ContractRegex.fee();

                Contract contract = new Contract(
                        booking.getIdBooking(),
                        customerId,
                        id,
                        preFee,
                        totalFee,
                        booking.getStarTime(),
                        "No discount");

                ReadAndWrite.write("src\\case_study\\data\\contract.csv",contract.getLine());
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
        contractList = ContractList.getContractList();
        for (Contract contract: contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editNewContract() {
        contractList = ContractList.getContractList();
        BookingServiceImp bookingServiceImp = new BookingServiceImp();
        int id;
        boolean flag = true;
        while (flag){
            if (contractList.isEmpty()){
                System.out.println("contract list is not contract in list");
                break;
            }
            System.out.println("Input id contract need to edit");
            id = ContractRegex.id();

            for (Contract contract : contractList) {
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
                        Booking booking = bookingServiceImp.editBooking(contract.getIdBooking());

                        contract.setIdBooking(booking.getIdBooking());
                        contract.setIdCustomer(booking.getCustomerId());

                        writeFileContract(contractList);
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

    public static void writeFileContract(List<Contract> contracts){
        List<Contract> contractList = contracts;

        File file = new File("src\\case_study\\data\\contract.csv");
        file.delete();

        for (Contract item : contractList) {
            ReadAndWrite.write("src\\case_study\\data\\contract.csv", item.getLine());
        }
    }
}
