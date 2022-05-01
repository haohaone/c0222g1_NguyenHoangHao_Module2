package case_study.service.implement;

import case_study.models.person.Employee;
import case_study.service.EmployeeService;
import case_study.service.implement.design_pattern.singleton.EmployeeList;
import case_study.service.implement.regex.EmployeeRegex;
import case_study.utils.ReadAndWrite;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {
    public static Scanner scanner = new Scanner(System.in);
    public static  List<Employee> employeeList = EmployeeList.getEmployeeList();


    @Override
    public void display() {
        employeeList = EmployeeList.getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        employeeList = EmployeeList.getEmployeeList();
        System.out.println("Input employee name");
        String name = scanner.nextLine();

        System.out.println("Input date of birth employee");
        String dateOfBirth = EmployeeRegex.dateOfBirth();

        System.out.println("Input gender employee");
        String gender = scanner.nextLine();

        System.out.println("Input email");
        String email = scanner.nextLine();

        System.out.println("Input employee ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Input phone number");
        String phoneNumber = scanner.nextLine();

        String level = EmployeeRegex.level();

        String position = EmployeeRegex.position();

        System.out.println("Input employee ID ");
        String employeeID = EmployeeRegex.idRegex(employeeList);

        System.out.println("Input employee salary");
        int salary = EmployeeRegex.salary();

        String line = name + "," +
                dateOfBirth + "," +
                gender + "," +
                email + "," +
                idCardNumber + "," +
                phoneNumber + "," +
                level + "," +
                position + "," +
                employeeID + "," +
                salary;
        ReadAndWrite.write("src\\case_study\\data\\employee.csv",line);
        System.out.println("Add new successful");
    }


    @Override
    public void edit() {
        employeeList = EmployeeList.getEmployeeList();
        System.out.println("Input ID of employee to edit");
        String id = scanner.nextLine();

        boolean flag = false;
        int index = 0;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployeeNumber().equals(id)){
                index = i;
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Input employee name");
            String name = scanner.nextLine();
            employeeList.get(index).setName(name);

            System.out.println("Input date of birth employee");
            String dateOfBirth = EmployeeRegex.dateOfBirth();
            employeeList.get(index).setDateOfBirth(dateOfBirth);

            System.out.println("Input gender employee");
            String gender = scanner.nextLine();
            employeeList.get(index).setGender(gender);

            System.out.println("Input email");
            String email = scanner.nextLine();
            employeeList.get(index).setEmail(email);

            System.out.println("Input employee ID card number");
            String idCardNumber = scanner.nextLine();

            employeeList.get(index).setIdCardNumber(idCardNumber);

            System.out.println("Input phone number");
            String phoneNumber = scanner.nextLine();
            employeeList.get(index).setPhoneNumber(phoneNumber);

            String level = EmployeeRegex.level();
            employeeList.get(index).setLevel(level);

            String position = EmployeeRegex.position();
            employeeList.get(index).setPosition(position);

            System.out.println("Input employee salary");
            int salary = EmployeeRegex.salary();
            employeeList.get(index).setSalary(salary);

            writeEmployeeList(employeeList);
            System.out.println("Edit successful");
        }else {
            System.out.println("Id is not in employee list");
        }
    }

    @Override
    public void delete() {
        employeeList = EmployeeList.getEmployeeList();
        System.out.println("Input ID of employee to edit");
        String id = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployeeNumber().equals(id)){
                employeeList.remove(i);

                writeEmployeeList(employeeList);

                flag = true;
                break;
            }
        }

        if (flag){

            writeEmployeeList(employeeList);
            System.out.println("Delete successful");
        }else {
            System.out.println("Id is not in employee list");
        }
    }

    public static void writeEmployeeList(List<Employee> employees){
        File file = new File("src\\case_study\\data\\employee.csv");
        file.delete();

        for (Employee item : employees) {
            ReadAndWrite.write("src\\case_study\\data\\employee.csv",item.getLine());
        }
    }
}
