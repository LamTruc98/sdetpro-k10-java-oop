package lab9_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //Form up data from object
        Employee fte = new FTE();
        Employee contract = new Contractor();
        List<Employee> employeeList = Arrays.asList(fte,contract);

        //calculate controller to process data
        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total salary is: " + totalSalary);
    }
}
