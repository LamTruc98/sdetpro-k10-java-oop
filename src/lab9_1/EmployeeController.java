package lab9_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary+= employee.getSalary();
            System.out.println(employee.getSalary());

        }
        return totalSalary;
    }

}
