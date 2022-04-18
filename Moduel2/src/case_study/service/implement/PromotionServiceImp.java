package case_study.service.implement;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.person.Customer;
import case_study.service.PromotionService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImp implements PromotionService {
    private List<Contract> contracts = ContractServiceImp.getContractList();
    public Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomerUseService() {
        String year;
        while (true){
            int check = 0;
            System.out.println("Input years for display customer list");
            year = scanner.nextLine();
            for (Contract contract : contracts) {
                if (contract.getBooking().getStarTime().substring(6).contains(year)){
                    System.out.println(contract.getBooking().getCustomer());
                    check++;
                    break;
                }
            }
            if (check == 0){
                System.out.println(year + " is not customer booking service");
                break;
            }
        }
    }

    @Override
    public void displayDiscount() {
        Stack<Contract> discount = new Stack<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate thisMonth =  LocalDate.now();
        String localDate = thisMonth.format(formatter);
        System.out.println(localDate.substring(3));
        int count = 0;
        for (Contract contract : contracts) {
            if (contract.getBooking().getStarTime().substring(3).equals(localDate.substring(3))){
                if (contract.getDiscountStatus().contains("No discount")){
                    discount.add(contract);
                    count++;
                }
            }
        }
        if (count > 0 ){
            System.out.println("This month have " + count + " customers");
            System.out.println("please input your amount give away discount");
            System.out.println("Input amount discount 10%");
            int discount10 =Integer.parseInt(scanner.nextLine());
            System.out.println("Input amount discount 20%");
            int discount20 =Integer.parseInt(scanner.nextLine());
            System.out.println("Input amount discount 50%");
            int discount50 =Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= discount10 + discount20 + discount50; i++) {
                Contract contract = discount.pop();
                if (i <= discount10 ){
                    contract.setDiscountStatus("Discount 10%");
                }else if (i <= discount10 + discount20){
                    contract.setDiscountStatus("Discount 20%");
                }else {
                    contract.setDiscountStatus("Discount 50%");
                }
            }
            System.out.println("Give away discount successful");
        }else {
            System.out.println("This month have 0 booking");
        }
    }
}