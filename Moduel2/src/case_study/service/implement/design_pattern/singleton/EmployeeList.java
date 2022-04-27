package case_study.service.implement.design_pattern.singleton;

import case_study.models.person.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private static List<Employee> employeeList = null;

    private EmployeeList(){}

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
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
}
