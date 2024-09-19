package openClose.employee;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Double calculateBonus(Integer salary) {
        return salary * 0.20;
    }
}
