package case_study.service.implement;

import case_study.models.person.Employee;
import case_study.service.EmployeeService;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList  = getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList  = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\employee.csv");
        for (String[] item : list) {
            employeeList.add(new Employee(
                                item[0],
                                item[1],
                                item[2],
                                item[3],
                                item[4],
                                item[5],
                                item[6],
                                item[7],
                                item[8],
                                Integer.parseInt(item[9])));
        }
        return employeeList;
    }

    @Override
    public void addNew() {
        System.out.println("Input employee name");
        String name = scanner.nextLine();

        System.out.println("Input date of birth employee");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Input gender employee");
        String gender = scanner.nextLine();

        System.out.println("Input email");
        String email = scanner.nextLine();

        System.out.println("Input employee ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Input phone number");
        String phoneNumber = scanner.nextLine();

        String level = "";
        boolean checkLevel = true;
        while (checkLevel){
            int choice = 0;
            System.out.println("--------Menu--------");
            System.out.println("1. Secondary Graduation");
            System.out.println("2. College Graduation");
            System.out.println("3. Graduate");
            System.out.println("4. Post-Graduate");
            System.out.println("Input your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    level = "Secondary Graduation";
                    checkLevel = false;
                    break;
                case 2:
                    level = "College Graduation";
                    checkLevel = false;
                    break;
                case 3:
                    level = "Graduate";
                    checkLevel = false;
                    break;
                case 4:
                    level = "Post-Graduate";
                    checkLevel = false;
                    break;
                default:
                    checkLevel = true;
            }
        }

        String position = "";
        boolean checkPosition = true;
        int choice = 0;
        while (checkPosition){
            System.out.println("--------Menu--------");
            System.out.println("1. Receptionist");
            System.out.println("2. Servants");
            System.out.println("3. Supervisor");
            System.out.println("4. Manager");
            System.out.println("5. Director");
            System.out.println("Input your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    position = "Receptionist";
                    checkPosition = false;
                    break;
                case 2:
                    position = "Servants";
                    checkPosition = false;
                    break;
                case 3:
                    position = "Supervisor";
                    checkPosition = false;
                    break;
                case 4:
                    position = "Manager";
                    checkPosition = false;
                    break;
                case 5:
                    position = "Director";
                    checkPosition = false;
                    break;
                default:
                    checkPosition = true;
            }
        }

        System.out.println("Input employee ID ");
        String employeeID = scanner.nextLine();

        System.out.println("Input employee salary");
        int salary;
        while (true){
            try {
                salary = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }
        List<Employee> employeeList  = getEmployeeList();
        employeeList.add(new Employee(name,
                            dateOfBirth,
                            gender,
                            email,
                            idCardNumber,
                            phoneNumber,
                            level,
                            position,
                            employeeID,
                            salary));
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
        List<Employee> employeeList  = getEmployeeList();
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
            String dateOfBirth = scanner.nextLine();
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

            String level = "";
            boolean checkLevel = true;
            while (checkLevel){
                System.out.println("--------Menu--------");
                System.out.println("1. Secondary Graduation");
                System.out.println("2. College Graduation");
                System.out.println("3. Graduate");
                System.out.println("4. Post-Graduate");
                System.out.println("Input your choice");
                int choice = 0;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");;
                }
                switch (choice){
                    case 1:
                        level = "Secondary Graduation";
                        checkLevel = false;
                        break;
                    case 2:
                        level = "College Graduation";
                        checkLevel = false;
                        break;
                    case 3:
                        level = "Graduate";
                        checkLevel = false;
                        break;
                    case 4:
                        level = "Post-Graduate";
                        checkLevel = false;
                        break;
                    default:
                        checkLevel = true;
                }
            }
            employeeList.get(index).setLevel(level);

            String position = "";
            boolean checkPosition = true;
            while (checkPosition){
                System.out.println("--------Menu--------");
                System.out.println("1. Receptionist");
                System.out.println("2. Servants");
                System.out.println("3. Supervisor");
                System.out.println("4. Manager");
                System.out.println("5. Director");
                System.out.println("Input your choice");
                int choice = 0;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");;
                }
                switch (choice){
                    case 1:
                        position = "Receptionist";
                        checkPosition = false;
                        break;
                    case 2:
                        position = "Servants";
                        checkPosition = false;
                        break;
                    case 3:
                        position = "Supervisor";
                        checkPosition = false;
                        break;
                    case 4:
                        position = "Manager";
                        checkPosition = false;
                        break;
                    case 5:
                        position = "Director";
                        checkPosition = false;
                        break;
                    default:
                        checkPosition = true;
                }
            }
            employeeList.get(index).setPosition(position);

            System.out.println("Input employee salary");
            int salary = Integer.parseInt(scanner.nextLine());
            employeeList.get(index).setSalary(salary);

            File file = new File("src\\case_study\\data\\employee.csv");
            file.delete();
            for (Employee item : employeeList) {
                String  line = item.getName() + "," +
                        item.getDateOfBirth() + "," +
                        item.getGender() + "," +
                        item.getEmail() + "," +
                        item.getIdCardNumber() + "," +
                        item.getPhoneNumber() + "," +
                        item.getLevel() + "," +
                        item.getPosition() + "," +
                        item.getIdEmployeeNumber() + "," +
                        item.getSalary();
                ReadAndWrite.write("src\\case_study\\data\\employee.csv",line);
            }
            System.out.println("Edit successful");
        }else {
            System.out.println("Id is not in employee list");
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList  = getEmployeeList();
        System.out.println("Input ID of employee to edit");
        String id = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployeeNumber().equals(id)){
                employeeList.remove(i);
                flag = true;
                break;
            }
        }

        if (flag){
            File file = new File("src\\case_study\\data\\employee.csv");
            file.delete();
            for (Employee item : employeeList) {
                String  line = item.getName() + "," +
                        item.getDateOfBirth() + "," +
                        item.getGender() + "," +
                        item.getEmail() + "," +
                        item.getIdCardNumber() + "," +
                        item.getPhoneNumber() + "," +
                        item.getLevel() + "," +
                        item.getPosition() + "," +
                        item.getIdEmployeeNumber() + "," +
                        item.getSalary();
                ReadAndWrite.write("src\\case_study\\data\\employee.csv",line);
            }
            System.out.println("Delete successful");
        }else {
            System.out.println("Id is not in employee list");
        }
    }
}
