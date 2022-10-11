package lab9_1;

public class Contractor extends Employee {
    @Override
    public String getName() {
        return "contract employee";
    }

    @Override
    public int getSalary() {
        return 40000;
    }
}
