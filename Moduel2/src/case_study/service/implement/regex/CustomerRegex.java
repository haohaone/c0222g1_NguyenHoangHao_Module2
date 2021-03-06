package case_study.service.implement.regex;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.utils.DateTimeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class CustomerRegex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idRegex = "CUS\\-[0-9]{4}";

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100){
            throw new DateTimeException();
        }
    }

    public static String dateOfBirth(){
        String dateOfBirth;
        while (true){
            try {
                dateOfBirth = scanner.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (DateTimeException e) {
                System.err.println("This age of customer can't booking");
            }catch (Exception ignored){
                System.err.println("Input wrong format");
            }
        }
        return dateOfBirth;
    }

    public static String customerType(){
        String customerType = "";
        boolean check = true;
        while (check) {
            System.out.println("--------Menu--------");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.println("3. Member");
            System.out.println("4. Platinum");
            System.out.println("5. Diamond");
            System.out.println("Input your choice");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice) {
                case 1:
                    customerType = "Gold";
                    check = false;
                    break;
                case 2:
                    customerType = "Silver";
                    check = false;
                    break;
                case 3:
                    customerType = "Member";
                    check = false;
                    break;
                case 4:
                    customerType = "Platinum";
                    check = false;
                    break;
                case 5:
                    customerType = "Diamond";
                    check = false;
                    break;
                default:
                    check = true;
            }
        }
        return customerType;
    }

    public static String idRegex(List<Customer> customerList){
        String id;
        boolean check = true;
        while (check){
            check = false;
            while (true){
                id = scanner.nextLine();
                if (id.matches(idRegex)){
                    break;
                }else {
                    System.err.println("Your input is wrong format");
                }
            }

            for (Customer emp : customerList) {
                if (emp.getIdCustomerNumber().equals(id)){
                    check = true;
                    break;
                }
            }
            if (check){
                System.out.println("Your is already in list");
            }else {
                return id;
            }
        }
        return "";
    }
}
