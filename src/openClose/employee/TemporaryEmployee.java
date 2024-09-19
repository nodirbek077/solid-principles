package openClose.employee;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Double calculateBonus(Integer salary) {
        return salary * 0.10;
    }
}
