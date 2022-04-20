package case_study.service.implement;

import case_study.models.person.Customer;
import case_study.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer("hao",
                "8-7-1999",
                "Nam",
                "hoanghao9x87@gmail.com",
                "201787802",
                "0762709502",
                "1",
                "hoa an 14",
                "VIP"));

        customerList.add(new Customer("hoang",
                "2-7-2005",
                "Nam",
                "hoang2005@gmail.com",
                "2005878888",
                "0762709888",
                "2",
                "165 nguyen tat thanh",
                "VIP"));

        customerList.add(new Customer("trung",
                "25-1-2005",
                "Nam",
                "trungtrung@gmail.com",
                "200511111",
                "0905000002",
                "3",
                "99 dien bien phu",
                "VIP"));
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input customer name");
        String name = scanner.nextLine();

        System.out.println("Input date of birth customer");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Input gender customer");
        String gender = scanner.nextLine();

        System.out.println("Input email");
        String email = scanner.nextLine();

        System.out.println("Input customer ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Input phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input customer ID ");
        String customerID = scanner.nextLine();

        System.out.println("Input customer address");
        String address = scanner.nextLine();

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

        customerList.add(new Customer(name,
                dateOfBirth,
                gender,
                email,
                idCardNumber,
                phoneNumber,
                customerID,
                address,
                customerType));

        System.out.println("Add new successful");
    }

    @Override
    public void edit() {
        System.out.println("Input ID of customer to edit");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomerNumber().equals(id)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Input customer name");
            String name = scanner.nextLine();
            customerList.get(index).setName(name);

            System.out.println("Input date of birth customer");
            String dateOfBirth = scanner.nextLine();
            customerList.get(index).setDateOfBirth(dateOfBirth);

            System.out.println("Input gender customer");
            String gender = scanner.nextLine();
            customerList.get(index).setGender(gender);

            System.out.println("Input email");
            String email = scanner.nextLine();
            customerList.get(index).setEmail(email);

            System.out.println("Input customer ID card number");
            String idCardNumber = scanner.nextLine();
            customerList.get(index).setIdCardNumber(idCardNumber);

            System.out.println("Input phone number");
            String phoneNumber = scanner.nextLine();
            customerList.get(index).setPhoneNumber(phoneNumber);

            System.out.println("Input customer ID");
            String customerId = scanner.nextLine();
            customerList.get(index).setIdCustomerNumber(customerId);

            System.out.println("Input customer address");
            String address = scanner.nextLine();
            customerList.get(index).setAddress(address);

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
            customerList.get(index).setCustomerType(customerType);

            System.out.println("Edit successful");
        } else {
            System.out.println("Id is not in employee list");
        }
    }

    @Override
    public void delete() {
        System.out.println("Input ID of employee to edit");
        String id = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomerNumber().equals(id)) {
                customerList.remove(i);
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Delete successful");
        } else {
            System.out.println("Id is not in employee list");
        }
    }
}
