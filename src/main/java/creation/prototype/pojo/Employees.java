package creation.prototype.pojo;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    // Attributes
    private List<String> employees;

    // Constructors
    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employeesInput) {
        this.employees = employeesInput;
    }

    // Load Data From Database
    public void loadData() {
        employees.add("Tal Ayash");
        employees.add("David Cohen");
        employees.add("Rami Levi");
        employees.add("Din Buzaglo");
    }

    // Getters & Setters
    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>(this.getEmployees());
        return new Employees(temp);
    }
}
