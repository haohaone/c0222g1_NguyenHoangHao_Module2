package case_study.service.implement.design_pattern.singleton;

import case_study.models.person.Customer;
import case_study.utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;

public class CustomerList {
    private static List<Customer> customerList = null;

    private CustomerList(){}

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


}
