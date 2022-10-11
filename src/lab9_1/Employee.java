package lab9_1;

import java.util.ArrayList;
import java.util.List;

/*
Create a class Employee with a method salary to return employee’s salary
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
(All above are models)
Write a method to accept a list of Employee and calculate total salary (Controller)
For example, company has 3 FTE and 2 contractors (Test Data)
 */
public class Employee {
    private String name;
    private int salary;


    public int getSalary() {
        return salary;
    }

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

