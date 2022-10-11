package lab9_1;


public class FTE extends Employee {
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {
        return "Full time employee";
    }
}
