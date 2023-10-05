package creation.prototype;

import creation.prototype.pojo.Employees;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees clone1 = (Employees) employees.clone();
        Employees clone2 = (Employees) employees.clone();

        List<String> list = clone1.getEmployees();
        list.add("Abir HaLeevi");

        List<String> list1 = clone2.getEmployees();
        list1.remove("Tal Ayash");

        System.out.println("emps List: "+employees.getEmployees());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
