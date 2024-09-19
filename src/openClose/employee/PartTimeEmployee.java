package openClose.employee;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Double calculateBonus(Integer salary) {
        return salary * 0.05;
    }
}
