package chap03.inheritance;

public class SalaryMgmt {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike");
        employee.setSalary(100.0);
        System.out.println(employee.getSalary());

        Manager manager = new Manager("Jane");
        manager.setSalary(100.0);
        manager.setBonus(100.0);
        System.out.println(manager.getSalary());

        System.out.println(manager.getManagerName());
    }
}
