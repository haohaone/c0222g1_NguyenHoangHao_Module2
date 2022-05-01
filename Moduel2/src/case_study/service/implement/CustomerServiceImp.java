package case_study.service.implement;

import case_study.models.person.Customer;
import case_study.service.CustomerService;
import case_study.service.implement.design_pattern.singleton.CustomerList;
import case_study.service.implement.regex.CustomerRegex;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = CustomerList.getCustomerList();

    @Override
    public void display() {
        customerList = CustomerList.getCustomerList();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        customerList = CustomerList.getCustomerList();
        System.out.println("Input customer name");
        String name = scanner.nextLine();

        System.out.println("Input date of birth customer");
        String dateOfBirth = CustomerRegex.dateOfBirth();

        System.out.println("Input gender customer");
        String gender = scanner.nextLine();

        System.out.println("Input email");
        String email = scanner.nextLine();

        System.out.println("Input customer ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Input phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input customer ID ");
        String customerID = CustomerRegex.idRegex(customerList);

        System.out.println("Input customer address");
        String address = scanner.nextLine();

        String customerType = CustomerRegex.customerType();

        String line = name + "," +
                dateOfBirth + "," +
                gender + "," +
                email + "," +
                idCardNumber + "," +
                phoneNumber + "," +
                customerID + "," +
                address + "," +
                customerType;
        ReadAndWrite.write("src\\case_study\\data\\customers.csv", line);
        System.out.println("Add new successful");
    }

    @Override
    public void edit() {
        customerList = CustomerList.getCustomerList();
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
            String dateOfBirth = CustomerRegex.dateOfBirth();
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

            String customerType = CustomerRegex.customerType();
            customerList.get(index).setCustomerType(customerType);

            writeCustomerList(customerList);
            System.out.println("Edit successful");
        } else {
            System.out.println("Id is not in employee list");
        }
    }

    @Override
    public void delete() {
        customerList = CustomerList.getCustomerList();
        System.out.println("Input ID of employee to edit");
        String id = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomerNumber().equals(id)) {
                customerList.remove(i);

                writeCustomerList(customerList);
                System.out.println("Edit successful");
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

    public static void writeCustomerList(List<Customer> customers) {
        File file = new File("src\\case_study\\data\\customers.csv");
        file.delete();

        for (Customer item : customers) {
            ReadAndWrite.write("src\\case_study\\data\\customers.csv", item.getLine());
        }
    }
}
