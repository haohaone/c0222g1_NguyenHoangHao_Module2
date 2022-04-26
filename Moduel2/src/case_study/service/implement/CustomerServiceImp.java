package case_study.service.implement;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.service.CustomerService;
import case_study.service.implement.regex.CustomerRegex;
import case_study.utils.ReadAndWrite;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService, Serializable {
    static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = getCustomerList();

    public static List<Customer> getCustomerList() {
        List<Customer> customerList  = new LinkedList<>();
        try {
            List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\customers.csv");
            for (String[] item : list) {
                customerList.add(new Customer(
                        item[0],
                        item[1],
                        item[2],
                        item[3],
                        item[4],
                        item[5],
                        item[6],
                        item[7],
                        item[8]));
            }
        }catch (NullPointerException e){
        }
        return customerList;
    }

    @Override
    public void display() {
        List<Customer> customerList = getCustomerList();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
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
        String customerID = scanner.nextLine();

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
        ReadAndWrite.write("src\\case_study\\data\\customers.csv",line);
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

            File file = new File("src\\case_study\\data\\customers.csv");
            file.delete();
            for (Customer item : customerList) {
                String  line = item.getName() + "," +
                        item.getDateOfBirth() + "," +
                        item.getGender() + "," +
                        item.getEmail() + "," +
                        item.getIdCardNumber() + "," +
                        item.getPhoneNumber() + "," +
                        item.getIdCustomerNumber() + "," +
                        item.getAddress() + "," +
                        item.getCustomerType();
                ReadAndWrite.write("src\\case_study\\data\\customers.csv",line);            }
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
                File file = new File("src\\case_study\\data\\customers.csv");
                file.delete();
                for (Customer item : customerList) {
                    String  line = item.getName() + "," +
                            item.getDateOfBirth() + "," +
                            item.getGender() + "," +
                            item.getEmail() + "," +
                            item.getIdCardNumber() + "," +
                            item.getPhoneNumber() + "," +
                            item.getIdCustomerNumber() + "," +
                            item.getAddress() + "," +
                            item.getCustomerType();
                    ReadAndWrite.write("src\\case_study\\data\\customers.csv",line);            }
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
}
