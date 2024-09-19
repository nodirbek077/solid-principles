package openClose.employee;

public abstract class Employee {
    private Integer id;
    private String name;

    public Employee(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract Double calculateBonus(Integer salary);
}
